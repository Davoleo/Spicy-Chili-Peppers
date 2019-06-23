package com.davoleo.spicymod.handler;

import com.davoleo.spicymod.item.ModItems;
import com.davoleo.spicymod.item.tool.ItemSpiceBow;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 09/04/2019 / 00:46
 * Class: ArrowHandler
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class ArrowHandler {

    public static void onBowReleased(ArrowLooseEvent event)
    {
        if (event.getBow().getItem() instanceof ItemSpiceBow)
        {
        }
    }

    public static void zoom(FOVUpdateEvent event) {
        if (event.getEntity().getActiveItemStack() != null && event.getEntity().getActiveItemStack().getItem() == ModItems.spice_bow)
            event.setNewfov(event.getFov() * ((ItemSpiceBow) event.getEntity().getActiveItemStack().getItem()).getZoom(event.getEntity()));
    }

}
