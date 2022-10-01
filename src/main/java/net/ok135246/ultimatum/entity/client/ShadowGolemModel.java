package net.ok135246.ultimatum.entity.client;

import net.minecraft.util.Identifier;
import net.ok135246.ultimatum.Ultimatum;
import net.ok135246.ultimatum.entity.custom.ShadowGolemEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ShadowGolemModel extends AnimatedGeoModel<ShadowGolemEntity> {
    @Override
    public Identifier getModelResource(ShadowGolemEntity object) {
        return new Identifier(Ultimatum.MOD_ID, "geo/shadow_golem.geo.json");
    }

    @Override
    public Identifier getTextureResource(ShadowGolemEntity object) {
        return new Identifier(Ultimatum.MOD_ID, "textures/entity/shadow_golem.png");
    }

    @Override
    public Identifier getAnimationResource(ShadowGolemEntity animatable) {
        return new Identifier(Ultimatum.MOD_ID, "animations/shadow_golem.animation.json");
    }
}
