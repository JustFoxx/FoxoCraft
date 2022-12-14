package io.github.justfoxx.foxocraft.features.items_group;

import io.github.justfoxx.foxocraft.Main;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;

import java.util.List;

public class FoxoItemsGroup {
	public static void create(List<ItemStack> listStacks) {
		ItemStack icon = new ItemStack(Items.PLAYER_HEAD);
		NbtCompound nbt = icon.getOrCreateNbt();
		nbt.putString("SkullOwner", "0cute");
		icon.setNbt(nbt);
		QuiltItemGroup.builder(Main.id("foxo_items_group"))
				.icon(() -> icon)
				.appendItems(stacks -> stacks.addAll(listStacks))
				.build();
	}
}
