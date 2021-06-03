package com.karpovanton.moremetals.registry;

import com.karpovanton.moremetals.blocks.*;

/**
 * A registry for mod blocks
 */
public class BlockRegistry extends CommonRegistry {
    // Instance
    public static final BlockRegistry INSTANCE = new BlockRegistry();

    // Blocks
    public static final MetalOreBlock COPPER_ORE        = new MetalOreBlock(2.0f);
    public static final MetalBlock    COPPER_BLOCK      = new MetalBlock(1.5f);
    public static final MetalOreBlock STEEL_ORE         = new MetalOreBlock(2.5f);
    public static final MetalBlock    STEEL_BLOCK       = new MetalBlock(2.0f);
    public static final MetalOreBlock SAPPHIRE_ORE      = new MetalOreBlock(3.0f);
    public static final MetalBlock    SAPPHIRE_BLOCK    = new MetalBlock(2.5f);
    public static final MetalOreBlock RUBY_ORE          = new MetalOreBlock(3.0f);
    public static final MetalBlock    RUBY_BLOCK        = new MetalBlock(2.5f);
    public static final MetalOreBlock CITRINE_ORE       = new MetalOreBlock(3.5f);
    public static final MetalBlock    CITRINE_BLOCK     = new MetalBlock(3.0f);
    public static final MetalOreBlock CHRYSOLITE_ORE    = new MetalOreBlock(4.0f);
    public static final MetalBlock    CHRYSOLITE_BLOCK  = new MetalBlock(3.5f);
    public static final MetalOreBlock AQUAMARINE_ORE    = new MetalOreBlock(4.5f);
    public static final MetalBlock    AQUAMARINE_BLOCK  = new MetalBlock(4.0f);
    public static final MetalOreBlock AMETHYST_ORE      = new MetalOreBlock(5.0f);
    public static final MetalBlock    AMETHYST_BLOCK    = new MetalBlock(4.5f);
    public static final MetalOreBlock TOURMALINE_ORE    = new MetalOreBlock(5.5f);
    public static final MetalBlock    TOURMALINE_BLOCK  = new MetalBlock(5.0f);

    /**
     * Registers all blocks into the game
     */
    @Override
    public void register() {
        registerBlock("copper_ore", COPPER_ORE, ItemGroupRegistry.ORES);
        registerBlock("copper_block", COPPER_BLOCK, ItemGroupRegistry.BLOCKS);
        registerBlock("steel_ore", STEEL_ORE, ItemGroupRegistry.ORES);
        registerBlock("steel_block", STEEL_BLOCK, ItemGroupRegistry.BLOCKS);
        registerBlock("sapphire_ore", SAPPHIRE_ORE, ItemGroupRegistry.ORES);
        registerBlock("sapphire_block", SAPPHIRE_BLOCK, ItemGroupRegistry.BLOCKS);
        registerBlock("ruby_ore", RUBY_ORE, ItemGroupRegistry.ORES);
        registerBlock("ruby_block", RUBY_BLOCK, ItemGroupRegistry.BLOCKS);
        registerBlock("citrine_ore", CITRINE_ORE, ItemGroupRegistry.ORES);
        registerBlock("citrine_block", CITRINE_BLOCK, ItemGroupRegistry.BLOCKS);
        registerBlock("chrysolite_ore", CHRYSOLITE_ORE, ItemGroupRegistry.ORES);
        registerBlock("chrysolite_block", CHRYSOLITE_BLOCK, ItemGroupRegistry.BLOCKS);
        registerBlock("aquamarine_ore", AQUAMARINE_ORE, ItemGroupRegistry.ORES);
        registerBlock("aquamarine_block", AQUAMARINE_BLOCK, ItemGroupRegistry.BLOCKS);
        registerBlock("amethyst_ore", AMETHYST_ORE, ItemGroupRegistry.ORES);
        registerBlock("amethyst_block", AMETHYST_BLOCK, ItemGroupRegistry.BLOCKS);
        registerBlock("tourmaline_ore", TOURMALINE_ORE, ItemGroupRegistry.ORES);
        registerBlock("tourmaline_block", TOURMALINE_BLOCK, ItemGroupRegistry.BLOCKS);
    }
}
