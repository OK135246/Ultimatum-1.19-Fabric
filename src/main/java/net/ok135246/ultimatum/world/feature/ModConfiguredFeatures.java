package net.ok135246.ultimatum.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.ok135246.ultimatum.Ultimatum;
import net.ok135246.ultimatum.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> NETHER_NECRONIUM_ESSENCE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NECRONIUM_ESSENCE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_MITHRIL_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MITHRIL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MITHRIL_ORE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NECRONIUM_ESSENCE =
            ConfiguredFeatures.register("necronium_essence", Feature.ORE, new OreFeatureConfig(NETHER_NECRONIUM_ESSENCE, 2));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MITHRIL_ORE =
            ConfiguredFeatures.register("mithril_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_MITHRIL_ORE, 4));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEPSLATE_MITHRIL_ORE =
            ConfiguredFeatures.register("deepslate_mithril_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_MITHRIL_ORE, 6));

    public static void registerConfiguredFeatures() {
        Ultimatum.LOGGER.debug("Registering the ModConfiguredFeatures for" + Ultimatum.MOD_ID);
    }
}
