package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Transport car() {
        return new Car();
    }

    @Bean
    public TransportService transportService() {
        return new TransportService(car()); // Внедряем зависимость
    }
}