
package net.mcreator.themakkersmod.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.themakkersmod.init.ThemakkersmodModItems;

import java.util.List;
import java.util.Collections;

public class BlockofKnakworstBlock extends Block {
	public BlockofKnakworstBlock() {
		super(BlockBehaviour.Properties.of(Material.SPONGE).sound(SoundType.SLIME_BLOCK).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(ThemakkersmodModItems.KNAKWORST_RAW.get(), 5));
	}
}
