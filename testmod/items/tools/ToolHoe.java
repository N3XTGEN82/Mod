package com.moocowx1250.testmod.items.tools;

import com.moocowx1250.testmod.Main;
import com.moocowx1250.testmod.init.ModItems;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolHoe extends ItemHoe
{

	public ToolHoe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabTest);
		
		ModItems.ITEMS.add(this);
	}
}
