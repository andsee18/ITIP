package org.example;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport truck = new Truck();
        Transport motorcycle = new Motorcycle();

        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();
    }
}