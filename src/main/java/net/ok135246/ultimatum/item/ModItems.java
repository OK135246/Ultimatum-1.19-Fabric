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

    public static final Item ENCHANTED_NETHERITE_APPLE = registerItem("enchanted_netherite_apple",
            (new EnchantedNetheriteAppleItem((new Item.Settings()).group(ModItemGroup.ULTIMATUM).rarity(Rarity.EPIC).food(ModFoodComponents.ENCHANTED_NETHERITE_APPLE))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Ultimatum.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Ultimatum.LOGGER.debug("Registering Mod Items for" + Ultimatum.MOD_ID);
    }
}
