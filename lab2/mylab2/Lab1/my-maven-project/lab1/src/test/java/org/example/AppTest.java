package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCarType() {
        Transport car = new Car();
        assertEquals("Легковой автомобиль", car.getType(), "Тип автомобиля должен быть 'Легковой автомобиль'");
    }

    @Test
    public void testTruckType() {
        Transport truck = new Truck();
        assertEquals("Грузовой автомобиль", truck.getType(), "Тип грузовика должен быть 'Грузовой автомобиль'");
    }

    @Test
    public void testMotorcycleType() {
        Transport motorcycle = new Motorcycle();
        assertEquals("Мотоцикл", motorcycle.getType(), "Тип мотоцикла должен быть 'Мотоцикл'");
    }

    @Test
    public void testDisplayInfo() {
        Transport car = new Car();
        // Поскольку displayInfo выводит в консоль, можно улучшить класс для захвата вывода,
        // но для простоты проверим, что метод выполняется без ошибок.
        assertDoesNotThrow(() -> car.displayInfo(), "displayInfo должен выполняться без исключений");
    }
}