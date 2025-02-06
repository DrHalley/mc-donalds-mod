package com.efetamturk.item;

import com.efetamturk.McDonaldsMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FAST_FOOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(McDonaldsMod.MOD_ID, "fast_food"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fast_food"))
                    .icon(() -> new ItemStack(ModItems.HAMBURGER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.HAMBURGER);
                        entries.add(ModItems.FRENCH_FRIES);
                        entries.add(ModItems.MCDONALDS_HAT);
                    }).build());

    public static void registerItemGroups() {


        McDonaldsMod.LOGGER.info("Registering Item Groups for " + McDonaldsMod.MOD_ID);
    }
}


