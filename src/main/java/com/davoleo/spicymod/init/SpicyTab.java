package com.davoleo.spicymod.init;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/*************************************************
 * Author: Davoleo
 * Date: 13/08/2018
 * Hour: 10.43
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class SpicyTab extends CreativeTabs {

    public SpicyTab()
    {
        super(SpicyMod.MODNAME);
        setBackgroundImageName("");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.jalapeno);
    }
}