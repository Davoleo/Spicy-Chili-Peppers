package com.davoleo.spicymod.item.food;

import com.davoleo.spicymod.SpicyMod;
import net.minecraft.item.ItemFood;

/*************************************************
 * Author: Davoleo
 * Date: 17/08/2018
 * Hour: 22.36
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemChiliMeat extends ItemFood{

    public ItemChiliMeat()
    {
        super(16, 4f, true);
        setRegistryName("chili_meat");
        setTranslationKey("chili_meat");
        setCreativeTab(SpicyMod.spicyTab);
    }
}
