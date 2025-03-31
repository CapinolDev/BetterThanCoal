package com.capinol.betterthancoal.datagen;

import com.capinol.betterthancoal.BetterThanCoal;
import com.capinol.betterthancoal.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BetterThanCoal.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.Pebble);
        simpleItem(ModItems.PebbleBlade);
        simpleItem(ModItems.PebbleSword);
        simpleItem(ModItems.Pebble_Boots);
        simpleItem(ModItems.Rawyogurt);
        simpleItem(ModItems.Pebble_Chestplate);
        simpleItem(ModItems.Pebble_Helmet);
        simpleItem(ModItems.Pebble_Leggings);
        simpleItem(ModItems.Texter);
        simpleItem(ModItems.Yogurt);

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BetterThanCoal.MOD_ID, "item/" + item.getId().getPath()));
    }
}
