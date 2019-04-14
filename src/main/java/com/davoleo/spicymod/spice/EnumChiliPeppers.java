package com.davoleo.spicymod.spice;

import com.davoleo.spicymod.block.ModBlocks;
import com.davoleo.spicymod.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 14/04/2019 / 18:03
 * Enum: EnumChiliPeppers
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2019
 **************************************************/

public enum EnumChiliPeppers {

    JALAPENO(1, ModItems.seed_jalapeno, ModBlocks.crop_jalapeno),
    HABANERO(2, ModItems.seed_habanero, ModBlocks.crop_habanero);

    private int id;
    private ItemSeeds seeds;
    private BlockCrops crop;
    private SpiceStats fruit;

    EnumChiliPeppers(int id, ItemSeeds seeds, BlockCrops crop, SpiceStats fruit)
    {
        this.id = id;
        this.seeds = seeds;
        this.crop = crop;
        this.fruit = fruit;
    }

    public int getId()
    {
        return id;
    }

    public ItemSeeds getSeeds()
    {
        return seeds;
    }

    public BlockCrops getCrop()
    {
        return crop;
    }

    public SpiceStats getFruit()
    {
        return fruit;
    }

    private class SpiceStats
    {
        private int foodPts;
        private int saturationPts;

    }
}

