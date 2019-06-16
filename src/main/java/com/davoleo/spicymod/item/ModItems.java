package com.davoleo.spicymod.item;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.food.*;
import com.davoleo.spicymod.item.seed.ItemSpiceSeed;
import com.davoleo.spicymod.item.tool.ItemHammer;
import com.davoleo.spicymod.item.tool.ItemKnife;
import com.davoleo.spicymod.item.tool.ItemSpiceBow;
import com.davoleo.spicymod.spice.EnumChiliPeppers;
import com.davoleo.spicymod.util.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

/*************************************************
 * Author: Davoleo
 * Date: 26/06/2018
 * Hour: 22.03
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ModItems{

    public static List<ItemSpice> spices = new ArrayList<>();
    public static List<ItemSpiceSeed> seeds = new ArrayList<>();

    public static ItemChili chili = new ItemChili();
    public static ItemChiliMeat chili_meat = new ItemChiliMeat();

    public static ItemHammer hammer = new ItemHammer(SpicyMod.spiceToolMaterial);
    public static ItemKnife knife = new ItemKnife(Item.ToolMaterial.IRON);
    public static ItemSpiceBow spice_bow = new ItemSpiceBow();

    //Registro di forge
    public static void register(IForgeRegistry<Item> registry)
    {
        for (EnumChiliPeppers type : EnumChiliPeppers.values())
        {
            registry.register(new ItemSpice(type));
            registry.register(new ItemSpiceSeed(type));
        }

        registry.registerAll(
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
        for (ItemSpiceSeed seed : seeds)
            Utils.registerItemModel(seed);


        for (ItemSpice spice : spices)
            Utils.registerItemModel(spice);

        Utils.registerItemModel(chili);
        Utils.registerItemModel(chili_meat);
        Utils.registerItemModel(hammer);
        Utils.registerItemModel(knife);
        Utils.registerItemModel(spice_bow);
    }

}

