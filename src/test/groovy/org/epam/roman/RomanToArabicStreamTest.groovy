package org.epam.roman

import spock.lang.Specification

import java.util.stream.Stream

class RomanToArabicStreamTest extends Specification {

    def "convert roman numeral string to arabic number"() {
        given: 'a roman to arabic converter'
        def converter = new RomanToArabicConverter()

        when: 'converting roman numeral strings to arabic numbers'
        def actual = romanNumerals.mapToInt(converter).toArray()

        then: 'the arabic numbers are correct'
        actual == arabicNumbers

        where: 'roman numeral strings and their arabic equivalents'
        romanNumerals = Stream.of(
                "I", "II", "IV", "V", "VI", "IX", "X", "XIII", "XV", "XL",
                "L", "LXXX", "XC", "C", "CD", "D", "CM", "M", "MDCCCLXXXIV"
        )
        arabicNumbers = [
                1, 2, 4, 5, 6, 9, 10, 13, 15, 40,
                50, 80, 90, 100, 400, 500, 900, 1000, 1884] as int[]
    }
}
