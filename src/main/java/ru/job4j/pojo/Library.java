package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("First book", 1);
        Book bookTwo = new Book("Second book", 2);
        Book bookThree = new Book("Third book", 3);
        Book bookFour = new Book("Clean code", 4);
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        for (int i = 0; i < books.length; i++) {
            Book rsl = books[i];
            System.out.println(rsl.getName() + " - " + rsl.getPage());
        }
        System.out.println("Replace books[0] to books[3].");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book rsl = books[i];
            System.out.println(rsl.getName() + " - " + rsl.getPage());
        }
        System.out.println("Shown only - Clean code");
        for (int i = 0; i < books.length; i++) {
            Book rsl = books[i];
            if (rsl.getName().equals("Clean code")) {
                System.out.println(rsl.getName() + " - " + rsl.getPage());
            }
        }
    }
}