package net.ok135246.ultimatum.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ENCHANTED_NETHERITE_APPLE = (new FoodComponent.Builder()).hunger(10).saturationModifier(2.0F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 4000, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 5), 1.0F).alwaysEdible().build();
}
