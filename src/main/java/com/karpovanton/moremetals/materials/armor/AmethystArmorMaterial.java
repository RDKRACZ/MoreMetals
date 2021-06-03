package com.karpovanton.moremetals.materials.armor;

import com.karpovanton.moremetals.registry.ItemRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

/**
 * Amethyst armor material
 */
public class AmethystArmorMaterial implements ArmorMaterial {
    // Material instance
    public static final AmethystArmorMaterial INSTANCE = new AmethystArmorMaterial();

    private static final int[] DURABILITY_VALUES = new int[] {850, 900, 950, 900};
    private static final int[] PROTECTION_VALUES = new int[] {5, 7, 8, 6};

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
        return Ingredient.ofItems(ItemRegistry.AMETHYST_INGOT);
    }

    @Override
    public String getName() {
        return "amethyst";
    }

    @Override
    public float getToughness() {
        return 2.2f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0f;
    }
}
