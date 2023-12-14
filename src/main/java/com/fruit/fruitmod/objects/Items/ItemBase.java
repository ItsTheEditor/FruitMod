package com.fruit.fruitmod.objects.Items;

import com.fruit.fruitmod.init.IHasModel;
import com.fruit.fruitmod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static com.fruit.fruitmod.fruitMod.proxy;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);

        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ItemInit.ITEMS.add(this);

    }

    @Override
    public void registerModels(){

        proxy.registerModel(this, 0);
    }
}
