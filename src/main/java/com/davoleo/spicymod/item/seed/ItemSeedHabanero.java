package com.davoleo.spicymod.item.seed;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

/*************************************************
 * Author: Davoleo
 * Date: 18/08/2018
 * Hour: 00.45
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemSeedHabanero extends ItemSeeds {

    public ItemSeedHabanero()
    {
        super(ModBlocks.crop_habanero, Blocks.FARMLAND);
        setTranslationKey("habanero_seed");
        setRegistryName("habanero_seed");
        setCreativeTab(SpicyMod.spicyTab);
    }

    public void registerItemModel()
    {
        SpicyMod.proxy.registerItemRenderer(this, 0, "habanero_seed");
    }


}
