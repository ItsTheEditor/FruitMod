package com.editspace.fruitmod.proxy;

import com.editspace.fruitmod.items.cherry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event){

    }

    public void init(FMLInitializationEvent event){

    }

    public void postInit(FMLPostInitializationEvent event){

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){

        event.getRegistry().register(new cherry());
    }

    @Mod.EventBusSubscriber(Side.CLIENT)
    public class ClientProxy extends CommonProxy {
        @Override
        public void preInit(FMLPreInitializationEvent event) {
            super.preInit(event);
        }

        @SubscribeEvent
        public void registerModels(ModelRegistryEvent event){

        }
    }

    public class ServerProxy extends CommonProxy{

    }

}
