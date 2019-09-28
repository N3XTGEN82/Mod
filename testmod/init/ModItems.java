package com.moocowx1250.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.moocowx1250.testmod.items.ItemBase;
import com.moocowx1250.testmod.items.ItemStrawberrySeeds;
import com.moocowx1250.testmod.items.ObsidianArrow;
import com.moocowx1250.testmod.items.RecurveBow;
import com.moocowx1250.testmod.items.armor.ArmorBase;
import com.moocowx1250.testmod.items.food.FoodBase;
import com.moocowx1250.testmod.items.tools.ToolAxe;
import com.moocowx1250.testmod.items.tools.ToolHoe;
import com.moocowx1250.testmod.items.tools.ToolPickaxe;
import com.moocowx1250.testmod.items.tools.ToolSpade;
import com.moocowx1250.testmod.items.tools.ToolSword;
import com.moocowx1250.testmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_STEEL_INGOT = EnumHelper.addToolMaterial("material_steel_ingot", 3, 500, 10.0F, 2.5f, 15);
	//																Element(Harvest Level, Max Uses, Efficiency, Damage, Enchantibility),
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 3, 200, 14.0f, 4.0f, 10);
	
	public static final ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armour_material_steel", Reference.MOD_ID + ":steel", 14, new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	//																				(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)
	
	//Items
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item ASH = new ItemBase("ash");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item KNAPPED_OBSIDIAN = new ItemBase("knapped_obsidian");
	public static final Item BONE_KNAPPING_TOOL = new ItemBase("bone_knapping_tool");
	public static final Item STRAWBERRY_SEEDS = new ItemStrawberrySeeds("strawberry_seeds");
	
	//Tools
	public static final ItemSword STEEL_SWORD = new ToolSword("steel_sword", MATERIAL_STEEL_INGOT);
	public static final ItemSpade STEEL_SHOVEL = new ToolSpade("steel_shovel", MATERIAL_STEEL_INGOT);
	public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", MATERIAL_STEEL_INGOT);
	public static final ItemAxe STEEL_AXE = new ToolAxe("steel_axe", MATERIAL_STEEL_INGOT);
	public static final ItemHoe STEEL_HOE = new ToolHoe("steel_hoe", MATERIAL_STEEL_INGOT);
	
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
	public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN);
	
	//Armor
	public static final Item STEEL_HELMET = new ArmorBase("steel_helmet", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_CHESTPLATE = new ArmorBase("steel_chestplate", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item STEEL_LEGGINGS = new ArmorBase("steel_leggings", ARMOR_MATERIAL_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item STEEL_BOOTS = new ArmorBase("steel_boots", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.FEET);
	
	//Food
	public static final Item STRAWBERRY = new FoodBase("strawberry", 3, 2.4f, false);
	
	//Bows
	public static final Item RECURVE_BOW = new RecurveBow("recurve_bow");
	public static final Item OBSIDIAN_ARROW = new ObsidianArrow("obsidian_arrow");

}
