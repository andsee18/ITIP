package org.example.transport;
public class TransportnoeSredstvo {
    private String model;
    private int maxSpeed;

    public TransportnoeSredstvo(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void move() {
        System.out.println("Транспортное средство движется");
    }
}