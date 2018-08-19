package com.davoleo.spicymod.item.tool;

import com.davoleo.spicymod.util.TooltipsAndStrings;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;

/*************************************************
 * Author: Davoleo
 * Date: 16/08/2018
 * Hour: 20.34
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemHammer extends ItemToolBase {

    private static final Set<Block> EFFECTIVE_ON_BLOCK = Sets.newHashSet(Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE);
    private int mode;

    public ItemHammer(ToolMaterial material)
    {
        super(material, EFFECTIVE_ON_BLOCK);
        setTranslationKey("spice_hammer");
        setRegistryName("spice_hammer");
    }

    public ActionResult<ItemStack> onItemRightClick (World world, EntityPlayer player, EnumHand handIn)
    {
        switch(mode)
        {
            case 0:
                //return ActionResult
        }
        return null;
    }

    public String getModeName(int mode)
    {
        this.mode = mode;

        switch(mode)
        {
            case 0:
                return "Lightning";
            case 1:
                return "Fireball";
            case 2:
                return "Grenade";
            default:
                return "Hammer";
        }
    }

    public void addInformation(ItemStack item, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(TooltipsAndStrings.DURABILITY + ": " + super.getDurabilityForDisplay(item));   //new ItemStack(this))
    }


    //Method created from the model of EwyBoy
    //Github Profile: https://github.com/EwyBoy
    @Override
    public boolean canHarvestBlock(IBlockState blockState)
    {
        Block block = blockState.getBlock();
        if (block == Blocks.OBSIDIAN)
        {
            return this.toolMaterial.getHarvestLevel() == 3;
        }
        else if (block != Blocks.DIAMOND_BLOCK && block != Blocks.DIAMOND_ORE)
        {
            if (block != Blocks.EMERALD_ORE && block != Blocks.EMERALD_BLOCK)
            {
                if (block != Blocks.GOLD_BLOCK && block != Blocks.GOLD_ORE)
                {
                    if (block != Blocks.IRON_BLOCK && block != Blocks.IRON_ORE)
                    {
                        if (block != Blocks.LAPIS_BLOCK && block != Blocks.LAPIS_ORE)
                        {
                            if (block != Blocks.REDSTONE_ORE && block != Blocks.LIT_REDSTONE_ORE)
                            {
                                Material material = blockState.getMaterial();
                                if (material == Material.ROCK)
                                {
                                    return true;
                                }
                                else if (material == Material.IRON)
                                {
                                    return true;
                                } else
                                    {
                                    return material == Material.ANVIL;
                                    }
                            } else
                                {
                                return this.toolMaterial.getHarvestLevel() >= 2;
                                }
                        } else
                            {
                            return this.toolMaterial.getHarvestLevel() >= 1;
                            }
                    } else
                        {
                        return this.toolMaterial.getHarvestLevel() >= 1;
                        }
                } else
                    {
                    return this.toolMaterial.getHarvestLevel() >= 2;
                    }
            } else
                {
                return this.toolMaterial.getHarvestLevel() >= 2;
                }
        } else
            {
            return this.toolMaterial.getHarvestLevel() >= 2;
            }
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player)
    {
        return super.onBlockStartBreak(itemstack, pos, player);
    }
}

