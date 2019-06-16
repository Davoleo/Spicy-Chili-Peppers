package com.davoleo.spicymod.block;

import com.davoleo.spicymod.block.crop.BlockSpiceCrop;
import com.davoleo.spicymod.spice.EnumChiliPeppers;
import net.minecraft.block.Block;
import net.minecraftforge.registries.IForgeRegistry;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/*************************************************
 * Author: Davoleo
 * Date: 16/07/2018
 * Hour: 18.18
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ModBlocks {

    public static List<BlockSpiceCrop> cropBlocks = new ArrayList<>();

    //Registro di forge
    public static void register(IForgeRegistry<Block> registry)
    {
        for (EnumChiliPeppers type : EnumChiliPeppers.values())
            registry.register(new BlockSpiceCrop(type));
    }
}