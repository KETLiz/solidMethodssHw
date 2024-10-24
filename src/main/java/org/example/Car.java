package org.example;

import java.awt.*;

public abstract class Car implements Fueling, Wipe {

    //region Public Constructors

    public Car(String mark, String model, Color color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    //endregion

    //region Public Methods
    // движение
    public abstract void movement();

    // тех обслуживание
    public abstract void maintenance();

    // переключение передач
    public abstract boolean gearShifting();

    // включение фар
    public abstract boolean switchHeadLights();

    // выключение дворников
    public abstract  boolean switchWipers();

    public boolean switchFogLights() {
        return !fogLights;
    }

    @Override
    public void fuel() {
        if(refuelingStation != null) {
            refuelingStation.fuel(fuelType);
        }
    }

    @Override
    public void wipe() {
        wipping.wipMirrows();
        wipping.wipWindshield();
        wipping.wipHeadLights();
    }

    public void setRefueling(Refueling refuelingStation) {
        this.refuelingStation = refuelingStation;
        System.out.println("Автомобиль заехал на заправку");
    }

    public void setWipping(Wipping wipping) {
        this.wipping = wipping;
        System.out.println("Автомобиль заехал на мойку");
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    //endregion

    //region Private Fields
    private Refueling refuelingStation; // какая-либо заправочная станция
    private Wipping wipping; // какая-то мойка
    private String mark; // марка автомобиля
    private String model; // модель автомобиля
    private Color color; // цвет
    private CarType type; // тип
    private int wheelCount; // число колёс
    protected FuelType fuelType; // тип топлива
    private GearboxType gearboxType; // тип коробки передач
    private double engineCapacity; // объём двигателя
    private boolean fogLights = false; // противотуманные фары
    //endregion
}
