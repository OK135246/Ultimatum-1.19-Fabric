package net.ok135246.ultimatum.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ok135246.ultimatum.Ultimatum;
import net.ok135246.ultimatum.entity.custom.ShadowGolemEntity;
import net.ok135246.ultimatum.world.dimension.ModDimensions;

public class ModEntities {
    public static final EntityType<ShadowGolemEntity> SHADOW_GOLEM = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Ultimatum.MOD_ID, "shadow_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ShadowGolemEntity::new)
                    .dimensions(EntityDimensions.fixed(1f,2f)).build());
}
