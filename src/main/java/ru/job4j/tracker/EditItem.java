package ru.job4j.tracker;

public class EditItem implements UserAction {

    @Override
    public String name() {
        return "Edit Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ===");
        int id = input.askInt("Enter id request for replace: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Request changed successfully.");
        } else {
            System.out.println("Request replacement error.");
        }
        return true;
    }
}
