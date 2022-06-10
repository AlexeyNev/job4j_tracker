package ru.job4j.oop;

public class Travel {
    public static void main(String[] args) {
        Vehicle plane = new Airplane();
        Vehicle plane2 = new Airplane();
        Vehicle plane3 = new Airplane();
        Vehicle train = new Train();
        Vehicle train2 = new Train();
        Vehicle train3 = new Train();
        Vehicle bus = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle bus3 = new Bus();

        Vehicle[] vehicles = {
                plane, plane2, plane3,
                train, train2, train3,
                bus, bus2, bus3
        };
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}

