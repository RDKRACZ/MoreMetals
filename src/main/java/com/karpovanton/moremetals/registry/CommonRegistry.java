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
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

/**
 * A base class for mod registries
 */
public abstract class CommonRegistry {
    /**
     * Registration event
     */
    public abstract void register();

    /**
     * Generates an ore feature
     * @param oreBlock Ore block instance
     * @param veinSize Max vein size
     * @param maxY Max spawn Y
     * @param repeats Repeats per chunk
     * @return Generated feature
     */
    protected static ConfiguredFeature<?, ?> createOreFeature(Block oreBlock, int veinSize, int maxY, int repeats) {
        return Feature.ORE
                .configure(new OreFeatureConfig(
                        OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                        oreBlock.getDefaultState(),
                        veinSize
                ))
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,0,maxY)))
                .spreadHorizontally()
                .repeat(repeats);
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

    /**
     * Registers an ore feature
     * @param feature Ore feature
     * @param name Registry name (ID)
     */
    protected void registerOreFeature(String name, ConfiguredFeature<?, ?> feature) {
        // Creating a registry key
        RegistryKey<ConfiguredFeature<?, ?>> key = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Info.MOD_ID, name));
        // Registering the configured feature
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), feature);
        // Applying the biome modification
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, key);
    }
}
