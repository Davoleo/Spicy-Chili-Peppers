package com.davoleo.spicymod.init;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/*************************************************
 * Author: Davoleo
 * Date: 29/06/2018
 * Hour: 17.10
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class SpicyCreativeTab extends CreativeTabs {

    public SpicyCreativeTab(){
        super(SpicyMod.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.jalapeno);
    }

}
