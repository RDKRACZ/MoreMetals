package com.karpovanton.moremetals.materials.tool;

import com.karpovanton.moremetals.registry.ItemRegistry;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

/**
 * Chrysolite tool material
 */
public class ChrysoliteToolMaterial implements ToolMaterial {
    // Material instance
    public static final ChrysoliteToolMaterial INSTANCE = new ChrysoliteToolMaterial();

    @Override
    public int getDurability() {
        return 1200;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0f;
    }

    @Override
    public float getAttackDamage() {
        return 9.0f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 11;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.CHRYSOLITE_INGOT);
    }
}
