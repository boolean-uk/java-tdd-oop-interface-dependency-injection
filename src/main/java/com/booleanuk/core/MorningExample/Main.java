package com.booleanuk.core.MorningExample;

public class Main {

    public static void main(String[] args) {
        PowerSupply corsairPowerSupply = new CorsairPowerSupply();
        Computer myComputer = new Computer(corsairPowerSupply);
        System.out.println(myComputer.turnOn());
    }

}
