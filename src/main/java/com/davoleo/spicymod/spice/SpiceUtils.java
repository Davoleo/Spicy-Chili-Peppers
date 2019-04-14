package com.davoleo.spicymod.spice;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 14/04/2019 / 18:45
 * Class: SpiceUtils
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class SpiceUtils {

    public static EnumChiliPeppers getSpiceTypeFromName(String name)
    {
         for (EnumChiliPeppers type : EnumChiliPeppers.values())
         {
             if (name.toUpperCase().contains(type.name()))
             {
                 return type;
             }
         }

         return null;
    }

}
