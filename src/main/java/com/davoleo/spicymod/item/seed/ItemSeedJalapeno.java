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

public class ItemSeedJalapeno extends ItemSeeds {

    public ItemSeedJalapeno()
    {
        super(ModBlocks.crop_jalapeno, Blocks.FARMLAND);
        setTranslationKey("jalapeno_seed");
        setRegistryName("jalapeno_seed");
        setCreativeTab(SpicyMod.spicyTab);
    }

    public void registerItemModel()
    {
        SpicyMod.proxy.registerItemRenderer(this, 0, "jalapeno_seed");
    }
}
