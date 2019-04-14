package com.davoleo.spicymod.handler;

import com.davoleo.spicymod.item.tool.ItemSpiceBow;
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

}
