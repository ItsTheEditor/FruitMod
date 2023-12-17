package com.fruitmod.Fruitmod.items;



import com.fruitmod.Fruitmod.Fruitmod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

public class cherry extends Item {

    public cherry(){
        setRegistryName("cherry");
        setUnlocalizedName(Fruitmod.MODID + ".cherry");

    }
    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(Objects.requireNonNull(getRegistryName()),"inventory"));
    }
}
