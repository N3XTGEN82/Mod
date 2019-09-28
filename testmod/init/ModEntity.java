package com.moocowx1250.testmod.init;

import com.moocowx1250.testmod.Main;
import com.moocowx1250.testmod.entity.obsidianArrow.EntityObsidianArrow;
import com.moocowx1250.testmod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntity 
{
	public static void registerEntities()
	{
		registerArrow("obsidian_arrow", EntityObsidianArrow.class, Reference.ENTITY_OBSIDIAN_ARROW);
	}
	
	private static void registerArrow(String name, Class<? extends Entity> entity, int id)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, 64, 20, true);
	}
}
