package com.davoleo.spicymod.item.food;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.ModItems;
import com.davoleo.spicymod.spice.EnumChiliPeppers;
import com.davoleo.spicymod.spice.IChiliPepper;
import com.davoleo.spicymod.spice.SpiceUtils;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 14/04/2019 / 18:51
 * Class: ItemSpice
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class ItemSpice extends ItemFood implements IChiliPepper {

    private final EnumChiliPeppers chiliPepper;

    public ItemSpice(EnumChiliPeppers chiliPepper)
    {
        super(chiliPepper.getFoodPts(), chiliPepper.getSaturationPts(), false);
        this.chiliPepper = chiliPepper;
        setRegistryName(new ResourceLocation(SpicyMod.MODID, chiliPepper.getName()));
        setTranslationKey(SpicyMod.MODID + "." + chiliPepper.getName());
        setCreativeTab(SpicyMod.spicyTab);
        ModItems.spices.add(this);
    }

    @Override
    public EnumChiliPeppers getType()
    {
        return chiliPepper;
    }
}
