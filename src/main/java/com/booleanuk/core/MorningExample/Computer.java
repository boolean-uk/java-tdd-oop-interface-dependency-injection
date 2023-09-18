package com.booleanuk.core.MorningExample;

public class Computer {
    private PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public String turnOn() {
        if (this.psu.getWattage() < 100) {
            return "PSU in not powerful enough";
        }
        return "Turned On";
    }
}
