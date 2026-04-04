package eu.pb4.enderscapepatch.impl.item;

import eu.pb4.polymer.core.api.item.PolymerItem;
import net.bunten.enderscape.registry.EnderscapeDataComponents;
import net.minecraft.block.BlockState;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import xyz.nucleoid.packettweaker.PacketContext;

public record PolyBaseItem(Item item) implements PolymerItem {
    @Override
    public Item getPolymerItem(ItemStack itemStack, PacketContext packetContext) {
        return item instanceof ShieldItem ? Items.SHIELD : Items.TRIAL_KEY;
    }

    @Override
    public void modifyBasePolymerItemStack(ItemStack out, ItemStack stack, PacketContext context) {
        out.remove(EnderscapeDataComponents.ATTACK_SOUNDS);
        out.remove(EnderscapeDataComponents.DASH_JUMP);
        out.remove(EnderscapeDataComponents.ENTITY_MAGNET);
        out.remove(EnderscapeDataComponents.LODESTONE_TELEPORTATION);
        out.remove(EnderscapeDataComponents.FUELED_TOOL);
        out.remove(EnderscapeDataComponents.STUN_ATTACK);
        out.remove(EnderscapeDataComponents.THRESHOLD_COUNTER);
        out.remove(EnderscapeDataComponents.TOGGLABLE);
        out.remove(EnderscapeDataComponents.ENABLED);
        out.remove(EnderscapeDataComponents.BACKSTAB_ANGLE);
        out.remove(EnderscapeDataComponents.CURRENT_FUEL);
        out.remove(EnderscapeDataComponents.RUBBLEMITE_VARIANT);
    }

    @Override
    public boolean isPolymerBlockInteraction(BlockState state, ServerPlayerEntity player, Hand hand, ItemStack stack, ServerWorld world, BlockHitResult blockHitResult, ActionResult actionResult) {
        return actionResult.isAccepted();
    }

    @Override
    public boolean isIgnoringBlockInteractionPlaySoundExceptedEntity(BlockState state, ServerPlayerEntity player, Hand hand, ItemStack stack, ServerWorld world, BlockHitResult blockHitResult) {
        return item instanceof BlockItem;
    }
}
