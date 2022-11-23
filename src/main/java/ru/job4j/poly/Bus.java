package ru.job4j.poly;

public class Bus implements Transport {
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
