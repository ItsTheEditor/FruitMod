package com.editspace.fruitmod.items;

import com.editspace.fruitmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.editspace.fruitmod.fruitmod;
import com.editspace.fruitmod.init.ModItems;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        fruitmod.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
