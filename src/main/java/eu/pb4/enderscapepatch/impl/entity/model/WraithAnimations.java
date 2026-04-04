package eu.pb4.enderscapepatch.impl.entity.model;

import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.*;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.AnimationDefinition.Builder;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.Transformation.*;

public class WraithAnimations {
	    public static final AnimationDefinition IDLE = Builder.create(4.0F).looping()
		.addBoneAnimation("body", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("upper_torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.05F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.3F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.35F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.05F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.3F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.35F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -30.0F), Interpolations.CUBIC),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -15.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(-45.4743F, -20.5777F, -38.033F), Interpolations.CUBIC),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(-48.9342F, -2.0901F, -20.7825F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(-7.0524F, -2.5587F, -7.3423F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-7.4929F, 0.3262F, 14.9786F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 50.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC),
			new Keyframe(5.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(32.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(28.2491F, -16.7796F, 28.2491F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.5F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(7.1566F, -2.2494F, 17.3593F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.5F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(-47.0109F, 25.0041F, 23.197F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-27.0109F, 25.0041F, 23.197F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(37.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.2F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Interpolations.CUBIC),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(-45.4743F, 20.5777F, 38.033F), Interpolations.CUBIC),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(-48.9342F, 2.0901F, 20.7825F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(-7.0524F, 2.5587F, 7.3423F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-7.4929F, -0.3262F, -14.9786F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -30.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -50.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC),
			new Keyframe(5.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -30.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(-47.0109F, -25.0041F, -23.197F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-27.0109F, -25.0041F, -23.197F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(37.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.2F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(32.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(28.2491F, 16.7796F, -28.2491F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.5F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(7.1566F, 2.2494F, -17.3593F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -12.5F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.5F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("vfx", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.build();

	    public static final AnimationDefinition WALK = Builder.create(4.0F).looping()
		.addBoneAnimation("body", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, -2.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("upper_torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.05F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.3F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.35F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.05F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.1F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.3F, AnimationHelper.createScalingVector(1.0F, 0.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.35F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, -46.76F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, -50.0F), Interpolations.CUBIC),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, -35.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, -46.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(-45.4743F, -20.5777F, -38.033F), Interpolations.CUBIC),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(-48.9342F, -2.0901F, -20.7825F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(-7.0524F, -2.5587F, -7.3423F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-7.4929F, 0.3262F, 14.9786F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 50.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC),
			new Keyframe(5.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 30.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(32.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(28.2491F, -16.7796F, 28.2491F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.5F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.75F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(42.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.25F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(7.1566F, -2.2494F, 17.3593F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 12.5F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.5F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(-47.0109F, 25.0041F, 23.197F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-27.0109F, 25.0041F, 23.197F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(37.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.2F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 46.76F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 50.0F), Interpolations.CUBIC),
			new Keyframe(2.6F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 35.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 46.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(-45.4743F, 20.5777F, 38.033F), Interpolations.CUBIC),
			new Keyframe(2.9F, AnimationHelper.createRotationalVector(-48.9342F, 2.0901F, 20.7825F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(-7.0524F, 2.5587F, 7.3423F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-7.4929F, -0.3262F, -14.9786F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -30.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -50.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC),
			new Keyframe(5.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -30.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(-47.0109F, -25.0041F, -23.197F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(-27.0109F, -25.0041F, -23.197F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(37.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(5.2F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(32.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(28.2491F, 16.7796F, -28.2491F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.5F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(3.05F, AnimationHelper.createRotationalVector(7.1566F, 2.2494F, -17.3593F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -12.5F), Interpolations.CUBIC),
			new Keyframe(3.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.5F), Interpolations.CUBIC),
			new Keyframe(4.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("vfx", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.build();

	    public static final AnimationDefinition RIGHT_SLASH = Builder.create(1.5F)
		.addBoneAnimation("body", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 20.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, -50.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, -60.8F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, -50.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, -19.25F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("upper_torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-15.5041F, -14.4775F, 3.9671F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(6.3265F, 21.6937F, -6.1191F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(6.3265F, 21.6937F, -6.1191F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(15.0F, -57.5F, -26.76F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(20.0F, -68.0F, -26.76F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(15.0F, -57.5F, -26.76F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(6.0F, -19.0F, -26.76F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-97.1988F, -10.692F, -5.2428F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-127.7398F, -78.3941F, 30.5832F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-127.66F, -77.99F, 30.19F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-101.1014F, -50.2438F, 1.9929F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-63.86F, -23.22F, -24.64F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-4.1935F, -6.053F, -42.6925F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-5.2551F, 5.1592F, 56.8487F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-5.2551F, 5.1592F, 56.8487F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 22.96F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-15.6964F, -15.1887F, 60.8899F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-5.6964F, -15.1887F, 60.8899F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-5.6964F, -15.1887F, 60.8899F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(72.68F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(72.68F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(31.3909F, 1.3003F, -2.0144F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(29.434F, -11.5082F, 19.5879F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(29.434F, -11.5082F, 19.5879F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 57.54F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 70.04F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 70.04F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(7.4147F, -0.2469F, 1.8914F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(5.3139F, -5.1844F, 44.1667F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(5.3139F, -5.1844F, 44.1667F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 14.44F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 56.94F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 56.94F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 40.0F, 44.26F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(38.4816F, 16.4937F, 44.7332F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-64.1871F, -49.3337F, 41.4819F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-64.1871F, -49.3337F, 41.4819F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-35.1336F, 73.6164F, 21.6468F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-71.3445F, 43.8509F, -18.9297F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-83.12F, 39.15F, -32.97F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-71.3445F, 43.8509F, -18.9297F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-55.15F, 21.29F, 17.14F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(-3.366F, 6.5481F, 50.2217F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-6.9375F, -2.4615F, -31.9364F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-6.9375F, -2.4615F, -31.9364F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -15.46F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(-111.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-16.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-16.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(29.4357F, -11.5035F, 19.3486F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(24.2406F, 20.6203F, -38.1458F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(24.2406F, 20.6203F, -38.1458F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(5.6473F, -4.8189F, 40.3548F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(6.1313F, 4.1847F, -34.1832F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(6.1313F, 4.1847F, -34.1832F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(25.5076F, 21.2732F, -8.6671F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(31.0866F, 9.9226F, 10.797F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(26.9208F, 3.4112F, -6.6833F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(26.8953F, -2.7968F, 5.4835F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("vfx", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_rot", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, -67.5F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_rot", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -27.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_angle1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_angle2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_angle2", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(5.0F, 0.0F, 10.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_angle2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(1.25F, 1.25F, 1.25F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_rot5", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end5", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end5", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash5", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash5", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot6", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end6", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end6", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash6", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash6", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot7", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end7", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end7", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash7", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash7", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot8", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end8", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end8", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash8", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash8", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.build();

	    public static final AnimationDefinition LEFT_SLASH = Builder.create(1.5F)
		.addBoneAnimation("body", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, -20.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 50.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 60.8F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 50.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 19.25F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("upper_torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-15.5041F, 14.4775F, -3.9671F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(6.3265F, -21.6937F, 6.1191F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(6.3265F, -21.6937F, 6.1191F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(1.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, -40.0F, -44.26F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(38.4816F, -16.4937F, -44.7332F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-64.1871F, 49.3337F, -41.4819F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-64.1871F, 49.3337F, -41.4819F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-35.1336F, -73.6164F, -21.6468F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-71.3445F, -43.8509F, 18.9297F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-83.12F, -39.15F, 32.97F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-71.3445F, -43.8509F, 18.9297F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-55.15F, -21.29F, -17.14F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(-3.366F, -6.5481F, -50.2217F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-6.9375F, 2.4615F, 31.9364F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-6.9375F, 2.4615F, 31.9364F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 15.46F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(-111.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-16.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-16.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(29.4357F, 11.5035F, -19.3486F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(24.2406F, -20.6203F, 38.1458F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(24.2406F, -20.6203F, 38.1458F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(5.6473F, 4.8189F, -40.3548F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(6.1313F, -4.1847F, 34.1832F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(6.1313F, -4.1847F, 34.1832F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(15.0F, 57.5F, 26.76F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(20.0F, 68.0F, 26.76F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(15.0F, 57.5F, 26.76F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(6.0F, 19.0F, 26.76F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-97.1988F, 10.692F, 5.2428F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-127.7398F, 78.3941F, -30.5832F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-127.66F, 77.99F, -30.19F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-101.1014F, 50.2438F, -1.9929F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-63.86F, 23.22F, 24.64F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-4.1935F, 6.053F, 42.6925F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-5.2551F, -5.1592F, -56.8487F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-5.2551F, -5.1592F, -56.8487F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -22.96F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-15.6964F, 15.1887F, -60.8899F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-5.6964F, 15.1887F, -60.8899F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(-5.6964F, 15.1887F, -60.8899F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(72.68F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(72.68F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(31.3909F, -1.3003F, 2.0144F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(29.434F, 11.5082F, -19.5879F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(29.434F, 11.5082F, -19.5879F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -57.54F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -70.04F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -70.04F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(7.4147F, 0.2469F, -1.8914F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(5.3139F, 5.1844F, -44.1667F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(5.3139F, 5.1844F, -44.1667F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -14.44F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -56.94F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -56.94F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(25.5076F, -21.2732F, 8.6671F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(31.0866F, -9.9226F, -10.797F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createRotationalVector(26.9208F, -3.4112F, 6.6833F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(26.8953F, 2.7968F, -5.4835F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("vfx", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_rot", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, -110.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_rot", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(10.0F, 0.0F, -22.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_angle1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_angle2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_angle2", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(5.0F, 0.0F, 10.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_angle2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(1.25F, 1.25F, 1.25F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_rot5", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end5", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end5", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash5", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash5", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot6", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end6", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end6", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash6", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.15F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash6", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot7", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end7", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end7", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash7", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash7", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot8", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end8", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end8", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash8", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.05F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash8", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slashes_rotator2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(142.5F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_rotator2", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.build();

	    public static final AnimationDefinition SPIN_SLASH = Builder.create(2.0F)
		.addBoneAnimation("body_root", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, -255.3F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(0.0F, -378.65F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(0.0F, -388.1F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(0.0F, -384.01F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(0.0F, -371.89F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, -360.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(0.0F, 57.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createRotationalVector(8.51F, 28.22F, -3.12F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(17.2412F, -9.027F, -6.3087F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(18.96F, -17.89F, -6.88F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createRotationalVector(15.64F, -18.27F, -6.81F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(10.8412F, -15.827F, -6.3087F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(5.04F, -6.65F, -4.75F), Interpolations.CUBIC),
			new Keyframe(1.65F, AnimationHelper.createRotationalVector(2.1F, -2.13F, -2.89F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("upper_torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-2.4727F, -40.7357F, 13.342F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-0.1235F, -7.243F, 1.9516F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(7.3713F, 17.7569F, 1.8967F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-60.1624F, 35.3963F, -72.0409F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(8.3159F, 15.64F, -75.5199F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-87.5477F, 19.4709F, -130.7934F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-5.1736F, 75.7493F, -8.263F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-3.9251F, -6.23F, -45.2007F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-6.6982F, 3.0554F, 36.9068F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -4.54F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 25.46F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-75.0244F, 20.9355F, 26.3639F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-39.7342F, -3.8835F, 87.711F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(26.5805F, 17.3935F, -30.7413F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(27.2524F, -16.2659F, 28.652F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -4.96F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 40.04F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(5.6473F, 4.8189F, -40.3548F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(5.7446F, -4.7023F, 39.1713F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -15.56F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 21.94F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-37.758F, 53.6433F, 19.9658F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(-123.158F, -63.8567F, 19.9658F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-123.158F, -63.8567F, 19.9658F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-5.9466F, 47.9726F, 101.0949F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(-4.3466F, -4.8274F, 40.6949F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(1.3697F, -16.6459F, 52.7332F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-3.0764F, 6.6886F, 52.7345F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(-7.3591F, 0.0525F, -12.089F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -30.46F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -62.96F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-122.7204F, 30.8205F, -114.5282F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(-7.4274F, 43.5025F, -55.751F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(45.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(29.8536F, -10.2668F, 17.1361F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(23.3566F, 21.6292F, -40.598F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -7.54F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -47.54F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(6.3957F, -3.7672F, 30.382F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(6.7619F, 3.0591F, -24.2266F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -16.94F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -69.44F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("vfx", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_rot", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, -67.5F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_rot", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -27.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_rot1", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end1", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.1F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash1", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.2F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash1", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body_rotation", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(0.0F, 13.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, -0.9F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.8F, AnimationHelper.createRotationalVector(0.0F, -0.18F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end2", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot3", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end3", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash3", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash3", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot4", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end4", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end4", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash4", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash4", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slashes_angle2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.95F, AnimationHelper.createRotationalVector(12.5F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_angle2", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(-12.0F, 0.0F, 7.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slashes_angle2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.95F, AnimationHelper.createScalingVector(1.25F, 1.25F, 1.25F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_rot5", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end5", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end5", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.2F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash5", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.3F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash5", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot6", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end6", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end6", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash6", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash6", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot7", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end7", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end7", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.3F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash7", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash7", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_rot8", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.5F, -15.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash_end8", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 48.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 20.2F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 16.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash_end8", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.5F, 1.5F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(3.0F, 3.0F, 1.5851F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(3.0F, 3.0F, 2.06F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createScalingVector(0.8588F, 0.8788F, 2.2588F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 2.24F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("slash8", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
			new Keyframe(1.35F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 112.5F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("slash8", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.7F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.95F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.86F), Interpolations.CUBIC),
			new Keyframe(1.35F, AnimationHelper.createScalingVector(1.0F, 1.0F, 0.79F), Interpolations.CUBIC)
		}))
		.build();

	@SuppressWarnings("unused")
	public static final AnimationDefinition SPAWN = Builder.create(2.0F)
		.addBoneAnimation("body", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("upper_torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(60.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.1F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.45F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -61.76F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -29.46F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-32.9425F, -37.4902F, -62.2832F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(-45.25F, -15.62F, -34.8F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_hand", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-6.9019F, -2.5602F, -17.7599F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, -5.35F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -9.54F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.99F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-51.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(-12.32F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(24.2438F, 20.6164F, -37.9057F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky_joint", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(5.8515F, 4.5684F, -37.859F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 61.76F), Interpolations.CUBIC),
			new Keyframe(1.4F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 29.46F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.25F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(-32.9425F, 37.4902F, 62.2832F), Interpolations.CUBIC),
			new Keyframe(1.6F, AnimationHelper.createRotationalVector(-45.25F, 15.62F, 34.8F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_hand", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-6.9019F, 2.5602F, 17.7599F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, 5.35F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 9.54F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.99F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-51.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createRotationalVector(-12.32F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(24.2438F, -20.6164F, 37.9057F), Interpolations.CUBIC),
			new Keyframe(1.5F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky_joint", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(5.8515F, -4.5684F, 37.859F), Interpolations.CUBIC),
			new Keyframe(1.45F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.15F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-25.54F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(41.96F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.25F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.15F, AnimationHelper.createRotationalVector(-50.38F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(14.62F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail2", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(2.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.9F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_animhead", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(1.05F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("vfx", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.build();

	@SuppressWarnings("unused")
	public static final AnimationDefinition DEATH = Builder.create(1.5F)
		.addBoneAnimation("vfx", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("body", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.05F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(-16.96F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-21.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("body", new Transformation(Targets.TRANSLATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createTranslationalVector(0.0F, 4.0F, 4.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 5.0F, 6.1F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createTranslationalVector(0.0F, 5.0F, 6.9F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 5.0F, 7.2F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 5.0F, 7.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("upper_torso", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("upper_torso", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.6F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.7F, AnimationHelper.createRotationalVector(-37.6F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_head", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("h_left_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("h_right_eye", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -26.76F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-29.9F, 17.5F, -26.76F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(-25.8845F, 21.3257F, -27.7455F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(38.9058F, 1.9795F, -10.2001F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(47.5058F, 1.9795F, -7.3001F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_arm", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-46.95F, -12.72F, -30.7F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-24.45F, -12.72F, -30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_hand", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, -1.01F, 4.65F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-2.7807F, -6.8164F, -55.2487F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-7.1752F, -1.6399F, -0.3115F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.3F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 42.96F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-58.76F, 25.0F, 23.2F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-8.76F, 25.0F, 23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.3F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, -9.02F, 15.18F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(31.3907F, -1.3052F, 2.2534F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(24.2406F, -20.6203F, 38.1458F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.3F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, -1.21F, 9.33F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(6.8305F, 2.9023F, -22.9194F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(6.6229F, -3.3505F, 26.7135F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.3F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("left_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 26.76F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-29.9F, -17.5F, 26.76F), Interpolations.CUBIC),
			new Keyframe(0.2F, AnimationHelper.createRotationalVector(-25.8845F, -21.3257F, 27.7455F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(38.9058F, -1.9795F, 10.2001F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(47.5058F, -1.9795F, 7.3001F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_arm", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_hand", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-46.95F, 12.72F, 30.7F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-24.45F, 12.72F, 30.7F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_hand", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.4F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.65F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-7.29F, 1.01F, -4.65F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-2.7807F, 6.8164F, 55.2487F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-7.1752F, 1.6399F, 0.3115F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.3F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -42.96F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-36.26F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-58.76F, -25.0F, -23.2F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-8.76F, -25.0F, -23.2F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.3F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_index_joint2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(25.18F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(30.22F, 9.02F, -15.18F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(31.3907F, 1.3052F, -2.2534F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(24.2406F, 20.6203F, -38.1458F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.3F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_pinky_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -27.54F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(7.32F, 1.21F, -9.33F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(6.8305F, -2.9023F, 22.9194F), Interpolations.CUBIC),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(6.6229F, 3.3505F, -26.7135F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.3F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("right_middle_finger_joint", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -31.94F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(29.46F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-50.54F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-70.32F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.4F, AnimationHelper.createRotationalVector(-1.97F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.55F, AnimationHelper.createRotationalVector(24.46F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createRotationalVector(24.46F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.55F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.8F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail2", new Transformation(Targets.ROTATE, new Keyframe[]{
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(27.12F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.1F, AnimationHelper.createRotationalVector(-10.38F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.35F, AnimationHelper.createRotationalVector(-10.38F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.6F, AnimationHelper.createRotationalVector(34.62F, 0.0F, 0.0F), Interpolations.CUBIC),
			new Keyframe(0.85F, AnimationHelper.createRotationalVector(34.62F, 0.0F, 0.0F), Interpolations.CUBIC)
		}))
		.addBoneAnimation("tail2", new Transformation(Targets.SCALE, new Keyframe[]{
			new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Interpolations.CUBIC),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(0.0F, 1.0F, 0.0F), Interpolations.CUBIC)
		}))
		.build();
}
