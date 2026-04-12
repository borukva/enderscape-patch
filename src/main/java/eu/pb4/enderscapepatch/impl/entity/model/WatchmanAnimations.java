package eu.pb4.enderscapepatch.impl.entity.model;

import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.*;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.AnimationDefinition.Builder;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.Transformation.*;


/**
 * Made with Blockbench 5.1.3
 * Exported for Minecraft version 1.19 or later with Mojang mappings
 * @author Author
 */
public class WatchmanAnimations {
	public static final AnimationDefinition IDLE = Builder.create(4.0F).looping()
		.addBoneAnimation("torso", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.26F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(9.26F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(9.26F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-17.3161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(-17.3161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_elbow", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-47.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.15F, AnimationHelper.createRotationalVector(-47.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(74.15F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(64.5064F, -21.9386F, 5.123F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(69.61F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(79.0064F, -21.9386F, 5.123F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(82.66F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(74.15F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(64.5064F, -21.9386F, 5.123F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(69.61F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createRotationalVector(79.0064F, -21.9386F, 5.123F), Interpolations.CUBIC),
			new Keyframe(3.6F, AnimationHelper.createRotationalVector(82.66F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(74.15F, -21.94F, 5.12F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("ground_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 7.5F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 7.5F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 720.0F, 720.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.4162F, 1.2988F, -7.3873F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(2.4162F, 1.2988F, -7.3873F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_left_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.55F, AnimationHelper.createScalingVector(1.0F, 0.25F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.85F, AnimationHelper.createScalingVector(1.0F, 0.25F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_left_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.8F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.85F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.55F, AnimationHelper.createScalingVector(1.0F, 0.25F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.85F, AnimationHelper.createScalingVector(1.0F, 0.25F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.8F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.85F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_flash", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(720.0F, 0.0F, 720.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.build();

	public static final AnimationDefinition WALK = Builder.create(2.0F).looping()
		.addBoneAnimation("body", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.5F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("torso", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.25F, 0.22F, -1.98F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(9.25F, -0.23F, 1.41F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(9.2513F, -0.4022F, 2.4675F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(9.25F, -0.18F, 1.58F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(9.25F, 0.12F, -0.79F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(9.25F, 0.35F, -2.17F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(9.2513F, 0.4022F, -2.4675F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(9.25F, 0.22F, -1.98F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_right_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_right_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-15.2161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(-15.2161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_elbow", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-52.02F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-45.69F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.55F, AnimationHelper.createRotationalVector(-45.69F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-52.02F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(70.4F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(61.65F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(79.15F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createRotationalVector(61.65F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(79.15F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(70.4F, -21.94F, 5.12F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 360.0F, 360.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(6.7F, 0.87F, -5.92F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(5.4162F, 1.2988F, -8.3873F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(7.9907F, 0.434F, -3.4621F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(6.7F, 0.87F, -5.92F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.78F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.55F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(5.78F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.03F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(6.08F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(8.03F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.78F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.55F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(5.78F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.03F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(6.08F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(8.03F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.78F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.55F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(5.78F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.03F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(6.08F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(8.03F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_knee", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_knee", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("ground_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.5F, 6.67F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createTranslationalVector(0.0F, 1.5F, 5.75F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createTranslationalVector(0.0F, 1.5F, 6.02F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, 1.5F, 8.3F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(0.0F, 1.5F, 8.21F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, 1.5F, 5.75F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createTranslationalVector(0.0F, 1.5F, 6.02F), Interpolations.CUBIC),
			new Keyframe(1.55F, AnimationHelper.createTranslationalVector(0.0F, 1.5F, 8.3F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createTranslationalVector(0.0F, 1.5F, 8.21F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 1.5F, 6.67F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("capes", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.5F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_flash", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(360.0F, 0.0F, 360.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.build();

	public static final AnimationDefinition LANTERN_SMACK = Builder.create(2.5F)
		.addBoneAnimation("body_root", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, -5.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, -32.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(0.0F, 45.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("torso", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.26F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(10.1981F, 24.6523F, 4.2912F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(27.0134F, -23.5497F, -1.2702F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(9.26F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_left_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(24.2207F, 14.9865F, -96.7814F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(10.2929F, 17.0885F, -102.1589F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(-29.4491F, 16.6214F, -100.9639F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-80.4418F, 15.7748F, -98.798F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(-119.1793F, 14.9865F, -96.7814F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(-140.74F, 25.74F, -93.37F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(-119.6793F, 23.2865F, -76.5814F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(-58.49F, -0.51F, -39.48F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(-25.1161F, -14.0084F, -22.0018F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(1.0F, -2.0F, -1.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(1.0F, -2.0F, -1.0F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_elbow", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(15.17F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(39.42F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(23.02F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(-35.69F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(-47.73F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createRotationalVector(-47.88F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-45.29F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-53.57F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.05F, AnimationHelper.createRotationalVector(-60.7F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.35F, AnimationHelper.createRotationalVector(-54.79F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(74.15F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(-80.3492F, -65.1973F, 144.5446F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(104.2653F, -27.413F, -18.1452F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(104.27F, -27.41F, -18.15F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(-56.2501F, -2.6001F, 34.5698F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-69.7685F, -14.1798F, 18.8822F), Interpolations.CUBIC),
			new Keyframe(1.55F, AnimationHelper.createRotationalVector(-17.5153F, -8.5292F, 47.2792F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(-16.1788F, -10.3722F, 31.9261F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createRotationalVector(40.9875F, -17.0564F, 8.0324F), Interpolations.CUBIC),
			new Keyframe(2.3F, AnimationHelper.createRotationalVector(71.9479F, -23.1035F, 2.5203F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(74.15F, -21.94F, 5.12F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.4162F, 1.2988F, -7.3873F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(9.8511F, 1.7279F, -9.8511F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(8.2804F, 1.7816F, -10.159F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(9.8511F, 1.7279F, -9.8511F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(2.4162F, 1.2988F, -7.3873F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(12.4348F, -0.6486F, 4.9579F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(9.1541F, 1.9442F, -7.6079F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(9.1541F, 1.9442F, -7.6079F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(9.5771F, 0.9721F, -3.8039F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(9.7091F, -1.7033F, 9.8553F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(8.6187F, 0.4651F, -4.2342F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(8.6187F, 0.4651F, -4.2342F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lower_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(9.9627F, -0.8672F, 4.9244F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(9.5214F, 1.694F, -10.156F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(9.5608F, 1.4511F, -8.7105F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 2.0F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createTranslationalVector(0.0F, -0.2F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 2.0F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(9.7091F, -1.7033F, 9.8553F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(8.6187F, 0.4651F, -4.2342F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(8.5906F, 0.8392F, -6.7062F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createRotationalVector(6.2459F, 0.1434F, -0.9359F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(9.9627F, -0.8672F, 4.9244F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(4.5843F, 1.2848F, -7.7242F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(4.5843F, 1.2848F, -7.7242F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 2.0F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(14.7733F, -1.2802F, 7.3905F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(13.6307F, 0.0901F, -1.7625F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(13.6307F, 0.0901F, -1.7625F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_leg", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, -0.9F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createTranslationalVector(0.0F, 0.56F, -2.69F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -2.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_knee", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_leg", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 2.0F, -2.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -2.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -2.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_knee", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("ground_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(0.0F, -45.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(-0.9819F, -30.408F, -4.8816F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-1.5071F, 10.1448F, -8.7878F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(-1.6388F, 25.1392F, -9.2186F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(-1.0537F, 21.6354F, -6.0244F), Interpolations.CUBIC),
			new Keyframe(2.15F, AnimationHelper.createRotationalVector(-0.5004F, 15.5985F, -2.8569F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("ground_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 8.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(-4.0F, 2.0F, 8.5F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createTranslationalVector(2.0F, 2.1F, 7.13F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(7.0F, 2.0F, 9.25F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createTranslationalVector(5.5F, 1.5F, 9.25F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("capes", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, -10.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(0.0F, 37.97F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(0.0F, 37.97F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("capes", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(-0.5F, 0.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(1.27F, 0.0F, -0.8F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(1.27F, 0.0F, -0.8F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_elbow", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -10.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals1", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 67.5F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 55.61F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals1", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(1.0F, 31.0F, -28.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_flash", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal1", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(-3.0F, 31.19F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, 46.64F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(-1.0F, 51.3F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal2", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createTranslationalVector(-1.0F, 9.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(1.0F, 15.54F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(1.0F, 18.8F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle3", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal3", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(1.0F, 25.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 33.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.55F, AnimationHelper.createTranslationalVector(1.0F, 40.5F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.55F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle4", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal4", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createTranslationalVector(2.0F, 11.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(1.0F, 17.14F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(-1.0F, 20.2F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal4", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle5", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 180.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal5", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(0.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(1.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(3.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal5", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.75F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle6", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal6", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createTranslationalVector(1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(1.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal6", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle7", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal7", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(1.0F, 15.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(0.0F, 24.14F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 29.9F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createTranslationalVector(1.0F, 32.4F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal7", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.75F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle8", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal8", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(-1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(1.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal8", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.75F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.build();

	public static final AnimationDefinition SUMMON_WRAITHS = Builder.create(5.0F)
		.addBoneAnimation("body_root", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, -0.75F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createTranslationalVector(0.0F, -0.75F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createTranslationalVector(0.0F, -2.75F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.75F, AnimationHelper.createTranslationalVector(0.0F, -2.75F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-11.8657F, -34.1754F, 8.4918F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(12.9044F, 3.6326F, -0.8819F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(11.42F, -0.57F, 1.92F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-5.7632F, -24.3683F, 6.2454F), Interpolations.CUBIC),
			new Keyframe(2.15F, AnimationHelper.createRotationalVector(7.5F, 15.0F, -7.5F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(6.38F, 15.98F, -5.36F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-5.7632F, 5.6317F, -1.2546F), Interpolations.CUBIC),
			new Keyframe(3.15F, AnimationHelper.createRotationalVector(0.0F, 45.0F, -15.0F), Interpolations.CUBIC),
			new Keyframe(3.35F, AnimationHelper.createRotationalVector(0.57F, 51.4F, -21.32F), Interpolations.CUBIC),
			new Keyframe(3.55F, AnimationHelper.createRotationalVector(0.38F, 52.0F, -19.91F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 40.9F, -15.0F), Interpolations.CUBIC),
			new Keyframe(4.5F, AnimationHelper.createRotationalVector(-0.02F, 10.26F, -3.99F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("torso", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.26F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-11.9164F, 20.7727F, 3.9594F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(11.613F, 36.9292F, 7.0389F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(9.26F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(9.3503F, 3.5657F, 0.5789F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(10.0081F, 22.1911F, 3.8133F), Interpolations.CUBIC),
			new Keyframe(2.15F, AnimationHelper.createRotationalVector(16.7254F, -0.8036F, 4.9352F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(16.8923F, -7.984F, 2.7614F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(16.89F, -7.98F, 2.76F), Interpolations.CUBIC),
			new Keyframe(3.15F, AnimationHelper.createRotationalVector(22.6242F, -22.9672F, 6.2875F), Interpolations.CUBIC),
			new Keyframe(3.35F, AnimationHelper.createRotationalVector(19.407F, -32.7268F, 14.8752F), Interpolations.CUBIC),
			new Keyframe(3.55F, AnimationHelper.createRotationalVector(19.41F, -35.23F, 14.88F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(9.8138F, -33.1599F, 11.553F), Interpolations.CUBIC),
			new Keyframe(4.5F, AnimationHelper.createRotationalVector(8.94F, -14.04F, 1.82F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(9.26F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_left_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-167.0889F, -73.6102F, 47.3743F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(-99.1396F, -7.251F, -44.5125F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-167.0889F, -73.6102F, 47.3743F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(-99.1396F, -7.251F, -44.5125F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-167.0889F, -73.6102F, 47.3743F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(-99.1396F, -7.251F, -44.5125F), Interpolations.CUBIC),
			new Keyframe(4.5F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_elbow", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(-83.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(-93.97F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-72.96F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createRotationalVector(21.81F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(21.81F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.05F, AnimationHelper.createRotationalVector(-83.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createRotationalVector(-93.97F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.15F, AnimationHelper.createRotationalVector(-72.96F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.3F, AnimationHelper.createRotationalVector(21.81F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.65F, AnimationHelper.createRotationalVector(21.81F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-83.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.1F, AnimationHelper.createRotationalVector(-93.97F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.15F, AnimationHelper.createRotationalVector(-72.96F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.3F, AnimationHelper.createRotationalVector(21.81F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.65F, AnimationHelper.createRotationalVector(21.81F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-1.92F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.5F, AnimationHelper.createRotationalVector(-40.58F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(74.15F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(126.4967F, -10.0628F, 14.673F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(126.5F, -10.06F, 14.67F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(-6.7447F, -8.2554F, 34.8492F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(-68.4303F, 17.4543F, 44.726F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createRotationalVector(99.0697F, 17.4543F, 44.726F), Interpolations.CUBIC),
			new Keyframe(2.05F, AnimationHelper.createRotationalVector(99.9469F, -29.4696F, 37.0583F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createRotationalVector(-20.0531F, -29.4696F, 37.0583F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(-68.4303F, 17.4543F, 44.726F), Interpolations.CUBIC),
			new Keyframe(2.3F, AnimationHelper.createRotationalVector(99.0697F, 17.4543F, 44.726F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(102.0234F, -15.0308F, 23.3472F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(99.64F, -17.29F, 20.62F), Interpolations.CUBIC),
			new Keyframe(3.1F, AnimationHelper.createRotationalVector(3.4401F, -19.3346F, 38.7053F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(-64.1878F, -19.4619F, 38.114F), Interpolations.CUBIC),
			new Keyframe(3.3F, AnimationHelper.createRotationalVector(58.8093F, 17.9447F, 36.1374F), Interpolations.CUBIC),
			new Keyframe(3.45F, AnimationHelper.createRotationalVector(98.59F, 15.25F, 37.58F), Interpolations.CUBIC),
			new Keyframe(3.7F, AnimationHelper.createRotationalVector(92.1274F, -0.4941F, 36.7171F), Interpolations.CUBIC),
			new Keyframe(4.1F, AnimationHelper.createRotationalVector(63.6521F, -27.8487F, 38.0867F), Interpolations.CUBIC),
			new Keyframe(4.35F, AnimationHelper.createRotationalVector(59.7F, 8.21F, 20.76F), Interpolations.CUBIC),
			new Keyframe(4.55F, AnimationHelper.createRotationalVector(80.5158F, 13.4835F, 7.1652F), Interpolations.CUBIC),
			new Keyframe(4.8F, AnimationHelper.createRotationalVector(77.41F, -13.21F, 4.3F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(74.15F, -21.94F, 5.12F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.4162F, 1.2988F, -7.3873F), Interpolations.LINEAR),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-0.6971F, 3.3508F, -3.081F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(-10.07F, 7.1F, 0.6F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-32.08F, 12.82F, 5.11F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(-54.31F, 18.86F, 6.69F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-85.2F, 27.03F, 9.12F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-105.7446F, 30.226F, 10.9497F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(-105.7446F, 30.226F, 10.9497F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(-50.7446F, 30.226F, 10.9497F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(-28.4312F, 18.5857F, 21.7199F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-48.4312F, 18.5857F, 21.7199F), Interpolations.CUBIC),
			new Keyframe(2.15F, AnimationHelper.createRotationalVector(-20.9312F, 18.5857F, 21.7199F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-14.2723F, 20.3053F, 26.6994F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-89.2723F, 20.3053F, 26.6994F), Interpolations.CUBIC),
			new Keyframe(3.15F, AnimationHelper.createRotationalVector(-9.2723F, 20.3053F, 26.6994F), Interpolations.CUBIC),
			new Keyframe(3.45F, AnimationHelper.createRotationalVector(-1.7723F, 20.3053F, 26.6994F), Interpolations.CUBIC),
			new Keyframe(3.95F, AnimationHelper.createRotationalVector(0.19F, 14.88F, 17.5F), Interpolations.CUBIC),
			new Keyframe(4.55F, AnimationHelper.createRotationalVector(1.61F, 4.3F, -2.16F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(2.4162F, 1.2988F, -7.3873F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, -0.19F, -0.19F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -0.735F, -0.61F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, -1.0F), Interpolations.CUBIC),
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, -1.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_elbow", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(-105.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(-70.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-74.96F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-87.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.15F, AnimationHelper.createRotationalVector(-62.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-62.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createRotationalVector(-37.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.4F, AnimationHelper.createRotationalVector(-22.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.6F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(4.7955F, 6.5625F, -11.7641F), Interpolations.CUBIC),
			new Keyframe(2.05F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(7.2955F, 6.5625F, -11.7641F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(7.2955F, 6.5625F, -11.7641F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), Interpolations.CUBIC),
			new Keyframe(2.05F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, -1.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(4.9811F, -0.4352F, 4.9811F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(6.1646F, 13.2778F, -8.9421F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createRotationalVector(4.9811F, -0.4352F, 4.9811F), Interpolations.CUBIC),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(6.1646F, 13.2778F, -8.9421F), Interpolations.CUBIC),
			new Keyframe(3.1F, AnimationHelper.createRotationalVector(4.9811F, -0.4352F, 4.9811F), Interpolations.CUBIC),
			new Keyframe(3.6F, AnimationHelper.createRotationalVector(6.1646F, 13.2778F, -8.9421F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lower_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.6F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.1F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.6F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(7.5F, 20.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(9.9244F, 20.8672F, -7.4627F), Interpolations.CUBIC),
			new Keyframe(2.05F, AnimationHelper.createRotationalVector(17.5F, 20.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(8.974F, 21.2777F, -7.6055F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(12.6267F, 24.4774F, 7.6919F), Interpolations.CUBIC),
			new Keyframe(3.15F, AnimationHelper.createRotationalVector(29.4819F, 56.6157F, 26.8666F), Interpolations.CUBIC),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(39.8864F, 59.1473F, 24.4768F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(20.5971F, 37.8743F, 3.5703F), Interpolations.CUBIC),
			new Keyframe(4.5F, AnimationHelper.createRotationalVector(10.3F, 8.92F, -1.21F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(12.4539F, -1.0809F, 4.8821F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(4.4302F, 2.6411F, -12.4162F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createRotationalVector(-5.0461F, -1.0809F, 4.8821F), Interpolations.CUBIC),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(17.1457F, 0.7559F, -5.1535F), Interpolations.CUBIC),
			new Keyframe(3.1F, AnimationHelper.createRotationalVector(2.4539F, -1.0809F, 4.8821F), Interpolations.CUBIC),
			new Keyframe(3.6F, AnimationHelper.createRotationalVector(4.4302F, 2.6411F, -12.4162F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-2.5756F, 0.8672F, -9.9627F), Interpolations.CUBIC),
			new Keyframe(2.05F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-2.5756F, 0.8672F, -9.9627F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(7.4964F, -0.1736F, 0.4839F), Interpolations.CUBIC),
			new Keyframe(3.5F, AnimationHelper.createRotationalVector(2.3843F, 0.9721F, -12.4608F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), Interpolations.CUBIC),
			new Keyframe(2.05F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, -1.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(12.4539F, -1.0809F, 4.8821F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(14.4302F, 2.6411F, -12.4162F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createRotationalVector(12.4539F, -1.0809F, 4.8821F), Interpolations.CUBIC),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(19.4302F, 2.6411F, -12.4162F), Interpolations.CUBIC),
			new Keyframe(3.1F, AnimationHelper.createRotationalVector(12.4539F, -1.0809F, 7.3821F), Interpolations.CUBIC),
			new Keyframe(3.6F, AnimationHelper.createRotationalVector(9.4302F, 2.6411F, -12.4162F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-6.8F, 0.0F, 6.7F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 7.5F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 7.5F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 7.5F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 7.5F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 7.5F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 7.5F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 7.5F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 7.5F), Interpolations.CUBIC),
			new Keyframe(3.75F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 7.5F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_leg", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_knee", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.8F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(37.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.75F, AnimationHelper.createRotationalVector(37.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(3.2F, 0.0F, -6.7F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.5F, 0.0F, -7.5F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, -7.5F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(2.5F, 0.0F, -7.5F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(2.5F, 0.0F, -7.5F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, -7.5F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(2.5F, 0.0F, -7.5F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(2.5F, 0.0F, -7.5F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, -7.5F), Interpolations.CUBIC),
			new Keyframe(3.75F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, -7.5F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_leg", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_knee", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.9F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.75F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("ground_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, -18.61F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(0.0F, 50.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(0.0F, -18.61F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.65F, AnimationHelper.createRotationalVector(0.0F, 50.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, -28.61F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.65F, AnimationHelper.createRotationalVector(0.0F, 50.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.1F, AnimationHelper.createRotationalVector(0.0F, 41.01F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.6F, AnimationHelper.createRotationalVector(0.0F, 10.27F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("ground_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(-2.0F, 2.0F, 7.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(11.06F, 2.0F, 3.94F), Interpolations.CUBIC),
			new Keyframe(2.05F, AnimationHelper.createTranslationalVector(-2.0F, 2.0F, 7.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(10.06F, 2.0F, 4.94F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createTranslationalVector(-2.0F, 2.0F, 7.0F), Interpolations.CUBIC),
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(9.06F, 3.0F, 4.94F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("capes", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, -35.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, -4.67F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, -35.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(0.0F, 10.33F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(0.0F, -5.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createRotationalVector(0.0F, 35.33F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("capes", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(-2.0F, 0.0F, 2.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(-0.98F, 0.0F, -1.02F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 2.0F), Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(-1.48F, 0.0F, -0.77F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(-1.0F, 0.0F, 2.0F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createTranslationalVector(-0.98F, -2.0F, 0.98F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm_rot", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(0.0F, -105.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(0.0F, -105.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.15F, AnimationHelper.createRotationalVector(0.0F, -105.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createRotationalVector(0.0F, -105.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createRotationalVector(-15.0F, -25.0F, 20.0F), Interpolations.CUBIC),
			new Keyframe(3.15F, AnimationHelper.createRotationalVector(-15.0F, -130.0F, 20.0F), Interpolations.CUBIC),
			new Keyframe(3.4F, AnimationHelper.createRotationalVector(-15.0F, -138.5F, 20.0F), Interpolations.CUBIC),
			new Keyframe(3.6F, AnimationHelper.createRotationalVector(-15.0F, -119.08F, 20.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, -50.2F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.5F, AnimationHelper.createRotationalVector(0.0F, -13.7F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals1", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 44.2F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 37.5F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 25.61F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals1", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(16.0F, 40.0F, -32.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal1", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createTranslationalVector(-3.0F, 31.19F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createTranslationalVector(0.0F, 46.64F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createTranslationalVector(-1.0F, 51.3F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(1.05F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal2", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, -48.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createTranslationalVector(-1.0F, 9.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createTranslationalVector(1.0F, 15.54F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createTranslationalVector(1.0F, 18.8F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle3", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal3", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(1.0F, 25.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, 33.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(1.0F, 40.5F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(1.05F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle4", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal4", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createTranslationalVector(2.0F, 11.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createTranslationalVector(1.0F, 17.14F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createTranslationalVector(-1.0F, 20.2F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal4", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle5", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 180.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal5", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, -48.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(1.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.7F, AnimationHelper.createTranslationalVector(3.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal5", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle6", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal6", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createTranslationalVector(1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createTranslationalVector(1.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal6", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle7", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal7", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -32.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(1.0F, 15.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 24.14F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, 29.9F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createTranslationalVector(1.0F, 32.4F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal7", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle8", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal8", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, -48.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(-1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(1.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.7F, AnimationHelper.createTranslationalVector(0.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal8", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_flash", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(16.0F, 40.0F, -32.0F), Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(16.0F, 40.0F, -32.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 40.0F, -32.0F), Interpolations.LINEAR),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 40.0F, -32.0F), Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(-16.0F, 40.0F, -32.0F), Interpolations.LINEAR),
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(-16.0F, 40.0F, -32.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_flash", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_flash1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(3.0F, 1.0F, 3.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.3F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.15F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.2F, AnimationHelper.createScalingVector(3.0F, 1.0F, 3.0F), Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createScalingVector(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.3F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.15F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createScalingVector(3.0F, 1.0F, 3.0F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createScalingVector(0.0F, 5.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_flash2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(3.0F, 1.0F, 3.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.3F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.15F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.2F, AnimationHelper.createScalingVector(3.0F, 1.0F, 3.0F), Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createScalingVector(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.3F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.15F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createScalingVector(3.0F, 1.0F, 3.0F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createScalingVector(0.0F, 5.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Interpolations.CUBIC),
			new Keyframe(1.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 44.2F), Interpolations.CUBIC),
			new Keyframe(1.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 37.5F), Interpolations.CUBIC),
			new Keyframe(2.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 25.61F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals2", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 40.0F, -32.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal9", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createTranslationalVector(-3.0F, 31.19F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.6F, AnimationHelper.createTranslationalVector(0.0F, 46.64F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.8F, AnimationHelper.createTranslationalVector(-1.0F, 51.3F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal9", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(2.05F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.8F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle10", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal10", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, -48.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.3F, AnimationHelper.createTranslationalVector(-1.0F, 9.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.45F, AnimationHelper.createTranslationalVector(1.0F, 15.54F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.65F, AnimationHelper.createTranslationalVector(1.0F, 18.8F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal10", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(2.15F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle11", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal11", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.35F, AnimationHelper.createTranslationalVector(1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(1.0F, 25.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.7F, AnimationHelper.createTranslationalVector(0.0F, 33.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(1.0F, 40.5F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal11", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(2.05F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle12", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal12", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.3F, AnimationHelper.createTranslationalVector(2.0F, 11.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.45F, AnimationHelper.createTranslationalVector(1.0F, 17.14F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.65F, AnimationHelper.createTranslationalVector(-1.0F, 20.2F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal12", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.95F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.15F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle13", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 180.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal13", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, -48.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.35F, AnimationHelper.createTranslationalVector(0.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(1.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.7F, AnimationHelper.createTranslationalVector(3.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal13", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle14", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal14", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(1.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.3F, AnimationHelper.createTranslationalVector(1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.45F, AnimationHelper.createTranslationalVector(0.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.65F, AnimationHelper.createTranslationalVector(1.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal14", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.95F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.15F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle15", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal15", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, -32.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.35F, AnimationHelper.createTranslationalVector(1.0F, 15.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 24.14F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.7F, AnimationHelper.createTranslationalVector(0.0F, 29.9F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.9F, AnimationHelper.createTranslationalVector(1.0F, 32.4F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal15", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.85F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.9F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle16", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal16", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, -48.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.35F, AnimationHelper.createTranslationalVector(-1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(1.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.7F, AnimationHelper.createTranslationalVector(0.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal16", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(2.2F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals3", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Interpolations.CUBIC),
			new Keyframe(2.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 44.2F), Interpolations.CUBIC),
			new Keyframe(2.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 37.5F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 25.61F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals3", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(-16.0F, 40.0F, -32.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal17", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(2.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.4F, AnimationHelper.createTranslationalVector(-3.0F, 31.19F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.6F, AnimationHelper.createTranslationalVector(0.0F, 46.64F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.8F, AnimationHelper.createTranslationalVector(-1.0F, 51.3F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal17", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(3.05F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(3.8F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle18", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal18", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, -48.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.3F, AnimationHelper.createTranslationalVector(-1.0F, 9.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.45F, AnimationHelper.createTranslationalVector(1.0F, 15.54F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.65F, AnimationHelper.createTranslationalVector(1.0F, 18.8F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal18", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.8F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(3.15F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(3.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle19", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal19", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(2.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.35F, AnimationHelper.createTranslationalVector(1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(1.0F, 25.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.7F, AnimationHelper.createTranslationalVector(0.0F, 33.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createTranslationalVector(1.0F, 40.5F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal19", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.0F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(3.05F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle20", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal20", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(2.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.3F, AnimationHelper.createTranslationalVector(2.0F, 11.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.45F, AnimationHelper.createTranslationalVector(1.0F, 17.14F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.65F, AnimationHelper.createTranslationalVector(-1.0F, 20.2F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal20", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.95F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.15F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(3.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle21", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 180.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal21", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, -48.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.35F, AnimationHelper.createTranslationalVector(0.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(1.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.7F, AnimationHelper.createTranslationalVector(3.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal21", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.6F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(3.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle22", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal22", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(2.65F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.3F, AnimationHelper.createTranslationalVector(1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.45F, AnimationHelper.createTranslationalVector(0.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.65F, AnimationHelper.createTranslationalVector(1.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal22", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.95F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.LINEAR),
			new Keyframe(3.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.15F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(3.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(3.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle23", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal23", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, -32.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.35F, AnimationHelper.createTranslationalVector(1.0F, 15.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(0.0F, 24.14F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.7F, AnimationHelper.createTranslationalVector(0.0F, 29.9F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.9F, AnimationHelper.createTranslationalVector(1.0F, 32.4F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal23", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.85F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(3.9F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle24", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal24", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, -48.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.35F, AnimationHelper.createTranslationalVector(-1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.5F, AnimationHelper.createTranslationalVector(1.0F, 27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.7F, AnimationHelper.createTranslationalVector(0.0F, 32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal24", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createScalingVector(0.5F, 0.5F, 0.5F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(3.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR),
			new Keyframe(5.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.build();

	public static final AnimationDefinition LANTERN_PUSH = Builder.create(2.0F)
		.addBoneAnimation("body_root", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(-9.2334F, 34.7444F, -3.0313F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(11.7336F, 49.3252F, 10.0767F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(11.7336F, 49.3252F, 10.0767F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(1.65F, 10.38F, 2.05F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("torso", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.26F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(11.8884F, -32.4669F, -2.9436F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(5.479F, -50.4075F, 0.5944F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(5.479F, -50.4075F, 0.5944F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(8.19F, -8.27F, 0.22F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(9.26F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_left_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm_rot", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(20.8542F, -5.9991F, 4.5404F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(11.8194F, -16.4758F, 4.1087F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(-31.7268F, -39.8581F, 1.9481F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-31.7268F, -39.8581F, 1.9481F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-14.53F, -17.76F, 0.77F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-2.9F, -2.9F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm_rot", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -1.0F, -1.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, -1.75F, -0.5F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, -1.75F, -0.5F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, -1.75F, -0.5F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_elbow", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-123.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-85.07F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(-23.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-33.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(-48.88F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_elbow", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -2.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(74.15F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(77.7758F, 4.6233F, -2.1488F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(96.3847F, 16.3995F, 6.8286F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(136.5561F, -18.1782F, 2.6737F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(164.0561F, -18.1782F, 2.6737F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(-17.7173F, -13.7474F, 0.2372F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(-84.3845F, -8.0054F, -1.3547F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-53.4552F, -8.9291F, -1.0483F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(51.7447F, -9.2824F, -7.2021F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(108.5728F, -18.5122F, 3.522F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(78.9327F, -18.4272F, 2.1565F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(75.5787F, -10.1937F, 0.6436F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(74.15F, -21.94F, 5.12F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.4162F, 1.2988F, -7.3873F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-20.9292F, 8.7784F, 11.2476F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(-11.1546F, 13.0267F, 23.2234F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(-11.1546F, 13.0267F, 23.2234F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-0.43F, 4.19F, -1.15F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(2.4162F, 1.2988F, -7.3873F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_elbow", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-57.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(-34.24F, 1.33F, 4.79F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(-22.9886F, 2.0135F, 7.2261F), Interpolations.CUBIC),
			new Keyframe(1.85F, AnimationHelper.createRotationalVector(-5.56F, 0.93F, 3.35F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_leg", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_knee", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_leg", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_knee", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("capes", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 22.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, 40.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(0.0F, 40.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("capes", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.5F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(2.0F, 0.0F, 0.5F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(2.0F, 0.0F, 0.5F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(4.9954F, 0.4346F, -2.4668F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(4.9002F, 1.0552F, -9.7852F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(4.9002F, 1.0552F, -9.7852F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(14.8821F, -1.0809F, 12.4539F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(4.9574F, 0.6518F, -7.4718F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(4.9574F, 0.6518F, -7.4718F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lower_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, 0.75F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createTranslationalVector(0.0F, 0.75F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createTranslationalVector(0.0F, 0.75F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(5.3521F, 14.1835F, 0.4989F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(6.9064F, 37.2273F, 3.2534F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(9.2814F, 35.3398F, -3.0402F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(9.2814F, 35.3398F, -3.0402F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(4.8656F, -0.9285F, 10.7937F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(4.6999F, -1.7082F, 19.9299F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(4.8821F, 1.0809F, -12.4539F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(4.8821F, 1.0809F, -12.4539F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(7.0596F, -17.2352F, -4.7331F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(9.67F, -14.7104F, -14.7034F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(9.67F, -14.7104F, -14.7034F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(17.3593F, -2.2494F, 7.1566F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(-2.4718F, -0.6518F, -4.9574F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(-2.4718F, -0.6518F, -4.9574F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("ground_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(0.0F, -45.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(-2.0306F, 27.9923F, 2.3253F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(0.0F, 29.46F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("ground_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(-1.5F, 1.0F, 4.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(-1.0F, 2.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(8.12F, 2.0F, 5.05F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(10.1F, 2.0F, 3.06F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(5.62F, 2.0F, 4.3F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.59F, 1.5F, 4.92F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals1", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -15.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.36F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 17.41F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 25.63F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals1", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.2F, AnimationHelper.createTranslationalVector(0.0F, 28.0F, -14.6F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createTranslationalVector(0.0F, 28.0F, -15.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createTranslationalVector(0.0F, 28.0F, -17.54F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 28.0F, -24.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(0.0F, 28.0F, -34.95F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 28.0F, -43.32F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(0.0F, 28.0F, -47.64F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createTranslationalVector(0.0F, 28.0F, -50.64F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 28.0F, -52.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle1", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -12.39F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -18.6F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -20.9F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal1", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createTranslationalVector(0.0F, -2.03F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(0.0F, 27.61F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createTranslationalVector(0.0F, 43.36F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createTranslationalVector(0.0F, 48.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.6F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal2", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 24.81F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 43.76F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 49.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle3", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle3", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -10.39F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -14.6F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -15.9F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal3", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -32.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createTranslationalVector(0.0F, -2.2F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(0.0F, 21.31F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createTranslationalVector(0.0F, 32.96F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createTranslationalVector(0.0F, 35.5F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.6F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle4", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle4", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -17.79F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -27.7F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -32.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal4", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 6.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 24.9F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 36.27F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 38.81F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal4", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle5", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 180.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal5", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 20.11F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 29.96F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 32.4F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal5", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle6", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle6", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -17.79F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -27.7F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -32.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal6", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -28.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createTranslationalVector(0.0F, -2.22F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createTranslationalVector(0.0F, 27.61F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createTranslationalVector(0.0F, 43.36F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createTranslationalVector(0.0F, 48.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal6", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.6F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle7", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal7", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 21.31F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 34.06F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 38.7F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal7", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle8", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle8", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -17.79F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -27.7F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -32.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal8", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -24.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 20.61F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, 33.06F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 38.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal8", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(0.25F, 0.25F, 0.25F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_flash", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 62.02F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 101.95F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 124.77F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 135.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 13.8F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -24.75F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -39.21F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -45.26F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -48.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createScalingVector(3.0F, 3.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.649F, AnimationHelper.createScalingVector(3.0F, 3.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave_pos", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 32.0F, -24.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave_pos2", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 32.0F, -24.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 62.02F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 101.95F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 124.77F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 135.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave2", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 13.8F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -31.66F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -49.94F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -58.29F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -59.93F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.9F, AnimationHelper.createScalingVector(5.0F, 5.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.949F, AnimationHelper.createScalingVector(5.0F, 5.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.95F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave_pos3", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 32.0F, -24.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave3", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 62.02F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 101.95F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 124.77F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 135.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave3", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 13.8F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -16.75F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -27.21F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -32.26F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, -34.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createScalingVector(2.0F, 2.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.399F, AnimationHelper.createScalingVector(2.0F, 2.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.4F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.build();

	public static final AnimationDefinition DEATH = Builder.create(8.0F)
		.addBoneAnimation("end_crystals1", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals1", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(26.0F, 0.0F, -67.6F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_rot1", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle1", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal1", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(-3.0F, 31.19F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, 46.64F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createTranslationalVector(-1.0F, 51.3F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_rot2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-42.5F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal2", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(-1.0F, 9.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(1.0F, 15.54F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(1.0F, 18.8F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.699F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle3", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle3", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal3", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createTranslationalVector(1.0F, 17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(1.0F, 25.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(0.0F, 33.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(1.0F, 40.5F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_rot4", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(15.0F, 0.0F, -12.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle4", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle4", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal4", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(2.0F, -11.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(1.0F, -17.14F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(-1.0F, -20.2F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal4", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.699F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_rot5", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(40.0F, 0.0F, -10.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle5", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 180.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal5", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createTranslationalVector(0.0F, -17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(1.0F, -27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createTranslationalVector(3.0F, -32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal5", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_angle6", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -135.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle6", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal6", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(1.0F, -17.29F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, -27.84F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createTranslationalVector(1.0F, -32.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal6", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.699F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_rot7", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle7", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -90.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal7", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_rot8", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle8", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_angle8", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal8", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(1.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals2", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(26.0F, 0.0F, -67.6F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystals2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_rot9", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(34.292F, 16.2701F, -53.3085F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal9", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(-3.0F, 31.19F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, 46.64F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createTranslationalVector(-1.0F, 51.3F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal9", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_rot10", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(-40.7307F, -13.3598F, -27.5213F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal10", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(-3.0F, 31.19F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, 46.64F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createTranslationalVector(-1.0F, 51.3F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal10", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_rot11", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(50.0F, 0.0F, 45.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal11", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(-3.0F, 31.19F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, 46.64F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createTranslationalVector(-1.0F, 51.3F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal11", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_rot12", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(-40.1017F, -2.9087F, 56.9315F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal12", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(-3.0F, 31.19F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createTranslationalVector(0.0F, 46.64F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createTranslationalVector(-1.0F, 51.3F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal12", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal13", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal14", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal15", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal16", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystals3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_flash", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(27.0F, 8.0F, -68.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_flash", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(2.0F, 2.0F, 2.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_flash1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(4.0F, 0.0F, 4.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(3.0F, 1.0F, 3.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.85F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_flash2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(4.0F, 0.0F, 4.0F), Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(3.0F, 1.0F, 3.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.85F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave_pos", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 32.0F, -24.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 13.8F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave_pos2", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 32.0F, -24.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave2", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 13.8F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave_pos3", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 32.0F, -24.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("shockwave3", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave3", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 13.8F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("shockwave3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body_root", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.1F, AnimationHelper.createTranslationalVector(0.0F, -1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(6.2F, AnimationHelper.createTranslationalVector(0.0F, -7.09F, 0.0F), Interpolations.CUBIC),
			new Keyframe(7.0F, AnimationHelper.createTranslationalVector(0.0F, -18.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(7.45F, AnimationHelper.createTranslationalVector(0.0F, -21.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, -1.47F, -10.6F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createTranslationalVector(0.0F, -8.19F, -21.01F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, -13.53F, -25.42F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createTranslationalVector(0.0F, -18.83F, -29.4F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, -26.25F, -32.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, -26.0F, -33.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-37.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-42.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("torso", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(9.26F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(-18.24F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(-38.24F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-38.24F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-3.24F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(-3.24F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eyelid", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_left_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye_glare", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-19.8161F, -14.9084F, -20.3018F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm_rot", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(-104.2853F, -31.5916F, 38.3298F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-159.89F, -31.59F, 46.33F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-184.8698F, -22.9147F, 61.9334F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-144.8698F, -22.9147F, 61.9334F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(-144.8698F, -22.9147F, 61.9334F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm_rot", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_elbow", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-53.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-68.19F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(-15.69F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(-15.69F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_elbow", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(74.15F, -21.94F, 5.12F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(125.8722F, -1.9843F, 20.6047F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(61.07F, -0.74F, 21.57F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-16.6278F, -1.9843F, 20.6047F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-68.03F, -1.98F, 20.61F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-115.4278F, -1.9843F, 20.6047F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(-104.73F, -1.98F, 20.6F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(-14.13F, -1.98F, 20.6F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lantern", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(0.699F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.4162F, 1.2988F, -7.3873F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(-57.5799F, 20.4814F, -6.3754F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-150.7786F, 32.8642F, 3.1333F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(-206.7334F, 19.8809F, -51.4064F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-171.7334F, 19.8809F, -51.4064F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(-171.7334F, 19.8809F, -51.4064F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_elbow", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(-50.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-50.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(-3.1F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(-1.4F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(-3.1F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(-37.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_leg", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_knee", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(65.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createRotationalVector(45.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_leg", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_leg", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_knee", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("capes", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(90.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("capes", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, -1.47F, -10.6F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createTranslationalVector(0.0F, -8.19F, -24.01F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, -13.53F, -31.82F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createTranslationalVector(0.0F, -18.93F, -36.4F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, -27.85F, -42.2F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, -34.94F, -45.35F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, -35.25F, -47.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(54.42F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(52.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(65.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-6.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("lower_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(57.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(67.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-7.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(57.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(55.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(67.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_lower_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-40.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-7.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("ground_cape", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-27.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-125.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(-75.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.5F, AnimationHelper.createRotationalVector(-99.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.75F, AnimationHelper.createRotationalVector(-110.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("ground_cape", new Transformation(Targets.MOVE_ORIGIN, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 5.0F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createTranslationalVector(0.0F, 5.0F, 14.0F), Interpolations.CUBIC),
			new Keyframe(0.3F, AnimationHelper.createTranslationalVector(0.0F, 10.0F, 24.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, 15.0F, 30.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 23.0F, 34.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 24.0F, 34.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(0.0F, 20.22F, 31.98F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 13.3F, 26.63F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 5.23F, 17.57F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.85F, 9.46F), Interpolations.CUBIC),
			new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.27F, 3.95F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, 3.13F), Interpolations.CUBIC),
			new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 3.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("end_crystal_lantern2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.75F, 0.75F, 0.75F), Interpolations.LINEAR)
		}))
		.build();
}