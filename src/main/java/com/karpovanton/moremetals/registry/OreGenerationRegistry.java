package com.karpovanton.moremetals.registry;

import net.minecraft.world.gen.feature.ConfiguredFeature;

/**
 * A registry for ore generation in the world
 */
public class OreGenerationRegistry extends CommonRegistry {
    // Instance
    public static final OreGenerationRegistry INSTANCE = new OreGenerationRegistry();

    // Ore features
    public static final ConfiguredFeature<?, ?> COPPER_ORE_OVERWORLD = createOreFeature(BlockRegistry.COPPER_ORE, 7, 60,15);
    public static final ConfiguredFeature<?, ?> STEEL_ORE_OVERWORLD = createOreFeature(BlockRegistry.STEEL_ORE, 6, 55, 12);
    public static final ConfiguredFeature<?, ?> SAPPHIRE_ORE_OVERWORLD = createOreFeature(BlockRegistry.SAPPHIRE_ORE, 5, 50, 10);
    public static final ConfiguredFeature<?, ?> RUBY_ORE_OVERWORLD = createOreFeature(BlockRegistry.RUBY_ORE, 5, 50, 9);
    public static final ConfiguredFeature<?, ?> CITRINE_ORE_OVERWORLD = createOreFeature(BlockRegistry.CITRINE_ORE, 4, 45, 8);
    public static final ConfiguredFeature<?, ?> CHRYSOLITE_ORE_OVERWORLD = createOreFeature(BlockRegistry.CHRYSOLITE_ORE, 4, 40, 7);
    public static final ConfiguredFeature<?, ?> AQUAMARINE_ORE_OVERWORLD = createOreFeature(BlockRegistry.AQUAMARINE_ORE, 3, 35, 6);
    public static final ConfiguredFeature<?, ?> AMETHYST_ORE_OVERWORLD = createOreFeature(BlockRegistry.AMETHYST_ORE, 3, 30, 5);
    public static final ConfiguredFeature<?, ?> TOURMALINE_ORE_OVERWORLD = createOreFeature(BlockRegistry.TOURMALINE_ORE, 3, 25, 4);

    /**
     * Registers all ores into the game
     */
    @Override
    public void register() {
        registerOreFeature("copper_ore_overworld", COPPER_ORE_OVERWORLD);
        registerOreFeature("steel_ore_overworld", STEEL_ORE_OVERWORLD);
        registerOreFeature("sapphire_ore_overworld", SAPPHIRE_ORE_OVERWORLD);
        registerOreFeature("ruby_ore_overworld", RUBY_ORE_OVERWORLD);
        registerOreFeature("citrine_ore_overworld", CITRINE_ORE_OVERWORLD);
        registerOreFeature("chrysolite_ore_overworld", CHRYSOLITE_ORE_OVERWORLD);
        registerOreFeature("aquamarine_ore_overworld", AQUAMARINE_ORE_OVERWORLD);
        registerOreFeature("amethyst_ore_overworld", AMETHYST_ORE_OVERWORLD);
        registerOreFeature("tourmaline_ore_overworld", TOURMALINE_ORE_OVERWORLD);
    }
}
