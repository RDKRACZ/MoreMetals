package com.karpovanton.moremetals.armor;

import com.karpovanton.moremetals.registry.ItemGroupRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

/**
 * A base class for all metal leggings
 */
public class MetalLeggingsItem extends ArmorItem {
    /**
     * Item constructor
     * @param material Armor material
     */
    public MetalLeggingsItem(ArmorMaterial material) {
        super(material, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroupRegistry.ARMOR));
    }
}
