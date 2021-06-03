package com.karpovanton.moremetals.materials.tool;

import com.karpovanton.moremetals.registry.ItemRegistry;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

/**
 * Tourmaline tool material
 */
public class TourmalineToolMaterial implements ToolMaterial {
    // Material instance
    public static final TourmalineToolMaterial INSTANCE = new TourmalineToolMaterial();

    @Override
    public int getDurability() {
        return 1800;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 15.0f;
    }

    @Override
    public float getAttackDamage() {
        return 18.0f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.TOURMALINE_INGOT);
    }
}
