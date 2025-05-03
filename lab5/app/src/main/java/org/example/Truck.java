package org.example;
import org.springframework.stereotype.Component;

@Component("truck")
public class Truck implements Transport {
    @Override
    public String getType() {
        return "Грузовой автомобиль";
    }
}