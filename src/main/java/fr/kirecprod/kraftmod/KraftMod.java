package fr.kirecprod.kraftmod;

import fr.kirecprod.kraftmod.core.init.BlockInit;
import fr.kirecprod.kraftmod.core.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = KraftMod.MODID)
public class KraftMod {
	public static final String MODID = "kraftmod";
	
	public KraftMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);

	}
}
