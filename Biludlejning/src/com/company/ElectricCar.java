package com.company;

public class ElectricCar extends ACar
{
    //FIELDS
    public int maxRange;
    public int batteryCapacity;

    //CONSTRUCTORS
    public ElectricCar(String registrationsNumber, String make, String model, int numberOfDoors, int batteryCapacity,int maxRange);
    this.batteryCapacity = batteryCapacity;
    this.maxRange = maxRange;

    //METHODS
    public int getBatteryCapacity()
    {
        return batteryCapacity; //returns battery capacity in kWh
    }
}
