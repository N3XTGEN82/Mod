package com.moocowx1250.testmod.items;

import com.moocowx1250.testmod.Main;
import com.moocowx1250.testmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabTest);
		
		ModItems.ITEMS.add(this);
	}
}
