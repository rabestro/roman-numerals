package org.epam.roman;

import java.util.function.ToIntFunction;

public final class RomanToArabicOptimized implements ToIntFunction<String> {
    
    @Override
    public int applyAsInt(String value) {
        final char[] chars = value.toCharArray();
        int result = 0;
        for (int i = chars.length; i-- > 0; ) {
            result += switch (chars[i]) {
                case 'I' -> result >= 5 ? -1 : 1;
                case 'V' -> 5;
                case 'X' -> result >= 50 ? -10 : 10;
                case 'L' -> 50;
                case 'C' -> result >= 500 ? -100 : 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> throw new IllegalArgumentException("Unexpected value: " + chars[i]);
            };
        }
        return result;
    }
}
