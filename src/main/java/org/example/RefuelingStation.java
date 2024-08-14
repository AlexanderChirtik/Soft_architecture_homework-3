package org.example;

public class RefuelingStation implements IRefueling{
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType) {
            case Diesel -> System.out.println("Заправка дизельным топлевом");
            case Gasoline -> System.out.println("Заправка бензином");
        }

    }
}
