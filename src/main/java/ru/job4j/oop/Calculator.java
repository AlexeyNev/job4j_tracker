package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int q) {
        return q - x;
    }

    public int divide(int w) {
        return w / x;
    }

    public int sumAllOperation(int result) {
        return sum(result) + multiply(result) + minus(result) + divide(result);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);

        int rsl3 = calculator.divide(10);
        System.out.println(rsl3);

        int rsl2 = minus(10);
        System.out.println(rsl2);

        int rsl4 = calculator.sumAllOperation(result);
        System.out.println(rsl4);
    }
}
