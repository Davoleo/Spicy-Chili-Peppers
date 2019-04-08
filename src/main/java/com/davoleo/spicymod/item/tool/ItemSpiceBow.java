package com.davoleo.spicymod.item.tool;

import com.davoleo.spicymod.SpicyMod;
import net.minecraft.item.ItemBow;
import net.minecraft.util.ResourceLocation;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 09/04/2019 / 00:24
 * Class: ItemSpiceBow
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class ItemSpiceBow extends ItemBow {

    public ItemSpiceBow()
    {
        setTranslationKey(SpicyMod.MODID + ".spice_bow");
        setRegistryName(new ResourceLocation(SpicyMod.MODID, "spice_bow"));

    }

    public void registerItemModel()
    {
        SpicyMod.proxy.registerItemRenderer(this, 0, "spice_bow");
    }
}
