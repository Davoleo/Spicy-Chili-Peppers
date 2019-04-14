package com.davoleo.spicymod.item.seed;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.spice.EnumChiliPeppers;
import com.davoleo.spicymod.spice.IChiliPepper;
import com.davoleo.spicymod.spice.SpiceUtils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
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

    private String name;

    public ItemSpiceSeed(String name)
    {
        super(SpiceUtils.getSpiceTypeFromName(name).getCrop(), Blocks.FARMLAND);
        setRegistryName(new ResourceLocation(SpicyMod.MODID, name));
        setTranslationKey(SpicyMod.MODID + "." + name);
        setCreativeTab(SpicyMod.spicyTab);
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

    @SideOnly(Side.CLIENT)
    public void initModel()
    {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(SpicyMod.MODID, "inventory"));
    }


}
