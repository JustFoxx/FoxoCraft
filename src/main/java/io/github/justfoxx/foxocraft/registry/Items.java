package io.github.justfoxx.foxocraft.registry;

import io.github.justfoxx.foxocraft.features.items.BaseItem;
import io.github.justfoxx.foxocraft.features.items.DrinkItem;
import io.github.justfoxx.foxocraft.features.items.FoodItem;
import io.github.justfoxx.foxocraft.features.items.MagicBookItem;
import net.minecraft.server.command.TimeCommand;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;

public class Items {
	public static final BaseItem ALLOY = new BaseItem(null);
	public static final BaseItem COMPRESSED_ALLOY = new BaseItem(null);
	public static final BaseItem EXTREME_ALLOY = new BaseItem(null);
	public static final BaseItem UNC_EXTREME_ALLOY = new BaseItem(null);
	public static final BaseItem COAL_DUST = new BaseItem(null);
	public static final BaseItem GOLD_DUST = new BaseItem(null);
	public static final BaseItem IRON_DUST = new BaseItem(null);
	public static final BaseItem MAGIC_DUST = new BaseItem(null);
	public static final BaseItem MITHRIL_DUST = new BaseItem(null);
	public static final BaseItem MIXED_IRON_DUST = new BaseItem(null);
	public static final BaseItem OBSIDIAN_DUST = new BaseItem(null);
	public static final BaseItem SILVER_DUST = new BaseItem(null);
	public static final BaseItem FOXO_INGOT = new BaseItem(null);
	public static final BaseItem MITHRIL_INGOT = new BaseItem(null);
	public static final BaseItem OBSIDIAN_INGOT = new BaseItem(null);
	public static final BaseItem SILVER_INGOT = new BaseItem(null);
	public static final BaseItem STEEL_INGOT = new BaseItem(null);
	public static final BaseItem UNWORKED_STEEL_INGOT = new BaseItem(null);
	public static final BaseItem AMETHYST_GEM = new BaseItem(null);
	public static final BaseItem COCOA_MESH = new BaseItem(null);
	public static final BaseItem COCOA_POWDER = new BaseItem(null);
	public static final BaseItem DIAMOND_STICK = new BaseItem(null);
	public static final BaseItem UNWORKED_STEEL = new BaseItem(null);
	public static final BaseItem EARTH_ESSENCE = new BaseItem(null);
	public static final BaseItem FIRE_ESSENCE = new BaseItem(null);
	public static final BaseItem WATER_ESSENCE = new BaseItem(null);
	public static final BaseItem WIND_ESSENCE = new BaseItem(null);

	public static final BaseItem CHOCO_BEEF = new FoodItem(null, 3, 0.3f, true);
	public static final BaseItem CHOCO_PORK = new FoodItem(null, 3, 0.3f, true);
	public static final BaseItem CHOCO_STEAK = new FoodItem(null, 3, 0.3f, true);
	public static final BaseItem COOKED_CHOCO_PORK = new FoodItem(null, 8, 0.8f, true);

	public static final BaseItem CHOCO_MILK = new DrinkItem(null, 0, 0, false);
	public static final BaseItem HOT_CHOCO_MILK = new DrinkItem(null, 3, 0.4f, false);

	public static final BaseItem BOOK_OF_EXP = new MagicBookItem(null, (player,stack,world) -> {
		world.playSound(null,player.getBlockPos(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1.0F, 1.0F);
		player.addExperience(40);
	});

	public static final BaseItem BOOK_OF_HEALING = new MagicBookItem(null, (player,stack,world) -> {
		world.playSound(null,player.getBlockPos(), SoundEvents.ENTITY_WARDEN_HEARTBEAT, SoundCategory.PLAYERS, 1.0F, 1.0F);
		player.heal(4);
	});

	public static final BaseItem BOOK_OF_TIME = new MagicBookItem(null, (player,stack,world) -> {
		world.playSound(null,player.getBlockPos(), SoundEvents.ITEM_LODESTONE_COMPASS_LOCK, SoundCategory.PLAYERS, 1.0F, 1.0F);
		if(world instanceof ServerWorld serverWorld) {
			((ServerWorld) world).setTimeOfDay(serverWorld.getTimeOfDay() + 1000);
		}
	});
}
