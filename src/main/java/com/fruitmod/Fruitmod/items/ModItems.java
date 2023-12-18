package com.fruitmod.Fruitmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {





    public static ItemBase cherry = new ItemBase("cherry").setCreativeTab(CreativeTabs.MISC);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                cherry
        );
    }

    public static void registerModels() {
        cherry.registerItemModel();
    }
}
