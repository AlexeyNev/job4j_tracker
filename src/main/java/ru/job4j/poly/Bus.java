package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public String drive() {
        return this.drive();
    }

    @Override
    public int passengers(int passenger) {
        return this.passengers(10);
    }

    @Override
    public int fuel(int liters, int price) {
        return this.fuel(5, 100);
    }
}
