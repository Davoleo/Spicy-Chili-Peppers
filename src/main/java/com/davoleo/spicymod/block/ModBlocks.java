package com.davoleo.spicymod.block;

import com.davoleo.spicymod.block.crop.BlockSpiceCrop;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/*************************************************
 * Author: Davoleo
 * Date: 16/07/2018
 * Hour: 18.18
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ModBlocks {

    //Block instances
    public static BlockSpiceCrop crop_habanero = new BlockSpiceCrop("habanero_crop");
    public static BlockSpiceCrop crop_jalapeno = new BlockSpiceCrop("jalapeno_crop");

    //Registro di forge
    public static void register(IForgeRegistry<Block> registry)
    {
        registry.registerAll(
                crop_habanero,
                crop_jalapeno
        );
    }

    //Registrazione itemblock
    public static void registerItemBlocks(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
        );
    }

    //Registrazione dei modelli
    public static void registerModels()
    {
        crop_habanero.initModel();
        crop_jalapeno.initModel();
    }
}