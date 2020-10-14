package com.zemoso.test;

import com.zemoso.abstractfactory.BudgetCarFactory;
import com.zemoso.abstractfactory.LuxuryCarFactory;
import com.zemoso.abstractfactory.SportsCarFactory;
import com.zemoso.factory.CarFactory;
import com.zemoso.factory.impl.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer1 {
    private static final Logger logger = LoggerFactory.getLogger(Customer1.class);
    public static void main(String[] args) {
        Car car;
        //CUSTOMER TRYING TO ORDER LUXURY CAR
        car = CarFactory.createCar(new LuxuryCarFactory());
        logger.info("Engine = " + car.getEngine());
        car.drive();

        logger.info("------------------");
        //CUSTOMER TRYING TO ORDER SPORTS_CAR
        car = CarFactory.createCar(new SportsCarFactory());
        logger.info("Engine = " + car.getEngine());
        car.drive();

        car = CarFactory.createCar(new BudgetCarFactory());
        logger.info("Engine = " + car.getEngine());
        car.drive();
    }
}
