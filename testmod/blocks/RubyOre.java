package com.moocowx1250.testmod.blocks;

import java.util.Random;

import com.moocowx1250.testmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase
{

	public RubyOre(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.5F);

	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.RUBY;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 3;
		int min = 1;
		return rand.nextInt(max) + min;
	}
	
	//  HOW TO MAKE IT DROP A SPECIFIC AMOUNT OR A RANDOM AMOUNT
	//@Override
	//public int quantityDropped(Random rand) {
	//	return 3;	or  int max = 4;
	//					int min = 1;
	// 					return rand.nextInt(max) + min;
	//}

}
