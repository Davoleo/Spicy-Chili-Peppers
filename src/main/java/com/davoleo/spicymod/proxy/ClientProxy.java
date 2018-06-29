package com.davoleo.spicymod.proxy;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.ItemJalapeno;
import com.davoleo.spicymod.item.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
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

    //accepts an Item, an int, and a String.
    public void registerItemRenderer(ItemJalapeno item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation
                (item, meta, new ModelResourceLocation(SpicyMod.MODID + ":" + id, "inventory"));
        //Questo metodo chiama ModelLoader.setCustomModelResourceLocation che dice al gioco quale modello deve usare per l'item
    }

        @Override
        public void preInit(FMLPreInitializationEvent e) {
            super.preInit(e);
        }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.initModels();
    }

}
