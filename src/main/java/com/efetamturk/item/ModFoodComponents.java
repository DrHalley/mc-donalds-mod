package com.efetamturk.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent HAMBURGER = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 1f).build();
    public static final FoodComponent FRENCH_FRIES = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1f).build();
}
