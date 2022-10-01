package net.ok135246.ultimatum.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.ok135246.ultimatum.Ultimatum;
import net.ok135246.ultimatum.entity.custom.ShadowGolemEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ShadowGolemRenderer extends GeoEntityRenderer<ShadowGolemEntity> {
    public ShadowGolemRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ShadowGolemModel());
        this.shadowRadius = 1f;
    }

    @Override
    public Identifier getTextureResource(ShadowGolemEntity entity) {
        return new Identifier(Ultimatum.MOD_ID, "textures/entity/shadow_golem.png");
    }

    @Override
    public RenderLayer getRenderType(ShadowGolemEntity animatable, float partialTicks, MatrixStack stack,
                                     @Nullable VertexConsumerProvider renderTypeBuffer, @Nullable VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {



        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
