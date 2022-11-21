package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * key -> key.getSurname() == Student::getSurname
 */

public class ListToMap {

    public static Map<String, Student> convert(List<Student> list) {
        return list.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        value -> value,
                        ((existing, replacement) -> existing)
                ));
    }
}