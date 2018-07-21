package com.davoleo.spicymod.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import com.davoleo.spicymod.SpicyMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import javax.annotation.Nullable;
import java.util.List;

/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 19.05
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

//ItemJalapeno permette di aggiungere item successivi con più facilità
public class ItemJalapeno extends ItemFood {

    public ItemJalapeno()
    {
        super(3, 0.4f, false);
        setRegistryName("jalapeno");        // The unique name that identifies this item, does NEVER change
        setUnlocalizedName(SpicyMod.MODID + ".jalapeno");     // Used for localization (en_US.lang)
        setCreativeTab(SpicyMod.creativeTab);
        setAlwaysEdible();

    }

    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(TextFormatting.RED + "It feels spicy even to keep it in your hands!");
    }

    @Override
    protected void onFoodEaten(ItemStack Stack, World World, EntityPlayer Player)
    {
        Player.setFire(10);
        Player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 2800, 1, false, false));
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
