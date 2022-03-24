package com.company;

public abstract class ACar implements Car
{
    //FIELDS
    private String registrationNumber;
    public String make;
    public String model;
    public int numberOfDoors;

    //CONSTRUCTORS
    public ACar(String registrationNumber, String make, String model, int numberOfDoors)
    {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    //METHODS
    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }
}
