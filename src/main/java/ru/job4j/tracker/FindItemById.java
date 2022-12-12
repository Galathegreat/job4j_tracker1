package ru.job4j.tracker;

public class FindItemById implements UserAction {
    private final Output out;

    public FindItemById(Output out) {
        this.out = out;
    }

        @Override
        public String name() {
            return "Find Item by id";
        }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            System.out.println("=== Find Item by id===");
            int id = input.askInt("Enter id search item by id: ");
            Item item = tracker.findById(id);
            if (item != null) {
                System.out.println(item);
            } else {
                System.out.println("The request with the entered id: " + id + " was not found.");
            }
            return true;
        }
    }
