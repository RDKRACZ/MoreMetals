package com.karpovanton.moremetals.materials.tool;

import com.karpovanton.moremetals.registry.ItemRegistry;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

/**
 * Aquamarine tool material
 */
public class AquamarineToolMaterial implements ToolMaterial {
    // Material instance
    public static final AquamarineToolMaterial INSTANCE = new AquamarineToolMaterial();

    @Override
    public int getDurability() {
        return 1400;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0f;
    }

    @Override
    public float getAttackDamage() {
        return 12.0f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.AQUAMARINE_INGOT);
    }
}
