package com.davoleo.spicymod.item;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.block.ModBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*************************************************
 * Author: Davoleo
 * Date: 16/07/2018
 * Hour: 18.05
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemSeedHabanero extends ItemSeeds {
    public ItemSeedHabanero()
    {
        super(ModBlocks.habanero_crop, Blocks.FARMLAND);
        setRegistryName("habanero_seeds");        // The unique name that identifies this item, does NEVER change
        setUnlocalizedName(SpicyMod.MODID + ".habanero_seeds");     // Used for localization (en_US.lang)
        setCreativeTab(SpicyMod.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel()
    {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
