package ru.job4j.ex;

import java.util.Objects;

public class FindEl extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (Objects.equals(value[i], key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Elem not found");
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] animal = {"Cat", "Dog", "Cow"};
        try {
            System.out.println(FindEl.indexOf(animal, "Cat"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}