package com.moocowx1250.testmod.items.food;

import com.moocowx1250.testmod.Main;
import com.moocowx1250.testmod.init.ModItems;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood
{

	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) 
	{
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabTest);
		
		ModItems.ITEMS.add(this);
	}
}
