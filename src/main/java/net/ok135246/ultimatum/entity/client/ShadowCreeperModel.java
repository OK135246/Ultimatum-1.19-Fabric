package net.ok135246.ultimatum.entity.client;

import net.minecraft.util.Identifier;
import net.ok135246.ultimatum.Ultimatum;
import net.ok135246.ultimatum.entity.custom.ShadowCreeperEntity;
import net.ok135246.ultimatum.entity.custom.ShadowGolemEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ShadowCreeperModel extends AnimatedGeoModel<ShadowCreeperEntity> {

    @Override
    public Identifier getModelResource(ShadowCreeperEntity object) {
        return new Identifier(Ultimatum.MOD_ID, "geo/shadow_creeper.geo.json");
    }

    @Override
    public Identifier getTextureResource(ShadowCreeperEntity object) {
        return new Identifier(Ultimatum.MOD_ID, "textures/entity/shadow_creeper.png");
    }

    @Override
    public Identifier getAnimationResource(ShadowCreeperEntity animatable) {
        return new Identifier(Ultimatum.MOD_ID, "animations/shadow_creeper.animation.json");
    }
}
