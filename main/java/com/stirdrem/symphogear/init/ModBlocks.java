package com.stirdrem.symphogear.init;

import java.util.ArrayList;
import java.util.List;

import com.stirdrem.symphogear.blocks.BlockBase;
import com.stirdrem.symphogear.blocks.SingasteinnBlock;
import com.stirdrem.symphogear.blocks.machines.Constructor.GearConstructor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block GEAR_CONSTRUCTOR = new GearConstructor("gear_constructor");
	public static final Block SINGASTEINN_BLOCK = new SingasteinnBlock("singasteinn_block", Material.IRON);
}
