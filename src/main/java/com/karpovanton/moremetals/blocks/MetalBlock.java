package com.karpovanton.moremetals.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

/**
 * A base class for all metal blocks
 */
public class MetalBlock extends Block {
    /**
     * Block constructor
     * @param hardness Block hardness
     */
    public MetalBlock(float hardness) {
        super(FabricBlockSettings
                .of(Material.METAL)
                .hardness(hardness));
    }
}
