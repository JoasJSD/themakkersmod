
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themakkersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.themakkersmod.world.features.KnakworstStoreFeature;
import net.mcreator.themakkersmod.ThemakkersmodMod;

@Mod.EventBusSubscriber
public class ThemakkersmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ThemakkersmodMod.MODID);
	public static final RegistryObject<Feature<?>> KNAKWORST_STORE = REGISTRY.register("knakworst_store", KnakworstStoreFeature::new);
}
