package com.booleanuk.examples;

public class Computer {
    PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public String turnOn() {
        if(this.psu.getWattage() < 100) {
            return "PSU not powerful enough!";
        }
        return "Turned on";
    }

    public PowerSupply getPsu() {
        return psu;
    }

}
