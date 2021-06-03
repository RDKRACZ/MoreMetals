package com.karpovanton.moremetals.tools;

import com.karpovanton.moremetals.common.MetalEvents;
import com.karpovanton.moremetals.common.MetalProfile;
import com.karpovanton.moremetals.common.MetalSettings;
import com.karpovanton.moremetals.registry.ItemGroupRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * A base class for all metal axes
 */
public class MetalAxeItem extends AxeItem {
    private final MetalProfile _profile;

    /**
     * Item constructor
     * @param material Tool material
     * @param attackDamage Attack damage
     * @param attackSpeed Attack speed
     * @param settings Metal settings
     */
    public MetalAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, MetalSettings settings) {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(ItemGroupRegistry.TOOLS));

        _profile = new MetalProfile(settings, 0, 0);
    }

    /**
     * Post hit event
     * @param stack Item stack with the item
     * @param target Target entity
     * @param attacker Attacker entity
     * @return Action result
     */
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);
        MetalEvents.postHit(target, attacker, _profile);

        return true;
    }

    /**
     * Post mine event
     * @param stack Item stack with the item
     * @param world World
     * @param state Broken block state
     * @param pos Broken block position
     * @param miner Miner entity
     * @return Action result
     */
    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        super.postMine(stack, world, state, pos, miner);
        MetalEvents.postMine(miner, _profile);

        return true;
    }
}
