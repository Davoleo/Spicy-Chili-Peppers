package com.davoleo.spicy_mod.item;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

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

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        jalapeno.initModel();
    }

}

