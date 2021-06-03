package com.karpovanton.moremetals.materials.armor;

import com.karpovanton.moremetals.registry.ItemRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

/**
 * Chrysolite armor material
 */
public class ChrysoliteArmorMaterial implements ArmorMaterial {
    // Material instance
    public static final ChrysoliteArmorMaterial INSTANCE = new ChrysoliteArmorMaterial();

    private static final int[] DURABILITY_VALUES = new int[] {650, 700, 750, 700};
    private static final int[] PROTECTION_VALUES = new int[] {4, 6, 7, 5};

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
        return 11;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.CHRYSOLITE_INGOT);
    }

    @Override
    public String getName() {
        return "chrysolite";
    }

    @Override
    public float getToughness() {
        return 1.8f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0f;
    }
}
