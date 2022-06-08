package ru.job4j.tracker;

public class StubInput implements Input {
    @Override
    public String askStr(String question) {
        return this.askStr(question);
    }

    @Override
    public int askInt(String question) {
        return this.askInt("Как дела?");
    }
}
