package com.davoleo.spicymod.item.food;

import com.davoleo.spicymod.SpicyMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

/*************************************************
 * Author: Davoleo
 * Date: 17/08/2018
 * Hour: 16.14
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemChili extends ItemFood {

    public ItemChili()
    {
        super(2, 0f, false);
        setRegistryName("chili_sauce");
        setTranslationKey("chili_sauce");
        setCreativeTab(SpicyMod.spicyTab);
        setAlwaysEdible();
    }

    @Nonnull
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }

    @Override
    public void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
    {
        player.setFire(15);
        player.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
    }

}
