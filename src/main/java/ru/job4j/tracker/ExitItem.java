package ru.job4j.tracker;

public class ExitItem implements UserAction {
    private final Output out;

    public ExitItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit programme";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Exit programme ===");
        return false;
    }
}
