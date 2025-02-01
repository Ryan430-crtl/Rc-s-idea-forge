
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rcsideasforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.rcsideasforge.block.ElectrumrawstoneblockBlock;
import net.mcreator.rcsideasforge.block.ElectrumrawdeepslateblockBlock;
import net.mcreator.rcsideasforge.block.ElectrumblockBlock;
import net.mcreator.rcsideasforge.RcsIdeasForgeMod;

public class RcsIdeasForgeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RcsIdeasForgeMod.MODID);
	public static final RegistryObject<Block> ELECTRUMBLOCK = REGISTRY.register("electrumblock", () -> new ElectrumblockBlock());
	public static final RegistryObject<Block> ELECTRUMRAWSTONEBLOCK = REGISTRY.register("electrumrawstoneblock", () -> new ElectrumrawstoneblockBlock());
	public static final RegistryObject<Block> ELECTRUMRAWDEEPSLATEBLOCK = REGISTRY.register("electrumrawdeepslateblock", () -> new ElectrumrawdeepslateblockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
