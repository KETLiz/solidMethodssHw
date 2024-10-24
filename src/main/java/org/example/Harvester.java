package org.example;

import java.awt.*;

public class Harvester extends Car {

    public Harvester(String mark, String model, Color color) {
        super(mark, model, color);
    }

    // подметание улицы
    public void sweeping() {
        System.out.println("Автомобиль метёт улицу");
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }
}
