package eu.pb4.enderscapepatch.mixin.mod;

import eu.pb4.enderscapepatch.impl.EnderscapePolymerPatch;
import net.bunten.enderscape.entity.enderling.Enderling;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Enderling.class)
public class EnderlingMixin {
    @Redirect(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/data/DataTracker;registerData(Ljava/lang/Class;Lnet/minecraft/entity/data/TrackedDataHandler;)Lnet/minecraft/entity/data/TrackedData;"))
    private static TrackedData<Object> forceFakeForSerializerCheckSkip(Class<?> entityClass, TrackedDataHandler<Object> dataHandler) {
        return new TrackedData<>(EnderscapePolymerPatch.FAKE_TRACKER_INDEX, dataHandler);
    }

    @Inject(method = "tick", at = @At("HEAD"))
    private void ensureAnimations(CallbackInfo ci) {
        var self = (Enderling)(Object)this;
        int age = ((net.minecraft.entity.Entity) self).age;
        switch (self.getState()) {
            case IDLE -> self.idleAnimationState.startIfNotRunning(age);
            case WALK -> self.walkAnimationState.startIfNotRunning(age);
            case CHASE -> self.chaseAnimationState.startIfNotRunning(age);
            case RIGHT_SLASH -> self.rightAttackAnimationState.startIfNotRunning(age);
            case LEFT_SLASH -> self.leftAttackAnimationState.startIfNotRunning(age);
        }
    }
}
