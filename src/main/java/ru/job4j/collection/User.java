package ru.job4j.collection;

import java.util.Objects;

/**
 * CompareTo() - возвращает при сравнении двух объектов -1 если первый меньше второго,
 * 0 если они равны и 1 если второй больше первого.
 * CompareTo - String. Compare - Integer
 */
public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     *  0 == если объекты равны
     */
    @Override
    public int compareTo(User another) {
        int rsl = name.compareTo(another.name);
        if (rsl == 0) {
            rsl = Integer.compare(age, another.age);
        }
        return rsl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}