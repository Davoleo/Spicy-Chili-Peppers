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
 * Date: 26/06/2018
 * Hour: 19.05
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

//ItemJalapeno permette di aggiungere item successivi con più facilità
public class ItemJalapeno extends ItemFood {

    private Random random;

    public ItemJalapeno()
    {
        super(3, 0.4f, false);
        setRegistryName("jalapeno");
        setTranslationKey("jalapeno");
        setCreativeTab(SpicyMod.spicyTab);
        setAlwaysEdible();
    }

    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(TooltipsAndStrings.JALAPENO);
    }

    @Override
    protected void onFoodEaten(ItemStack Stack, World World, EntityPlayer Player)
    {
//        if (random.nextInt(3) + 1 > 1)
//        {
            Player.setFire(10);
//        }
//        else
//        {
//            Player.sendMessage(new TextComponentString(TooltipsAndStrings.JALAPENO_RESIST));
//        }
        Player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 2800, 1, false, false));
    }

    @SideOnly(Side.CLIENT)
    public void registerItemModel()
    {
        SpicyMod.proxy.registerItemRenderer(this, 0, "jalapeno");
    }

}
