package com.davoleo.spicymod.item;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.block.BlockCropBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

/*************************************************
 * Author: Davoleo
 * Date: 13/08/2018
 * Hour: 11.13
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemSeedBase extends ItemSeeds {

    private String name;
    private BlockCropBase crop;

    public ItemSeedBase(String name, BlockCropBase crop)
    {

        super(crop, Blocks.FARMLAND);
        setUnlocalizedName(name);
        setRegistryName(name);

        this.name = name;
        this.crop = crop;

        setCreativeTab(SpicyMod.spicyTab);
    }

    public void registerItemModel()
    {
        SpicyMod.proxy.registerItemRenderer(this, 0, name);
    }


}
