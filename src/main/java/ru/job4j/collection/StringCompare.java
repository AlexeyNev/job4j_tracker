package ru.job4j.collection;

import java.util.Comparator;

/**
 * Необходимо реализовать поэлементное сравнение двух списков, т.е. сравниваем элементы двух списков,
 * находящихся на одних и тех же позициях (под одним и тем же индексом).
 * Сравнение в лексикографическом порядке.
 */
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl;
        int size = Math.min(left.length(), right.length());
        for (int i = 0; i < size; i++) {
            rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                return rsl;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
