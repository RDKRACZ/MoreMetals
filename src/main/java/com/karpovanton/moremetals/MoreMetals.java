package com.karpovanton.moremetals;

import com.karpovanton.moremetals.registry.BlockRegistry;
import com.karpovanton.moremetals.registry.ItemGroupRegistry;
import com.karpovanton.moremetals.registry.ItemRegistry;
import com.karpovanton.moremetals.registry.OreGenerationRegistry;
import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

/**
 * Main mod entrypoint class
 */
public class MoreMetals implements ModInitializer {
    // Mod logger
    public static final Logger LOGGER = LogManager.getLogger();
    // Random instance
    public static final Random RANDOM = new Random();

    /**
     * Mod initialization event
     */
    @Override
    public void onInitialize() {
        // Calling registries
        ItemGroupRegistry.INSTANCE.register();
        ItemRegistry.INSTANCE.register();
        BlockRegistry.INSTANCE.register();
        OreGenerationRegistry.INSTANCE.register();
    }
}