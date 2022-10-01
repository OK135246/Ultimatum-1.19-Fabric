package net.ok135246.ultimatum.world.dimension;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.ok135246.ultimatum.Ultimatum;
import net.ok135246.ultimatum.block.ModBlocks;
import net.ok135246.ultimatum.item.ModItems;

public class ModDimensions {
    public static final RegistryKey<World> SHADOW_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(Ultimatum.MOD_ID,"shadowdimension"));
    public static final RegistryKey<DimensionType> SHADOW_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            SHADOW_DIMENSION_KEY.getValue());


    public static void register() {
        Ultimatum.LOGGER.debug("Registering ModDimensions for" + Ultimatum.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.NECRONIUM_ESSENCE)
                .destDimID(SHADOW_DIMENSION_KEY.getValue())
                .tintColor(0,0,0)
                .lightWithItem(ModItems.NECRONIUM_HEART)
                .onlyLightInOverworld()
                .registerPortal();
    }
}
