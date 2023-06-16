
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themakkersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.themakkersmod.block.KnakworstOvenBlock;
import net.mcreator.themakkersmod.ThemakkersmodMod;

public class ThemakkersmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ThemakkersmodMod.MODID);
	public static final RegistryObject<Block> KNAKWORST_OVEN = REGISTRY.register("knakworst_oven", () -> new KnakworstOvenBlock());
}
