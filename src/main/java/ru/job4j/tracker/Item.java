package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() { // конструктор без параметров
    }

    public Item(String name) { // конструктор с одним параметром
        this.name = name;
    }

    public Item(int id, String name) { // конструктор с двумя параметрами
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}