package com.efetamturk.item;

import com.efetamturk.McDonaldsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FRENCH_FRIES = registerItem("french_fries", new Item(new FabricItemSettings().food(ModFoodComponents.FRENCH_FRIES)));
    public static final Item HAMBURGER = registerItem("hamburger", new Item(new FabricItemSettings().food(ModFoodComponents.HAMBURGER)));

    public static final Item MCDONALDS_HAT = registerItem("mcdonalds_hat", new ArmorItem(ModArmorMaterial.MCDONALDS, ArmorItem.Type.HELMET, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(McDonaldsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        McDonaldsMod.LOGGER.info("Registering Mod Items for " + McDonaldsMod.MOD_ID);

    }
}
