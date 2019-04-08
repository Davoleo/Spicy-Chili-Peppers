package com.davoleo.spicymod;

import com.davoleo.spicymod.handler.ArrowHandler;
import com.davoleo.spicymod.proxy.CommonProxy;
import com.davoleo.spicymod.util.SpicyTab;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SpicyMod.MODID, name = SpicyMod.MODNAME, version = SpicyMod.MODVERSION, dependencies = "required-after:forge@[14.23.5.2768,)", acceptedMinecraftVersions = "[1.12.2]")
public class SpicyMod {
    public static final String MODID = "spicymod";
    public static final String MODNAME = "Spicy Chili Peppers";
    public static final String MODVERSION = "0.1.0";

    public static final Item.ToolMaterial spiceToolMaterial = EnumHelper.addToolMaterial("SPICE", 3, 500, 14, 6, 10);

    public static final SpicyTab spicyTab = new SpicyTab();

    @Mod.Instance
    public static SpicyMod instance;

    @SidedProxy(serverSide = "com.davoleo.spicymod.proxy.CommonProxy", clientSide = "com.davoleo.spicymod.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(ArrowHandler.class);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
