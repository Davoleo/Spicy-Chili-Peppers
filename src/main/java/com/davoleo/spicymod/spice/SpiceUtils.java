package com.davoleo.spicymod.spice;

import com.davoleo.spicymod.block.ModBlocks;
import com.davoleo.spicymod.block.crop.BlockSpiceCrop;
import com.davoleo.spicymod.item.ModItems;
import com.davoleo.spicymod.item.food.ItemSpice;
import com.davoleo.spicymod.item.seed.ItemSpiceSeed;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 14/04/2019 / 18:45
 * Class: SpiceUtils
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class SpiceUtils {

    public static ItemSpiceSeed getSeedsFromType(EnumChiliPeppers type)
    {
        for (ItemSpiceSeed seed : ModItems.seeds)
        {
            if (seed.getType() == type)
                return seed;
        }
        throw null;
    }

    public static ItemSpice getFruitFromType(EnumChiliPeppers type)
    {
        for (ItemSpice fruit : ModItems.spices)
        {
            if (fruit.getType() == type)
                return fruit;
        }
        return null;
    }

    public static BlockSpiceCrop getCropFromType(EnumChiliPeppers type)
    {
        for (BlockSpiceCrop crop : ModBlocks.cropBlocks)
        {
            if (crop.getType() == type)
                return crop;
        }
        return null;
    }

}
