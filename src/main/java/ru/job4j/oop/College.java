package ru.job4j.oop;

public interface College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student st = freshman;
        Object obj = st;
        System.out.println(new Freshman());
        System.out.println(new Student());
        System.out.println(new Object());
    }
}
