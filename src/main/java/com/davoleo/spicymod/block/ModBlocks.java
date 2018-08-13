package com.davoleo.spicymod.block;

import com.davoleo.spicymod.item.ModItems;
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
   public static BlockCropBase crop_habanero = new BlockCropBase("habanero_crop", ModItems.seed_habanero, ModItems.habanero);
   public static BlockCropBase crop_jalapeno = new BlockCropBase("jalapeno_crop", ModItems.seed_jalapeno, ModItems.jalapeno);

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
    public static void registerModels() {
        crop_habanero.registerItemModel(crop_habanero.createItemBlock());
        crop_jalapeno.registerItemModel(crop_jalapeno.createItemBlock());
    }
}