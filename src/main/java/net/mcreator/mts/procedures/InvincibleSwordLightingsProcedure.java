package net.mcreator.mts.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import java.util.Random;

public class InvincibleSwordLightingsProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double lightingX = 0;
		double lightingZ = 0;
		for (int index0 = 0; index0 < (int) (30); index0++) {
			lightingX = x + Mth.nextInt(new Random(), -100, 100);
			lightingZ = z + Mth.nextInt(new Random(), -100, 100);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo(lightingX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) lightingX, (int) lightingZ)), lightingZ, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
