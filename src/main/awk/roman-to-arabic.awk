#!/usr/bin/env gawk -f
#
# Roman to Arabic numeral converter
#
# Copyright (c) 2023 Jegors Čemisovs
# License: MIT License
#
BEGIN {
    FPAT = "C?M|C?D|X?C|X?L|I?X|I?V|I"

    Roman["I"] = 1
    Roman["V"] = 5
    Roman["X"] = 10
    Roman["L"] = 50
    Roman["C"] = 100
    Roman["D"] = 500
    Roman["M"] = 1000
    Roman["IV"] = 4
    Roman["IX"] = 9
    Roman["XL"] = 40
    Roman["XC"] = 90
    Roman["CD"] = 400
    Roman["CM"] = 500
}
{
    for (number = 0; NF; --NF) number += Roman[$NF]
    print number
}
