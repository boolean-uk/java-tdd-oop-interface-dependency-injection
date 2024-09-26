package com.booleanuk.examples;

public class Main {
    public static void main(String[] args) {
//        PowerSupply psu = new KnockOffPowerSupply();
//        Computer myComputer = new Computer(psu);
//        System.out.println(myComputer.turnOn());
//        System.out.println(myComputer.getPsu());

        PowerSupply psu0 = new KnockOffPowerSupply();
        PowerSupply psu1 = new CorsairPowerSupply();
        PowerSupply psu2 = new KnockOffPowerSupply();
        PowerSupply psu3 = new CorsairPowerSupply();

        PowerSupply[] psus = new PowerSupply[]{psu0, psu1, psu2, psu3};
        for (PowerSupply psu : psus) {
            System.out.println(psu.getWattage());
        }

    }
}
