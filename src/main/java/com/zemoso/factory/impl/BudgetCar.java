package com.zemoso.factory.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BudgetCar implements Car {
    private static final Logger logger = LoggerFactory.getLogger(BudgetCar.class);
    private final String price;
    private final Engine engine;

    public BudgetCar(Engine engine, String price) {
        this.engine = engine;
        this.price = price;
    }

    public void drive() {
        logger.info("sports car with " + price);
    }

    public String getEngine() {
        return engine.toString();
    }
}
