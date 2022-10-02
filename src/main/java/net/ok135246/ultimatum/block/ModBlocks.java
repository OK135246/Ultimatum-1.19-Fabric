package net.ok135246.ultimatum.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ok135246.ultimatum.Ultimatum;
import net.ok135246.ultimatum.block.custom.UltimateCraftingTableBlock;
import net.ok135246.ultimatum.item.ModItemGroup;

public class ModBlocks {
    public static final Block NECRONIUM_ESSENCE = registerBlock("necronium_essence",
            new Block(FabricBlockSettings.of(Material.STONE).strength(25f).requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)), ModItemGroup.ULTIMATUM);
    public static final Block NECRONIUM_BLOCK = registerBlock("necronium_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(35f).requiresTool().sounds(BlockSoundGroup.NETHERITE)), ModItemGroup.ULTIMATUM);

    public static final Block ULTIMATE_BLOCK = registerBlock("ultimate_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(60f).requiresTool().sounds(BlockSoundGroup.NETHERITE)), ModItemGroup.ULTIMATUM);

    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(10f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)), ModItemGroup.ULTIMATUM);
    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(10f).requiresTool().sounds(BlockSoundGroup.STONE)), ModItemGroup.ULTIMATUM);
    public static final Block DEEPSLATE_MITHRIL_ORE = registerBlock("deepslate_mithril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(15f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.ULTIMATUM);

    public static final Block ENCHANTED_NETHERITE_BLOCK = registerBlock("enchanted_netherite_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(10f).requiresTool().sounds(BlockSoundGroup.NETHERITE)), ModItemGroup.ULTIMATUM);

    public static final Block VYBRANTHYM_BLOCK = registerBlock("vybranthym_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(15f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)), ModItemGroup.ULTIMATUM);
    public static final Block VYBRANTHYM_ORE = registerBlock("vybranthym_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(17f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.ULTIMATUM);

    public static final Block ULTIMATE_CRAFTING_TABLE = registerBlock("ultimate_crafting_table",
            new UltimateCraftingTableBlock(FabricBlockSettings.of(Material.STONE).strength(10f).requiresTool().sounds(BlockSoundGroup.NETHERITE)), ModItemGroup.ULTIMATUM);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Ultimatum.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Ultimatum.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Ultimatum.LOGGER.debug("Registering ModBlocks for" + Ultimatum.MOD_ID);
    }
}
