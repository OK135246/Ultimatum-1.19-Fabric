package net.ok135246.ultimatum.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ok135246.ultimatum.Ultimatum;
import net.ok135246.ultimatum.block.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<UltimateCraftingTableEntity> ULTIMATE_CRAFTING_TABLE;

    public static void registerBlockEntities() {
        ULTIMATE_CRAFTING_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Ultimatum.MOD_ID, "ultimate_crafting_table"),
                FabricBlockEntityTypeBuilder.create(UltimateCraftingTableEntity::new,
                        ModBlocks.ULTIMATE_CRAFTING_TABLE).build(null));
    }
}
