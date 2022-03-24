package com.company;

public class GasolinCar extends AFuelCar
{
    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre)
    {

        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);

    }

    @Override
    public String getFuelType()
    {
        return "GasolineCar";
    }

    @Override
    public int getKmPerlitre()
    {
        return 0;
    }
}
