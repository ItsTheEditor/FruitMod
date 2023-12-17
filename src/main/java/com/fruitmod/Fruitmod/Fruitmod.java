package com.fruitmod.Fruitmod;


import com.fruitmod.Fruitmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

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

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
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
