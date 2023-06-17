
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themakkersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.themakkersmod.item.MicrophoneItem;
import net.mcreator.themakkersmod.item.KnakworstRawItem;
import net.mcreator.themakkersmod.item.KnakWorstCookedItem;
import net.mcreator.themakkersmod.item.EatenMicrophoneItem;
import net.mcreator.themakkersmod.item.DonItem;
import net.mcreator.themakkersmod.item.CanofKnakworstItem;
import net.mcreator.themakkersmod.item.CanOpenerItem;
import net.mcreator.themakkersmod.item.BreadwithKnakworstItem;
import net.mcreator.themakkersmod.ThemakkersmodMod;

public class ThemakkersmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThemakkersmodMod.MODID);
	public static final RegistryObject<Item> BREADWITH_KNAKWORST = REGISTRY.register("breadwith_knakworst", () -> new BreadwithKnakworstItem());
	public static final RegistryObject<Item> KNAK_WORST_COOKED = REGISTRY.register("knak_worst_cooked", () -> new KnakWorstCookedItem());
	public static final RegistryObject<Item> KNAKWORST_RAW = REGISTRY.register("knakworst_raw", () -> new KnakworstRawItem());
	public static final RegistryObject<Item> DON = REGISTRY.register("don", () -> new DonItem());
	public static final RegistryObject<Item> KNAKWORST_OVEN = block(ThemakkersmodModBlocks.KNAKWORST_OVEN);
	public static final RegistryObject<Item> BLOCKOF_KNAKWORST = block(ThemakkersmodModBlocks.BLOCKOF_KNAKWORST);
	public static final RegistryObject<Item> CANOF_KNAKWORST = REGISTRY.register("canof_knakworst", () -> new CanofKnakworstItem());
	public static final RegistryObject<Item> CAN_OPENER = REGISTRY.register("can_opener", () -> new CanOpenerItem());
	public static final RegistryObject<Item> EATEN_MICROPHONE = REGISTRY.register("eaten_microphone", () -> new EatenMicrophoneItem());
	public static final RegistryObject<Item> MICROPHONE = REGISTRY.register("microphone", () -> new MicrophoneItem());
	public static final RegistryObject<Item> MOOS_STATUE = block(ThemakkersmodModBlocks.MOOS_STATUE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
