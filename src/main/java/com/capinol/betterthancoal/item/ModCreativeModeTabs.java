package com.capinol.betterthancoal.item;

import com.capinol.betterthancoal.BetterThanCoal;
import com.capinol.betterthancoal.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterThanCoal.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BTCOAL_TAB = CREATIVE_MODE_TABS.register("btcoal_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Pebble.get()))
            .title(Component.translatable("creativetab.btcoal_tab"))
            .displayItems((pParameters, pOutput) ->{
                pOutput.accept(ModItems.Pebble.get());
                pOutput.accept(ModItems.PebbleBlade.get());
                pOutput.accept(ModItems.PebbleSword.get());
                pOutput.accept(ModItems.Yogurt.get());
                pOutput.accept(ModItems.Rawyogurt.get());
                pOutput.accept(ModItems.Texter.get());
                pOutput.accept(ModBlocks.Condesed_Pebbles.get());
                pOutput.accept(ModItems.Pebble_Helmet.get());
                pOutput.accept(ModItems.Pebble_Chestplate.get());
                pOutput.accept(ModItems.Pebble_Leggings.get());
                pOutput.accept(ModItems.Pebble_Boots.get());
                pOutput.accept(ModItems.Yogurtium.get());
                pOutput.accept(ModItems.Yogurtium_Helmet.get());
                pOutput.accept(ModItems.Yogurtium_Chestplate.get());
                pOutput.accept(ModItems.Yogurtium_Leggings.get());
                pOutput.accept(ModItems.Yogurtium_Boots.get());
            } )
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
