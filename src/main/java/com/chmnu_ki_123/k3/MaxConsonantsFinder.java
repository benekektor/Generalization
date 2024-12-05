package com.chmnu_ki_123.k3;

import java.util.Arrays;

public class MaxConsonantsFinder {

    private static int countConsonants(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }

    public static String findMaxConsonants(String[] strings) {
        if (strings == null || strings.length == 0) {
            throw new IllegalArgumentException("Список не може бути порожнім.");
        }
        return Arrays.stream(strings)
                .max((s1, s2) -> Integer.compare(countConsonants(s1), countConsonants(s2)))
                .orElse("");
    }

    public static void main(String[] args) {

        String[] strings = {"hello", "world", "java", "programming"};
        System.out.println("Рядок з максимальною кількістю приголосних: " + findMaxConsonants(strings));
    }
}
