
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.themakkersmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThemakkersmodModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("themakkersmod", "the_makkers_mod_tab"),
				builder -> builder.title(Component.translatable("item_group.themakkersmod.the_makkers_mod_tab")).icon(() -> new ItemStack(ThemakkersmodModItems.BREADWITH_KNAKWORST.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ThemakkersmodModItems.BREADWITH_KNAKWORST.get());
					tabData.accept(ThemakkersmodModItems.KNAK_WORST_COOKED.get());
					tabData.accept(ThemakkersmodModItems.KNAKWORST_RAW.get());
					tabData.accept(ThemakkersmodModItems.DON.get());
					tabData.accept(ThemakkersmodModBlocks.KNAKWORST_OVEN.get().asItem());
				}).withSearchBar());
	}
}
