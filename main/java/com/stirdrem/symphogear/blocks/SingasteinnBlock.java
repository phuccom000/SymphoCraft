package com.stirdrem.symphogear.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SingasteinnBlock extends BlockBase {

	public SingasteinnBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 3);
		
	}
}
