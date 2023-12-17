package com.fruitmod.Fruitmod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.fruitmod.Fruitmod.items.cherry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    @GameRegistry.ObjectHolder("Fruitmod:cherry")
    public static cherry cherry;

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        cherry.initModel();
    }

}
