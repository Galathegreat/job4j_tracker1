package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        int id = input.askInt("Enter id request for delete: ");
        if (tracker.delete(id)) {
            System.out.println("Request deleted successfully.");
        } else {
            System.out.println("Request deletion error.");
        }
        return true;
    }
}
