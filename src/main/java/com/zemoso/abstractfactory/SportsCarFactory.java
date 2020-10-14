package com.zemoso.abstractfactory;


import com.zemoso.factory.impl.Car;
import com.zemoso.factory.impl.Engine;
import com.zemoso.factory.impl.SportsCar;

public class SportsCarFactory implements CarAbstractFactory {
    public Car createCar() {
        return new SportsCar(new Engine("3200cc"), "0-100MPH/4sec");
    }
}
