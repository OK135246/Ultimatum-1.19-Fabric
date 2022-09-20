package net.ok135246.ultimatum.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;

import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.ok135246.ultimatum.Ultimatum;
import net.ok135246.ultimatum.item.custom.*;

public class ModItems {

    public static final Item NECRONIUM_DUST = registerItem("necronium_dust",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item NECRONIUM_INGOT = registerItem("necronium_ingot",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item NECRONIUM_STICK = registerItem("necronium_stick",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item NECRONIUM_HEART = registerItem("necronium_heart",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));

    public static final Item ULTIMATE_DUST = registerItem("ultimate_dust",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item ULTIMATE_CATALYST = registerItem("ultimate_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item ULTIMATE_INGOT = registerItem("ultimate_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));

    public static final Item ULTIMATE_SWORD = registerItem("ultimate_sword",
            new SwordItem(ModToolMaterials.ULTIMATE, 899, -2.3f,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item ULTIMATE_AXE = registerItem("ultimate_axe",
            new ModAxeItem(ModToolMaterials.ULTIMATE, 400, -2.7f,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item ULTIMATE_PICKAXE = registerItem("ultimate_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ULTIMATE, 200, -2.4f,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item ULTIMATE_SHOVEL = registerItem("ultimate_shovel",
            new ShovelItem(ModToolMaterials.ULTIMATE, 150, -2.5f,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item ULTIMATE_HOE = registerItem("ultimate_hoe",
            new ModHoeItem(ModToolMaterials.ULTIMATE, 100, -1.5f,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item ULTIMATE_BOW = registerItem("ultimate_bow",
            new UltimateBowItem(new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM).maxDamage(2147483647)));
    public static final Item ULTIMATE_HELMET = registerItem("ultimate_helmet",
            new UltimateArmorItem(ModArmorMaterials.ULTIMATE, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item ULTIMATE_CHESTPLATE = registerItem("ultimate_chestplate",
            new ArmorItem(ModArmorMaterials.ULTIMATE, EquipmentSlot.CHEST,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item ULTIMATE_LEGGINGS = registerItem("ultimate_leggings",
            new ArmorItem(ModArmorMaterials.ULTIMATE, EquipmentSlot.LEGS,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item ULTIMATE_BOOTS = registerItem("ultimate_boots",
            new ArmorItem(ModArmorMaterials.ULTIMATE, EquipmentSlot.FEET,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));


    public static final Item WOODEN_CATALYST = registerItem("wooden_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.ULTIMATUM)));
    public static final Item STONE_CATALYST = registerItem("stone_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.ULTIMATUM)));
    public static final Item COAL_CATALYST = registerItem("coal_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.ULTIMATUM)));
    public static final Item COPPER_CATALYST = registerItem("copper_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.ULTIMATUM)));
    public static final Item IRON_CATALYST = registerItem("iron_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.ULTIMATUM)));
    public static final Item REDSTONE_CATALYST = registerItem("redstone_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.ULTIMATUM)));
    public static final Item LAPIS_CATALYST = registerItem("lapis_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.ULTIMATUM)));
    public static final Item DIAMOND_CATALYST = registerItem("diamond_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.ULTIMATUM)));
    public static final Item NETHERITE_CATALYST = registerItem("netherite_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item NETHER_STAR_CATALYST = registerItem("nether_star_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item MITHRIL_CATALYST = registerItem("mithril_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item DRAGON_CATALYST = registerItem("dragon_catalyst",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));

    public static final Item ENCHANTED_NETHERITE_APPLE = registerItem("enchanted_netherite_apple",
            (new EnchantedNetheriteAppleItem((new Item.Settings()).group(ModItemGroup.ULTIMATUM).rarity(Rarity.EPIC).food(ModFoodComponents.ENCHANTED_NETHERITE_APPLE))));

    public static final Item STONE_STICK = registerItem("stone_stick",
            new Item(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.ULTIMATUM)));
    public static final Item COAL_STICK = registerItem("coal_stick",
            new Item(new FabricItemSettings().rarity(Rarity.COMMON).group(ModItemGroup.ULTIMATUM)));
    public static final Item COPPER_STICK = registerItem("copper_stick",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.ULTIMATUM)));
    public static final Item IRON_STICK = registerItem("iron_stick",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.ULTIMATUM)));
    public static final Item REDSTONE_STICK = registerItem("redstone_stick",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.ULTIMATUM)));
    public static final Item LAPIS_STICK = registerItem("lapis_stick",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.ULTIMATUM)));
    public static final Item DIAMOND_STICK = registerItem("diamond_stick",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item NETHERITE_STICK = registerItem("netherite_stick",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item NETHER_STAR_STICK = registerItem("nether_star_stick",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item MITHRIL_STICK = registerItem("mithril_stick",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));
    public static final Item DRAGON_STICK = registerItem("dragon_stick",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.ULTIMATUM)));

    public static final Item RAW_MITHRIL = registerItem("raw_mithril",
            new Item(new FabricItemSettings().group(ModItemGroup.ULTIMATUM)));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ULTIMATUM)));

    public static final Item MITHRIL_SWORD = registerItem("mithril_sword",
            new SwordItem(ModToolMaterials.MITHRIL,7 ,-3.4f ,
                    new FabricItemSettings().rarity(Rarity.RARE).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item MITHRIL_AXE = registerItem("mithril_axe",
            new ModAxeItem(ModToolMaterials.MITHRIL, 11, -3.9f,
                    new FabricItemSettings().rarity(Rarity.RARE).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe",
            new ModPickaxeItem(ModToolMaterials.MITHRIL, 1, -2.4f,
                    new FabricItemSettings().rarity(Rarity.RARE).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item MITHRIL_SHOVEL = registerItem("mithril_shovel",
            new ShovelItem(ModToolMaterials.MITHRIL, 0, -2.5f,
                    new FabricItemSettings().rarity(Rarity.RARE).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item MITHRIL_HOE = registerItem("mithril_hoe",
            new ModHoeItem(ModToolMaterials.MITHRIL, -1, -1.5f,
                    new FabricItemSettings().rarity(Rarity.RARE).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item MITHRIL_BOW = registerItem("mithril_bow",
            new BowItem(new FabricItemSettings().rarity(Rarity.RARE).fireproof().group(ModItemGroup.ULTIMATUM).maxDamage(3048)));
    public static final Item MITHRIL_HELMET = registerItem("mithril_helmet",
            new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.RARE).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item MITHRIL_CHESTPLATE = registerItem("mithril_chestplate",
            new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.CHEST,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item MITHRIL_LEGGINGS = registerItem("mithril_leggings",
            new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.LEGS,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));
    public static final Item MITHRIL_BOOTS = registerItem("mithril_boots",
            new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.FEET,
                    new FabricItemSettings().rarity(Rarity.EPIC).fireproof().group(ModItemGroup.ULTIMATUM)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Ultimatum.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Ultimatum.LOGGER.debug("Registering Mod Items for" + Ultimatum.MOD_ID);
    }
}
