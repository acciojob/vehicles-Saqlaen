package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    public void setName(String name ){
        this.name = name;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    @Override
    public String getVehicleName() {
        return null;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
