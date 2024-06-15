
package net.mcreator.mts.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.mts.init.MtsModItems;

public class ObsidianaxeItem extends AxeItem {
	public ObsidianaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1450;
			}

			public float getSpeed() {
				return 7.5f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MtsModItems.OBSIDIANINGOT.get()));
			}
		}, 1, -3.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
