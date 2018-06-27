package com.davoleo.spicy_mod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.davoleo.spicy_mod.SpicyMod;
/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 19.05
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

//ItemBase permette di aggiungere item successivi con più facilità
public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {
        this.name = name;
        //L'unlocalizedName è quello utilizzato poi per tradurre il nome in gioco nella lingua attiva
        setUnlocalizedName(name);
        //Il registryName viene utilizzato da forge per registrare l'oggetto e non deve MAI CAMBIARE
        setRegistryName(name);
    }

    public void registerItemModel() {
        SpicyMod.proxy.registerItemRenderer(this, 0, name);
    }

    //The setCreativeTab method is an overriden version that returns ItemBase instead of Item
    //so we can use it in our register method without casting, as you’ll see later.
    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
