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

public class BlockCropHabanero extends BlockCrops {

    public BlockCropHabanero() {
        setTranslationKey("habanero_crop");
        setRegistryName("habanero_crop");
    }

    @Override
    protected Item getSeed() {
        return ModItems.seed_habanero;
    }

    @Override
    protected Item getCrop() {
        return ModItems.habanero;
    }

    public void registerItemModel(Item itemBlock)
    {
        SpicyMod.proxy.registerItemRenderer(itemBlock, 0, "habanero_crop");
    }
}
