package com.davoleo.spicymod.util;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.tool.ItemHammer;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.client.event.MouseEvent;


/*************************************************
 * Author: Davoleo
 * Date: 20/08/2018
 * Hour: 00.04
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(value = Side.CLIENT, modid = SpicyMod.MODID)
public class ClientHandler {

    @SubscribeEvent
    public static void onMouseInput(MouseEvent event)
    {
        if(Minecraft.getMinecraft().currentScreen == null)
        {
            EntityPlayer player = Minecraft.getMinecraft().player;
            ItemStack held = player.getHeldItem(EnumHand.MAIN_HAND);
            if(event.getDwheel() != 0 && held.getItem() instanceof ItemHammer)
            {
                //SpicyMod.network.send

                //TODO : Create networking classes
                //Xtones.NETWORK_WRAPPER.sendToServer(new MessageCycleXtone(event.getDwheel() > 0));
                //event.setCanceled(true);
            }
        }
    }

}
