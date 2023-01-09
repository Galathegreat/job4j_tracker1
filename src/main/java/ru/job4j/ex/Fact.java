package ru.job4j.ex;

public class Fact {
    public void calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less then 0");
        }
        int rsl = 1;
        for (int i = 2; i <= n; i++) {
            rsl *= i;
        }
    }

    public static void main(String[] args) {
        new Fact().calc(-1);
    }
}
