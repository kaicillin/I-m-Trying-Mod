package noidea.trying.client.entity;
// For anyone reading this code, I'm sorry
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import noidea.trying.Trying;
import noidea.trying.entity.custom.WhirlybirdEntity;

public class WhirlybirdRenderer extends MobEntityRenderer<WhirlybirdEntity, WhirlybirdRenderState, WhirlybirdModel> {

    public WhirlybirdRenderer(EntityRendererFactory.Context context) {
        super(context, new WhirlybirdModel(context.getPart(WhirlybirdModel.WHIRLYBIRD)), 0.75f);
        System.out.println("THe rendered is being made. IT HAD BETTER BE FUNCTIONAL!!!" + context.getPart(WhirlybirdModel.WHIRLYBIRD));
        System.out.println("WhirlybirdModel loaded successfully.");

    }

    @Override
    public WhirlybirdRenderState createRenderState() {
        return new WhirlybirdRenderState();
    }

    @Override
    public void render(WhirlybirdRenderState livingEntityRenderState, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(livingEntityRenderState, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(WhirlybirdRenderState state) {
        //return Identifier.of("trying", "textures/entity/whirlybird.png");
        return Identifier.of("minecraft", "textures/entity/chicken.png");
        //return Identifier.of(Trying.MOD_ID, "textures/entity/whirlybird.png");
    }

    @Override
    public void updateRenderState(WhirlybirdEntity livingEntity, WhirlybirdRenderState livingEntityRenderState, float f) {
        super.updateRenderState(livingEntity, livingEntityRenderState, f);
        livingEntityRenderState.idleAnimationState.copyFrom(livingEntity.idleAnimationState);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        System.out.println("Model Data: " + modelData);  // Debug line
        return TexturedModelData.of(modelData, 29, 29); // Texture size should match your model's texture
    }
}
