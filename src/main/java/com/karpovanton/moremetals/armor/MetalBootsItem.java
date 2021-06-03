package com.karpovanton.moremetals.armor;

import com.karpovanton.moremetals.registry.ItemGroupRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

/**
 * A base class for all metal boots
 */
public class MetalBootsItem extends ArmorItem {
    /**
     * Item constructor
     * @param material Armor material
     */
    public MetalBootsItem(ArmorMaterial material) {
        super(material, EquipmentSlot.FEET, new Item.Settings().group(ItemGroupRegistry.ARMOR));
    }
}
