package com.davoleo.spicymod.spice;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 14/04/2019 / 18:03
 * Enum: EnumChiliPeppers
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2019
 **************************************************/

public enum EnumChiliPeppers {

    JALAPENO(1, "jalapeno", 3, 0.4F),
    HABANERO(2, "habanero", 5, 1F),;

    private int id;
    private String name;
    private int foodPts;
    private float saturationPts;

    EnumChiliPeppers(int id, String name, int foodPts, float saturationPts)
    {
        this.id = id;
        this.name = name;
        this.foodPts = foodPts;
        this.saturationPts = saturationPts;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getFoodPts()
    {
        return foodPts;
    }

    public float getSaturationPts()
    {
        return saturationPts;
    }
}

