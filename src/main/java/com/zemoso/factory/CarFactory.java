package com.zemoso.factory;

import com.zemoso.abstractfactory.CarAbstractFactory;
import com.zemoso.factory.impl.Car;

public class CarFactory {

    public static Car createCar(CarAbstractFactory carAbstractFactory) {
        return carAbstractFactory.createCar();
    }

}
