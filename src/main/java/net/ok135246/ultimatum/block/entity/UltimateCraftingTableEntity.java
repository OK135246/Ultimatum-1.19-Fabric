package net.ok135246.ultimatum.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.ok135246.ultimatum.item.ModItems;
import net.ok135246.ultimatum.item.inventory.ImplementedInventory;
import net.ok135246.ultimatum.screen.UltimateCraftingTableScreenHandler;
import org.jetbrains.annotations.Nullable;

public class UltimateCraftingTableEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(82, ItemStack.EMPTY);
    public UltimateCraftingTableEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ULTIMATE_CRAFTING_TABLE, pos, state);
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new UltimateCraftingTableScreenHandler(syncId, inv, this);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    public static void tick(World world, BlockPos pos, BlockState state, UltimateCraftingTableEntity entity) {
        if(hasRecipe(entity) && hasNotReachedStackLimit(entity)) {
            craftItem(entity);
        }
    }

    private static void craftItem(UltimateCraftingTableEntity entity) {
        entity.removeStack(0, 1);
        entity.removeStack(1, 1);
        entity.removeStack(2, 1);

        entity.setStack(82, new ItemStack(ModItems.ULTIMATE_CATALYST,
                entity.getStack(3).getCount() + 1));
    }

    private static boolean hasRecipe(UltimateCraftingTableEntity entity) {
        boolean hasItemInFirstSlot = entity.getStack(0).getItem() == ModItems.ULTIMATE_DUST;
        boolean hasItemInSecondSlot = entity.getStack(1).getItem() == ModItems.ULTIMATE_DUST;
        boolean hasItemInThirdSlot = entity.getStack(2).getItem() == ModItems.ULTIMATE_DUST;

        return hasItemInFirstSlot && hasItemInSecondSlot && hasItemInThirdSlot;
    }

    private static boolean hasNotReachedStackLimit(UltimateCraftingTableEntity entity) {
        return entity.getStack(82).getCount() < entity.getStack(82).getMaxCount();
    }
}
