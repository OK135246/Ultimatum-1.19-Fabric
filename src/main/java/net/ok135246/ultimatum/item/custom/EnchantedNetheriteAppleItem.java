package net.ok135246.ultimatum.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedNetheriteAppleItem extends Item {
    public EnchantedNetheriteAppleItem(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
