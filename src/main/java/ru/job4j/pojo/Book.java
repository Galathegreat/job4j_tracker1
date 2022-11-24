package ru.job4j.pojo;

import ru.job4j.poly.Transport;

public class Book {
    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static class Bus implements Transport {
        @Override
        public void ride() {
            System.out.println("Ride");
        }

        @Override
        public void passengers(int passAmount) {
            int pass = passAmount;
        }

        @Override
        public double refuel(double fuelAmount) {
            double price = 32;
            return fuelAmount * price;
        }
    }
}
