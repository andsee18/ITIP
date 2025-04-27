package org.example.transport;

public class Main {
    public static void main(String[] args) {
        TransportnoeSredstvo vehicle = new TransportnoeSredstvo("Generic Vehicle", 100);
        LegkovoiAvtomobil car = new LegkovoiAvtomobil("Toyota Camry", 180, 5);
        GruzovoiAvtomobil truck = new GruzovoiAvtomobil("Volvo FH16", 120, 20000);
        Mototsikl motorcycle = new Mototsikl("Harley-Davidson", 200, false);

        vehicle.move();
        car.move();
        truck.move();
        motorcycle.move();

        System.out.println("Car model: " + car.getModel());
        System.out.println("Truck cargo capacity: " + truck.getCargoCapacity());
    }
}