
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mts.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mts.block.StrongglassblockBlock;
import net.mcreator.mts.MtsMod;

public class MtsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MtsMod.MODID);
	public static final RegistryObject<Block> STRONGGLASSBLOCK = REGISTRY.register("strongglassblock", () -> new StrongglassblockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			StrongglassblockBlock.registerRenderLayer();
		}
	}
}
