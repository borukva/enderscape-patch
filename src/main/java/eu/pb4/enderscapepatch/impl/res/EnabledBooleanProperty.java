package eu.pb4.enderscapepatch.impl.res;

import com.mojang.serialization.MapCodec;
import eu.pb4.polymer.resourcepack.extras.api.format.item.property.bool.BooleanProperty;
import net.bunten.enderscape.registry.EnderscapeDataComponents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public record EnabledBooleanProperty() implements BooleanProperty {
    public static final MapCodec<EnabledBooleanProperty> MAP_CODEC = MapCodec.unit(new EnabledBooleanProperty());

    public static boolean test(ItemStack stack, @Nullable World level, @Nullable LivingEntity living) {
        return stack.getOrDefault(EnderscapeDataComponents.ENABLED, false);
    }

    @Override
    public MapCodec<? extends BooleanProperty> codec() {
        return CODEC;
    }
}
