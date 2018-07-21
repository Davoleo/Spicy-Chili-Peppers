package com.davoleo.spicymod.block;

import com.davoleo.spicymod.block.crop.BlockHabaneroCrop;
import com.davoleo.spicymod.block.crop.BlockJalapenoCrop;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*************************************************
 * Author: Davoleo
 * Date: 16/07/2018
 * Hour: 18.18
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ModBlocks {

    @GameRegistry.ObjectHolder("spicymod:testblock")
    public static TestBlock testblock;

    @GameRegistry.ObjectHolder("spicymod:jalapeno_crop")
    public static BlockJalapenoCrop jalapeno_crop;

    @GameRegistry.ObjectHolder("spicymod:habanero_crop")
    public static BlockHabaneroCrop habanero_crop;


    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        testblock.initModel();
    }
}