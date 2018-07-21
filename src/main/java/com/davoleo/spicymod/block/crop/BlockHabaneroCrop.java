package com.davoleo.spicymod.block.crop;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/*************************************************
 * Author: Davoleo
 * Date: 16/07/2018
 * Hour: 18.02
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class BlockHabaneroCrop extends BlockCrops {


    public BlockHabaneroCrop()
    {
        setUnlocalizedName(SpicyMod.MODID + ".habanero_crop");
        setRegistryName("habanero_crop");
    }

    @Override
    protected Item getSeed()
    {
        return ModItems.habanero_seeds;
    }

    @Override
    protected Item getCrop()
    {
        return ModItems.habanero;
    }

}
