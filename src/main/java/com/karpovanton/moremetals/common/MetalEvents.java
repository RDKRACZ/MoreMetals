package com.karpovanton.moremetals.common;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

/**
 * A class with common events for metals
 */
public class MetalEvents {
    /**
     * Inventory tick event
     * @param selected Is item selected
     * @param entity Entity who has the item
     * @param profile Metal profile
     */
    public static void inventoryTick(boolean selected, Entity entity, MetalProfile profile) {
        // Incrementing electricity and ticks
        profile.setElectricity(profile.getElectricity() + 1);
        profile.setTicks(profile.getTicks() + 1);

        // Returning if not enough ticks to proceed
        if (profile.getTicks() < 600) return;

        MetalSettings settings = profile.getSettings();

        // Selected-only events
        if (selected) {
            sharpness(settings, entity);
            electricity(profile, settings, entity);
        }

        // Non-selected events
        radiation(settings, entity);

        // Resetting ticks
        profile.setTicks(0);
    }

    /**
     * Post hit event
     * @param target Target entity
     * @param attacker Attacker entity
     * @param profile Metal profile
     */
    public static void postHit(LivingEntity target, LivingEntity attacker, MetalProfile profile) {
        sharpness(profile.getSettings(), attacker);
        electricity(profile, profile.getSettings(), target);
        radiation(profile.getSettings(), target);
    }

    /**
     * Post mine event
     * @param miner Miner event
     * @param profile Metal profile
     */
    public static void postMine(LivingEntity miner, MetalProfile profile) {
        sharpness(profile.getSettings(), miner);
        electricity(profile, profile.getSettings(), miner);
        radiation(profile.getSettings(), miner);
    }

    /**
     * Sharpness effect applier
     * @param settings Metal settings
     * @param entity Entity with the item
     */
    private static void sharpness(MetalSettings settings, Entity entity) {
        if (settings.getSharpness().randomize()) {
            // Damaging the entity
            entity.damage(DamageSource.GENERIC, settings.getSharpnessDamage());
            System.out.println("Sharpness");
        }
    }

    /**
     * Electricity effect applier
     * @param profile Metal profile
     * @param settings Metal settings
     * @param entity Entity who has the item
     */
    private static void electricity(MetalProfile profile, MetalSettings settings, Entity entity) {
        if (profile.getElectricity() >= settings.getElectricalCapacity()) { // Checking the electrical capacity
            if (settings.getElectricalShock().randomize()) {
                // Damaging the entity
                entity.damage(DamageSource.GENERIC, settings.getElectricalShockDamage());
            }
            // Resetting the electricity
            profile.setElectricity(0);
        }
    }

    /**
     * Radiation effect applier
     * @param settings Metal settings
     * @param entity Entity who has the item
     */
    private static void radiation(MetalSettings settings, Entity entity) {
        if (!settings.isStabilized()) {
            if (settings.getRadiation().randomize() && entity.isLiving()) {
                // Applying poison effect
                ((LivingEntity) entity).applyStatusEffect(new StatusEffectInstance(StatusEffects.POISON, settings.getRadiationDuration()));
            }
        }
    }
}
