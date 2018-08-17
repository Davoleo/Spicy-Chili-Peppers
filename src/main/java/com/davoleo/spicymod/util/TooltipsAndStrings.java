package com.davoleo.spicymod.util;

import com.davoleo.spicymod.SpicyMod;
import net.minecraft.util.text.TextFormatting;

/*************************************************
 * Author: Davoleo
 * Date: 16/08/2018
 * Hour: 18.28
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class TooltipsAndStrings {

    //Tooltips
    public static final String JALAPENO = SpicyMod.proxy.localize(TextFormatting.RED + "tooltip.spicymod.jalapeno");
    public static final String HABANERO = SpicyMod.proxy.localize(TextFormatting.GOLD + "tooltip.spicymod.habanero");

    public static final String DURABILITY = SpicyMod.proxy.localize(TextFormatting.YELLOW + "tooltip.spicymod.durability");

    //Other Strings
    public static final String JALAPENO_RESIST = SpicyMod.proxy.localize(TextFormatting.BOLD + "string.spicymod.jalapeno_resist");
    public static final String HABANERO_RESIST = SpicyMod.proxy.localize(TextFormatting.BOLD + "string.spicymod.habanero_resist");
}
