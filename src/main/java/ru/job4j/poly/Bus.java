package ru.job4j.poly;

public class Bus implements Transport {
    private int fuel;

    @Override
    public void drive() {
        System.out.println("Bus drive");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Number passengers " + passenger);
    }

    @Override
    public int refuel(int fuel) {
        this.fuel += fuel;
        return fuel * 50;
    }
}
