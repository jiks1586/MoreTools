
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mts.item.ObsidianswordItem;
import net.mcreator.mts.item.ObsidianpickaxeItem;
import net.mcreator.mts.item.ObsidianingotItem;
import net.mcreator.mts.item.ObsidianaxeItem;
import net.mcreator.mts.item.InvincibleswordItem;
import net.mcreator.mts.item.InvinciblepickaxeItem;
import net.mcreator.mts.item.InvincibleingotItem;
import net.mcreator.mts.item.Invincible1swordItem;
import net.mcreator.mts.item.GlassswordItem;
import net.mcreator.mts.item.GlasspickaxeItem;
import net.mcreator.mts.item.GlassingotItem;
import net.mcreator.mts.item.GlassaxeItem;
import net.mcreator.mts.item.DeepslateswordItem;
import net.mcreator.mts.item.DeepslatepickaxeItem;
import net.mcreator.mts.item.DeepslateaxeItem;
import net.mcreator.mts.MtsMod;

public class MtsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MtsMod.MODID);
	public static final RegistryObject<Item> DEEPSLATEPICKAXE = REGISTRY.register("deepslatepickaxe", () -> new DeepslatepickaxeItem());
	public static final RegistryObject<Item> DEEPSLATESWORD = REGISTRY.register("deepslatesword", () -> new DeepslateswordItem());
	public static final RegistryObject<Item> DEEPSLATEAXE = REGISTRY.register("deepslateaxe", () -> new DeepslateaxeItem());
	public static final RegistryObject<Item> OBSIDIANINGOT = REGISTRY.register("obsidianingot", () -> new ObsidianingotItem());
	public static final RegistryObject<Item> OBSIDIANSWORD = REGISTRY.register("obsidiansword", () -> new ObsidianswordItem());
	public static final RegistryObject<Item> OBSIDIANPICKAXE = REGISTRY.register("obsidianpickaxe", () -> new ObsidianpickaxeItem());
	public static final RegistryObject<Item> OBSIDIANAXE = REGISTRY.register("obsidianaxe", () -> new ObsidianaxeItem());
	public static final RegistryObject<Item> INVINCIBLEINGOT = REGISTRY.register("invincibleingot", () -> new InvincibleingotItem());
	public static final RegistryObject<Item> INVINCIBLESWORD = REGISTRY.register("invinciblesword", () -> new InvincibleswordItem());
	public static final RegistryObject<Item> INVINCIBLEPICKAXE = REGISTRY.register("invinciblepickaxe", () -> new InvinciblepickaxeItem());
	public static final RegistryObject<Item> INVINCIBLE_1SWORD = REGISTRY.register("invincible_1sword", () -> new Invincible1swordItem());
	public static final RegistryObject<Item> STRONGGLASSBLOCK = block(MtsModBlocks.STRONGGLASSBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GLASSINGOT = REGISTRY.register("glassingot", () -> new GlassingotItem());
	public static final RegistryObject<Item> GLASSSWORD = REGISTRY.register("glasssword", () -> new GlassswordItem());
	public static final RegistryObject<Item> GLASSPICKAXE = REGISTRY.register("glasspickaxe", () -> new GlasspickaxeItem());
	public static final RegistryObject<Item> GLASSAXE = REGISTRY.register("glassaxe", () -> new GlassaxeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
