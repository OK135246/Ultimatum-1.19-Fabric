package net.ok135246.ultimatum.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ok135246.ultimatum.Ultimatum;
import net.ok135246.ultimatum.entity.custom.ShadowCreeperEntity;
import net.ok135246.ultimatum.entity.custom.ShadowGolemEntity;

public class ModEntities {
    public static final EntityType<ShadowGolemEntity> SHADOW_GOLEM = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Ultimatum.MOD_ID, "shadow_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ShadowGolemEntity::new)
                    .dimensions(EntityDimensions.fixed(1f,2.5f)).build());

    public static final EntityType<ShadowCreeperEntity> SHADOW_CREEPER = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Ultimatum.MOD_ID, "shadow_creeper"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ShadowCreeperEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f,1.8f)).build());
}
