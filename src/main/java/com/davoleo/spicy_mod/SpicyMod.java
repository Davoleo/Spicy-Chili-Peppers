package com.davoleo.spicy_mod;

import com.davoleo.spicy_mod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SpicyMod.MODID, name = SpicyMod.NAME, version = SpicyMod.VERSION)
public class SpicyMod {
    public static final String MODID = "spicymod";
    public static final String NAME = "Spicy Chili Peppers";
    public static final String VERSION = "@VERSION@";

    private static Logger logger;

    @SidedProxy(serverSide = "com.davoleo.spicy_mod.proxy.CommonProxy", clientSide = "com.davoleo.spicy_mod.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static SpicyMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(MODID + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}