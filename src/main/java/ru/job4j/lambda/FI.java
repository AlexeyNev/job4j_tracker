package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = (left, right) -> {
            return Integer.compare(left.getSize(), right.getSize());
        };
        Arrays.sort(atts, comparator);

        Comparator<String> cmpSize = (left, right) -> {
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(atts, comparator);

        Comparator<String> cmpDescSize = (left, right) -> {
            return Integer.compare(right.length(), left.length());
        };
        Arrays.sort(atts, comparator);
    }
}