package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarUnitTests {

    Car opel = new Car();

    @org.junit.Test
    public void testStartEngine() {
        assertEquals("brr...", opel.startEngine());
    }

    @Test
    public void testCarHaveFuel() {
        boolean result = opel.hasFuel();
        assertTrue(true, String.valueOf(result));
    }

    @Test
    public void testBrakes() {
        opel.startEngine();
        assertEquals("Speed is slowing.", opel.pressBreaks());
    }

    @Test
    public void testDrive() {
        assertEquals("Accelerating", opel.drive());
    }

    @Test
    public void testRefuel() {
        assertEquals("Fuel tank is filled.", opel.refuel());
    }

}
