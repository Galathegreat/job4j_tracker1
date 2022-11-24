package ru.job4j.pojo;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle airbus = new Airbus();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[] {airbus, train, bus};
        for (Vehicle a: vehicles) {
            a.move();
        }
    }
}
