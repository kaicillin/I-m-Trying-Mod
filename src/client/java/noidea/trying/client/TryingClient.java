package noidea.trying.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.particle.EndRodParticle;

import net.minecraft.client.particle.FireflyParticle;
import net.minecraft.client.render.RenderLayer;
import noidea.trying.Trying;
import noidea.trying.block.ModBlocks;
import noidea.trying.entity.ModEntities;
import noidea.trying.client.entity.WhirlybirdModel;
import noidea.trying.client.entity.WhirlybirdRenderer;

public class TryingClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(Trying.LE_PARTICLES, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(Trying.LE_APIS, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(Trying.REGINA_APIS, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(Trying.INNOCENS_ANIMA, FireflyParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(Trying.PERFECTUM_ANIMA, FireflyParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(Trying.ASCENDENS_ANIMA, FireflyParticle.Factory::new);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WATER_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEST_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TWO_BLOCK, RenderLayer.getCutout());

        System.out.println("Registering Whirlybird renderer...");

        EntityModelLayerRegistry.registerModelLayer(WhirlybirdModel.WHIRLYBIRD, WhirlybirdModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.WHIRLYBIRD, WhirlybirdRenderer::new);
        EntityRendererRegistry.register(
                ModEntities.WHIRLYBIRD,
                context -> {
                    System.out.println("Renderer is being created");
                    return new WhirlybirdRenderer(context);
                }
        );
    }
}
