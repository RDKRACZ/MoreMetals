package com.karpovanton.moremetals.armor;

import com.karpovanton.moremetals.registry.ItemGroupRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

/**
 * A base class for all metal chestplates
 */
public class MetalChestplateItem extends ArmorItem {
    /**
     * Item constructor
     * @param material Armor material
     */
    public MetalChestplateItem(ArmorMaterial material) {
        super(material, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroupRegistry.ARMOR));
    }
}
