package com.zemoso.factory.impl;

public class Engine {
    private final String power;

    public Engine(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine [power=" + power + "]";
    }

}
