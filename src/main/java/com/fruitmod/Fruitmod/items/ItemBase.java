package com.fruitmod.Fruitmod.items;

import com.fruitmod.Fruitmod.Fruitmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {


        protected String name;

        public ItemBase(String name) {
            this.name = name;
            setUnlocalizedName(name);
            setRegistryName(name);

            setCreativeTab(CreativeTabs.MISC);
        }

        public void registerItemModel() {
            Fruitmod.proxy.registerItemRenderer(this, 0, name);
        }

        

    }




