package com.capinol.betterthancoal.item;

import com.capinol.betterthancoal.BetterThanCoal;
import com.capinol.betterthancoal.item.custom.ModArmorItem;
import com.capinol.betterthancoal.item.custom.TextSenderItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterThanCoal.MOD_ID);

    public static final RegistryObject<Item> PebbleBlade = ITEMS.register("pebbleblade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Pebble = ITEMS.register("pebble", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PebbleSword = ITEMS.register("pebblesword", () -> new Item(new Item.Properties().durability(60)));
    public static final RegistryObject<Item> Yogurt = ITEMS.register("yogurt", () -> new Item(new Item.Properties().food(ModFoods.YOGURT)));
    public static final RegistryObject<Item> Rawyogurt = ITEMS.register("rawyogurt", () -> new Item(new Item.Properties().food(ModFoods.RAWYOGURT)));
    public static final RegistryObject<Item> Texter = ITEMS.register("texter", () -> new TextSenderItem(new Item.Properties()));
    public static final RegistryObject<Item> Yogurtium = ITEMS.register("yogurtium", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Pebble_Helmet = ITEMS.register("pebble_helmet",
            () -> new ModArmorItem(ModArmorMaterials.Pebble, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> Pebble_Chestplate = ITEMS.register("pebble_chestplate",
            () -> new ArmorItem(ModArmorMaterials.Pebble, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> Pebble_Leggings = ITEMS.register("pebble_leggings",
            () -> new ArmorItem(ModArmorMaterials.Pebble, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> Pebble_Boots = ITEMS.register("pebble_boots",
            () -> new ArmorItem(ModArmorMaterials.Pebble, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> Yogurtium_Helmet = ITEMS.register("yogurtium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.Yogurtium, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> Yogurtium_Chestplate = ITEMS.register("yogurtium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.Yogurtium, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> Yogurtium_Leggings = ITEMS.register("yogurtium_leggings",
            () -> new ArmorItem(ModArmorMaterials.Yogurtium, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> Yogurtium_Boots = ITEMS.register("yogurtium_boots",
            () -> new ArmorItem(ModArmorMaterials.Yogurtium, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
