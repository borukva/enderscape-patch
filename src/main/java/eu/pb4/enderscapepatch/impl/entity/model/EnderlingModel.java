package eu.pb4.enderscapepatch.impl.entity.model;

import eu.pb4.factorytools.api.virtualentity.emuvanilla.EntityValueExtraction;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.Animation;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.model.*;
import net.bunten.enderscape.entity.enderling.Enderling;
import net.minecraft.util.math.MathHelper;

public class EnderlingModel extends EntityModel<Enderling> {
    private final ModelPart enderling;
    private final ModelPart bodyRoot;
    private final ModelPart body;
    private final ModelPart torso;
    private final ModelPart head;
    private final ModelPart rightArm;
    private final ModelPart leftArm;

    private final Animation idleAnimation;
    private final Animation walkAnimation;
    private final Animation chaseAnimation;
    private final Animation rightAttackAnimation;
    private final Animation leftAttackAnimation;

    public EnderlingModel(ModelPart root) {
        super(root);
        enderling = root.getChild("enderling");
        bodyRoot = enderling.getChild("body_root");
        body = bodyRoot.getChild("body");
        torso = body.getChild("torso");
        head = torso.getChild("h_head");
        rightArm = torso.getChild("right_arm");
        leftArm = torso.getChild("left_arm");

        idleAnimation = EnderlingAnimations.IDLE.createAnimation(root);
        walkAnimation = EnderlingAnimations.WALK.createAnimation(root);
        chaseAnimation = EnderlingAnimations.CHASE.createAnimation(root);
        rightAttackAnimation = EnderlingAnimations.RIGHT_ATTACK.createAnimation(root);
        leftAttackAnimation = EnderlingAnimations.LEFT_ATTACK.createAnimation(root);
    }

    public static TexturedModelData createLayer() {
        ModelData meshDefinition = new ModelData();
        ModelPartData partDefinition = meshDefinition.getRoot();

        ModelPartData enderling = partDefinition.addChild("enderling", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 24.0F, 0.0F));
        ModelPartData bodyRoot = enderling.addChild("body_root", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));
        ModelPartData body = bodyRoot.addChild("body", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -12.0F, 0.0F));

        body.addChild("right_leg", ModelPartBuilder.create().uv(24, 16)
                .cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, Dilation.NONE), ModelTransform.origin(-2.0F, 0.0F, 0.0F));
        body.addChild("left_leg", ModelPartBuilder.create().uv(24, 16).mirrored()
                .cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, Dilation.NONE).mirrored(false), ModelTransform.origin(2.0F, 0.0F, 0.0F));

        ModelPartData torso = body.addChild("torso", ModelPartBuilder.create().uv(0, 16)
                .cuboid(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, Dilation.NONE), ModelTransform.origin(0.0F, 0.0F, 0.0F));
        ModelPartData head = torso.addChild("h_head", ModelPartBuilder.create().uv(0, 0)
                .cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, Dilation.NONE), ModelTransform.origin(0.0F, -12.0F, 0.0F));

        head.addChild("h_left_eyelid", ModelPartBuilder.create().uv(24, 30)
                .cuboid(-1.5F, 0.25F, -2.25F, 3.0F, 1.0F, 2.0F, new Dilation(0.25F)), ModelTransform.origin(2.5F, -3.25F, -1.75F));
        head.addChild("h_right_eyelid", ModelPartBuilder.create().uv(24, 30)
                .cuboid(-1.5F, 0.25F, -2.25F, 3.0F, 1.0F, 2.0F, new Dilation(0.25F)), ModelTransform.origin(-2.5F, -3.25F, -1.75F));
        head.addChild("h_left_eye_glare", ModelPartBuilder.create().uv(0, 32)
                .cuboid(0.0F, -1.0F, 0.0F, 6.0F, 1.0F, 0.0F, Dilation.NONE), ModelTransform.origin(4.0F, -2.0F, -4.0F));
        head.addChild("h_right_eye_glare", ModelPartBuilder.create().uv(0, 32)
                .cuboid(-6.0F, -1.0F, 0.0F, 6.0F, 1.0F, 0.0F, Dilation.NONE), ModelTransform.origin(-4.0F, -2.0F, -4.0F));

        torso.addChild("right_arm", ModelPartBuilder.create().uv(32, 0)
                .cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, Dilation.NONE), ModelTransform.origin(-4.0F, -11.0F, 0.0F));
        torso.addChild("left_arm", ModelPartBuilder.create().uv(32, 0).mirrored()
                .cuboid(0.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, Dilation.NONE).mirrored(false), ModelTransform.origin(4.0F, -11.0F, 0.0F));

        return TexturedModelData.of(meshDefinition, 64, 64);
    }

    @Override
    public void setAngles(Enderling state) {
        super.setAngles(state);

        float age = state.age;
        if (state.deathTime <= 0) {
            head.pitch += (state.getPitch() * (MathHelper.PI / 180)) / 2;
            head.yaw += (EntityValueExtraction.getRelativeHeadYaw(state) * (MathHelper.PI / 180)) / 2;
        }

        idleAnimation.apply(state.idleAnimationState, age);
        walkAnimation.apply(state.walkAnimationState, age);
        chaseAnimation.apply(state.chaseAnimationState, age);
        rightAttackAnimation.apply(state.rightAttackAnimationState, age);
        leftAttackAnimation.apply(state.leftAttackAnimationState, age);
    }
}
