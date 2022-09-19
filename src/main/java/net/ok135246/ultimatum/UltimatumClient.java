package net.ok135246.ultimatum;

import net.fabricmc.api.ClientModInitializer;
import net.ok135246.ultimatum.util.ModModelPredicateProvider;

public class UltimatumClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}
