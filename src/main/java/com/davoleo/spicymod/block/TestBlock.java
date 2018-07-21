package com.davoleo.spicymod.block;

import com.davoleo.spicymod.SpicyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*************************************************
 * Author: Davoleo
 * Date: 16/07/2018
 * Hour: 18.22
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class TestBlock extends Block {
    public TestBlock()
    {
        super(Material.ANVIL);
        setUnlocalizedName(SpicyMod.MODID + ".testblock");
        setRegistryName("testblock");
        setHardness(4f);
        setResistance(8f);
    }

    @Override
    public TestBlock setCreativeTab(CreativeTabs creativeTab)
    {
        super.setCreativeTab(creativeTab);
        return this;
    }


    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
