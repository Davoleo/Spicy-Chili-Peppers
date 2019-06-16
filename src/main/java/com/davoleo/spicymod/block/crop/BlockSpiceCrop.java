package com.davoleo.spicymod.block.crop;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.block.ModBlocks;
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
import sun.security.provider.ConfigFile;

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

    private EnumChiliPeppers chiliPepper;

    public BlockSpiceCrop(EnumChiliPeppers chiliPepper)
    {
        this.chiliPepper = chiliPepper;
        setRegistryName(new ResourceLocation(SpicyMod.MODID, chiliPepper.getName() + "_crop"));
        setTranslationKey(SpicyMod.MODID + "." + chiliPepper.getName() + "_crop");
        ModBlocks.cropBlocks.add(this);
    }

    @Override
    public EnumChiliPeppers getType()
    {
        return chiliPepper;
    }

    @Nonnull
    @Override
    protected Item getCrop()
    {
        return SpiceUtils.getFruitFromType(chiliPepper);
    }

    @Nonnull
    @Override
    protected Item getSeed()
    {
        return SpiceUtils.getSeedsFromType(chiliPepper);
    }
}
