
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themakkersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.themakkersmod.ThemakkersmodMod;

public class ThemakkersmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ThemakkersmodMod.MODID);
	public static final RegistryObject<SoundEvent> DON = REGISTRY.register("don", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("themakkersmod", "don")));
}
