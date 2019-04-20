package com.davoleo.spicymod.block.crop;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.food.ItemSpice;
import com.davoleo.spicymod.spice.EnumChiliPeppers;
import com.davoleo.spicymod.spice.IChiliPepper;
import com.davoleo.spicymod.spice.SpiceUtils;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import java.util.Objects;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 14/04/2019 / 18:01
 * Class: BlockSpiceCrop
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class BlockSpiceCrop extends BlockCrops implements IChiliPepper {

    private String name;

    public BlockSpiceCrop(String name)
    {
        this.name = name;
        setRegistryName(new ResourceLocation(SpicyMod.MODID, name));
        setTranslationKey(SpicyMod.MODID + "." + name);
    }

    @Override
    public EnumChiliPeppers getType()
    {
        for (EnumChiliPeppers type : EnumChiliPeppers.values())
        {
            if (name.toUpperCase().contains(type.name()))
                return type;
        }

        return null;
    }

    @Nonnull
    @Override
    protected Item getCrop()
    {
        return SpiceUtils.getFruitFromType(this.getType());
    }

    @Nonnull
    @Override
    protected Item getSeed()
    {
        return SpiceUtils.getSeedFromType(this.getType());
    }

    @SideOnly(Side.CLIENT)
    public void initModel()
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(Objects.requireNonNull(getRegistryName()), "inventory"));
    }
}
