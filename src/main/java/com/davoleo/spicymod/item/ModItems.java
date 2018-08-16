package com.davoleo.spicymod.item;

import com.davoleo.spicymod.block.ModBlocks;
import com.davoleo.spicymod.item.food.ItemHabanero;
import com.davoleo.spicymod.item.food.ItemJalapeno;
import com.davoleo.spicymod.item.seed.ItemSeedBase;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 22.03
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ModItems{

    //istanze
    public static ItemSeedBase seed_jalapeno = new ItemSeedBase("jalapeno_seed", ModBlocks.crop_jalapeno);
    public static ItemSeedBase seed_habanero = new ItemSeedBase("habanero_seed", ModBlocks.crop_habanero);
    public static ItemJalapeno jalapeno = new ItemJalapeno();
    public static ItemHabanero habanero = new ItemHabanero();

    //Registro di forge
    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                seed_jalapeno,
                seed_habanero,
                jalapeno,
                habanero
        );
    }

//Registrazione dei modelli
    public static void registerModels()
    {
        seed_habanero.registerItemModel();
        seed_jalapeno.registerItemModel();
        jalapeno.registerItemModel();
        habanero.registerItemModel();
    }

}

