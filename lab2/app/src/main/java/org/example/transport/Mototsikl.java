package org.example.transport;
public class Mototsikl extends TransportnoeSredstvo {
    private boolean hasSidecar;

    public Mototsikl(String model, int maxSpeed, boolean hasSidecar) {
        super(model, maxSpeed);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    @Override
    public void move() {
        System.out.println("Мотоцикл мчится");
    }
}