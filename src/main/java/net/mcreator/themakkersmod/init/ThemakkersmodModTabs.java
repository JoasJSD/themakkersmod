
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
					tabData.accept(ThemakkersmodModBlocks.BLOCKOF_KNAKWORST.get().asItem());
					tabData.accept(ThemakkersmodModItems.CANOF_KNAKWORST.get());
					tabData.accept(ThemakkersmodModItems.CAN_OPENER.get());
					tabData.accept(ThemakkersmodModItems.EATEN_MICROPHONE.get());
					tabData.accept(ThemakkersmodModItems.MICROPHONE.get());
					tabData.accept(ThemakkersmodModBlocks.MOOS_STATUE.get().asItem());
					tabData.accept(ThemakkersmodModItems.BINGO_CARD.get());
					tabData.accept(ThemakkersmodModItems.JEREMYS_CLOVER_H.get());
				}).withSearchBar());
	}
}
