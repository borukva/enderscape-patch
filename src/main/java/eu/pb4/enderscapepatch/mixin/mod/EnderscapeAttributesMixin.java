package eu.pb4.enderscapepatch.mixin.mod;

import eu.pb4.polymer.rsm.api.RegistrySyncUtils;
import net.bunten.enderscape.registry.EnderscapeAttributes;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnderscapeAttributes.class)
public class EnderscapeAttributesMixin {
    @Inject(method = "register", at = @At("TAIL"))
    private static void polymerify(String name, EntityAttribute attribute, CallbackInfoReturnable<RegistryEntry<EntityAttribute>> cir) {
        RegistrySyncUtils.setServerEntry(Registries.ATTRIBUTE, cir.getReturnValue().value());
    }
}
