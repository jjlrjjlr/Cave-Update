package jjlr.caveupdate.blocks;

import jjlr.caveupdate.caveUpdateMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class basicBlock extends Block {
	
	protected String name;

	public basicBlock(String name, Material material) {
		
		super(material);
		
		this.name = name;
		
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel(Item itemBlock) {
		
		caveUpdateMain.proxy.registerItemRenderer(itemBlock, 0, name);
		
	}
	
	public Item createItemBlock() {
		
		return new ItemBlock(this).setRegistryName(getRegistryName());
		
	}
	
	@Override
	public basicBlock setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
		
	}

}
