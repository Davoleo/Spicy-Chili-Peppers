package com.davoleo.spicy_mod.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.davoleo.spicy_mod.SpicyMod;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 19.05
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

//ItemJalapeno permette di aggiungere item successivi con più facilità
public class ItemJalapeno extends Item {

    public ItemJalapeno() {
        setRegistryName("jalapeno");        // The unique name that identifies this item, does NEVER change
        setUnlocalizedName(SpicyMod.MODID + ".jalapeno");     // Used for localization (en_US.lang)
        setCreativeTab(SpicyMod.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
