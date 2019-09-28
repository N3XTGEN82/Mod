package com.moocowx1250.testmod.util.handlers;

import com.moocowx1250.testmod.entity.obsidianArrow.EntityObsidianArrow;
import com.moocowx1250.testmod.entity.obsidianArrow.RenderObsidianArrow;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
		public static void registerEntityRenders()
		{
			
			RenderingRegistry.registerEntityRenderingHandler(EntityObsidianArrow.class, new IRenderFactory<EntityObsidianArrow>() 
			{
				@Override
				public Render<? super EntityObsidianArrow> createRenderFor(RenderManager manager) 
				{
					return new RenderObsidianArrow(manager);
				}
			});
		}
}
