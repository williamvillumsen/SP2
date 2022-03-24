package com.company;

public class DieselCar extends AFuelCar
{
    //FIELDS
    public boolean particleFilter;
    private int fee;

    //CONSTRUCTOR
    public DieselCar (String registrationNumber, String make, String model, int numberOfDoors, boolean particleFilter)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
        this.particleFilter = particleFilter;
    }

    //METHODS
    private boolean hasParticleFilter()
    {
        return particleFilter;
    }

    @Override
    public String getFuelType()
    {
        return "DieselCar";
    }

    @Override
    public int getKmPerLitre()
    {
        return 0;
    }

    public int getRegistrationFee()
    {
        int registrationFee;
        int particleCost = 1000;

        if(kmPerLitre >= 21)
        {
            registrationFee = 130;
        } else if(kmPerLitre >= 15 && kmPerLitre <= 20)
        {
            registrationFee = 1390;
        }
        else if(kmPerLitre >= 10 && kmPerLitre <= 14)
        {
            registrationFee = 1850;
        }
        else if(kmPerLitre >= 5 && kmPerLitre <= 9)
        {
            registrationFee = 2770;
        }
        else
        {
            registrationFee = 15260;
        }
        if(!particleFilter)
        {
            return registrationFee += particleCost;
        }
        return registrationFee;
    }

}
