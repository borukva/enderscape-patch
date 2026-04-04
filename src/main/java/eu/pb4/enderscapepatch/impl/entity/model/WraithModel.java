package eu.pb4.enderscapepatch.impl.entity.model;

import eu.pb4.factorytools.api.virtualentity.emuvanilla.EntityValueExtraction;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.Animation;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.model.*;
import net.bunten.enderscape.entity.wraith.Wraith;
import net.minecraft.util.math.MathHelper;

public class WraithModel extends EntityModel<Wraith> {
    private final ModelPart wraith;

    private final Animation idleAnimation;
    private final Animation walkAnimation;
    private final Animation rightSlashAnimation;
    private final Animation leftSlashAnimation;
    private final Animation spinSlashAnimation;

    public WraithModel(ModelPart root) {
        super(root);
        this.wraith = root.getChild("wraith");

        idleAnimation = WraithAnimations.IDLE.createAnimation(root);
        walkAnimation = WraithAnimations.WALK.createAnimation(root);
        rightSlashAnimation = WraithAnimations.RIGHT_SLASH.createAnimation(root);
        leftSlashAnimation = WraithAnimations.LEFT_SLASH.createAnimation(root);
        spinSlashAnimation = WraithAnimations.SPIN_SLASH.createAnimation(root);
    }

    public static TexturedModelData createLayer() {
        ModelData meshDefinition = new ModelData();
        ModelPartData root = meshDefinition.getRoot();

        ModelPartData wraith = root.addChild("wraith", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 24.0F, 0.0F));

        ModelPartData vfx = wraith.addChild("vfx", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData slashes = vfx.addChild("slashes", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData slashes_rot = slashes.addChild("slashes_rot", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData slashes_angle1 = slashes_rot.addChild("slashes_angle1", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData slashes_rotator1 = slashes_angle1.addChild("slashes_rotator1", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -18.0F, 0.0F));

        ModelPartData slash_rot1 = slashes_rotator1.addChild("slash_rot1", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 2.0F, 0.0F));

        ModelPartData slash_end1 = slash_rot1.addChild("slash_end1", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 12.5F));

        ModelPartBuilder slashCubes = ModelPartBuilder.create().uv(0, 21).cuboid(0.0F, -1.5F, 20.0F, 0.0F, 3.0F, 25.0F, Dilation.NONE)
                .uv(1, 18).cuboid(-1.5F, 0.0F, 20.0F, 3.0F, 0.0F, 25.0F, Dilation.NONE);
        slash_end1.addChild("slash1", slashCubes, ModelTransform.origin(0.0F, 0.0F, -45.0F));

        ModelPartData slash_rot2 = slashes_rotator1.addChild("slash_rot2", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.0F, 0.0F));

        ModelPartData slash_end2 = slash_rot2.addChild("slash_end2", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 12.5F));

        slash_end2.addChild("slash2", ModelPartBuilder.create().uv(0, 21).cuboid(0.0F, -1.5F, 20.0F, 0.0F, 3.0F, 25.0F, Dilation.NONE)
                .uv(1, 18).cuboid(-1.5F, 0.0F, 20.0F, 3.0F, 0.0F, 25.0F, Dilation.NONE), ModelTransform.origin(0.0F, 0.0F, -45.0F));

        ModelPartData slash_rot3 = slashes_rotator1.addChild("slash_rot3", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 6.0F, 2.0F));

        ModelPartData slash_end3 = slash_rot3.addChild("slash_end3", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 12.5F));

        slash_end3.addChild("slash3", ModelPartBuilder.create().uv(0, 21).cuboid(0.0F, -1.5F, 20.0F, 0.0F, 3.0F, 25.0F, Dilation.NONE)
                .uv(1, 18).cuboid(-1.5F, 0.0F, 20.0F, 3.0F, 0.0F, 25.0F, Dilation.NONE), ModelTransform.origin(0.0F, 0.0F, -45.0F));

        ModelPartData slash_rot4 = slashes_rotator1.addChild("slash_rot4", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -6.0F, 6.0F));

        ModelPartData slash_end4 = slash_rot4.addChild("slash_end4", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 12.5F));

        slash_end4.addChild("slash4", ModelPartBuilder.create().uv(0, 21).cuboid(0.0F, -1.5F, 20.0F, 0.0F, 3.0F, 25.0F, Dilation.NONE)
                .uv(1, 18).cuboid(-1.5F, 0.0F, 20.0F, 3.0F, 0.0F, 25.0F, Dilation.NONE), ModelTransform.origin(0.0F, 0.0F, -45.0F));

        ModelPartData slashes_angle2 = slashes_rot.addChild("slashes_angle2", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData slashes_rotator2 = slashes_angle2.addChild("slashes_rotator2", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -18.0F, 0.0F));

        ModelPartData slash_rot5 = slashes_rotator2.addChild("slash_rot5", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 2.0F, 0.0F));

        ModelPartData slash_end5 = slash_rot5.addChild("slash_end5", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 12.5F));

        slash_end5.addChild("slash5", ModelPartBuilder.create().uv(0, 21).cuboid(0.0F, -1.5F, 20.0F, 0.0F, 3.0F, 25.0F, Dilation.NONE)
                .uv(1, 18).cuboid(-1.5F, 0.0F, 20.0F, 3.0F, 0.0F, 25.0F, Dilation.NONE), ModelTransform.origin(0.0F, 0.0F, -45.0F));

        ModelPartData slash_rot6 = slashes_rotator2.addChild("slash_rot6", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.0F, 0.0F));

        ModelPartData slash_end6 = slash_rot6.addChild("slash_end6", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 12.5F));

        slash_end6.addChild("slash6", ModelPartBuilder.create().uv(0, 21).cuboid(0.0F, -1.5F, 20.0F, 0.0F, 3.0F, 25.0F, Dilation.NONE)
                .uv(1, 18).cuboid(-1.5F, 0.0F, 20.0F, 3.0F, 0.0F, 25.0F, Dilation.NONE), ModelTransform.origin(0.0F, 0.0F, -45.0F));

        ModelPartData slash_rot7 = slashes_rotator2.addChild("slash_rot7", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 6.0F, 2.0F));

        ModelPartData slash_end7 = slash_rot7.addChild("slash_end7", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 12.5F));

        slash_end7.addChild("slash7", ModelPartBuilder.create().uv(0, 21).cuboid(0.0F, -1.5F, 20.0F, 0.0F, 3.0F, 25.0F, Dilation.NONE)
                .uv(1, 18).cuboid(-1.5F, 0.0F, 20.0F, 3.0F, 0.0F, 25.0F, Dilation.NONE), ModelTransform.origin(0.0F, 0.0F, -45.0F));

        ModelPartData slash_rot8 = slashes_rotator2.addChild("slash_rot8", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -6.0F, 6.0F));

        ModelPartData slash_end8 = slash_rot8.addChild("slash_end8", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 12.5F));

        slash_end8.addChild("slash8", ModelPartBuilder.create().uv(0, 21).cuboid(0.0F, -1.5F, 20.0F, 0.0F, 3.0F, 25.0F, Dilation.NONE)
                .uv(1, 18).cuboid(-1.5F, 0.0F, 20.0F, 3.0F, 0.0F, 25.0F, Dilation.NONE), ModelTransform.origin(0.0F, 0.0F, -45.0F));

        ModelPartData body_rotation = wraith.addChild("body_rotation", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData body_root = body_rotation.addChild("body_root", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData body = body_root.addChild("body", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -15.0F, 0.0F));

        ModelPartData torso = body.addChild("torso", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData upper_torso = torso.addChild("upper_torso", ModelPartBuilder.create().uv(0, 17).cuboid(-4.5F, -6.0F, -2.0F, 9.0F, 6.0F, 4.0F, Dilation.NONE), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        upper_torso.addChild("cube_r1", ModelPartBuilder.create().uv(24, 43).cuboid(-4.0F, -3.0F, 0.0F, 4.0F, 3.0F, 0.0F, Dilation.NONE), ModelTransform.of(-4.5F, -4.0F, -1.0F, 0.0F, 0.0F, 0.3927F));

        upper_torso.addChild("cube_r2", ModelPartBuilder.create().uv(24, 43).mirrored().cuboid(0.0F, -3.0F, 0.0F, 4.0F, 3.0F, 0.0F, Dilation.NONE).mirrored(false), ModelTransform.of(4.5F, -4.0F, -1.0F, 0.0F, 0.0F, -0.3927F));

        ModelPartData h_head = upper_torso.addChild("h_head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, Dilation.NONE), ModelTransform.origin(0.0F, -6.0F, 0.0F));

        h_head.addChild("cube_r3", ModelPartBuilder.create().uv(32, 22).cuboid(0.0F, -2.0F, 0.0F, 0.0F, 8.0F, 11.0F, Dilation.NONE), ModelTransform.of(-4.0F, -8.0F, -4.0F, 0.0F, -0.3927F, 0.0F));

        h_head.addChild("cube_r4", ModelPartBuilder.create().uv(32, 22).cuboid(0.0F, -2.0F, 0.0F, 0.0F, 8.0F, 11.0F, Dilation.NONE), ModelTransform.of(4.0F, -8.0F, -4.0F, 0.0F, 0.3927F, 0.0F));

        h_head.addChild("cube_r5", ModelPartBuilder.create().uv(40, 44).cuboid(0.0F, -4.5F, -0.5F, 0.0F, 8.0F, 12.0F, Dilation.NONE), ModelTransform.of(-3.0F, -3.5F, 0.5F, 0.0F, -0.3927F, 0.0F));

        h_head.addChild("cube_r6", ModelPartBuilder.create().uv(40, 44).cuboid(0.0F, -4.5F, -0.5F, 0.0F, 8.0F, 12.0F, Dilation.NONE), ModelTransform.of(3.0F, -3.5F, 0.5F, 0.0F, 0.3927F, 0.0F));

        h_head.addChild("cube_r7", ModelPartBuilder.create().uv(0, 37).cuboid(0.0F, -3.5F, -2.5F, 0.0F, 10.0F, 17.0F, Dilation.NONE), ModelTransform.of(0.0F, -9.5F, 0.5F, 0.3927F, 0.0F, 0.0F));

        ModelPartData h_animhead = h_head.addChild("h_animhead", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -5.75F, -5.0F));

        h_animhead.addChild("cube_r8", ModelPartBuilder.create().uv(32, 17).mirrored().cuboid(-3.0F, -5.0F, 0.0F, 16.0F, 10.0F, 0.0F, Dilation.NONE).mirrored(false), ModelTransform.of(5.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.7854F));

        h_animhead.addChild("cube_r9", ModelPartBuilder.create().uv(32, 17).cuboid(-13.0F, -5.0F, 0.0F, 16.0F, 10.0F, 0.0F, Dilation.NONE), ModelTransform.of(-5.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.7854F));

        ModelPartData h_left_eye = h_head.addChild("h_left_eye", ModelPartBuilder.create().uv(32, 41).mirrored().cuboid(-0.2912F, -3.4434F, -0.05F, 10.0F, 4.0F, -0.1F, Dilation.NONE).mirrored(false), ModelTransform.origin(1.5F, -2.5F, -4.5F));

        h_left_eye.addChild("cube_r10", ModelPartBuilder.create().uv(22, 16).cuboid(-1.0F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, Dilation.NONE), ModelTransform.of(0.25F, -0.75F, 0.0F, 0.0F, 0.0F, -0.3927F));

        ModelPartData h_right_eye = h_head.addChild("h_right_eye", ModelPartBuilder.create().uv(32, 41).cuboid(-9.7088F, -3.4434F, -0.05F, 10.0F, 4.0F, -0.1F, Dilation.NONE), ModelTransform.origin(-1.5F, -2.5F, -4.5F));

        h_right_eye.addChild("cube_r11", ModelPartBuilder.create().uv(22, 16).mirrored().cuboid(-4.0F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, Dilation.NONE).mirrored(false), ModelTransform.of(-0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.3927F));

        ModelPartData left_arm = upper_torso.addChild("left_arm", ModelPartBuilder.create().uv(36, 0).cuboid(0.0F, -11.0F, 0.0F, 14.0F, 17.0F, 0.0F, Dilation.NONE), ModelTransform.origin(4.5F, -4.0F, 0.0F));

        ModelPartData left_hand = left_arm.addChild("left_hand", ModelPartBuilder.create().uv(50, 45).cuboid(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, Dilation.NONE), ModelTransform.origin(3.5F, 2.0F, 0.0F));

        ModelPartData left_index = left_hand.addChild("left_index", ModelPartBuilder.create().uv(20, 33).cuboid(-1.75F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, Dilation.NONE), ModelTransform.origin(1.5F, 6.75F, -1.25F));

        left_index.addChild("left_index_joint", ModelPartBuilder.create().uv(12, 39).cuboid(-4.0F, -1.0F, 0.0F, 5.0F, 7.0F, 0.0F, Dilation.NONE), ModelTransform.origin(0.25F, 4.0F, 0.0F));

        ModelPartData left_index2 = left_hand.addChild("left_index2", ModelPartBuilder.create().uv(20, 27).cuboid(-0.5F, 0.0F, -0.25F, 1.0F, 4.0F, 2.0F, Dilation.NONE), ModelTransform.origin(-1.5F, 3.75F, -2.25F));

        left_index2.addChild("left_index_joint2", ModelPartBuilder.create().uv(12, 34).cuboid(-0.25F, -1.0F, -1.25F, 0.0F, 7.0F, 5.0F, Dilation.NONE), ModelTransform.origin(0.25F, 4.0F, 0.0F));

        ModelPartData left_pinky = left_hand.addChild("left_pinky", ModelPartBuilder.create().uv(20, 33).cuboid(-1.75F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, Dilation.NONE), ModelTransform.origin(1.5F, 6.5F, 1.25F));

        left_pinky.addChild("left_pinky_joint", ModelPartBuilder.create().uv(12, 39).cuboid(-4.0F, -1.0F, 0.0F, 5.0F, 7.0F, 0.0F, Dilation.NONE), ModelTransform.origin(0.25F, 4.0F, 0.0F));

        ModelPartData left_middle_finger = left_hand.addChild("left_middle_finger", ModelPartBuilder.create().uv(20, 33).cuboid(-1.75F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, Dilation.NONE), ModelTransform.origin(1.5F, 7.0F, 0.0F));

        left_middle_finger.addChild("left_middle_finger_joint", ModelPartBuilder.create().uv(12, 39).cuboid(-4.0F, -1.0F, 0.0F, 5.0F, 7.0F, 0.0F, Dilation.NONE), ModelTransform.origin(0.25F, 4.0F, 0.0F));

        ModelPartData right_arm = upper_torso.addChild("right_arm", ModelPartBuilder.create().uv(36, 0).mirrored().cuboid(-14.0F, -11.0F, 0.0F, 14.0F, 17.0F, 0.0F, Dilation.NONE).mirrored(false), ModelTransform.origin(-4.5F, -4.0F, 0.0F));

        ModelPartData right_hand = right_arm.addChild("right_hand", ModelPartBuilder.create().uv(50, 45).mirrored().cuboid(-1.5F, 0.0F, -2.0F, 3.0F, 7.0F, 4.0F, Dilation.NONE).mirrored(false), ModelTransform.origin(-3.5F, 2.0F, 0.0F));

        ModelPartData right_index = right_hand.addChild("right_index", ModelPartBuilder.create().uv(20, 33).mirrored().cuboid(-0.25F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, Dilation.NONE).mirrored(false), ModelTransform.origin(-1.5F, 6.75F, -1.25F));

        right_index.addChild("right_index_joint", ModelPartBuilder.create().uv(12, 39).mirrored().cuboid(-1.0F, -1.0F, 0.0F, 5.0F, 7.0F, 0.0F, Dilation.NONE).mirrored(false), ModelTransform.origin(-0.25F, 4.0F, 0.0F));

        ModelPartData right_index2 = right_hand.addChild("right_index2", ModelPartBuilder.create().uv(20, 27).cuboid(-0.5F, 0.0F, -0.25F, 1.0F, 4.0F, 2.0F, Dilation.NONE), ModelTransform.origin(1.5F, 3.75F, -2.25F));

        right_index2.addChild("right_index_joint2", ModelPartBuilder.create().uv(12, 34).cuboid(0.25F, -1.0F, -1.25F, 0.0F, 7.0F, 5.0F, Dilation.NONE), ModelTransform.origin(-0.25F, 4.0F, 0.0F));

        ModelPartData right_pinky = right_hand.addChild("right_pinky", ModelPartBuilder.create().uv(20, 33).mirrored().cuboid(-0.25F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, Dilation.NONE).mirrored(false), ModelTransform.origin(-1.5F, 6.5F, 1.25F));

        right_pinky.addChild("right_pinky_joint", ModelPartBuilder.create().uv(12, 39).mirrored().cuboid(-1.0F, -1.0F, 0.0F, 5.0F, 7.0F, 0.0F, Dilation.NONE).mirrored(false), ModelTransform.origin(-0.25F, 4.0F, 0.0F));

        ModelPartData right_middle_finger = right_hand.addChild("right_middle_finger", ModelPartBuilder.create().uv(20, 33).mirrored().cuboid(-0.25F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, Dilation.NONE).mirrored(false), ModelTransform.origin(-1.5F, 7.0F, 0.0F));

        right_middle_finger.addChild("right_middle_finger_joint", ModelPartBuilder.create().uv(12, 39).mirrored().cuboid(-1.0F, -1.0F, 0.0F, 5.0F, 7.0F, 0.0F, Dilation.NONE).mirrored(false), ModelTransform.origin(-0.25F, 4.0F, 0.0F));

        ModelPartData tail = torso.addChild("tail", ModelPartBuilder.create().uv(0, 27).cuboid(-2.5F, 0.0F, 0.0F, 5.0F, 6.0F, 3.0F, Dilation.NONE), ModelTransform.origin(0.0F, 0.0F, -1.5F));

        tail.addChild("tail2", ModelPartBuilder.create().uv(0, 30).cuboid(0.0F, 0.0F, 0.0F, 0.0F, 10.0F, 6.0F, Dilation.NONE), ModelTransform.origin(0.0F, 6.0F, 0.0F));

        return TexturedModelData.of(meshDefinition, 64, 64);
    }

    @Override
    public void setAngles(Wraith state) {
        super.setAngles(state);

        float age = state.age;

        if (state.deathTime > 0) {
            wraith.pitch = MathHelper.lerp(0.1F, wraith.pitch, 0);
            wraith.yaw = MathHelper.lerp(0.1F, wraith.yaw, 0);
            wraith.roll = MathHelper.lerp(0.1F, wraith.roll, 0);
        } else {
            wraith.pitch += (state.getPitch() * (MathHelper.PI / 180)) / 2;
            wraith.yaw += (EntityValueExtraction.getRelativeHeadYaw(state) * (MathHelper.PI / 180)) / 2;
        }

        idleAnimation.apply(state.idleAnimationState, age);
        walkAnimation.apply(state.walkAnimationState, age);
        rightSlashAnimation.apply(state.rightSlashAnimationState, age);
        leftSlashAnimation.apply(state.leftSlashAnimationState, age);
        spinSlashAnimation.apply(state.spinSlashAnimationState, age);
    }
}
