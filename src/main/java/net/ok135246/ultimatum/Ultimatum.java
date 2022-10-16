package net.ok135246.ultimatum;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.ok135246.ultimatum.block.ModBlocks;
import net.ok135246.ultimatum.block.entity.ModBlockEntities;
import net.ok135246.ultimatum.entity.ModEntities;
import net.ok135246.ultimatum.entity.custom.ShadowCreeperEntity;
import net.ok135246.ultimatum.entity.custom.ShadowGolemEntity;
import net.ok135246.ultimatum.item.ModItems;
import net.ok135246.ultimatum.screen.ModScreenHandlers;
import net.ok135246.ultimatum.util.ModLootTableModifiers;
import net.ok135246.ultimatum.world.dimension.ModDimensions;
import net.ok135246.ultimatum.world.feature.ModConfiguredFeatures;
import net.ok135246.ultimatum.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

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

		ModBlockEntities.registerBlockEntities();

		ModDimensions.register();

		GeckoLib.initialize();

		ModScreenHandlers.registerAllScreenHandlers();

		FabricDefaultAttributeRegistry.register(
				ModEntities.SHADOW_GOLEM, ShadowGolemEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(
				ModEntities.SHADOW_CREEPER, ShadowCreeperEntity.setAttributes());
	}
}
