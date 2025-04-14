package org.example;

public class Transport {
    private String type;

    public Transport(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type cannot be null or empty");
        }    
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void displayInfo() {
        System.out.println("Транспортное средство: " + type);
    }
}