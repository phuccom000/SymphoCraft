package com.stirdrem.symphogear.items;

import com.stirdrem.symphogear.Main;
import com.stirdrem.symphogear.init.ModItems;
import com.stirdrem.symphogear.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0,"inventory");
	}

	
	
}
