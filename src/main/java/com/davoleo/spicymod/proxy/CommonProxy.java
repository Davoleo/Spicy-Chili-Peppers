package com.davoleo.spicymod.proxy;

import net.minecraft.item.Item;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.common.Mod;

/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 18.33
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/


@Mod.EventBusSubscriber
public class CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id)
    {}


    public String localize(String unlocalized, Object... args)
    {
        return I18n.format(unlocalized, args);
    }

}