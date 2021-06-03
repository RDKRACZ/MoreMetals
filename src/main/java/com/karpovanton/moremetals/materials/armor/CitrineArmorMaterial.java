package com.karpovanton.moremetals.materials.armor;

import com.karpovanton.moremetals.registry.ItemRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

/**
 * Citrine armor material
 */
public class CitrineArmorMaterial implements ArmorMaterial {
    // Material instance
    public static final CitrineArmorMaterial INSTANCE = new CitrineArmorMaterial();

    private static final int[] DURABILITY_VALUES = new int[] {600, 650, 700, 650};
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 7, 4};

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
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.CITRINE_INGOT);
    }

    @Override
    public String getName() {
        return "citrine";
    }

    @Override
    public float getToughness() {
        return 1.6f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0f;
    }
}
