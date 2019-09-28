package com.moocowx1250.testmod.items.tools;

import com.moocowx1250.testmod.Main;
import com.moocowx1250.testmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe {

	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 8.0F, -3.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabTest);
		
		ModItems.ITEMS.add(this);
	}
}
