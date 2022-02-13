package fr.kirecprod.kraftmod.core.init;

import fr.kirecprod.kraftmod.KraftMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class BlockInit {
    private BlockInit() {

    }
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KraftMod.MODID);

    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(1.5f, 6.0f)));
    public static final RegistryObject<Block> TITANE_BLOCK = BLOCKS.register("titane_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(1.5F, 6.0f)));
    public static final RegistryObject<Block> PALADIUM_BLOCK = BLOCKS.register("paladium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(1.5f, 6.0f)));
    public static final RegistryObject<Block> ENDEMONIUM_BLOCK = BLOCKS.register("endemonium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(1.5f, 6.0f)));

}
