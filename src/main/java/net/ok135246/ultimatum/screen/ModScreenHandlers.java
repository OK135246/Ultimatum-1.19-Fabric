package net.ok135246.ultimatum.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ok135246.ultimatum.Ultimatum;

public class ModScreenHandlers {
    public static ScreenHandlerType<UltimateCraftingTableScreenHandler> ULTIMATE_CRAFTING_TABLE_SCREEN_HANDLER =
            Registry.register(Registry.SCREEN_HANDLER, new Identifier(Ultimatum.MOD_ID, "ultimate_crafting_table"),
                    new ScreenHandlerType<>(UltimateCraftingTableScreenHandler::new));
}
