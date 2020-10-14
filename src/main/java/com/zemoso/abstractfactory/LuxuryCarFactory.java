package com.zemoso.abstractfactory;

import com.zemoso.factory.impl.Car;
import com.zemoso.factory.impl.Engine;
import com.zemoso.factory.impl.LuxuryCar;

public class LuxuryCarFactory implements CarAbstractFactory{
    public Car createCar() {
        return new LuxuryCar(new Engine("2400cc"), "BOSE Player");
    }
}
