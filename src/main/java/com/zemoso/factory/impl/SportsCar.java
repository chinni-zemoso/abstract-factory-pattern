package com.zemoso.factory.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SportsCar implements Car {
    private static final Logger logger = LoggerFactory.getLogger(SportsCar.class);
    private final String pickup;
    private final Engine engine;

    public SportsCar(Engine engine, String pickup) {
        this.engine = engine;
        this.pickup = pickup;
    }

    public void drive() {
        logger.info("sports car with " + pickup);
    }

    public String getEngine() {
        return engine.toString();
    }

}
