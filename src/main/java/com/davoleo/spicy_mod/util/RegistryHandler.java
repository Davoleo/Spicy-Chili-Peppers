package com.davoleo.spicy_mod.util;

import com.davoleo.spicy_mod.item.ItemBase;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 19.29
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register event) {
        final Item[] items = {
                new ItemBase("itemBase")
        };

        event.getRegistry().registerAll(items);
    }
}
