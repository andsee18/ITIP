package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // Получаем бины из Spring контейнера
        LegkovoiAvtomobil legkovoi = context.getBean(LegkovoiAvtomobil.class);
        GruzovoiAvtomobil gruzovoi = context.getBean(GruzovoiAvtomobil.class);
        Motocikl motocikl = context.getBean(Motocikl.class);

        // Выводим информацию о каждом бине
        System.out.println("Тип легкового автомобиля: " + legkovoi.getTip() + ", Мест: " + legkovoi.getKolichestvoMest());
        System.out.println("Тип грузового автомобиля: " + gruzovoi.getTip() + ", Грузоподъемность: " + gruzovoi.getGruzopodemnost());
        System.out.println("Тип мотоцикла: " + motocikl.getTip() + ", С коляской: " + motocikl.hasSidecar());

        context.close();
    }
}