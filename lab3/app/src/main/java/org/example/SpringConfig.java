package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public LegkovoiAvtomobil legkovoiAvtomobil() {
        return new LegkovoiAvtomobil("Легковой автомобиль", 5);
    }

    @Bean
    public GruzovoiAvtomobil gruzovoiAvtomobil() {
        return new GruzovoiAvtomobil("Грузовой автомобиль", 1000.0);
    }

    @Bean
    public Motocikl motocikl() {
        return new Motocikl("Мотоцикл", false);
    }
}