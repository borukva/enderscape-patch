package eu.pb4.enderscapepatch.mixin.mod;

import eu.pb4.enderscapepatch.impl.EnderscapePolymerPatch;
import net.bunten.enderscape.entity.wraith.Wraith;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Wraith.class)
public class WraithMixin {
    @Redirect(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/data/DataTracker;registerData(Ljava/lang/Class;Lnet/minecraft/entity/data/TrackedDataHandler;)Lnet/minecraft/entity/data/TrackedData;"))
    private static TrackedData<Object> forceFakeForSerializerCheckSkip(Class<?> entityClass, TrackedDataHandler<Object> dataHandler) {
        return new TrackedData<>(EnderscapePolymerPatch.FAKE_TRACKER_INDEX, dataHandler);
    }
}
