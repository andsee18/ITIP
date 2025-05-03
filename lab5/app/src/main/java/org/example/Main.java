package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Java Config
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем бин TransportService
        TransportService service = context.getBean(TransportService.class);

        // Вызываем метод бина и выводим результат
        service.printTransportType(); // Это уже есть в вашем коде

        // Получим и другие бины (Car, Motorcycle, Truck) и выведем их типы
        Car car = context.getBean("car", Car.class); // Получаем бин по имени и типу
        System.out.println("Тип Car: " + car.getType());

        Motorcycle motorcycle = context.getBean("motorcycle", Motorcycle.class);
        System.out.println("Тип Motorcycle: " + motorcycle.getType());

        Truck truck = context.getBean("truck", Truck.class);
        System.out.println("Тип Truck: " + truck.getType());

        context.close();
    }
}