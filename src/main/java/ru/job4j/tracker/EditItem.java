package ru.job4j.tracker;

public class EditItem implements UserAction {
    private final Output out;

    public EditItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit Item ===");
        int id = input.askInt("Enter id request for replace: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Request changed successfully.");
        } else {
            out.println("Request replacement error.");
        }
        return true;
    }
}
