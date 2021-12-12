package com.karpovanton.moremetals.registry;

import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

/**
 * A registry for ore generation in the world
 */
public class OreGenerationRegistry extends CommonRegistry {
    // Instance
    public static final OreGenerationRegistry INSTANCE = new OreGenerationRegistry();

    // Configured features
    public static final ConfiguredFeature<?, ?> COPPER_ORE_OVERWORLD = createConfiguredFeature(BlockRegistry.COPPER_ORE, 7);
    public static final ConfiguredFeature<?, ?> STEEL_ORE_OVERWORLD = createConfiguredFeature(BlockRegistry.STEEL_ORE, 6);
    public static final ConfiguredFeature<?, ?> SAPPHIRE_ORE_OVERWORLD = createConfiguredFeature(BlockRegistry.SAPPHIRE_ORE, 5);
    public static final ConfiguredFeature<?, ?> RUBY_ORE_OVERWORLD = createConfiguredFeature(BlockRegistry.RUBY_ORE, 5);
    public static final ConfiguredFeature<?, ?> CITRINE_ORE_OVERWORLD = createConfiguredFeature(BlockRegistry.CITRINE_ORE, 4);
    public static final ConfiguredFeature<?, ?> CHRYSOLITE_ORE_OVERWORLD = createConfiguredFeature(BlockRegistry.CHRYSOLITE_ORE, 4);
    public static final ConfiguredFeature<?, ?> AQUAMARINE_ORE_OVERWORLD = createConfiguredFeature(BlockRegistry.AQUAMARINE_ORE, 3);
    public static final ConfiguredFeature<?, ?> AMETHYST_ORE_OVERWORLD = createConfiguredFeature(BlockRegistry.AMETHYST_ORE, 3);
    public static final ConfiguredFeature<?, ?> TOURMALINE_ORE_OVERWORLD = createConfiguredFeature(BlockRegistry.TOURMALINE_ORE, 3);

    // Placed features
    public static final PlacedFeature P_COPPER_ORE_OVERWORLD = createPlacedFeature(COPPER_ORE_OVERWORLD, 60, 15);
    public static final PlacedFeature P_STEEL_ORE_OVERWORLD = createPlacedFeature(STEEL_ORE_OVERWORLD, 55, 12);
    public static final PlacedFeature P_SAPPHIRE_ORE_OVERWORLD = createPlacedFeature(SAPPHIRE_ORE_OVERWORLD, 50, 10);
    public static final PlacedFeature P_RUBY_ORE_OVERWORLD = createPlacedFeature(RUBY_ORE_OVERWORLD, 50, 9);
    public static final PlacedFeature P_CITRINE_ORE_OVERWORLD = createPlacedFeature(CITRINE_ORE_OVERWORLD, 45, 8);
    public static final PlacedFeature P_CHRYSOLITE_ORE_OVERWORLD = createPlacedFeature(CHRYSOLITE_ORE_OVERWORLD, 40, 7);
    public static final PlacedFeature P_AQUAMARINE_ORE_OVERWORLD = createPlacedFeature(AQUAMARINE_ORE_OVERWORLD, 35, 6);
    public static final PlacedFeature P_AMETHYST_ORE_OVERWORLD = createPlacedFeature(AMETHYST_ORE_OVERWORLD, 30, 5);
    public static final PlacedFeature P_TOURMALINE_ORE_OVERWORLD = createPlacedFeature(TOURMALINE_ORE_OVERWORLD, 25, 4);

    /**
     * Registers all ores into the game
     */
    @Override
    public void register() {
        registerOreFeature("copper_ore_overworld", COPPER_ORE_OVERWORLD, P_COPPER_ORE_OVERWORLD);
        registerOreFeature("steel_ore_overworld", STEEL_ORE_OVERWORLD, P_STEEL_ORE_OVERWORLD);
        registerOreFeature("sapphire_ore_overworld", SAPPHIRE_ORE_OVERWORLD, P_SAPPHIRE_ORE_OVERWORLD);
        registerOreFeature("ruby_ore_overworld", RUBY_ORE_OVERWORLD, P_RUBY_ORE_OVERWORLD);
        registerOreFeature("citrine_ore_overworld", CITRINE_ORE_OVERWORLD, P_CITRINE_ORE_OVERWORLD);
        registerOreFeature("chrysolite_ore_overworld", CHRYSOLITE_ORE_OVERWORLD, P_CHRYSOLITE_ORE_OVERWORLD);
        registerOreFeature("aquamarine_ore_overworld", AQUAMARINE_ORE_OVERWORLD, P_AQUAMARINE_ORE_OVERWORLD);
        registerOreFeature("amethyst_ore_overworld", AMETHYST_ORE_OVERWORLD, P_AMETHYST_ORE_OVERWORLD);
        registerOreFeature("tourmaline_ore_overworld", TOURMALINE_ORE_OVERWORLD, P_TOURMALINE_ORE_OVERWORLD);
    }
}
