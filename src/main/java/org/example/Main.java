package org.example;

import java.awt.*;

/**
 * добавить класс Мойка, на которую автомобиль будет заезжать
 * добавить метод в класс Car - возможность загнать автомобиль на мойку
 * создать парк автомобилей, несколько моек и заправочных станций
 * отправить автомобиль на мойку, а потом на заправочную станцию
 */

public class Main {
    public static void main(String[] args) {
        RefluelingStation refluelingStation = new RefluelingStation();
        Washing1 w1 = new Washing1();
        Washing2 w2 = new Washing2();

        Harvester h = new Harvester("Opel", "dld", Color.BLACK);

        h.setWipping(w2);
        h.wipe();

        h.setFuelType(FuelType.DIEZEL);
        h.setRefueling(refluelingStation);
        h.fuel();

    }
}