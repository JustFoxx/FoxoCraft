package io.github.justfoxx.foxocraft.features.items;

import net.minecraft.item.FoodComponent;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import javax.annotation.Nullable;

public class FoodItem extends BaseItem {
	public FoodItem(@Nullable QuiltItemSettings settings,int hunger, float saturation, boolean meat) {
		super(settings);
		final FoodComponent.Builder foodBuilder = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation);
		if(meat) foodBuilder.meat();
		setSettings(super.settings.food(foodBuilder.build()));
	}
}
