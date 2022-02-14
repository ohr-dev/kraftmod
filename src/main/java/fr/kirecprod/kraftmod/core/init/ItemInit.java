package fr.kirecprod.kraftmod.core.init;

import fr.kirecprod.kraftmod.KraftMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class  ItemInit {
    private ItemInit() {}

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KraftMod.MODID);

    //ITEMS
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(KraftMod.TAB_KRAFTMOD).fireResistant()));
    public static final RegistryObject<Item> TITANE_INGOT = ITEMS.register("titane_ingot", () -> new Item(new Item.Properties().tab(KraftMod.TAB_KRAFTMOD).fireResistant()));
    public static final RegistryObject<Item> PALADIUM_INGOT = ITEMS.register("paladium_ingot", () -> new Item(new Item.Properties().tab(KraftMod.TAB_KRAFTMOD).fireResistant()));
    public static final RegistryObject<Item> ENDEMONIUM_INGOT = ITEMS.register("endemonium_ingot", () -> new Item(new Item.Properties().tab(KraftMod.TAB_KRAFTMOD).fireResistant()));
    //ITEMS

    //BLOCK ITEMS
    public static final RegistryObject<BlockItem> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BlockItem(BlockInit.SILVER_BLOCK.get(), new Item.Properties().tab(KraftMod.TAB_KRAFTMOD).fireResistant()));
    public static final RegistryObject<BlockItem> TITANE_BLOCK_ITEM = ITEMS.register("titane_block", () -> new BlockItem(BlockInit.TITANE_BLOCK.get(), new Item.Properties().tab(KraftMod.TAB_KRAFTMOD).fireResistant()));
    public static final RegistryObject<BlockItem> PALADIUM_BLOCK_ITEM = ITEMS.register("paladium_block", () -> new BlockItem(BlockInit.PALADIUM_BLOCK.get(), new Item.Properties().tab(KraftMod.TAB_KRAFTMOD).fireResistant()));
    public static final RegistryObject<BlockItem> ENDEMONIUM_BLOCK_ITEM = ITEMS.register("endemonium_block", () -> new BlockItem(BlockInit.ENDEMONIUM_BLOCK.get(), new Item.Properties().tab(KraftMod.TAB_KRAFTMOD).fireResistant()));
    //BLOCK ITEMS

}
