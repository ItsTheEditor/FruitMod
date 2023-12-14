package com.fruit.fruitmod;

import com.fruit.fruitmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = fruitMod.MODID, name = fruitMod.NAME, version = fruitMod.VERSION)
public class fruitMod {
    public static final String MODID = "fruit";
    public static final String NAME = "Fruit Mod";
    public static final String VERSION = "1.0";

    // Update the clientSide and serverSide attributes to point to the actual proxy classes
    public static final String CLIENT = "com.fruit.fruitmod.proxy.ClientProxy";
    public static final String SERVER = "com.fruit.fruitmod.proxy.CommonProxy";

    @Mod.Instance
    public static fruitMod Instance;

    @SidedProxy(clientSide = CLIENT, serverSide = SERVER)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}

    @EventHandler
    public static void Init(FMLInitializationEvent event) {}

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {}
}
