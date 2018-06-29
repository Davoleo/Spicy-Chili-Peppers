package com.davoleo.spicymod;

import com.davoleo.spicymod.init.SpicyCreativeTab;
import com.davoleo.spicymod.proxy.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SpicyMod.MODID, name = SpicyMod.MODNAME, version = SpicyMod.MODVERSION,  useMetadata = true)
public class SpicyMod {
    public static final String MODID = "spicymod";
    public static final String MODNAME = "Spicy Chili Peppers";
    public static final String MODVERSION = "@VERSION@";

    public static final SpicyCreativeTab creativeTab = new SpicyCreativeTab();

    @SidedProxy(serverSide = "com.davoleo.spicymod.proxy.CommonProxy", clientSide = "com.davoleo.spicymod.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static SpicyMod instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    logger = event.getModLog();
    proxy.preInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event); }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
    }
