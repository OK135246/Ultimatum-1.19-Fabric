package net.ok135246.ultimatum;

import net.fabricmc.api.ModInitializer;
import net.ok135246.ultimatum.block.ModBlocks;
import net.ok135246.ultimatum.item.ModItems;
import net.ok135246.ultimatum.util.ModLootTableModifiers;
import net.ok135246.ultimatum.world.feature.ModConfiguredFeatures;
import net.ok135246.ultimatum.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ultimatum implements ModInitializer {
	public static final String MOD_ID = "ultimatum";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();

		ModLootTableModifiers.modifyLootTables();

	}
}
