package com.davoleo.spicymod.item.food;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.util.Tooltips;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

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
        setTranslationKey("habanero");
        setRegistryName("habanero");
        setCreativeTab(SpicyMod.spicyTab);
        setAlwaysEdible();
    }

    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(Tooltips.HABANERO);
    }

    protected void onFoodEaten(ItemStack Stack, World World, EntityPlayer Player)
    {
        Player.setFire(6);
        Player.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 2400, 1, true, false));
        Player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 1, true, false));
    }

    @SideOnly(Side.CLIENT)
    public void registerItemModel() {
        SpicyMod.proxy.registerItemRenderer(this, 0, "habanero");
    }

}
