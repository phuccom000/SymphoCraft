package com.stirdrem.symphogear.init;

import java.util.ArrayList;
import java.util.List;

import com.stirdrem.symphogear.Main;
import com.stirdrem.symphogear.items.ItemBase;
import com.stirdrem.symphogear.items.armor.ArmorBase;
import com.stirdrem.symphogear.items.armor.ArmorModel;
import com.stirdrem.symphogear.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item SYMPHOGEAR_PENDANT = new ItemBase("symphogear_pendant");
	public static final Item BASE_PENDANT = new ItemBase("base_pendant");
	public static final Item SINGASTEINN = new ItemBase("singasteinn");
	public static final ArmorMaterial GEAR_GUNGNIR = EnumHelper.addArmorMaterial("gear_gungnir", Reference.modid + ":gear_gungnir", 20, new int[] {6, 8, 8, 5}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F);
	public static final Item GUNGNIR_GEAR = new ArmorModel("gungnir_gear", GEAR_GUNGNIR, 1, EntityEquipmentSlot.CHEST );

}

