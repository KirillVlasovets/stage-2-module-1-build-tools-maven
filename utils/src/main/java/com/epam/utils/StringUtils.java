package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        double number;
        try {
            number = Double.parseDouble(str);
            if (str.startsWith("0")) {
                return false;
            }
        } catch (NumberFormatException | NullPointerException exception) {
            return false;
        }
        return number > 0;
    }
}
