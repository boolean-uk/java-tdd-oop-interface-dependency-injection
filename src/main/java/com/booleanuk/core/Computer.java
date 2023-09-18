package com.booleanuk.core;

public class Computer {
    private PowerSupply psu;

    public Computer(PowerSupply psu){
        this.psu = psu;
    }

    public String turnOn() {
        if (this.psu.getWattage() < 100) {
            return "PSU is not powerful enough";
        }
        return "Turned on";
    }
}
