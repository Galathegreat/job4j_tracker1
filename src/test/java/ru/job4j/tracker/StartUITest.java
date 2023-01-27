package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(
                new CreateAction(out),
                new ExitItem(out)
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName()).isEqualTo("Item name");
    }

    @Test
    public void whenEditItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        String id = String.valueOf(item.getId());
        Input in = new StubInput(
                new String[]{"0", id, replacedName, "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new EditItem(out),
                new ExitItem(out)
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replacedName);
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("=== Delete Item ==="));
        String id = String.valueOf(item.getId());
        Input in = new StubInput(
                new String[]{"0", id, "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new DeleteItem(out),
                new ExitItem(out)
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
    }

    @Test
    public void whenExitItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(
                new ExitItem(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + System.lineSeparator()
                        + "0. Exit programme" + System.lineSeparator()
                        + "=== Exit programme ===" + ln
        );
    }

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new EditItem(output),
                new ExitItem(output)
        );
        new StartUI(output).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Edit Item" + ln
                        + "1. Exit programme" + ln
                        + "=== Edit Item ===" + ln
                        + "Request changed successfully." + ln
                        + "Menu:" + ln
                        + "0. Edit Item" + ln
                        + "1. Exit programme" + ln
                        + "=== Exit programme ===" + ln
        );
    }

    @Test
    public void whenShowAllItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new ShowAllItem(output),
                new ExitItem(output)
        );
        new StartUI(output).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit programme" + ln
                        + "=== Show all items ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit programme" + ln
                        + "=== Exit programme ===" + ln
        );
    }

    @Test
    public void whenFindItemByName() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find Item by mane"));
        Input in = new StubInput(new String[]{"0", (item.getName()), "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new FindItemByName(output),
                new ExitItem(output)
        );
        new StartUI(output).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Find Item by mane" + ln
                        + "1. Exit programme" + ln
                        + "=== Find Item by name ===" + ln
                        + item + ln
                        + "Menu:" + ln
                        + "0. Find Item by mane" + ln
                        + "1. Exit programme" + ln
                        + "=== Exit programme ===" + ln
        );
    }

    @Test
    public void whenFindItemById() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new FindItemById(output),
                new ExitItem(output)
        );
        new StartUI(output).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Find Item by id" + ln
                        + "1. Exit programme" + ln
                        + "=== Find Item by id ===" + ln
                        + "The request with the entered id: " + 1 + " was not found." + ln
                        + "Menu:" + ln
                        + "0. Find Item by id" + ln
                        + "1. Exit programme" + ln
                        + "=== Exit programme ===" + ln
        );
    }
}

