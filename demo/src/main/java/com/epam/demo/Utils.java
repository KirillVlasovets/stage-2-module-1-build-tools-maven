package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args) {
            double number;
            if (str.contains("0")) {
                return false;
            }
            try {
                number = Double.parseDouble(str);
            } catch (NumberFormatException | NullPointerException exception) {
                return false;
            }
            if (number <= 0) {
                return false;
            }
        }
        return true;
    }
}