package com.davoleo.spicymod.item.tool;

import com.davoleo.spicymod.SpicyMod;
import com.davoleo.spicymod.config.Config;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Set;

/*************************************************
 * Author: Davoleo
 * Date: 16/08/2018
 * Hour: 21.26
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemToolBase extends ItemTool {

    private int mineRadius = 1, mineDepth = 0;

    public ItemToolBase(ToolMaterial material, Set<Block> effectiveOnBlock)
    {
        super(material.getAttackDamage(), -3.25F, material, effectiveOnBlock);
        setMaxDamage((int)(material.getMaxUses()* Config.durabilityMultiplier));
        setCreativeTab(SpicyMod.spicyTab);
    }

    //Method modelled off of EwyBoy's code
    //Github Profile: https://github.com/EwyBoy
    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        if (entityLiving instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entityLiving;
            RayTraceResult result = rayTrace(world, player, false);
            EnumFacing sideHit = result.sideHit;

            int xd, yd, zd;
            yd = xd = zd = mineRadius;

            switch (sideHit) {
                case NORTH:
                case SOUTH: zd = mineDepth; break;
                case EAST:
                case WEST: xd = mineDepth; break;
                case UP:
                case DOWN: yd = mineDepth; break;

            }

            if (!player.isSneaking())
            {
                for (int x = pos.getX() - xd; x <= pos.getX() + xd; x++)
                {
                    for (int y = pos.getY() - yd; y <= pos.getY() + yd; y++)
                    {
                        for (int z = pos.getZ() - zd; z <= pos.getZ() + zd; z++)
                        {
                            BlockPos targetPos = new BlockPos(x, y, z);
                            IBlockState targetBlock = world.getBlockState(targetPos);
                            if (canHarvestBlock(targetBlock, player.getHeldItem(EnumHand.MAIN_HAND)))
                            {
                                if ((stack.getMaxDamage() - stack.getItemDamage()) >= 1 && targetBlock.getBlock() != Blocks.BEDROCK)
                                {
                                    if (targetBlock.getBlock().getExpDrop(targetBlock, world, targetPos, 0) > 0)
                                        if (!world.isRemote && world.getGameRules().getBoolean("doTileDrops"))
                                            world.spawnEntity(new EntityXPOrb(world, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, world.getBlockState(pos).getBlock().getExpDrop(targetBlock, world, targetPos, 0)));
                                    world.destroyBlock(new BlockPos(x, y, z), true);
                                }
                                stack.damageItem(1, player);
                            }
                        }
                    }
                }
            } else
                {
                stack.damageItem(1, player);
                }
            return false;
        }
        else
            {
                return false;
            }
    }

    public void registerItemModel()
    {
        SpicyMod.proxy.registerItemRenderer(this, 0, "hammer");
    }

}
