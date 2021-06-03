package com.karpovanton.moremetals.materials.armor;

import com.karpovanton.moremetals.registry.ItemRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

/**
 * Aquamarine armor material
 */
public class AquamarineArmorMaterial implements ArmorMaterial {
    // Material instance
    public static final AquamarineArmorMaterial INSTANCE = new AquamarineArmorMaterial();

    private static final int[] DURABILITY_VALUES = new int[] {750, 800, 850, 800};
    private static final int[] PROTECTION_VALUES = new int[] {4, 7, 8, 5};

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
        return 14;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.AQUAMARINE_INGOT);
    }

    @Override
    public String getName() {
        return "aquamarine";
    }

    @Override
    public float getToughness() {
        return 2.0f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0f;
    }
}
