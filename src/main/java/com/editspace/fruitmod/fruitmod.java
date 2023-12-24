package com.editspace.fruitmod;

import com.editspace.fruitmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = fruitmod.MODID, name = fruitmod.NAME, version = fruitmod.VERSION)
public class fruitmod
{
    public static final String MODID = "editspace";
    public static final String NAME = "Fruit mod";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "editspace.fruitmod.proxy.ClientProxy", serverSide = "editspace.fruitmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static fruitmod instance;

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
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
