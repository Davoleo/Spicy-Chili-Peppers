package com.davoleo.spicymod.config;

import com.davoleo.spicymod.SpicyMod;

/*************************************************
 * Author: Davoleo
 * Date: 28/06/2018
 * Hour: 20.07
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

@net.minecraftforge.common.config.Config(modid = SpicyMod.MODID, name = "spicy_chili_peppers", category = "general")
public class Config {

    @net.minecraftforge.common.config.Config.Name(value = "Extra Spice")
    @net.minecraftforge.common.config.Config.Comment("Set this to false to make chili peppers less spicy (removes the fire effect)")
    public static boolean extraSpice = true;

    @net.minecraftforge.common.config.Config.Name(value = "Durability Multiplier")
    @net.minecraftforge.common.config.Config.Comment("General tool durability multiplier (Affects all tools)")
    @net.minecraftforge.common.config.Config.RangeDouble(min = 0, max = Float.MAX_VALUE)
    public static float durabilityMultiplier = 1;
}