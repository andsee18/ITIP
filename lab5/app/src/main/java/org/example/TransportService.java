package org.example;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class TransportService {
    private Transport transport;

    @Autowired
    public TransportService(@Qualifier("car") Transport transport) { // Указываем имя бина
        this.transport = transport;
    }

    public void printTransportType() {
        System.out.println("Тип транспорта: " + transport.getType());
    }
}