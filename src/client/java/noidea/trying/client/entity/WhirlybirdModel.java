package noidea.trying.client.entity;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import noidea.trying.Trying;
// For anyone reading this code, I'm sorry
// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class WhirlybirdModel extends EntityModel<WhirlybirdRenderState> {
    public static final EntityModelLayer WHIRLYBIRD = new EntityModelLayer(Identifier.of(Trying.MOD_ID, "whirlybird"), "main");


    private final ModelPart bodyBase;
    private final ModelPart body4;
    private final ModelPart body3;
    private final ModelPart body2;
    private final ModelPart bodyChest;
    private final ModelPart wingR;
    private final ModelPart bone12;
    private final ModelPart wingL;
    private final ModelPart bone11;
    private final ModelPart tail;
    private final ModelPart head;
    private final ModelPart eyes;

    public WhirlybirdModel(ModelPart root) {
        super(root);
        this.bodyBase = root.getChild("bodyBase");
        this.body4 = this.bodyBase.getChild("body4");
        this.body3 = this.body4.getChild("body3");
        this.body2 = this.body3.getChild("body2");
        this.bodyChest = this.body2.getChild("bodyChest");
        this.wingR = this.bodyChest.getChild("wingR");
        this.bone12 = this.wingR.getChild("bone12");
        this.wingL = this.bodyChest.getChild("wingL");
        this.bone11 = this.wingL.getChild("bone11");
        this.tail = this.bodyBase.getChild("tail");
        this.head = this.bodyBase.getChild("head");
        this.eyes = this.head.getChild("eyes");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        //(old version, updating everything else) ModelPartData bodyBase = modelPartData.addChild("bodyBase", ModelPartBuilder.create(), ModelTransform.pivot(0.7439F, 23.5197F, 0.0F));
        ModelPartData bodyBase = modelPartData.addChild("bodyBase", ModelPartBuilder.create(), new ModelTransform(0.7439F, 23.5197F, 0.0F, 0F, 0F, 0F, 0F, 0f, 0F));

        ModelPartData cube_r1 = bodyBase.addChild("cube_r1", ModelPartBuilder.create().uv(4, 24).cuboid(-0.4249F, -0.1401F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.8326F));

        ModelPartData body4 = bodyBase.addChild("body4", ModelPartBuilder.create(), new ModelTransform(-0.175F, 0.2251F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F));

        ModelPartData cube_r2 = body4.addChild("cube_r2", ModelPartBuilder.create().uv(20, 5).cuboid(-0.4603F, -0.1688F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0472F));

        ModelPartData body3 = body4.addChild("body3", ModelPartBuilder.create(), new ModelTransform(1.425F, -0.65F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F));

        ModelPartData cube_r3 = body3.addChild("cube_r3", ModelPartBuilder.create().uv(20, 0).cuboid(-0.2671F, -0.1307F, -1.5F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.25F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

        ModelPartData body2 = body3.addChild("body2", ModelPartBuilder.create(), new ModelTransform(0.425F, -1.65F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F));

        ModelPartData cube_r4 = body2.addChild("cube_r4", ModelPartBuilder.create().uv(10, 18).cuboid(-0.7917F, -0.2447F, -2.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, -1.75F, 0.0F, 0.0F, 0.0F, -0.5236F));

        ModelPartData bodyChest = body2.addChild("bodyChest", ModelPartBuilder.create(), new ModelTransform(-0.7849F, -1.6278F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F));

        ModelPartData cube_r5 = bodyChest.addChild("cube_r5", ModelPartBuilder.create().uv(0, 18).cuboid(-0.6131F, 0.2881F, -2.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-1.809F, -1.242F, 0.0F, 0.0F, 0.0F, -1.0472F));

        ModelPartData wingR = bodyChest.addChild("wingR", ModelPartBuilder.create(), new ModelTransform(-0.134F, -0.042F, -1.25F,0F, 0F, 0F, 0F, 0F, 0F));

        ModelPartData cube_r6 = wingR.addChild("cube_r6", ModelPartBuilder.create().uv(20, 18).cuboid(-0.5629F, -7.245F, -0.6472F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, -1.2217F));

        ModelPartData bone12 = wingR.addChild("bone12", ModelPartBuilder.create(), new ModelTransform(-2.7651F, 0.0605F, -1.933F, 0F, 0F, 0F, 0F, 0F, 0F));

        ModelPartData cube_r7 = bone12.addChild("cube_r7", ModelPartBuilder.create().uv(10, 24).cuboid(-0.2349F, -3.5855F, 0.183F, 1.0F, 7.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, -1.2217F));

        ModelPartData cube_r8 = bone12.addChild("cube_r8", ModelPartBuilder.create().uv(18, 24).cuboid(-0.0487F, -2.8817F, 0.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.1862F, 1.0462F, 0.25F, 0.5236F, 0.0F, -1.2217F));

        ModelPartData wingL = bodyChest.addChild("wingL", ModelPartBuilder.create(), new ModelTransform(-0.134F, -0.067F, 1.65F, 0F, 0F, 0F, 0F, 0F, 0F));

        ModelPartData cube_r9 = wingL.addChild("cube_r9", ModelPartBuilder.create().uv(0, 24).cuboid(-0.5864F, -7.0376F, -0.6949F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, -1.2217F));

        ModelPartData bone11 = wingL.addChild("bone11", ModelPartBuilder.create(), new ModelTransform(-2.75F, 0.0F, 1.85F, 0F, 0F, 0F, 0F, 0F, 0F));

        ModelPartData cube_r10 = bone11.addChild("cube_r10", ModelPartBuilder.create().uv(12, 24).cuboid(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, -1.2217F));

        ModelPartData cube_r11 = bone11.addChild("cube_r11", ModelPartBuilder.create().uv(24, 18).cuboid(-0.5F, -1.5F, -0.5F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.75F, 0.5F, 0.25F, -0.5236F, 0.0F, -1.2217F));

        ModelPartData tail = bodyBase.addChild("tail", ModelPartBuilder.create(), new ModelTransform(-1.7F, -0.35F, 0.0F , 0F, 0F, 0F, 0F, 0F, 0F));

        ModelPartData cube_r12 = tail.addChild("cube_r12", ModelPartBuilder.create().uv(14, 24).cuboid(-0.5685F, -0.2313F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.618F));

        ModelPartData head = bodyBase.addChild("head", ModelPartBuilder.create(), new ModelTransform(-0.9189F, -4.9018F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F));

        ModelPartData head_r1 = head.addChild("head_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-4.5604F, -4.198F, -2.5F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-0.006F, -0.2366F, 0.0F, 0.0F, 0.0F, 1.0036F));

        ModelPartData eyes = head.addChild("eyes", ModelPartBuilder.create(), new ModelTransform(1.494F, -2.9271F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F));

        ModelPartData pupil_r1 = eyes.addChild("pupil_r1", ModelPartBuilder.create().uv(16, 10).cuboid(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(0.0772F, -0.0595F, 0.0F, 0.0F, 0.0F, 1.2654F));

        ModelPartData eye_r1 = eyes.addChild("eye_r1", ModelPartBuilder.create().uv(0, 10).cuboid(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-0.0772F, 0.0595F, 0.0F, 0.0F, 0.0F, 0.2182F));
        return TexturedModelData.of(modelData, 32, 32);
    }
    @Override
    public void setAngles(WhirlybirdRenderState whirlybirdRenderState) {
        super.setAngles(whirlybirdRenderState);

        this.animate(whirlybirdRenderState.idleAnimationState, WhirlybirdAnimation.IDLE, whirlybirdRenderState.age, 1F);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }
}