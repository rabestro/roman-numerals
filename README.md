# Roman to arabic numeral converter

## Description
This is a simple roman to arabic numeral converter. 
It takes a roman numeral as input and returns the corresponding arabic numeral.

## Usage
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
