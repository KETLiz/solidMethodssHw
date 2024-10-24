package org.example;

public class RefluelingStation implements Refueling {
    
    @Override
    public void fuel(FuelType fuelType) {
        switch(fuelType) {
            case DIEZEL -> System.out.println("Заправка дизельным топливом");
            case GAZOLINE -> System.out.println("Заправка бензином");
        }
    }
}
