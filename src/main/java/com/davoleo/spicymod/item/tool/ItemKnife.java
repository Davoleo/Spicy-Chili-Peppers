package com.davoleo.spicymod.item.tool;

import com.davoleo.spicymod.SpicyMod;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

import java.util.Set;

/*************************************************
 * Author: Davoleo
 * Date: 17/08/2018
 * Hour: 16.17
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemKnife extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON_BLOCK = Sets.newHashSet(Blocks.VINE, Blocks.LEAVES, Blocks.LEAVES2, Blocks.CARPET, Blocks.BROWN_MUSHROOM, Blocks.BROWN_MUSHROOM_BLOCK, Blocks.CHORUS_FLOWER, Blocks.CHORUS_PLANT, Blocks.MELON_BLOCK, Blocks.PUMPKIN, Blocks.RED_MUSHROOM, Blocks.RED_MUSHROOM_BLOCK);

    public ItemKnife(ToolMaterial material)
    {
        super(material.getAttackDamage() - 2, 1F, ToolMaterial.IRON, EFFECTIVE_ON_BLOCK );
        setTranslationKey("knife");
        setRegistryName("knife");
    }

    public void registerItemModel()
    {
        SpicyMod.proxy.registerItemRenderer(this, 0, "knife");
    }


}
