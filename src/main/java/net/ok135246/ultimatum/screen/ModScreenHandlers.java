package net.ok135246.ultimatum.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ok135246.ultimatum.Ultimatum;

public class ModScreenHandlers {
    public static ScreenHandlerType<UltimateCraftingTableScreenHandler> ULTIMATE_CRAFTING_TABLE_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        ULTIMATE_CRAFTING_TABLE_SCREEN_HANDLER = new ScreenHandlerType<>(UltimateCraftingTableScreenHandler::new);
    }
}
