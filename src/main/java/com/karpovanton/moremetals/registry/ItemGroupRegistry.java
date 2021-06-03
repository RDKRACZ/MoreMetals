package com.karpovanton.moremetals.registry;

import com.karpovanton.moremetals.Info;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

/**
 * A registry for item groups (creative tabs)
 */
public class ItemGroupRegistry extends CommonRegistry {
    // Instance
    public static final ItemGroupRegistry INSTANCE = new ItemGroupRegistry();

    public static ItemGroup INGOTS;

    public static ItemGroup ORES;

    public static ItemGroup BLOCKS;

    public static ItemGroup TOOLS;

    public static ItemGroup ARMOR;

    /**
     * Registers the item groups into the game
     */
    @Override
    public void register() {
        INGOTS = FabricItemGroupBuilder
                    .create(new Identifier(Info.MOD_ID, "ingots"))
                    .icon(() -> new ItemStack(Items.IRON_INGOT))
                    .build();

        ORES = FabricItemGroupBuilder
                    .create(new Identifier(Info.MOD_ID, "ores"))
                    .icon(() -> new ItemStack(Items.IRON_ORE))
                    .build();

        BLOCKS = FabricItemGroupBuilder
                    .create(new Identifier(Info.MOD_ID, "blocks"))
                    .icon(() -> new ItemStack(Items.IRON_BLOCK))
                    .build();

        TOOLS = FabricItemGroupBuilder
                    .create(new Identifier(Info.MOD_ID, "tools"))
                    .icon(() -> new ItemStack(Items.IRON_PICKAXE))
                    .build();

        ARMOR = FabricItemGroupBuilder
                    .create(new Identifier(Info.MOD_ID, "armor"))
                    .icon(() -> new ItemStack(Items.IRON_CHESTPLATE))
                    .build();
    }
}
