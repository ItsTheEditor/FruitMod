package com.fruitmod.Fruitmod;


import com.fruitmod.Fruitmod.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;
import com.fruitmod.Fruitmod.items.ModItems;

@Mod(modid = Fruitmod.MODID, name = Fruitmod.NAME, version = Fruitmod.VERSION, clientSideOnly = true)
public class Fruitmod
{
    public static final String MODID = "fruitmod";
    public static final String NAME = "Fruitmod";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "com.fruitmod.Fruitmod.proxy.ClientProxy", serverSide = "fruitmod.Fruitmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static Fruitmod instance;
    public static Logger logger;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {


        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
            ModItems.registerModels();

        }
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
        System.out.println(NAME + "is loading");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
