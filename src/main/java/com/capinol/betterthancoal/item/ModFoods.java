package com.capinol.betterthancoal.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoods {
    public static final FoodProperties YOGURT = new FoodProperties.Builder().nutrition(10).saturationMod(0.2f).build();
    public static final FoodProperties RAWYOGURT = new FoodProperties.Builder().nutrition(12)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 200, 1), 1).build();
}
