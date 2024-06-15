
package net.mcreator.mts.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

public class DeepslateaxeItem extends AxeItem {
	public DeepslateaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 197;
			}

			public float getSpeed() {
				return 5.5f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
