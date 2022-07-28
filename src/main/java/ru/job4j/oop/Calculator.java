package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int finalSum = sum(10);
        System.out.println(finalSum);
        int finalMinus = minus(10);
        System.out.println(finalMinus);
        Calculator calculator = new Calculator();
        int finalMultiply = calculator.multiply(10);
        System.out.println(finalMultiply);
        int finalDivide = calculator.divide(10);
        System.out.println(finalDivide);
        int finalAll = calculator.sumAllOperation(10);
        System.out.println(finalAll);
    }
}

