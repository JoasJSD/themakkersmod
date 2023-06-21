
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.themakkersmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ThemakkersmodModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == ThemakkersmodModVillagerProfessions.KNAKWORST_BUTCHER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(ThemakkersmodModItems.KNAKWORST_RAW.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(ThemakkersmodModItems.CANOF_KNAKWORST.get()), 8, 8, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(ThemakkersmodModBlocks.BLOCKOF_KNAKWORST.get()), 5, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(ThemakkersmodModItems.KNAK_WORST_COOKED.get(), 5),

					new ItemStack(ThemakkersmodModItems.BINGO_CARD.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(ThemakkersmodModItems.KNAKWORST_RAW.get(), 5),

					new ItemStack(ThemakkersmodModItems.JEREMYS_CLOVER_H.get()), 10, 5, 0.05f));
		}
	}
}
