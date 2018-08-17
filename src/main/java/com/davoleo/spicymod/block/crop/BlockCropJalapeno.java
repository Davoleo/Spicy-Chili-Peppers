package com.davoleo.spicymod.block.crop;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/*************************************************
 * Author: Davoleo
 * Date: 18/08/2018
 * Hour: 00.51
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class BlockCropJalapeno extends BlockCrops {

    public BlockCropJalapeno() {
        setTranslationKey("jalapeno_crop");
        setRegistryName("jalapeno_crop");
    }

    @Override
    protected Item getSeed() {
        return ModItems.seed_jalapeno;
    }

    @Override
    protected Item getCrop() {
        return ModItems.jalapeno;
    }

    public void registerItemModel(Item itemBlock)
    {
        SpicyMod.proxy.registerItemRenderer(itemBlock, 0, "jalapeno_crop");
    }
}
