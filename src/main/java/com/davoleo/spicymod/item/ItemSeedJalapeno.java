package com.davoleo.spicymod.item;

import com.davoleo.spicymod.SpicyMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
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

public class ItemSeedJalapeno extends Item {
    public ItemSeedJalapeno()
    {
        setRegistryName("jalapeno_seeds");        // The unique name that identifies this item, does NEVER change
        setUnlocalizedName(SpicyMod.MODID + ".jalapeno_seeds");     // Used for localization (en_US.lang)
        setCreativeTab(SpicyMod.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel()
    {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
