package org.example.transport;
public class GruzovoiAvtomobil extends TransportnoeSredstvo {
    private int cargoCapacity;

    public GruzovoiAvtomobil(String model, int maxSpeed, int cargoCapacity) {
        super(model, maxSpeed);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void move() {
        System.out.println("Грузовой автомобиль везет груз");
    }
}