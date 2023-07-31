# Roman to arabic numeral converter

The repository contains AWK script to convert Roman numbers to Arabic numbers, as well as two Java implementations of the converter.

## AWK script
The script is located in the `src/main/awk` directory. It can be run as follows:
```shell
gawk -f roman-to-arabic.awk roman_numerals.txt
```

## Java implementations
The Java implementations are located in the `src/main/java` directory.

### Usage
```java
var converter = new RomanToArabicConverter();

var romanNumerals = Stream.of(
                "I", "II", "IV", "V", "VI", "IX", "X", "XIII", "XV", "XL",
                "L", "LXXX", "XC", "C", "CD", "D", "CM", "M", "MDCCCLXXXIV");

var arabicNumerals = romanNumerals.mapToInt(converter).toArray();

assertThat(arabicNumerals).containsExactly(
                1, 2, 4, 5, 6, 9, 10, 13, 15, 40,
                50, 80, 90, 100, 400, 500, 900, 1000, 1884);
```
