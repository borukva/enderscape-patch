package eu.pb4.enderscapepatch.mixin.mod;

import eu.pb4.enderscapepatch.impl.EnderscapePolymerPatch;
import net.bunten.enderscape.entity.wraith.Wraith;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Wraith.class)
public class WraithMixin {
    @Redirect(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/data/DataTracker;registerData(Ljava/lang/Class;Lnet/minecraft/entity/data/TrackedDataHandler;)Lnet/minecraft/entity/data/TrackedData;"))
    private static TrackedData<Object> forceFakeForSerializerCheckSkip(Class<?> entityClass, TrackedDataHandler<Object> dataHandler) {
        return new TrackedData<>(EnderscapePolymerPatch.FAKE_TRACKER_INDEX, dataHandler);
    }

    @Inject(method = "tick", at = @At("HEAD"))
    private void ensureAnimations(CallbackInfo ci) {
        var self = (Wraith)(Object)this;
        int age = ((net.minecraft.entity.Entity) self).age;
        switch (self.getState()) {
            case IDLE -> self.idleAnimationState.startIfStopped(age);
            case WALK -> self.walkAnimationState.startIfStopped(age);
            case RIGHT_SLASH -> self.rightSlashAnimationState.startIfStopped(age);
            case LEFT_SLASH -> self.leftSlashAnimationState.startIfStopped(age);
            case SPIN_SLASH -> self.spinSlashAnimationState.startIfStopped(age);
        }
    }
}
