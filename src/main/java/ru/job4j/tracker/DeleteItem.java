package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    private final Output out;

    public Output getOut() {
        return out;
    }

    public DeleteItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete Item ===");
        int id = input.askInt("Enter id request for delete: ");
        if (tracker.delete(id)) {
            out.println("Request deleted successfully.");
        } else {
            out.println("Request deletion error.");
        }
        return true;
    }
}
