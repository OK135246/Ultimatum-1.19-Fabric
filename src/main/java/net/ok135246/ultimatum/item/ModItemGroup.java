package net.ok135246.ultimatum.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.ok135246.ultimatum.Ultimatum;

public class ModItemGroup {
    public static final ItemGroup ULTIMATUM = FabricItemGroupBuilder.build(
            new Identifier(Ultimatum.MOD_ID, "ultimatum"), () -> new ItemStack(ModItems.NECRONIUM_DUST));

}
