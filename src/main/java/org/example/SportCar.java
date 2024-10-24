package org.example;

import java.awt.*;

public class SportCar extends Car{

    public SportCar(String mark, String model, Color color) {
        super(mark, model, color);
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
