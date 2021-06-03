package com.karpovanton.moremetals.materials.armor;

import com.karpovanton.moremetals.registry.ItemRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

/**
 * Tourmaline armor material
 */
public class TourmalineArmorMaterial implements ArmorMaterial {
    // Material instance
    public static final TourmalineArmorMaterial INSTANCE = new TourmalineArmorMaterial();

    private static final int[] DURABILITY_VALUES = new int[] {950, 1000, 1100, 1000};
    private static final int[] PROTECTION_VALUES = new int[] {6, 8, 9, 7};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.TOURMALINE_INGOT);
    }

    @Override
    public String getName() {
        return "tourmaline";
    }

    @Override
    public float getToughness() {
        return 2.4f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0f;
    }
}
