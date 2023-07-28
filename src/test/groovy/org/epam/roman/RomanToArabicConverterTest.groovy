package org.epam.roman

import spock.lang.Specification

class RomanToArabicConverterTest extends Specification {
    def sut = new RomanToArabicConverter()

    def "convert roman numeral string to arabic number"() {
        when:
        def result = sut.applyAsInt(roman)

        then:
        result == arabic

        where:
        roman         | arabic
        "I"           | 1
        "II"          | 2
        "IV"          | 4
        "V"           | 5
        "VI"          | 6
        "IX"          | 9
        "X"           | 10
        "XIII"        | 13
        "XV"          | 15
        "XL"          | 40
        "L"           | 50
        "LXXX"        | 80
        "XC"          | 90
        "C"           | 100
        "CD"          | 400
        "D"           | 500
        "CM"          | 900
        "M"           | 1000
        "MDCCCLXXXIV" | 1884
    }
}
