package com.davoleo.spicymod.item.food;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.util.TooltipsAndStrings;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

/*************************************************
 * Author: Davoleo
 * Date: 30/06/2018
 * Hour: 21.47
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemHabanero extends ItemFood {

    private Random random;

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
        tooltip.add(TooltipsAndStrings.HABANERO);
    }

    protected void onFoodEaten(ItemStack Stack, World World, EntityPlayer Player)
    {
//        if (random.nextInt(3) + 1 > 1)
//        {
            Player.setFire(6);
//        }
//        else
//        {
//            Player.sendMessage(new TextComponentString(TooltipsAndStrings.HABANERO_RESIST));
//        }
        Player.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 2400, 1, true, false));
        Player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 1, true, false));
    }

    @SideOnly(Side.CLIENT)
    public void registerItemModel() {
        SpicyMod.proxy.registerItemRenderer(this, 0, "habanero");
    }

}
