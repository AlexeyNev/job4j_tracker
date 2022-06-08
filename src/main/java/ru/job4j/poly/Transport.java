package ru.job4j.poly;

public interface Transport {
    String drive();

    int passengers(int passenger);

    int fuel(int liters, int price);
}
