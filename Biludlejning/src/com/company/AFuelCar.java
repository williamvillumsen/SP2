package com.company;

public abstract class AFuelCar extends ACar
{
    //FIELDS
    int kmPerLitre;

    //CONSTRUCTOR
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPerLitre = kmPerLitre;
    }

    //METHODS
    abstract String getFuelType();

    int getKmPrLitre()
    {
        return kmPerLitre;
    }
}
