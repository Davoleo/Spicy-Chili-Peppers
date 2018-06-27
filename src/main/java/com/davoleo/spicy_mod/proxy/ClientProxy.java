package com.davoleo.spicy_mod.proxy;

import com.davoleo.spicy_mod.SpicyMod;
import com.davoleo.spicy_mod.item.ItemBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 18.35
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/


public class ClientProxy extends CommonProxy {
    public void registerItemRenderer(ItemBase item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(SpicyMod.MODID + ":" + id, "inventory"));

    }
}
