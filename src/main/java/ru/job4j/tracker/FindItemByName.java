package ru.job4j.tracker;

import java.util.ArrayList;

public class FindItemByName implements UserAction {
    private final Output out;

    public FindItemByName(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Item by mane";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find Item by name ===");
        String name = input.askStr("Enter id search item by name: ");
        ArrayList<Item> items = new ArrayList<>();
        if (items.size() > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("The request with the entered name: " + name + " was not found.");
        }
        return true;
    }
}

