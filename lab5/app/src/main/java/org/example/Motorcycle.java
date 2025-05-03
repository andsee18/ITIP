package org.example;
import org.springframework.stereotype.Component;

@Component("motorcycle")
public class Motorcycle implements Transport {
    @Override
    public String getType() {
        return "Мотоцикл";
    }
}