package com.booleanuk.examples;

public class CorsairPowerSupply implements PowerSupply {
    public int getWattage() {
        return 800;
    }

    public String Hello() {  //This method is not accessible via the interface in other classes. It must be targeted specifically through this class.
        return "Hello";
    }

}
