package com.davoleo.spicymod.util;

import com.davoleo.spicymod.SpicyMod;
import net.minecraftforge.common.config.Configuration;

/*************************************************
 * Author: Davoleo
 * Date: 28/06/2018
 * Hour: 20.07
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Config {

    private static final String CATEGORY_GENERAL = "general";

    // This values below you can access elsewhere in your mod:
    public static boolean isThisAGoodTutorial = true;
    public static String yourRealName = "Steve";
    public static float durabilityMultiplier = 1;

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
    public static void readConfig() {
        Configuration cfg = SpicyMod.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            System.out.println("ERROR LOADING SPICY CHILI PEPPERS CONFIG FILE!");
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        // cfg.getBoolean() will get the value in the config if it is already specified there. If not it will create the value.
        isThisAGoodTutorial = cfg.getBoolean("Spicyness",CATEGORY_GENERAL,isThisAGoodTutorial, "Set this to false to make chili peppers less spicy");
        yourRealName = cfg.getString("realName", CATEGORY_GENERAL, yourRealName, "Set your real name here");

        durabilityMultiplier = cfg.getFloat("durabilityMultiplier", CATEGORY_GENERAL,1F, 0,  Float.MAX_VALUE, "General tool durability multiplier (Affects all the tools)");

    }
}