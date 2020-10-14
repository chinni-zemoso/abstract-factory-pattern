package com.zemoso.abstractfactory;

import com.zemoso.factory.impl.Car;
import com.zemoso.factory.impl.Engine;
import com.zemoso.factory.impl.SportsCar;

public class BudgetCarFactory implements CarAbstractFactory {
    public Car createCar() {
        return new SportsCar(new Engine("1000cc"), "1,00,000");
    }
}
