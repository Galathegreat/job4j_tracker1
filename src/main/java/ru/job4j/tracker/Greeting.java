package ru.job4j.tracker;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome. What is your name?");
        String name = input.nextLine();
        System.out.println(name + ", Nice to meet u!");
    }
}
