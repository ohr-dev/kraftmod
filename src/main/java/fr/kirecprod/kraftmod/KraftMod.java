package fr.kirecprod.kraftmod;

import fr.kirecprod.kraftmod.core.init.BlockInit;
import fr.kirecprod.kraftmod.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = KraftMod.MODID)
public class KraftMod {
	public static final String MODID = "kraftmod";

	public static final CreativeModeTab TAB_KRAFTMOD = new CreativeModeTab(MODID) {
		@Override
		public ItemStack makeIcon() {
			return ItemInit.ENDEMONIUM_INGOT.get().getDefaultInstance();
		}
	};

	public KraftMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);

	}
}
