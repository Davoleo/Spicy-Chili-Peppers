package com.davoleo.spicymod.item;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.block.ModBlocks;
import com.davoleo.spicymod.item.food.ItemChili;
import com.davoleo.spicymod.item.food.ItemChiliMeat;
import com.davoleo.spicymod.item.food.ItemHabanero;
import com.davoleo.spicymod.item.food.ItemJalapeno;
import com.davoleo.spicymod.item.seed.ItemSeedHabanero;
import com.davoleo.spicymod.item.seed.ItemSeedJalapeno;
import com.davoleo.spicymod.item.seed.ItemSpiceSeed;
import com.davoleo.spicymod.item.tool.ItemHammer;
import com.davoleo.spicymod.item.tool.ItemKnife;
import com.davoleo.spicymod.item.tool.ItemSpiceBow;
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
    public static ItemSpiceSeed seed_jalapeno = new ItemSpiceSeed("jalapeno_seeds");
    public static ItemSpiceSeed seed_habanero = new ItemSpiceSeed("habanero_seeds");

    public static ItemJalapeno jalapeno = new ItemJalapeno();
    public static ItemHabanero habanero = new ItemHabanero();
    public static ItemChili chili = new ItemChili();
    public static ItemChiliMeat chili_meat = new ItemChiliMeat();

    public static ItemHammer hammer = new ItemHammer(SpicyMod.spiceToolMaterial);
    public static ItemKnife knife = new ItemKnife(Item.ToolMaterial.IRON);
    public static ItemSpiceBow spice_bow = new ItemSpiceBow();

    //Registro di forge
    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                seed_jalapeno,
                seed_habanero,

                jalapeno,
                habanero,
                chili,
                chili_meat,

                hammer,
                knife,
                spice_bow
        );
    }

//Registrazione dei modelli
    public static void registerModels()
    {
        seed_habanero.initModel();
        seed_jalapeno.initModel();

        jalapeno.registerItemModel();
        habanero.registerItemModel();
        chili.registerItemModel();
        chili_meat.registerItemModel();

        hammer.registerItemModel();
        knife.registerItemModel();
        spice_bow.registerItemModel();
    }

}

