package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;

    }

    public Error() {

    }

    public void printInfo2() {
        System.out.println("Error");
    }

    public void printInfo() {
        System.out.println("Error: " + active);
        System.out.println("Error: " + status);
        System.out.println("Error: " + message);

    }

    public static void main(String[] args) {
        Error rsl = new Error();
        rsl.printInfo2();
        Error error = new Error(true, 403, "Все ок");
        error.printInfo();
        Error err = new Error(false, 404, "Не ок");
        err.printInfo();
    }
}

