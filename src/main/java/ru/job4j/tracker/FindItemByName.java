package ru.job4j.tracker;

public class FindItemByName implements UserAction {

    @Override
    public String name() {
        return "Find Item by mane";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find Item by name===");
        int id = input.askInt("Enter id search item by name: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("The request with the entered name: " + id + " was not found.");
        }
        return true;
    }
}
