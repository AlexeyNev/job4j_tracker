package ru.job4j.strategy;

/**
 * Square реализует конкретное действие системы.
 * На данном этапе он реализует интерфейс Shape.
 */
public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    " _______ "  + ln
                + "|       |" + ln
                + "|       |" + ln
                + "|_______|" + ln;
    }
}
