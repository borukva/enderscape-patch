package eu.pb4.enderscapepatch.impl.entity.model;

import eu.pb4.factorytools.api.virtualentity.emuvanilla.EntityValueExtraction;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.animation.Animation;
import eu.pb4.factorytools.api.virtualentity.emuvanilla.model.*;
import net.bunten.enderscape.entity.watchman.Watchman;
import net.minecraft.util.math.MathHelper;

public class WatchmanModel extends EntityModel<Watchman> {

    private final ModelPart watchman;
    private final ModelPart hHead;

    private final Animation idleAnimation;
    private final Animation walkAnimation;
    private final Animation lanternSmackAnimation;
    private final Animation summonWraithsAnimation;
    private final Animation lanternPushAnimation;
    private final Animation deathAnimation;

    public WatchmanModel(ModelPart root) {
        super(root);
        this.watchman = root.getChild("watchman");
        this.hHead = this.watchman.getChild("body_root").getChild("body").getChild("torso").getChild("h_head");

        idleAnimation = WatchmanAnimations.IDLE.createAnimation(root);
        walkAnimation = WatchmanAnimations.WALK.createAnimation(root);
        lanternSmackAnimation = WatchmanAnimations.LANTERN_SMACK.createAnimation(root);
        summonWraithsAnimation = WatchmanAnimations.SUMMON_WRAITHS.createAnimation(root);
        lanternPushAnimation = WatchmanAnimations.LANTERN_PUSH.createAnimation(root);
        deathAnimation = WatchmanAnimations.DEATH.createAnimation(root);
    }

    @SuppressWarnings("unused")
    public static TexturedModelData createLayer() {
        ModelData meshDefinition = new ModelData();
        ModelPartData root = meshDefinition.getRoot();

        ModelPartData watchmanRoot = root.addChild("watchman", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 24.0F, 0.0F));

        ModelPartData vfx = watchmanRoot.addChild("vfx", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystals1 = vfx.addChild("end_crystals1", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot1 = end_crystals1.addChild("end_crystal_rot1", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle1 = end_crystal_rot1.addChild("end_crystal_angle1", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal1 = end_crystal_angle1.addChild("end_crystal1", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot2 = end_crystals1.addChild("end_crystal_rot2", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle2 = end_crystal_rot2.addChild("end_crystal_angle2", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal2 = end_crystal_angle2.addChild("end_crystal2", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot3 = end_crystals1.addChild("end_crystal_rot3", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle3 = end_crystal_rot3.addChild("end_crystal_angle3", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal3 = end_crystal_angle3.addChild("end_crystal3", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot4 = end_crystals1.addChild("end_crystal_rot4", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle4 = end_crystal_rot4.addChild("end_crystal_angle4", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal4 = end_crystal_angle4.addChild("end_crystal4", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot5 = end_crystals1.addChild("end_crystal_rot5", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle5 = end_crystal_rot5.addChild("end_crystal_angle5", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal5 = end_crystal_angle5.addChild("end_crystal5", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot6 = end_crystals1.addChild("end_crystal_rot6", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle6 = end_crystal_rot6.addChild("end_crystal_angle6", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal6 = end_crystal_angle6.addChild("end_crystal6", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot7 = end_crystals1.addChild("end_crystal_rot7", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle7 = end_crystal_rot7.addChild("end_crystal_angle7", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal7 = end_crystal_angle7.addChild("end_crystal7", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot8 = end_crystals1.addChild("end_crystal_rot8", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle8 = end_crystal_rot8.addChild("end_crystal_angle8", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal8 = end_crystal_angle8.addChild("end_crystal8", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystals2 = vfx.addChild("end_crystals2", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot9 = end_crystals2.addChild("end_crystal_rot9", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle9 = end_crystal_rot9.addChild("end_crystal_angle9", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal9 = end_crystal_angle9.addChild("end_crystal9", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot10 = end_crystals2.addChild("end_crystal_rot10", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle10 = end_crystal_rot10.addChild("end_crystal_angle10", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal10 = end_crystal_angle10.addChild("end_crystal10", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot11 = end_crystals2.addChild("end_crystal_rot11", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle11 = end_crystal_rot11.addChild("end_crystal_angle11", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal11 = end_crystal_angle11.addChild("end_crystal11", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot12 = end_crystals2.addChild("end_crystal_rot12", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle12 = end_crystal_rot12.addChild("end_crystal_angle12", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal12 = end_crystal_angle12.addChild("end_crystal12", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot13 = end_crystals2.addChild("end_crystal_rot13", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle13 = end_crystal_rot13.addChild("end_crystal_angle13", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal13 = end_crystal_angle13.addChild("end_crystal13", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot14 = end_crystals2.addChild("end_crystal_rot14", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle14 = end_crystal_rot14.addChild("end_crystal_angle14", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal14 = end_crystal_angle14.addChild("end_crystal14", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot15 = end_crystals2.addChild("end_crystal_rot15", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle15 = end_crystal_rot15.addChild("end_crystal_angle15", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal15 = end_crystal_angle15.addChild("end_crystal15", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot16 = end_crystals2.addChild("end_crystal_rot16", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle16 = end_crystal_rot16.addChild("end_crystal_angle16", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal16 = end_crystal_angle16.addChild("end_crystal16", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystals3 = vfx.addChild("end_crystals3", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot17 = end_crystals3.addChild("end_crystal_rot17", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle17 = end_crystal_rot17.addChild("end_crystal_angle17", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal17 = end_crystal_angle17.addChild("end_crystal17", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot18 = end_crystals3.addChild("end_crystal_rot18", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle18 = end_crystal_rot18.addChild("end_crystal_angle18", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal18 = end_crystal_angle18.addChild("end_crystal18", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot19 = end_crystals3.addChild("end_crystal_rot19", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle19 = end_crystal_rot19.addChild("end_crystal_angle19", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal19 = end_crystal_angle19.addChild("end_crystal19", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot20 = end_crystals3.addChild("end_crystal_rot20", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle20 = end_crystal_rot20.addChild("end_crystal_angle20", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal20 = end_crystal_angle20.addChild("end_crystal20", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot21 = end_crystals3.addChild("end_crystal_rot21", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle21 = end_crystal_rot21.addChild("end_crystal_angle21", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal21 = end_crystal_angle21.addChild("end_crystal21", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot22 = end_crystals3.addChild("end_crystal_rot22", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle22 = end_crystal_rot22.addChild("end_crystal_angle22", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal22 = end_crystal_angle22.addChild("end_crystal22", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot23 = end_crystals3.addChild("end_crystal_rot23", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle23 = end_crystal_rot23.addChild("end_crystal_angle23", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal23 = end_crystal_angle23.addChild("end_crystal23", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal_rot24 = end_crystals3.addChild("end_crystal_rot24", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -2.5F, 0.0F));

        ModelPartData end_crystal_angle24 = end_crystal_rot24.addChild("end_crystal_angle24", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_crystal24 = end_crystal_angle24.addChild("end_crystal24", ModelPartBuilder.create().uv(4, 13).cuboid(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_flash = vfx.addChild("end_flash", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_flash_rot1 = end_flash.addChild("end_flash_rot1", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 2.0F, 0.0F));

        ModelPartData end_flash1 = end_flash_rot1.addChild("end_flash1", ModelPartBuilder.create().uv(16, 0).cuboid(-1.5F, -8.5F, 0.0F, 3.0F, 17.0F, 0.0F, new Dilation(0.0F))
        .uv(16, -3).cuboid(0.0F, -8.5F, -1.5F, 0.0F, 17.0F, 3.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData end_flash_rot2 = end_flash.addChild("end_flash_rot2", ModelPartBuilder.create(), ModelTransform.of(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

        ModelPartData end_flash2 = end_flash_rot2.addChild("end_flash2", ModelPartBuilder.create().uv(16, 0).cuboid(-1.5F, -8.5F, 0.0F, 3.0F, 17.0F, 0.0F, new Dilation(0.0F))
        .uv(16, -3).cuboid(0.0F, -8.5F, -1.5F, 0.0F, 17.0F, 3.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData shockwave_pos = vfx.addChild("shockwave_pos", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData shockwave = shockwave_pos.addChild("shockwave", ModelPartBuilder.create().uv(11, 18).cuboid(-3.675F, -8.0F, -1.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F))
        .uv(0, 11).mirrored().cuboid(8.012F, -3.315F, -1.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)).mirrored(false)
        .uv(-2, 11).cuboid(-3.675F, 7.999F, -1.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F))
        .uv(0, 11).cuboid(-7.988F, -3.314F, -1.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r1 = shockwave.addChild("cube_r1", ModelPartBuilder.create().uv(0, 11).cuboid(0.001F, -6.627F, -2.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-7.9887F, -3.3147F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData cube_r2 = shockwave.addChild("cube_r2", ModelPartBuilder.create().uv(-2, 11).cuboid(-7.0F, -0.001F, -2.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.3034F, 7.9994F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData cube_r3 = shockwave.addChild("cube_r3", ModelPartBuilder.create().uv(0, 11).mirrored().cuboid(-0.001F, 0.0F, -2.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(8.0124F, 3.3134F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData cube_r4 = shockwave.addChild("cube_r4", ModelPartBuilder.create().uv(11, 18).cuboid(-0.373F, 0.001F, -2.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.325F, -8.001F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData shockwave_pos2 = vfx.addChild("shockwave_pos2", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData shockwave2 = shockwave_pos2.addChild("shockwave2", ModelPartBuilder.create().uv(11, 18).cuboid(-3.675F, -8.0F, -1.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F))
        .uv(0, 11).mirrored().cuboid(8.012F, -3.315F, -1.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)).mirrored(false)
        .uv(-2, 11).cuboid(-3.675F, 7.999F, -1.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F))
        .uv(0, 11).cuboid(-7.988F, -3.314F, -1.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r5 = shockwave2.addChild("cube_r5", ModelPartBuilder.create().uv(0, 11).cuboid(0.001F, -6.627F, -2.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-7.9887F, -3.3147F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData cube_r6 = shockwave2.addChild("cube_r6", ModelPartBuilder.create().uv(-2, 11).cuboid(-7.0F, -0.001F, -2.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.3034F, 7.9994F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData cube_r7 = shockwave2.addChild("cube_r7", ModelPartBuilder.create().uv(0, 11).mirrored().cuboid(-0.001F, 0.0F, -2.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(8.0124F, 3.3134F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData cube_r8 = shockwave2.addChild("cube_r8", ModelPartBuilder.create().uv(11, 18).cuboid(-0.373F, 0.001F, -2.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.325F, -8.001F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData shockwave_pos3 = vfx.addChild("shockwave_pos3", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData shockwave3 = shockwave_pos3.addChild("shockwave3", ModelPartBuilder.create().uv(11, 18).cuboid(-3.675F, -8.0F, -1.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F))
        .uv(0, 11).mirrored().cuboid(8.012F, -3.315F, -1.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)).mirrored(false)
        .uv(-2, 11).cuboid(-3.675F, 7.999F, -1.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F))
        .uv(0, 11).cuboid(-7.988F, -3.314F, -1.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r9 = shockwave3.addChild("cube_r9", ModelPartBuilder.create().uv(0, 11).cuboid(0.001F, -6.627F, -2.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-7.9887F, -3.3147F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData cube_r10 = shockwave3.addChild("cube_r10", ModelPartBuilder.create().uv(-2, 11).cuboid(-7.0F, -0.001F, -2.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.3034F, 7.9994F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData cube_r11 = shockwave3.addChild("cube_r11", ModelPartBuilder.create().uv(0, 11).mirrored().cuboid(-0.001F, 0.0F, -2.0F, 0.0F, 6.627F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(8.0124F, 3.3134F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData cube_r12 = shockwave3.addChild("cube_r12", ModelPartBuilder.create().uv(11, 18).cuboid(-0.373F, 0.001F, -2.0F, 7.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.325F, -8.001F, 1.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData body_root = watchmanRoot.addChild("body_root", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData body = body_root.addChild("body", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -28.0F, 0.0F));

        ModelPartData torso = body.addChild("torso", ModelPartBuilder.create().uv(44, 50).cuboid(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData h_head = torso.addChild("h_head", ModelPartBuilder.create().uv(36, 15).cuboid(-4.0F, -9.0F, -4.0F, 8.0F, 9.0F, 8.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, -12.0F, 0.0F));

        ModelPartData cube_r13 = h_head.addChild("cube_r13", ModelPartBuilder.create().uv(32, 0).cuboid(-10.0F, -6.0F, 1.0F, 18.0F, 15.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-10.6257F, -10.9092F, -3.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData cube_r14 = h_head.addChild("cube_r14", ModelPartBuilder.create().uv(48, 33).mirrored().cuboid(-8.0F, -2.0F, 0.0F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-4.0F, -6.0F, -3.0F, 0.0F, 0.0F, 0.3927F));

        ModelPartData cube_r15 = h_head.addChild("cube_r15", ModelPartBuilder.create().uv(32, 0).mirrored().cuboid(-8.0F, -6.0F, 1.0F, 18.0F, 15.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(10.6257F, -10.9092F, -3.0F, 0.0F, 0.0F, -0.7854F));

        ModelPartData cube_r16 = h_head.addChild("cube_r16", ModelPartBuilder.create().uv(48, 33).cuboid(0.0F, -2.0F, 0.0F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -6.0F, -3.0F, 0.0F, 0.0F, -0.3927F));

        ModelPartData h_left_eyelid = h_head.addChild("h_left_eyelid", ModelPartBuilder.create().uv(60, 20).cuboid(-1.0F, 0.75F, -0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.75F)), ModelTransform.origin(2.5F, -5.25F, -2.75F));

        ModelPartData h_right_eyelid = h_head.addChild("h_right_eyelid", ModelPartBuilder.create().uv(60, 20).mirrored().cuboid(-1.0F, 0.75F, -0.75F, 2.0F, 2.0F, 1.0F, new Dilation(0.75F)).mirrored(false), ModelTransform.origin(-2.5F, -5.25F, -2.75F));

        ModelPartData h_left_eye_glare = h_head.addChild("h_left_eye_glare", ModelPartBuilder.create().uv(28, 15).cuboid(0.0F, -2.0F, 0.0F, 8.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(3.0F, -2.0F, -4.025F));

        ModelPartData h_right_eye_glare = h_head.addChild("h_right_eye_glare", ModelPartBuilder.create().uv(28, 15).mirrored().cuboid(-8.0F, -2.0F, 0.0F, 8.0F, 2.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.origin(-3.0F, -2.0F, -4.025F));

        ModelPartData left_arm = torso.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.origin(4.0F, -11.0F, 0.0F));

        ModelPartData left_arm_rot = left_arm.addChild("left_arm_rot", ModelPartBuilder.create().uv(36, 67).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 14.0F, 2.0F, new Dilation(0.01F)), ModelTransform.origin(1.0F, -1.0F, 0.0F));

        ModelPartData left_elbow = left_arm_rot.addChild("left_elbow", ModelPartBuilder.create().uv(44, 67).cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 14.0F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 14.0F, 1.0F));

        ModelPartData lantern = left_elbow.addChild("lantern", ModelPartBuilder.create().uv(1, 18).cuboid(-1.5F, 2.5F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
        .uv(0, 0).cuboid(-1.5F, 0.5F, 0.0F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F))
        .uv(28, 18).cuboid(-1.5F, 7.5F, -1.5F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
        .uv(7, 0).cuboid(1.5F, 3.0F, 0.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
        .uv(7, 0).cuboid(-2.5F, 3.0F, 0.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 13.0F, -1.0F));

        ModelPartData end_crystal_lantern = lantern.addChild("end_crystal_lantern", ModelPartBuilder.create().uv(0, 3).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 5.5F, 0.0F));

        ModelPartData end_crystal_lantern2 = lantern.addChild("end_crystal_lantern2", ModelPartBuilder.create().uv(0, 7).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 5.5F, 0.0F));

        ModelPartData right_arm = torso.addChild("right_arm", ModelPartBuilder.create().uv(36, 67).mirrored().cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 14.0F, 2.0F, new Dilation(0.01F)).mirrored(false), ModelTransform.origin(-4.0F, -11.0F, 0.0F));

        ModelPartData right_elbow = right_arm.addChild("right_elbow", ModelPartBuilder.create().uv(44, 67).mirrored().cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 14.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.origin(-1.0F, 13.0F, 1.0F));

        ModelPartData left_shoulder_plate = torso.addChild("left_shoulder_plate", ModelPartBuilder.create(), ModelTransform.origin(5.5F, -11.5F, 0.0F));

        ModelPartData cube_r17 = left_shoulder_plate.addChild("cube_r17", ModelPartBuilder.create().uv(52, 38).mirrored().cuboid(-1.5F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        ModelPartData right_shoulder_plate = torso.addChild("right_shoulder_plate", ModelPartBuilder.create(), ModelTransform.origin(-5.5F, -11.5F, 0.0F));

        ModelPartData cube_r18 = right_shoulder_plate.addChild("cube_r18", ModelPartBuilder.create().uv(52, 38).cuboid(-1.5F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData right_leg = body.addChild("right_leg", ModelPartBuilder.create().uv(60, 67).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 14.0F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(-2.0F, 0.0F, 0.0F));

        ModelPartData right_knee = right_leg.addChild("right_knee", ModelPartBuilder.create().uv(52, 67).cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 14.0F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 14.0F, -1.0F));

        ModelPartData left_leg = body.addChild("left_leg", ModelPartBuilder.create().uv(60, 67).mirrored().cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 14.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.origin(2.0F, 0.0F, 0.0F));

        ModelPartData left_knee = left_leg.addChild("left_knee", ModelPartBuilder.create().uv(52, 67).mirrored().cuboid(-1.0F, 0.0F, 0.0F, 2.0F, 14.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.origin(0.0F, 14.0F, -1.0F));

        ModelPartData capes = body_root.addChild("capes", ModelPartBuilder.create(), ModelTransform.origin(0.0F, -40.0F, 2.0F));

        ModelPartData cape = capes.addChild("cape", ModelPartBuilder.create().uv(20, 34).cuboid(-5.0F, 0.0F, -1.0F, 10.0F, 20.0F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 0.0F, 0.0F));

        ModelPartData lower_cape = cape.addChild("lower_cape", ModelPartBuilder.create().uv(11, 57).cuboid(-5.5F, 0.0F, -0.5F, 11.0F, 20.0F, 1.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 20.0F, 0.0F));

        ModelPartData right_cape = capes.addChild("right_cape", ModelPartBuilder.create().uv(0, 23).cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 18.0F, 4.0F, new Dilation(0.0F)), ModelTransform.origin(-6.0F, 2.0F, -2.0F));

        ModelPartData right_lower_cape = right_cape.addChild("right_lower_cape", ModelPartBuilder.create().uv(0, 45).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 20.0F, 4.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 18.0F, -2.0F));

        ModelPartData left_cape = capes.addChild("left_cape", ModelPartBuilder.create().uv(0, 23).mirrored().cuboid(-1.0F, 0.0F, -2.0F, 2.0F, 18.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.origin(6.0F, 2.0F, -2.0F));

        ModelPartData left_lower_cape = left_cape.addChild("left_lower_cape", ModelPartBuilder.create().uv(0, 45).mirrored().cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 20.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.origin(0.0F, 18.0F, -2.0F));

        ModelPartData ground_cape = capes.addChild("ground_cape", ModelPartBuilder.create().uv(53, 0).cuboid(-7.0F, 0.0F, 0.0F, 14.0F, 0.0F, 16.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 39.75F, -1.5F));

        return TexturedModelData.of(meshDefinition, 128, 128);
    }

    @Override
    public void setAngles(Watchman state) {
        super.setAngles(state);
        float age = state.age;

        if (state.deathTime > 0) {
            watchman.pitch = MathHelper.lerp(0.1F, watchman.pitch, 0);
            watchman.yaw = MathHelper.lerp(0.1F, watchman.yaw, 0);
            watchman.roll = MathHelper.lerp(0.1F, watchman.roll, 0);
            deathAnimation.apply(state.deathAnimationState, age);
            return;
        }

        idleAnimation.apply(state.idleAnimationState, age);
        walkAnimation.apply(state.walkAnimationState, age);
        lanternSmackAnimation.apply(state.lanternSmackAnimationState, age);
        summonWraithsAnimation.apply(state.summonWraithsAnimationState, age);
        lanternPushAnimation.apply(state.lanternPushAnimationState, age);

        hHead.pitch += (state.getPitch() * (MathHelper.PI / 180)) / 2;
        hHead.yaw += (EntityValueExtraction.getRelativeHeadYaw(state) * (MathHelper.PI / 180)) / 2;
    }
}
