package com.davoleo.spicymod.block;

import com.davoleo.spicymod.block.crop.BlockCropHabanero;
import com.davoleo.spicymod.block.crop.BlockCropJalapeno;
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

    //istanze
   public static BlockCropHabanero crop_habanero = new BlockCropHabanero();
   public static BlockCropJalapeno crop_jalapeno = new BlockCropJalapeno();

    //Registro di forge
    public static void register(IForgeRegistry<Block> registry)
    {
        registry.registerAll(
                crop_habanero,
                crop_jalapeno

        );

        //Gameregistry (tile esntities)

    }

    //Registrazione itemblock
    public static void registerItemBlocks(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
        );
    }

    //Registrazione dei modelli
    public static void registerModels() {}
}