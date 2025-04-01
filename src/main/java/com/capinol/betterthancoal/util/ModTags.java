package com.capinol.betterthancoal.util;

import com.capinol.betterthancoal.BetterThanCoal;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> TASTY_FOOD = tag("tasty_food");
        public static final TagKey<Block> NEEDS_YOGURTIUM_TOOL = tag("needs_yogurtium_tool");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(BetterThanCoal.MOD_ID, name));
        }
    }

    public static class Items {

    }
}
