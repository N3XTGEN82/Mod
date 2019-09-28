package com.moocowx1250.testmod.entity.obsidianArrow;

import com.moocowx1250.testmod.util.Reference;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderObsidianArrow extends RenderArrow<EntityObsidianArrow>
{

	public RenderObsidianArrow(RenderManager manager) 
	{
		super(manager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityObsidianArrow entity) 
	{
		return new ResourceLocation(Reference.MOD_ID + ":textures/entity/arrows/obsidian_arrow.png");
	}
}
