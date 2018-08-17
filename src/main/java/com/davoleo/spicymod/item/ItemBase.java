package com.davoleo.spicymod.item;

import com.davoleo.spicymod.SpicyMod;
import net.minecraft.item.Item;

/*************************************************
 * Author: Davoleo
 * Date: 13/08/2018
 * Hour: 10.00
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name)
    {
        this.name = name;
        setTranslationKey(name);
        setRegistryName(name);

        setCreativeTab(SpicyMod.spicyTab);
    }

    public void registerItemModel()
    {
        SpicyMod.proxy.registerItemRenderer(this, 0, name);
    }



}
