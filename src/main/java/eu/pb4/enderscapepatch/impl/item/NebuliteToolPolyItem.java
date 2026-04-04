package eu.pb4.enderscapepatch.impl.item;

import eu.pb4.enderscapepatch.impl.res.EnabledBooleanProperty;
import eu.pb4.polymer.core.api.item.PolymerItem;
import net.bunten.enderscape.registry.EnderscapeDataComponents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.CustomModelDataComponent;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import xyz.nucleoid.packettweaker.PacketContext;

import java.util.List;

public record NebuliteToolPolyItem() implements PolymerItem {
    @Override
    public Item getPolymerItem(ItemStack itemStack, PacketContext packetContext) {
        return Items.TRIAL_KEY;
    }

    @Override
    public void modifyBasePolymerItemStack(ItemStack out, ItemStack stack, PacketContext context) {
        out.set(DataComponentTypes.MAX_DAMAGE, 13);
        out.set(DataComponentTypes.DAMAGE, 13 - stack.getItemBarStep());

        out.set(DataComponentTypes.TOOLTIP_DISPLAY, out.getOrDefault(DataComponentTypes.TOOLTIP_DISPLAY, TooltipDisplayComponent.DEFAULT).with(DataComponentTypes.DAMAGE, true));

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
}
