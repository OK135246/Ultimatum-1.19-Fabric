package net.ok135246.ultimatum;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.ok135246.ultimatum.entity.ModEntities;
import net.ok135246.ultimatum.entity.client.ShadowCreeperRenderer;
import net.ok135246.ultimatum.entity.client.ShadowGolemRenderer;
import net.ok135246.ultimatum.screen.ModScreenHandlers;
import net.ok135246.ultimatum.screen.UltimateCraftingTableScreen;
import net.ok135246.ultimatum.util.ModModelPredicateProvider;

public class UltimatumClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();

        HandledScreens.register(ModScreenHandlers.ULTIMATE_CRAFTING_TABLE_SCREEN_HANDLER, UltimateCraftingTableScreen::new);

        EntityRendererRegistry.register(ModEntities.SHADOW_GOLEM, ShadowGolemRenderer::new);
        EntityRendererRegistry.register(ModEntities.SHADOW_CREEPER, ShadowCreeperRenderer::new);
    }
}
