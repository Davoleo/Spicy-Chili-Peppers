package com.davoleo.spicymod;

import com.davoleo.spicymod.block.ModBlocks;
import com.davoleo.spicymod.util.Config;
import com.davoleo.spicymod.util.SpicyTab;
import com.davoleo.spicymod.item.ModItems;
import com.davoleo.spicymod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

@Mod(modid = SpicyMod.MODID, name = SpicyMod.MODNAME, version = SpicyMod.MODVERSION)
public class SpicyMod {
    public static final String MODID = "spicymod";
    public static final String MODNAME = "Spicy Chili Peppers";
    public static final String MODVERSION = "@VERSION@";

    public static final Item.ToolMaterial spiceToolMaterial = EnumHelper.addToolMaterial("SPICE", 3, 500, 10, 6, 10);

    public static Configuration config;

    public static final SpicyTab spicyTab = new SpicyTab();


    @Mod.Instance
    public static SpicyMod instance;

    @SidedProxy(serverSide = "com.davoleo.spicymod.proxy.CommonProxy", clientSide = "com.davoleo.spicymod.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "SpicyChiliPeppers.cfg"));
        Config.readConfig();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {}

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        if (config.hasChanged())
        {
            config.save();
        }
    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }

    }
}
