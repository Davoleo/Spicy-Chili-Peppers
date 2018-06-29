package com.davoleo.spicymod.proxy;

import com.davoleo.spicymod.init.Config;
import com.davoleo.spicymod.item.ItemJalapeno;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 18.33
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/


@Mod.EventBusSubscriber
public class CommonProxy {

    // Config instance
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent e)
    {
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "SpicyChiliPeppers.cfg"));
        Config.readConfig();
    }

    public void init(FMLInitializationEvent e)
    {
    }

    public void postInit(FMLPostInitializationEvent e)
    {
        if (config.hasChanged())
        {
            config.save();
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new ItemJalapeno());
    }

}