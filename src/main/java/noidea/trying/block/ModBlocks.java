package noidea.trying.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import noidea.trying.Trying;
import noidea.trying.item.ModItems;

import java.util.function.Function;

public class ModBlocks {
    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        RegistryKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static final Block TEST_BLOCK = register(
            "test_block",
            Block::new,
            AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS).nonOpaque(),
            true
    );

    public static final Block TWO_BLOCK = register(
            "two_block",
            Block::new,
            AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS).nonOpaque(),
            true
    );

    public static final Block WATER_LILY = register(
            "water_lily",
            Block::new,
            AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS).nonOpaque(),
            true

    );

    public static final Block LE_SPIN = register(
            "le_spin",
            Block::new,
            AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS).nonOpaque(),
            true

    );

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Trying.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Trying.MOD_ID, name));
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ModItems.CUSTOM_ITEM_GROUP_KEY).register((itemGroup) -> {
            itemGroup.add(ModBlocks.TEST_BLOCK.asItem());
            itemGroup.add(ModBlocks.TWO_BLOCK.asItem());
            itemGroup.add(ModBlocks.WATER_LILY.asItem());
            itemGroup.add(ModBlocks.LE_SPIN.asItem());

        });

    }

}