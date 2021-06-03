package com.karpovanton.moremetals.items;

import com.karpovanton.moremetals.common.MetalEvents;
import com.karpovanton.moremetals.common.MetalProfile;
import com.karpovanton.moremetals.common.MetalSettings;
import com.karpovanton.moremetals.registry.ItemGroupRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * A base class for all metal ingots
 */
public class MetalIngot extends Item {
    // Metal profile
    private final MetalProfile _profile;

    /**
     * Item constructor
     * @param settings Metal settings
     */
    public MetalIngot(MetalSettings settings) {
        // Generating item settings
        super(new Item.Settings()
                .group(ItemGroupRegistry.INGOTS));

        _profile = new MetalProfile(settings, 0, 0);
    }

    /**
     * Inventory update event
     * @param stack Item stack with the item
     * @param world World
     * @param entity Entity who has the item
     * @param slot Slot index
     * @param selected Is selected (in hand)
     */
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        MetalEvents.inventoryTick(selected, entity, _profile);
    }
}
