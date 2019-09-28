package com.moocowx1250.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.moocowx1250.testmod.blocks.BlockBase;
import com.moocowx1250.testmod.blocks.RubyBlock;
import com.moocowx1250.testmod.blocks.RubyOre;
import com.moocowx1250.testmod.blocks.SteelBlock;
import com.moocowx1250.testmod.blocks.crops.BlockStrawberryCrop;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block STEEL_BLOCK = new SteelBlock("steel_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block STRAWBERRY_CROP = new BlockStrawberryCrop("strawberry_crop");

}
