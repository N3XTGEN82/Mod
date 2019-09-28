package com.moocowx1250.testmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(Items.COAL, new ItemStack(ModItems.ASH, 4), 1.5f);
	}
}
