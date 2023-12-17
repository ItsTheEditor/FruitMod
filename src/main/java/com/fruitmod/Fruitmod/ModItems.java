package com.fruitmod.fruitmod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.fruitmod.fruitmod.items.cherry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    @GameRegistry.ObjectHolder("fruitmod:cherry")
    public static cherry cherry;

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        cherry.initModel();
    }

}
