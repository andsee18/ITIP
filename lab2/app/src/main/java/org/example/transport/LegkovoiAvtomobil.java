package org.example.transport;
public class LegkovoiAvtomobil extends TransportnoeSredstvo {
    private int passengerCapacity;

    public LegkovoiAvtomobil(String model, int maxSpeed, int passengerCapacity) {
        super(model, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("Легковой автомобиль едет");
    }
}