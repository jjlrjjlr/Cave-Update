package jjlr.caveupdate;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = references.MODID, name = references.NAME, version = references.VERSION)
public class caveUpdateMain {
	
	@Instance
	public static caveUpdateMain instance;
	
	/*
	 * Used to setup client and common proxy.
	 * 
	@SidedProxy(clientSide = references.CLIENT_PROXY, serverSide = references.COMMON_PROXY)
	public static commonProxy proxy;
	*/
	
	/*
	 * Used to register items.
	 * 
	@Mod.EventBusSubscriber
	public static class RegistrationHandler{
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItem(ModelRegistryEvent event) {
			ModItems.registerModels();
		}
	}
	*/
	
	/*
	 * Forge preInititialization.
	 * 
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(references.NAME + " is starting...");
	}
	*/
	
	/*
	 * Forge Initialization.
	 *
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}
	*/
	
	/*
	 * Forge PostInitialization.
	 * 
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(references.NAME + " started successfully...");
	}
	*/
}