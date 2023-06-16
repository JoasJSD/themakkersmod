
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themakkersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.themakkersmod.item.KnakworstRawItem;
import net.mcreator.themakkersmod.item.KnakWorstCookedItem;
import net.mcreator.themakkersmod.item.DonItem;
import net.mcreator.themakkersmod.item.BreadwithKnakworstItem;
import net.mcreator.themakkersmod.ThemakkersmodMod;

public class ThemakkersmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThemakkersmodMod.MODID);
	public static final RegistryObject<Item> BREADWITH_KNAKWORST = REGISTRY.register("breadwith_knakworst", () -> new BreadwithKnakworstItem());
	public static final RegistryObject<Item> KNAK_WORST_COOKED = REGISTRY.register("knak_worst_cooked", () -> new KnakWorstCookedItem());
	public static final RegistryObject<Item> KNAKWORST_RAW = REGISTRY.register("knakworst_raw", () -> new KnakworstRawItem());
	public static final RegistryObject<Item> DON = REGISTRY.register("don", () -> new DonItem());
}
