package com.karpovanton.moremetals.registry;

import com.karpovanton.moremetals.armor.*;
import com.karpovanton.moremetals.common.MetalSettings;
import com.karpovanton.moremetals.common.Percentage;
import com.karpovanton.moremetals.items.*;
import com.karpovanton.moremetals.materials.armor.*;
import com.karpovanton.moremetals.materials.tool.*;
import com.karpovanton.moremetals.tools.*;

/**
 * A registry for mod items
 */
public class ItemRegistry extends CommonRegistry {
    // Instance
    public static final ItemRegistry INSTANCE = new ItemRegistry();

    // Copper items
    public static final MetalSettings COPPER_SETTINGS = new MetalSettings()
            .setSharpness(new Percentage(3))
            .setSharpnessDamage(1.5f)
            .setElectricalShock(new Percentage(5))
            .setElectricalCapacity(500)
            .setElectricalShockDamage(2.5f);
    public static final MetalIngot COPPER_INGOT = new MetalIngot(COPPER_SETTINGS);

    public static final MetalSwordItem   COPPER_SWORD   = new MetalSwordItem(CopperToolMaterial.INSTANCE, 3, -1.6f, COPPER_SETTINGS);
    public static final MetalPickaxeItem COPPER_PICKAXE = new MetalPickaxeItem(CopperToolMaterial.INSTANCE, 1, -1.3f, COPPER_SETTINGS);
    public static final MetalAxeItem     COPPER_AXE     = new MetalAxeItem(CopperToolMaterial.INSTANCE, 5, -2.4f, COPPER_SETTINGS);
    public static final MetalShovelItem  COPPER_SHOVEL  = new MetalShovelItem(CopperToolMaterial.INSTANCE, 1, -1.1f, COPPER_SETTINGS);
    public static final MetalHoeItem     COPPER_HOE     = new MetalHoeItem(CopperToolMaterial.INSTANCE, 1, -1.2f, COPPER_SETTINGS);

    public static final MetalHelmetItem     COPPER_HELMET     = new MetalHelmetItem(CopperArmorMaterial.INSTANCE);
    public static final MetalChestplateItem COPPER_CHESTPLATE = new MetalChestplateItem(CopperArmorMaterial.INSTANCE);
    public static final MetalLeggingsItem   COPPER_LEGGINGS   = new MetalLeggingsItem(CopperArmorMaterial.INSTANCE);
    public static final MetalBootsItem      COPPER_BOOTS      = new MetalBootsItem(CopperArmorMaterial.INSTANCE);

    // Steel items
    public static final MetalSettings STEEL_SETTINGS = new MetalSettings()
                                            .setSharpness(new Percentage(10))
                                            .setSharpnessDamage(2.0f)
                                            .setElectricalShock(new Percentage(5))
                                            .setElectricalCapacity(300)
                                            .setElectricalShockDamage(3.0f);
    public static final MetalIngot STEEL_INGOT = new MetalIngot(STEEL_SETTINGS);

    public static final MetalSwordItem   STEEL_SWORD   = new MetalSwordItem(SteelToolMaterial.INSTANCE, 3, -2.1f, STEEL_SETTINGS);
    public static final MetalPickaxeItem STEEL_PICKAXE = new MetalPickaxeItem(SteelToolMaterial.INSTANCE, 2, -1.6f, STEEL_SETTINGS);
    public static final MetalAxeItem     STEEL_AXE     = new MetalAxeItem(SteelToolMaterial.INSTANCE, 6, -2.8f, STEEL_SETTINGS);
    public static final MetalShovelItem  STEEL_SHOVEL  = new MetalShovelItem(SteelToolMaterial.INSTANCE, 1, -2.3f, STEEL_SETTINGS);
    public static final MetalHoeItem     STEEL_HOE     = new MetalHoeItem(SteelToolMaterial.INSTANCE, 1, -2.1f, STEEL_SETTINGS);

    public static final MetalHelmetItem     STEEL_HELMET     = new MetalHelmetItem(SteelArmorMaterial.INSTANCE);
    public static final MetalChestplateItem STEEL_CHESTPLATE = new MetalChestplateItem(SteelArmorMaterial.INSTANCE);
    public static final MetalLeggingsItem   STEEL_LEGGINGS   = new MetalLeggingsItem(SteelArmorMaterial.INSTANCE);
    public static final MetalBootsItem      STEEL_BOOTS      = new MetalBootsItem(SteelArmorMaterial.INSTANCE);

    // Sapphire items
    public static final MetalSettings SAPPHIRE_SETTINGS = new MetalSettings()
                                            .setSharpness(new Percentage(5))
                                            .setSharpnessDamage(1.0f)
                                            .setElectricalShock(new Percentage(2))
                                            .setElectricalCapacity(400)
                                            .setElectricalShockDamage(2.0f);
    public static final MetalIngot SAPPHIRE_INGOT = new MetalIngot(SAPPHIRE_SETTINGS);

    public static final MetalSwordItem   SAPPHIRE_SWORD   = new MetalSwordItem(SapphireToolMaterial.INSTANCE, 4, -2.1f, SAPPHIRE_SETTINGS);
    public static final MetalPickaxeItem SAPPHIRE_PICKAXE = new MetalPickaxeItem(SapphireToolMaterial.INSTANCE, 2, -1.7f, SAPPHIRE_SETTINGS);
    public static final MetalAxeItem     SAPPHIRE_AXE     = new MetalAxeItem(SapphireToolMaterial.INSTANCE, 7, -2.8f, SAPPHIRE_SETTINGS);
    public static final MetalShovelItem  SAPPHIRE_SHOVEL  = new MetalShovelItem(SapphireToolMaterial.INSTANCE, 2, -1.4f, SAPPHIRE_SETTINGS);
    public static final MetalHoeItem     SAPPHIRE_HOE     = new MetalHoeItem(SapphireToolMaterial.INSTANCE, 2, -1.7f, SAPPHIRE_SETTINGS);

    public static final MetalHelmetItem     SAPPHIRE_HELMET     = new MetalHelmetItem(SapphireArmorMaterial.INSTANCE);
    public static final MetalChestplateItem SAPPHIRE_CHESTPLATE = new MetalChestplateItem(SapphireArmorMaterial.INSTANCE);
    public static final MetalLeggingsItem   SAPPHIRE_LEGGINGS   = new MetalLeggingsItem(SapphireArmorMaterial.INSTANCE);
    public static final MetalBootsItem      SAPPHIRE_BOOTS      = new MetalBootsItem(SapphireArmorMaterial.INSTANCE);

    // Ruby items
    public static final MetalSettings RUBY_SETTINGS = new MetalSettings()
                                            .setSharpness(new Percentage(8))
                                            .setSharpnessDamage(1.0f)
                                            .setElectricalShock(new Percentage(7))
                                            .setElectricalCapacity(350)
                                            .setElectricalShockDamage(3.0f);
    public static final MetalIngot RUBY_INGOT = new MetalIngot(RUBY_SETTINGS);

    public static final MetalSwordItem   RUBY_SWORD   = new MetalSwordItem(RubyToolMaterial.INSTANCE, 5, -2.3f, RUBY_SETTINGS);
    public static final MetalPickaxeItem RUBY_PICKAXE = new MetalPickaxeItem(RubyToolMaterial.INSTANCE, 3, -1.8f, RUBY_SETTINGS);
    public static final MetalAxeItem     RUBY_AXE     = new MetalAxeItem(RubyToolMaterial.INSTANCE, 8, -3.0f, RUBY_SETTINGS);
    public static final MetalShovelItem  RUBY_SHOVEL  = new MetalShovelItem(RubyToolMaterial.INSTANCE, 3, -1.6f, RUBY_SETTINGS);
    public static final MetalHoeItem     RUBY_HOE     = new MetalHoeItem(RubyToolMaterial.INSTANCE, 3, -1.9f, RUBY_SETTINGS);

    public static final MetalHelmetItem     RUBY_HELMET     = new MetalHelmetItem(RubyArmorMaterial.INSTANCE);
    public static final MetalChestplateItem RUBY_CHESTPLATE = new MetalChestplateItem(RubyArmorMaterial.INSTANCE);
    public static final MetalLeggingsItem   RUBY_LEGGINGS   = new MetalLeggingsItem(RubyArmorMaterial.INSTANCE);
    public static final MetalBootsItem      RUBY_BOOTS      = new MetalBootsItem(RubyArmorMaterial.INSTANCE);

    // Citrine items
    public static final MetalSettings CITRINE_SETTINGS = new MetalSettings()
                                            .setSharpness(new Percentage(10))
                                            .setSharpnessDamage(2.0f)
                                            .setElectricalShock(new Percentage(3))
                                            .setElectricalCapacity(380)
                                            .setElectricalShockDamage(3.0f);
    public static final MetalIngot CITRINE_INGOT = new MetalIngot(CITRINE_SETTINGS);

    public static final MetalSwordItem   CITRINE_SWORD   = new MetalSwordItem(CitrineToolMaterial.INSTANCE, 6, -2.4f, CITRINE_SETTINGS);
    public static final MetalPickaxeItem CITRINE_PICKAXE = new MetalPickaxeItem(CitrineToolMaterial.INSTANCE, 4, -2.0f, CITRINE_SETTINGS);
    public static final MetalAxeItem     CITRINE_AXE     = new MetalAxeItem(CitrineToolMaterial.INSTANCE, 9, -3.0f, CITRINE_SETTINGS);
    public static final MetalShovelItem  CITRINE_SHOVEL  = new MetalShovelItem(CitrineToolMaterial.INSTANCE, 4, -1.7f, CITRINE_SETTINGS);
    public static final MetalHoeItem     CITRINE_HOE     = new MetalHoeItem(CitrineToolMaterial.INSTANCE, 4, -2.1f, CITRINE_SETTINGS);

    public static final MetalHelmetItem     CITRINE_HELMET     = new MetalHelmetItem(CitrineArmorMaterial.INSTANCE);
    public static final MetalChestplateItem CITRINE_CHESTPLATE = new MetalChestplateItem(CitrineArmorMaterial.INSTANCE);
    public static final MetalLeggingsItem   CITRINE_LEGGINGS   = new MetalLeggingsItem(CitrineArmorMaterial.INSTANCE);
    public static final MetalBootsItem      CITRINE_BOOTS      = new MetalBootsItem(CitrineArmorMaterial.INSTANCE);

    // Chrysolite items
    public static final MetalSettings CHRYSOLITE_SETTINGS = new MetalSettings()
                                            .setSharpness(new Percentage(3))
                                            .setSharpnessDamage(1.0f)
                                            .setElectricalShock(new Percentage(5))
                                            .setElectricalCapacity(550)
                                            .setElectricalShockDamage(2.0f)
                                            .setRadiation(new Percentage(1))
                                            .setRadiationDuration(150);
    public static final MetalIngot CHRYSOLITE_INGOT = new MetalIngot(CHRYSOLITE_SETTINGS);

    public static final MetalSwordItem   CHRYSOLITE_SWORD   = new MetalSwordItem(ChrysoliteToolMaterial.INSTANCE, 7, -2.6f, CHRYSOLITE_SETTINGS);
    public static final MetalPickaxeItem CHRYSOLITE_PICKAXE = new MetalPickaxeItem(ChrysoliteToolMaterial.INSTANCE, 5, -2.2f, CHRYSOLITE_SETTINGS);
    public static final MetalAxeItem     CHRYSOLITE_AXE     = new MetalAxeItem(ChrysoliteToolMaterial.INSTANCE, 10, -3.1f, CHRYSOLITE_SETTINGS);
    public static final MetalShovelItem  CHRYSOLITE_SHOVEL  = new MetalShovelItem(ChrysoliteToolMaterial.INSTANCE, 5, -1.9f, CHRYSOLITE_SETTINGS);
    public static final MetalHoeItem     CHRYSOLITE_HOE     = new MetalHoeItem(ChrysoliteToolMaterial.INSTANCE, 5, -2.3f, CHRYSOLITE_SETTINGS);

    public static final MetalHelmetItem     CHRYSOLITE_HELMET     = new MetalHelmetItem(ChrysoliteArmorMaterial.INSTANCE);
    public static final MetalChestplateItem CHRYSOLITE_CHESTPLATE = new MetalChestplateItem(ChrysoliteArmorMaterial.INSTANCE);
    public static final MetalLeggingsItem   CHRYSOLITE_LEGGINGS   = new MetalLeggingsItem(ChrysoliteArmorMaterial.INSTANCE);
    public static final MetalBootsItem      CHRYSOLITE_BOOTS      = new MetalBootsItem(ChrysoliteArmorMaterial.INSTANCE);

    // Aquamarine items
    public static final MetalSettings AQUAMARINE_SETTINGS = new MetalSettings()
                                            .setSharpness(new Percentage(2))
                                            .setSharpnessDamage(2.0f)
                                            .setElectricalShock(new Percentage(5))
                                            .setElectricalCapacity(450)
                                            .setElectricalShockDamage(1.0f)
                                            .setRadiation(new Percentage(2))
                                            .setRadiationDuration(200);
    public static final MetalIngot AQUAMARINE_INGOT = new MetalIngot(AQUAMARINE_SETTINGS);

    public static final MetalSwordItem   AQUAMARINE_SWORD   = new MetalSwordItem(AquamarineToolMaterial.INSTANCE, 8, -2.4f, AQUAMARINE_SETTINGS);
    public static final MetalPickaxeItem AQUAMARINE_PICKAXE = new MetalPickaxeItem(AquamarineToolMaterial.INSTANCE, 6, -2.0f, AQUAMARINE_SETTINGS);
    public static final MetalAxeItem     AQUAMARINE_AXE     = new MetalAxeItem(AquamarineToolMaterial.INSTANCE, 11, -2.9f, AQUAMARINE_SETTINGS);
    public static final MetalShovelItem  AQUAMARINE_SHOVEL  = new MetalShovelItem(AquamarineToolMaterial.INSTANCE, 6, -1.7f, AQUAMARINE_SETTINGS);
    public static final MetalHoeItem     AQUAMARINE_HOE     = new MetalHoeItem(AquamarineToolMaterial.INSTANCE, 6, -2.1f, AQUAMARINE_SETTINGS);

    public static final MetalHelmetItem     AQUAMARINE_HELMET     = new MetalHelmetItem(AquamarineArmorMaterial.INSTANCE);
    public static final MetalChestplateItem AQUAMARINE_CHESTPLATE = new MetalChestplateItem(AquamarineArmorMaterial.INSTANCE);
    public static final MetalLeggingsItem   AQUAMARINE_LEGGINGS   = new MetalLeggingsItem(AquamarineArmorMaterial.INSTANCE);
    public static final MetalBootsItem      AQUAMARINE_BOOTS      = new MetalBootsItem(AquamarineArmorMaterial.INSTANCE);

    // Amethyst items
    public static final MetalSettings AMETHYST_SETTINGS = new MetalSettings()
                                            .setSharpness(new Percentage(3))
                                            .setSharpnessDamage(2.5f)
                                            .setElectricalShock(new Percentage(6))
                                            .setElectricalCapacity(700)
                                            .setElectricalShockDamage(2.0f)
                                            .setRadiation(new Percentage(1))
                                            .setRadiationDuration(120);
    public static final MetalIngot AMETHYST_INGOT = new MetalIngot(AMETHYST_SETTINGS);

    public static final MetalSwordItem   AMETHYST_SWORD   = new MetalSwordItem(AmethystToolMaterial.INSTANCE, 9, -2.5f, AMETHYST_SETTINGS);
    public static final MetalPickaxeItem AMETHYST_PICKAXE = new MetalPickaxeItem(AmethystToolMaterial.INSTANCE, 7, -2.1f, AMETHYST_SETTINGS);
    public static final MetalAxeItem     AMETHYST_AXE     = new MetalAxeItem(AmethystToolMaterial.INSTANCE, 12, -3.0f, AMETHYST_SETTINGS);
    public static final MetalShovelItem  AMETHYST_SHOVEL  = new MetalShovelItem(AmethystToolMaterial.INSTANCE, 7, -1.8f, AMETHYST_SETTINGS);
    public static final MetalHoeItem     AMETHYST_HOE     = new MetalHoeItem(AmethystToolMaterial.INSTANCE, 7, -2.2f, AMETHYST_SETTINGS);

    public static final MetalHelmetItem     AMETHYST_HELMET     = new MetalHelmetItem(AmethystArmorMaterial.INSTANCE);
    public static final MetalChestplateItem AMETHYST_CHESTPLATE = new MetalChestplateItem(AmethystArmorMaterial.INSTANCE);
    public static final MetalLeggingsItem   AMETHYST_LEGGINGS   = new MetalLeggingsItem(AmethystArmorMaterial.INSTANCE);
    public static final MetalBootsItem      AMETHYST_BOOTS      = new MetalBootsItem(AmethystArmorMaterial.INSTANCE);

    // Tourmaline items
    public static final MetalSettings TOURMALINE_SETTINGS = new MetalSettings()
                                            .setSharpness(new Percentage(3))
                                            .setSharpnessDamage(2.0f)
                                            .setElectricalShock(new Percentage(5))
                                            .setElectricalCapacity(1000)
                                            .setElectricalShockDamage(1.0f)
                                            .setRadiation(new Percentage(1))
                                            .setRadiationDuration(200);
    public static final MetalIngot TOURMALINE_INGOT = new MetalIngot(TOURMALINE_SETTINGS);

    public static final MetalSwordItem   TOURMALINE_SWORD   = new MetalSwordItem(TourmalineToolMaterial.INSTANCE, 10, -2.6f, TOURMALINE_SETTINGS);
    public static final MetalPickaxeItem TOURMALINE_PICKAXE = new MetalPickaxeItem(TourmalineToolMaterial.INSTANCE, 8, -2.2f, TOURMALINE_SETTINGS);
    public static final MetalAxeItem     TOURMALINE_AXE     = new MetalAxeItem(TourmalineToolMaterial.INSTANCE, 13, -3.1f, TOURMALINE_SETTINGS);
    public static final MetalShovelItem  TOURMALINE_SHOVEL  = new MetalShovelItem(TourmalineToolMaterial.INSTANCE, 8, -2.0f, TOURMALINE_SETTINGS);
    public static final MetalHoeItem     TOURMALINE_HOE     = new MetalHoeItem(TourmalineToolMaterial.INSTANCE, 8, -2.4f, TOURMALINE_SETTINGS);

    public static final MetalHelmetItem     TOURMALINE_HELMET     = new MetalHelmetItem(TourmalineArmorMaterial.INSTANCE);
    public static final MetalChestplateItem TOURMALINE_CHESTPLATE = new MetalChestplateItem(TourmalineArmorMaterial.INSTANCE);
    public static final MetalLeggingsItem   TOURMALINE_LEGGINGS   = new MetalLeggingsItem(TourmalineArmorMaterial.INSTANCE);
    public static final MetalBootsItem      TOURMALINE_BOOTS      = new MetalBootsItem(TourmalineArmorMaterial.INSTANCE);

    /**
     * Registers all items into the game
     */
    @Override
    public void register() {
        // Registering copper items
        registerItem("copper_ingot", COPPER_INGOT);
        registerItem("copper_sword", COPPER_SWORD);
        registerItem("copper_pickaxe", COPPER_PICKAXE);
        registerItem("copper_axe", COPPER_AXE);
        registerItem("copper_shovel", COPPER_SHOVEL);
        registerItem("copper_hoe", COPPER_HOE);
        registerItem("copper_helmet", COPPER_HELMET);
        registerItem("copper_chestplate", COPPER_CHESTPLATE);
        registerItem("copper_leggings", COPPER_LEGGINGS);
        registerItem("copper_boots", COPPER_BOOTS);

        // Registering steel items
        registerItem("steel_ingot", STEEL_INGOT);
        registerItem("steel_sword", STEEL_SWORD);
        registerItem("steel_pickaxe", STEEL_PICKAXE);
        registerItem("steel_axe", STEEL_AXE);
        registerItem("steel_shovel", STEEL_SHOVEL);
        registerItem("steel_hoe", STEEL_HOE);
        registerItem("steel_helmet", STEEL_HELMET);
        registerItem("steel_chestplate", STEEL_CHESTPLATE);
        registerItem("steel_leggings", STEEL_LEGGINGS);
        registerItem("steel_boots", STEEL_BOOTS);

        // Registering sapphire items
        registerItem("sapphire_ingot", SAPPHIRE_INGOT);
        registerItem("sapphire_sword", SAPPHIRE_SWORD);
        registerItem("sapphire_pickaxe", SAPPHIRE_PICKAXE);
        registerItem("sapphire_axe", SAPPHIRE_AXE);
        registerItem("sapphire_shovel", SAPPHIRE_SHOVEL);
        registerItem("sapphire_hoe", SAPPHIRE_HOE);
        registerItem("sapphire_helmet", SAPPHIRE_HELMET);
        registerItem("sapphire_chestplate", SAPPHIRE_CHESTPLATE);
        registerItem("sapphire_leggings", SAPPHIRE_LEGGINGS);
        registerItem("sapphire_boots", SAPPHIRE_BOOTS);

        // Registering ruby items
        registerItem("ruby_ingot", RUBY_INGOT);
        registerItem("ruby_sword", RUBY_SWORD);
        registerItem("ruby_pickaxe", RUBY_PICKAXE);
        registerItem("ruby_axe", RUBY_AXE);
        registerItem("ruby_shovel", RUBY_SHOVEL);
        registerItem("ruby_hoe", RUBY_HOE);
        registerItem("ruby_helmet", RUBY_HELMET);
        registerItem("ruby_chestplate", RUBY_CHESTPLATE);
        registerItem("ruby_leggings", RUBY_LEGGINGS);
        registerItem("ruby_boots", RUBY_BOOTS);

        // Registering citrine items
        registerItem("citrine_ingot", CITRINE_INGOT);
        registerItem("citrine_sword", CITRINE_SWORD);
        registerItem("citrine_pickaxe", CITRINE_PICKAXE);
        registerItem("citrine_axe", CITRINE_AXE);
        registerItem("citrine_shovel", CITRINE_SHOVEL);
        registerItem("citrine_hoe", CITRINE_HOE);
        registerItem("citrine_helmet", CITRINE_HELMET);
        registerItem("citrine_chestplate", CITRINE_CHESTPLATE);
        registerItem("citrine_leggings", CITRINE_LEGGINGS);
        registerItem("citrine_boots", CITRINE_BOOTS);

        // Registering chrysolite items
        registerItem("chrysolite_ingot", CHRYSOLITE_INGOT);
        registerItem("chrysolite_sword", CHRYSOLITE_SWORD);
        registerItem("chrysolite_pickaxe", CHRYSOLITE_PICKAXE);
        registerItem("chrysolite_axe", CHRYSOLITE_AXE);
        registerItem("chrysolite_shovel", CHRYSOLITE_SHOVEL);
        registerItem("chrysolite_hoe", CHRYSOLITE_HOE);
        registerItem("chrysolite_helmet", CHRYSOLITE_HELMET);
        registerItem("chrysolite_chestplate", CHRYSOLITE_CHESTPLATE);
        registerItem("chrysolite_leggings", CHRYSOLITE_LEGGINGS);
        registerItem("chrysolite_boots", CHRYSOLITE_BOOTS);

        // Registering aquamarine items
        registerItem("aquamarine_ingot", AQUAMARINE_INGOT);
        registerItem("aquamarine_sword", AQUAMARINE_SWORD);
        registerItem("aquamarine_pickaxe", AQUAMARINE_PICKAXE);
        registerItem("aquamarine_axe", AQUAMARINE_AXE);
        registerItem("aquamarine_shovel", AQUAMARINE_SHOVEL);
        registerItem("aquamarine_hoe", AQUAMARINE_HOE);
        registerItem("aquamarine_helmet", AQUAMARINE_HELMET);
        registerItem("aquamarine_chestplate", AQUAMARINE_CHESTPLATE);
        registerItem("aquamarine_leggings", AQUAMARINE_LEGGINGS);
        registerItem("aquamarine_boots", AQUAMARINE_BOOTS);

        // Registering amethyst items
        registerItem("amethyst_ingot", AMETHYST_INGOT);
        registerItem("amethyst_sword", AMETHYST_SWORD);
        registerItem("amethyst_pickaxe", AMETHYST_PICKAXE);
        registerItem("amethyst_axe", AMETHYST_AXE);
        registerItem("amethyst_shovel", AMETHYST_SHOVEL);
        registerItem("amethyst_hoe", AMETHYST_HOE);
        registerItem("amethyst_helmet", AMETHYST_HELMET);
        registerItem("amethyst_chestplate", AMETHYST_CHESTPLATE);
        registerItem("amethyst_leggings", AMETHYST_LEGGINGS);
        registerItem("amethyst_boots", AMETHYST_BOOTS);

        // Registering tourmaline items
        registerItem("tourmaline_ingot", TOURMALINE_INGOT);
        registerItem("tourmaline_sword", TOURMALINE_SWORD);
        registerItem("tourmaline_pickaxe", TOURMALINE_PICKAXE);
        registerItem("tourmaline_axe", TOURMALINE_AXE);
        registerItem("tourmaline_shovel", TOURMALINE_SHOVEL);
        registerItem("tourmaline_hoe", TOURMALINE_HOE);
        registerItem("tourmaline_helmet", TOURMALINE_HELMET);
        registerItem("tourmaline_chestplate", TOURMALINE_CHESTPLATE);
        registerItem("tourmaline_leggings", TOURMALINE_LEGGINGS);
        registerItem("tourmaline_boots", TOURMALINE_BOOTS);
    }
}
