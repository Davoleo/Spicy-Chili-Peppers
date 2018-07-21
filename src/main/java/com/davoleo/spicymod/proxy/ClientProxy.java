package com.davoleo.spicymod.proxy;

import com.davoleo.spicymod.block.ModBlocks;
import com.davoleo.spicymod.item.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 18.35
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
            super.preInit(e);
        }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.initModels();
        ModBlocks.initModels();
    }

}
