package com.davoleo.spicy_mod.util;

import com.davoleo.spicy_mod.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 19.39
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {


@SubscribeEvent
public static void registerModels(ModelRegistryEvent event){
    registerModel(ModItems.BASIC_ITEM);
    }

    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}