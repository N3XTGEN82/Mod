package com.moocowx1250.testmod.items;

import com.moocowx1250.testmod.Main;
import com.moocowx1250.testmod.entity.obsidianArrow.EntityObsidianArrow;
import com.moocowx1250.testmod.init.ModItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ObsidianArrow extends ItemArrow
{
	public ObsidianArrow(String name) {
		 setUnlocalizedName(name);
		 setRegistryName(name);
		 setCreativeTab(Main.tabTest);
		 
		 ModItems.ITEMS.add(this);
	}
	
	@Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) 
	{
		EntityObsidianArrow entityObsidianArrow = new EntityObsidianArrow(worldIn, shooter);
		return entityObsidianArrow;
	}
	
	 public void registerModels()
	 {
		 Main.proxy.registerItemRenderer(this, 0, "inventory");
	 }
}
