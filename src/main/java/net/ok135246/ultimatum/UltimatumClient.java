package net.ok135246.ultimatum;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.ok135246.ultimatum.screen.ModScreenHandlers;
import net.ok135246.ultimatum.screen.UltimateCraftingTableScreen;
import net.ok135246.ultimatum.util.ModModelPredicateProvider;

public class UltimatumClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
        
        HandledScreens.register(ModScreenHandlers.ULTIMATE_CRAFTING_TABLE_SCREEN_HANDLER, UltimateCraftingTableScreen::new);
    }
}
