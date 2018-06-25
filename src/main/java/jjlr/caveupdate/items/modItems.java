package jjlr.caveupdate.items;

import jjlr.caveupdate.references;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class modItems {
	
public static basicItem nautilusFossil = new basicItem("nautilus_fossil", references.MODID).setCreativeTab(CreativeTabs.MATERIALS);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				
				nautilusFossil
		);
	}
	
	public static void registerModels() {
		
		nautilusFossil.registerItemModel();
	}

}
