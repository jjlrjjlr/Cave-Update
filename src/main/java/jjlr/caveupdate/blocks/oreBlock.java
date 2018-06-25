package jjlr.caveupdate.blocks;

/*
 * Created by jjlr ; 6/25/2018 5:46 AM UTC
 * Currently unused;
 */

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class oreBlock extends basicBlock {

	public oreBlock(String name, Material material, float resistance, float hardness) {
		
		super(name, material);
		
		setHardness(hardness);
		setResistance(resistance);
	}
	
	@Override
	public oreBlock setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
		
	}
	
}
