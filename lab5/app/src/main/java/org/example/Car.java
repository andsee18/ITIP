package org.example;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Transport {
    @Override
    public String getType() {
        return "Легковой автомобиль";
    }
}