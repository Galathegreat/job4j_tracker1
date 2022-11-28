package ru.job4j.tracker;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome. What is your name?");
        String name = input.nextLine();
        System.out.println(name + ", Nice to meet u!");
    }

    public static class ShowAllItem implements UserAction {

        @Override
        public String name() {
            return "Show all items";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            System.out.println("=== Show all items ===");
            Item[] items = tracker.findAll();
            if (items.length > 0) {
                for (Item item : items) {
                    System.out.println(item);
                }
            } else {
                System.out.println("The repository does not contain requests.");
            }
            return true;
        }
    }
}
