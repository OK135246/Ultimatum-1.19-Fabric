package net.ok135246.ultimatum.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.OreConfiguredFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> NECRONIUM_ESSENCE_PLACED = PlacedFeatures.register("necronium_essence_placed",
            ModConfiguredFeatures.NECRONIUM_ESSENCE, modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(5), YOffset.aboveBottom(30))));

    public static final RegistryEntry<PlacedFeature> MITHRIL_ORE_PLACED = PlacedFeatures.register("mithril_ore_placed",
            ModConfiguredFeatures.MITHRIL_ORE, modifiersWithCount(3, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-60), YOffset.aboveBottom(30))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
