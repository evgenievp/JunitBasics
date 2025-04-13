package org.example;

import java.util.function.Supplier;

public class Car implements CarInterface {
    public int fuel;

    public Car() {
        this.fuel = 100;
    }

    @Override
    public String drive() {
        this.fuel -= 10;
        return "Accelerating";
    }

    @Override
    public String refuel() {
        this.fuel = 100;
        return "Fuel tank is filled.";
    }

    @Override
    public String startEngine() {
        return "brr...";
    }

    @Override
    public String pressBreaks() {
        return "Speed is slowing.";
    }

    @Override
    public boolean hasFuel() {
        if (this.fuel > 0) {
           return true;
        }
        return false;
    }

}
