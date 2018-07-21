package com.davoleo.spicymod.item;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 22.03
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ModItems{

    @GameRegistry.ObjectHolder("spicymod:jalapeno")
    public static ItemJalapeno jalapeno;

    @GameRegistry.ObjectHolder("spicymod:habanero")
    public static ItemHabanero habanero;

    @GameRegistry.ObjectHolder("spicymod:jalapeno_seeds")
    public static ItemSeedJalapeno jalapeno_seeds;

    @GameRegistry.ObjectHolder("spicymod:habanero_seeds")
    public static ItemSeedHabanero habanero_seeds;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        jalapeno.initModel();
        habanero.initModel();
        jalapeno_seeds.initModel();
        habanero_seeds.initModel();
    }

}

