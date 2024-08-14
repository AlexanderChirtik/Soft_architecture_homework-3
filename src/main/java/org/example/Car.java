package org.example;

import java.awt.*;

public abstract class Car {

    //region Constructors

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }
    //endregion

    //region Public Methods

    //Движение
    public abstract void movement();

    //Обслуживание
    public abstract void maintenance();

    //Переключение передач
    public abstract boolean gearShifting();

    //Включение фар
    public abstract boolean switchHeadLights();

    //Включение дворников
    public abstract boolean switchWipers();

    //Включение противотуманных фар
    public boolean switchFogLights() {
        fogLights = !fogLights;
        return fogLights;
    }

    //Установка числа колес
    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    //Получение количества числа колес
    public int getWheelsCount() {
        return wheelsCount;
    }


    //endregion

    //region Private Fields

    //Марка автомобиль
    private String make;

    private String model;
    private Color color;
    protected CarType type;
    private int wheelsCount;
    protected FuelType fuelType;
    private GearboxType gearboxType;

    //Объем двигателя
    private double engineCapacity;

    //Состояние противотуманных фар
    private boolean fogLights = false;

    //endregion
}
