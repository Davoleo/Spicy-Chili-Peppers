package com.davoleo.spicymod.util;

import com.davoleo.spicymod.SpicyMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 16/06/2019 / 17:15
 * Class: Utils
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class Utils {

    public static void registerItemModel(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
