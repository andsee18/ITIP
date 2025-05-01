package org.example;

public class TransportService {
    private Transport transport;

    // Внедрение зависимости через конструктор
    public TransportService(Transport transport) {
        this.transport = transport;
    }

    public void showTransportInfo() {
        System.out.println("Тип транспорта: " + transport.getType());
    }
}