package net.mcreator.mts.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class InvincibleIngotTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double practise_index = 0;
		practise_index = 0;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			world.addParticle(ParticleTypes.FIREWORK, (x + Math.sin(world.dayTime() / 1 + practise_index * 5) * 1.5), (y + 1), (z + Math.cos(world.dayTime() / 1 + practise_index * 5) * 1.5), 0, 0, 0);
			practise_index = practise_index + 1;
		}
	}
}
