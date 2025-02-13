
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rcsideasforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rcsideasforge.item.ElectrumrawItem;
import net.mcreator.rcsideasforge.item.ElectrumnuggetItem;
import net.mcreator.rcsideasforge.item.ElectrumingotItem;
import net.mcreator.rcsideasforge.RcsIdeasForgeMod;

public class RcsIdeasForgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RcsIdeasForgeMod.MODID);
	public static final RegistryObject<Item> ELECTRUMINGOT = REGISTRY.register("electrumingot", () -> new ElectrumingotItem());
	public static final RegistryObject<Item> ELECTRUMBLOCK = block(RcsIdeasForgeModBlocks.ELECTRUMBLOCK);
	public static final RegistryObject<Item> ELECTRUMRAW = REGISTRY.register("electrumraw", () -> new ElectrumrawItem());
	public static final RegistryObject<Item> ELECTRUMRAWSTONEBLOCK = block(RcsIdeasForgeModBlocks.ELECTRUMRAWSTONEBLOCK);
	public static final RegistryObject<Item> ELECTRUMRAWDEEPSLATEBLOCK = block(RcsIdeasForgeModBlocks.ELECTRUMRAWDEEPSLATEBLOCK);
	public static final RegistryObject<Item> ELECTRUMNUGGET = REGISTRY.register("electrumnugget", () -> new ElectrumnuggetItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
