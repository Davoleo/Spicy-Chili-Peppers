package com.davoleo.spicymod.spice;

import com.davoleo.spicymod.block.crop.BlockSpiceCrop;
import com.davoleo.spicymod.item.food.ItemSpice;
import com.davoleo.spicymod.item.seed.ItemSpiceSeed;
import net.minecraft.block.BlockCrops;

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
             if (name.contains(type.getName()))
             {
                 return type;
             }
         }

         return null;
    }

    public static BlockCrops getCropFromName(String name)
    {
        return new BlockSpiceCrop(name);
    }

    public static ItemSpice getFruitFromType(EnumChiliPeppers type)
    {
       return new ItemSpice(type.getName());
    }

    public static ItemSpiceSeed getSeedFromType(EnumChiliPeppers type)
    {
        return new ItemSpiceSeed(type.getName());
    }



}
