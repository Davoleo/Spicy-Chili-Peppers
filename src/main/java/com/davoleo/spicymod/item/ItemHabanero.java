package com.davoleo.spicymod.item;

import com.davoleo.spicymod.SpicyMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*************************************************
 * Author: Davoleo
 * Date: 30/06/2018
 * Hour: 21.47
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemHabanero extends ItemFood {

    public ItemHabanero()
    {
        super(5,1F, false);
        setRegistryName("habanero");
        setUnlocalizedName(SpicyMod.MODID + ".habanero");
        setCreativeTab(SpicyMod.creativeTab);
    }


    @Override
    protected void onFoodEaten(ItemStack Stack, World World, EntityPlayer Player)
    {
        Player.setFire(6);
        Player.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 2400, 1, true, false));
        Player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 1, true, false));
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
