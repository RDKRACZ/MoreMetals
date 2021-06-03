package com.karpovanton.moremetals.armor;

import com.karpovanton.moremetals.registry.ItemGroupRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

/**
 * A base class for all metal helmets
 */
public class MetalHelmetItem extends ArmorItem {
    /**
     * Item constructor
     * @param material Armor material
     */
    public MetalHelmetItem(ArmorMaterial material) {
        super(material, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroupRegistry.ARMOR));
    }
}
