package com.davoleo.spicymod.block.crop;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/*************************************************
 * Author: Davoleo
 * Date: 16/07/2018
 * Hour: 18.01
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class BlockJalapenoCrop extends BlockCrops {

    public BlockJalapenoCrop()
    {
    setUnlocalizedName(SpicyMod.MODID + ".jalapeno_crop");
        setRegistryName("jalapeno_crop");
    }

    @Override
    protected Item getSeed()
    {
        return ModItems.jalapeno_seeds;
    }

    @Override
    protected Item getCrop()
    {
        return ModItems.jalapeno;
    }
}

