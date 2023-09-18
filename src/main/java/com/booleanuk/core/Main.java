package com.booleanuk.core;

public class Main {

    public static void main(String[] args){
        PowerSupply psu = new KnockOffPowerSupply();
        Computer myComputer = new Computer(psu);
        System.out.println(myComputer.turnOn());
    }
}
