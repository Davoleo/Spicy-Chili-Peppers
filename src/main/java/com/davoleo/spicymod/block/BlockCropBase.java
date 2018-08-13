package com.davoleo.spicymod.block;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.item.ItemSeedBase;
import com.davoleo.spicymod.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.model.ModelLoader;

/*************************************************
 * Author: Davoleo
 * Date: 13/08/2018
 * Hour: 10.29
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class BlockCropBase extends BlockCrops {

    private String name;
    private ItemSeedBase seed;
    private ItemFood crop;

    public BlockCropBase(String name, ItemSeedBase seed, ItemFood crop) {
        this.name = name;
        this.seed = seed;
        this.crop = crop;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    protected Item getSeed() {
        return seed;
    }

    @Override
    protected Item getCrop() {
        return crop;
    }

    public Item createItemBlock()
    {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    public void registerItemModel(Item itemBlock)
    {
        SpicyMod.proxy.registerItemRenderer(itemBlock, 0, name);
    }
}
