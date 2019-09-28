package com.moocowx1250.testmod.items;

import com.moocowx1250.testmod.Main;
import com.moocowx1250.testmod.init.ModItems;

import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class RecurveBow extends ItemBow
{
	 public RecurveBow(String name) {
		 setUnlocalizedName(name);
		 setRegistryName(name);
		 setCreativeTab(Main.tabTest);
		 setMaxDamage(384);
		 setMaxStackSize(1);
		 
		 ModItems.ITEMS.add(this);
	}
	 
	 @Override
	public int getItemEnchantability() 
	 {
		 return 10;
	}
	 
	 @Override
	protected boolean isArrow(ItemStack stack) 
	 {
		 if(stack.getItem() == ModItems.OBSIDIAN_ARROW)
		 {
			 return true;
		 }
		 return false;
	}
	 
	 public void registerModels()
	 {
		 Main.proxy.registerItemRenderer(this, 0, "inventory");
	 }
}
