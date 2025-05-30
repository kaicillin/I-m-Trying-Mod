package noidea.trying;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import noidea.trying.block.ModBlocks;
import noidea.trying.command.TryingCommands;
import noidea.trying.entity.ModEntities;
import noidea.trying.entity.custom.WhirlybirdEntity;
import noidea.trying.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;

public class Trying implements ModInitializer {
    public static final String MOD_ID = "trying";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // This DefaultParticleType gets called when you want to use your particle in code.
    public static final SimpleParticleType LE_PARTICLES = FabricParticleTypes.simple();
    public static final SimpleParticleType LE_APIS = FabricParticleTypes.simple();
    public static final SimpleParticleType REGINA_APIS = FabricParticleTypes.simple();
    public static final SimpleParticleType INNOCENS_ANIMA = FabricParticleTypes.simple();
    public static final SimpleParticleType ASCENDENS_ANIMA = FabricParticleTypes.simple();
    public static final SimpleParticleType PERFECTUM_ANIMA = FabricParticleTypes.simple();



    @Override
    public void onInitialize() {
        LOGGER.info("This mod is running. I THINK.");
        ModItems.initialize();
        ModBlocks.initialize();


        // Register our custom particle type in the mod initializer.
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "le_particles"), LE_PARTICLES);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "le_apis"), LE_APIS);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "regina_apis"), REGINA_APIS);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "ascendens_anima"), ASCENDENS_ANIMA);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "innocens_anima"), INNOCENS_ANIMA);
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "perfectum_anima"), PERFECTUM_ANIMA);

        ModEntities.registerModEntities();

        FabricDefaultAttributeRegistry.register(ModEntities.WHIRLYBIRD, WhirlybirdEntity.createAttributes());
    }
}