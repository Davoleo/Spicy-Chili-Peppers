package com.davoleo.spicymod.item.seed;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.ModItems;
import com.davoleo.spicymod.spice.EnumChiliPeppers;
import com.davoleo.spicymod.spice.IChiliPepper;
import com.davoleo.spicymod.spice.SpiceUtils;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 14/04/2019 / 18:30
 * Class: ItemSpiceSeed
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class ItemSpiceSeed extends ItemSeeds implements IChiliPepper {

    private final EnumChiliPeppers chiliPepper;

    public ItemSpiceSeed(EnumChiliPeppers chiliPepper)
    {
        super(SpiceUtils.getCropFromType(chiliPepper), Blocks.FARMLAND);
        this.chiliPepper = chiliPepper;
        setRegistryName(new ResourceLocation(SpicyMod.MODID, chiliPepper.getName() + "_seeds"));
        setTranslationKey(SpicyMod.MODID + "." + chiliPepper.getName() + "_seeds");
        setCreativeTab(SpicyMod.spicyTab);
        ModItems.seeds.add(this);
    }

    @Override
    public EnumChiliPeppers getType()
    {
        return chiliPepper;
    }


}
