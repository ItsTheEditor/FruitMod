package com.fruitmod.Fruitmod.proxy;

import com.fruitmod.Fruitmod.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        ModItems.initModels();
    }
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }


}