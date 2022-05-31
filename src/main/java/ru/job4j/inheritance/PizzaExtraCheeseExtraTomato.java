package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends Pizza {
    public String name() {
        return super.name() + "extra tomato";
    }
}
