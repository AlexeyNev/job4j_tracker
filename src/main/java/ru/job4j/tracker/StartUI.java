package ru.job4j.tracker;

public class StartUI {
    @Override
    public String toString() {
        return "StartUI{}";
    }

    public static void main(String[] args) {
        Item item = new Item(1, "User1");
        System.out.println("User: "
                + item.getId() + " "
                + item.getName() + " "
                + item.getCreated()
        );
    }
}
