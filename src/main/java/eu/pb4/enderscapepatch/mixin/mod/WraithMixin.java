package eu.pb4.enderscapepatch.mixin.mod;

import eu.pb4.enderscapepatch.impl.EnderscapePolymerPatch;
import net.bunten.enderscape.entity.wraith.Wraith;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.SyncedDataHolder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Wraith.class)
public class WraithMixin {
    @Redirect(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/syncher/SynchedEntityData;defineId(Ljava/lang/Class;Lnet/minecraft/network/syncher/EntityDataSerializer;)Lnet/minecraft/network/syncher/EntityDataAccessor;"))
    private static EntityDataAccessor<Object> forceFakeForSerializerCheckSkip(Class<? extends SyncedDataHolder> entityClass, EntityDataSerializer<Object> dataHandler) {
        return new EntityDataAccessor<>(EnderscapePolymerPatch.FAKE_TRACKER_INDEX, dataHandler);
    }
}
