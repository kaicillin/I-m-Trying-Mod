package noidea.trying.entity;
// For anyone reading this code, I'm sorry
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import noidea.trying.Trying;
import noidea.trying.entity.custom.WhirlybirdEntity;

public class ModEntities {

    private static final RegistryKey<EntityType<?>> WHIRLYBIRD_KEY =
            RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(Trying.MOD_ID, "whirlybird"));

    public static final EntityType<WhirlybirdEntity> WHIRLYBIRD = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Trying.MOD_ID, "whirlybird"),
            EntityType.Builder.create(WhirlybirdEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.5f).build(WHIRLYBIRD_KEY));

    public static void registerModEntities() {
        Trying.LOGGER.info("MODDED ENTITIES ARE BEING REGISTERED FOR" + Trying.MOD_ID);
    }
}
