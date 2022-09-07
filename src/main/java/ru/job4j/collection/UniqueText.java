package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * String[] origin = originText.split(" ");
 * String[] text = duplicateText.split(" ");
 * HashSet<String> check = new HashSet<>(
 * Arrays.asList(origin));
 * for (String el : text) {
 * if (!check.contains(el)) {
 * return false;
 * }
 * }
 * return true;
 */

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String s : origin) {
            check.add(s);
        }
        for (String l : text) {
            if (!check.contains(l)) {
                rsl = false;
            }
        }
        return rsl;
    }
}