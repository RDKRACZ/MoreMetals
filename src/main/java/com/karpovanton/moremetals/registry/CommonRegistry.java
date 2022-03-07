package com.karpovanton.moremetals.registry;

import com.karpovanton.moremetals.Info;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

import java.util.Arrays;

/**
 * A base class for mod registries
 */
public abstract class CommonRegistry {
    /**
     * Registration event
     */
    public abstract void register();

    protected static ConfiguredFeature<?, ?> createConfiguredFeature(Block oreBlock, int veinSize) {
        return new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(
                OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                oreBlock.getDefaultState(),
                veinSize));
    }

    protected static PlacedFeature createPlacedFeature(ConfiguredFeature<?, ?> configuredFeature, int maxY, int repeats) {
        return new PlacedFeature(RegistryEntry.of(configuredFeature), Arrays.asList(
                CountPlacementModifier.of(repeats),
                SquarePlacementModifier.of(),
                HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(maxY)))
        );
    }

    /**
     * Registers an item to the game
     * @param name Item name (ID)
     * @param item Item instance
     */
    protected void registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(Info.MOD_ID, name), item);
    }

    /**
     * Registers a block and a block item to the game
     * @param name Block name (ID)
     * @param block Block instance
     * @param group Item group with the block item
     */
    protected void registerBlock(String name, Block block, ItemGroup group) {
        // Registering the block
        Registry.register(Registry.BLOCK, new Identifier(Info.MOD_ID, name), block);
        // Registering the block item
        Registry.register(Registry.ITEM, new Identifier(Info.MOD_ID, name), new BlockItem(block, new Item.Settings().group(group)));
    }

    protected void registerOreFeature(String name, ConfiguredFeature<?, ?> configuredFeature, PlacedFeature placedFeature) {
        Identifier id = new Identifier(Info.MOD_ID, name);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, id, configuredFeature);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, id, placedFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, id));
    }
}
