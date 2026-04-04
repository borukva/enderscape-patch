package eu.pb4.enderscapepatch.impl.entity.model;

import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.*;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.AnimationDefinition.Builder;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.Transformation.*;

public class EnderlingAnimations {
    public static final AnimationDefinition IDLE;
    public static final AnimationDefinition WALK;
    public static final AnimationDefinition CHASE;
    public static final AnimationDefinition RIGHT_ATTACK;
    public static final AnimationDefinition LEFT_ATTACK;

    private EnderlingAnimations() {
    }

    static {
        IDLE = Builder.create(4.0F).looping()
            .addBoneAnimation("torso", new Transformation(Targets.TRANSLATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Interpolations.CUBIC),
                new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Interpolations.CUBIC),
                new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 8.91F), Interpolations.CUBIC),
                new Keyframe(0.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 10.0F), Interpolations.CUBIC),
                new Keyframe(1.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Interpolations.CUBIC),
                new Keyframe(2.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 10.0F), Interpolations.CUBIC),
                new Keyframe(3.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Interpolations.CUBIC),
                new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 8.91F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("h_left_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(0.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 0.25F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.85F, AnimationHelper.createScalingVector(1.0F, 0.25F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.9F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(4.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_left_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.8F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.85F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(4.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_right_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(0.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 0.25F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.85F, AnimationHelper.createScalingVector(1.0F, 0.25F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.9F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(4.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_right_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.8F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.85F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
                new Keyframe(0.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(4.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -8.91F), Interpolations.CUBIC),
                new Keyframe(0.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -10.0F), Interpolations.CUBIC),
                new Keyframe(1.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Interpolations.CUBIC),
                new Keyframe(2.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -10.0F), Interpolations.CUBIC),
                new Keyframe(3.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Interpolations.CUBIC),
                new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -8.91F), Interpolations.CUBIC)
            }))
            .build();

        WALK = Builder.create(0.8F).looping()
            .addBoneAnimation("right_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.4F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.8F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("left_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.4F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.8F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(-12.0F, 0.0F, 6.0F), Interpolations.CUBIC),
                new Keyframe(0.4F, AnimationHelper.createRotationalVector(12.0F, 0.0F, 6.0F), Interpolations.CUBIC),
                new Keyframe(0.8F, AnimationHelper.createRotationalVector(-12.0F, 0.0F, 6.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(12.0F, 0.0F, -6.0F), Interpolations.CUBIC),
                new Keyframe(0.4F, AnimationHelper.createRotationalVector(-12.0F, 0.0F, -6.0F), Interpolations.CUBIC),
                new Keyframe(0.8F, AnimationHelper.createRotationalVector(12.0F, 0.0F, -6.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("h_left_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(0.8F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_right_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(0.8F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_left_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_right_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }))
            .build();

        CHASE = Builder.create(0.55F).looping()
            .addBoneAnimation("right_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(34.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.275F, AnimationHelper.createRotationalVector(-34.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.55F, AnimationHelper.createRotationalVector(34.0F, 0.0F, 0.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("left_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(-34.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.275F, AnimationHelper.createRotationalVector(34.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.55F, AnimationHelper.createRotationalVector(-34.0F, 0.0F, 0.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(-38.0F, 0.0F, 6.0F), Interpolations.CUBIC),
                new Keyframe(0.275F, AnimationHelper.createRotationalVector(34.0F, 0.0F, 6.0F), Interpolations.CUBIC),
                new Keyframe(0.55F, AnimationHelper.createRotationalVector(-38.0F, 0.0F, 6.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(34.0F, 0.0F, -6.0F), Interpolations.CUBIC),
                new Keyframe(0.275F, AnimationHelper.createRotationalVector(-38.0F, 0.0F, -6.0F), Interpolations.CUBIC),
                new Keyframe(0.55F, AnimationHelper.createRotationalVector(34.0F, 0.0F, -6.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("torso", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(11.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.55F, AnimationHelper.createRotationalVector(11.0F, 0.0F, 0.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("body", new Transformation(Targets.TRANSLATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.275F, AnimationHelper.createTranslationalVector(0.0F, 0.9F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("h_left_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_right_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_left_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_right_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }))
            .build();

        RIGHT_ATTACK = Builder.create(1.2F)
            .addBoneAnimation("right_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("left_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_left_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_right_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_left_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_right_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 6.0F), Interpolations.CUBIC),
                new Keyframe(0.35F, AnimationHelper.createRotationalVector(68.0F, -18.0F, 34.0F), Interpolations.CUBIC),
                new Keyframe(0.55F, AnimationHelper.createRotationalVector(-100.0F, -20.0F, 66.0F), Interpolations.CUBIC),
                new Keyframe(0.8F, AnimationHelper.createRotationalVector(-34.0F, -10.0F, 14.0F), Interpolations.CUBIC),
                new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 6.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("torso", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.35F, AnimationHelper.createRotationalVector(-8.0F, 14.0F, -7.0F), Interpolations.CUBIC),
                new Keyframe(0.6F, AnimationHelper.createRotationalVector(10.0F, -16.0F, 6.0F), Interpolations.CUBIC),
                new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
            }))
            .build();

        LEFT_ATTACK = Builder.create(1.2F)
            .addBoneAnimation("right_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("left_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_left_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_right_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_left_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("h_right_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
                new Keyframe(1.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }))
            .addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -6.0F), Interpolations.CUBIC),
                new Keyframe(0.35F, AnimationHelper.createRotationalVector(68.0F, 18.0F, -34.0F), Interpolations.CUBIC),
                new Keyframe(0.55F, AnimationHelper.createRotationalVector(-100.0F, 20.0F, -66.0F), Interpolations.CUBIC),
                new Keyframe(0.8F, AnimationHelper.createRotationalVector(-34.0F, 10.0F, -14.0F), Interpolations.CUBIC),
                new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -6.0F), Interpolations.CUBIC)
            }))
            .addBoneAnimation("torso", new Transformation(Targets.ROTATE, new Keyframe[]{
                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
                new Keyframe(0.35F, AnimationHelper.createRotationalVector(-8.0F, -14.0F, 7.0F), Interpolations.CUBIC),
                new Keyframe(0.6F, AnimationHelper.createRotationalVector(10.0F, 16.0F, -6.0F), Interpolations.CUBIC),
                new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
            }))
            .build();
    }
}
