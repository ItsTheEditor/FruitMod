# fruitmod
 
This is a minecraft forge mod for 1.12.2,
it adds fruits like Cherrys.
But the mod is broken i am trying to figure out why it can not find the model file or texture of the cherry item.



If you are wondering what error i get here it is:



[Client thread/ERROR] [FML]: Exception loading model for variant fruit:cherry#inventory for item "fruit:cherry", normal location exception: 
net.minecraftforge.client.model.ModelLoaderRegistry$LoaderException: Exception loading model fruit:item/cherry with loader VanillaLoader.INSTANCE, skipping
	at net.minecraftforge.client.model.ModelLoaderRegistry.getModel(ModelLoaderRegistry.java:161) ~[ModelLoaderRegistry.class:?]
	at net.minecraftforge.client.model.ModelLoader.loadItemModels(ModelLoader.java:302) ~[ModelLoader.class:?]
	at net.minecraft.client.renderer.block.model.ModelBakery.loadVariantItemModels(ModelBakery.java:175) ~[ModelBakery.class:?]
	at net.minecraftforge.client.model.ModelLoader.setupModelRegistry(ModelLoader.java:151) ~[ModelLoader.class:?]
	at net.minecraft.client.renderer.block.model.ModelManager.onResourceManagerReload(ModelManager.java:28) [ModelManager.class:?]
	at net.minecraft.client.resources.SimpleReloadableResourceManager.registerReloadListener(SimpleReloadableResourceManager.java:121) [SimpleReloadableResourceManager.class:?]
	at net.minecraft.client.Minecraft.init(Minecraft.java:513) [Minecraft.class:?]
	at net.minecraft.client.Minecraft.run(Minecraft.java:378) [Minecraft.class:?]
	at net.minecraft.client.main.Main.main(Main.java:118) [Main.class:?]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[?:1.8.0_392]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[?:1.8.0_392]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[?:1.8.0_392]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[?:1.8.0_392]
	at net.minecraft.launchwrapper.Launch.launch(Launch.java:135) [launchwrapper-1.12.jar:?]
	at net.minecraft.launchwrapper.Launch.main(Launch.java:28) [launchwrapper-1.12.jar:?]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[?:1.8.0_392]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[?:1.8.0_392]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[?:1.8.0_392]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[?:1.8.0_392]
	at net.minecraftforge.legacydev.Main.start(Main.java:86) [legacydev-0.2.3.1-fatjar.jar:0.2.3.1+4+372be23]
	at net.minecraftforge.legacydev.MainClient.main(MainClient.java:29) [legacydev-0.2.3.1-fatjar.jar:0.2.3.1+4+372be23]
Caused by: java.io.FileNotFoundException: fruit:models/item/cherry.json
	at net.minecraft.client.resources.SimpleReloadableResourceManager.getResource(SimpleReloadableResourceManager.java:69) ~[SimpleReloadableResourceManager.class:?]
	at net.minecraft.client.renderer.block.model.ModelBakery.loadModel(ModelBakery.java:334) ~[ModelBakery.class:?]
	at net.minecraftforge.client.model.ModelLoader.access$1400(ModelLoader.java:115) ~[ModelLoader.class:?]
	at net.minecraftforge.client.model.ModelLoader$VanillaLoader.loadModel(ModelLoader.java:861) ~[ModelLoader$VanillaLoader.class:?]
	at net.minecraftforge.client.model.ModelLoaderRegistry.getModel(ModelLoaderRegistry.java:157) ~[ModelLoaderRegistry.class:?]
	... 20 more
[17:13:50] [Client thread/ERROR] [FML]: Exception loading model for variant fruit:cherry#inventory for item "fruit:cherry", blockstate location exception: 
net.minecraftforge.client.model.ModelLoaderRegistry$LoaderException: Exception loading model fruit:cherry#inventory with loader VariantLoader.INSTANCE, skipping
	at net.minecraftforge.client.model.ModelLoaderRegistry.getModel(ModelLoaderRegistry.java:161) ~[ModelLoaderRegistry.class:?]
	at net.minecraftforge.client.model.ModelLoader.loadItemModels(ModelLoader.java:296) ~[ModelLoader.class:?]
	at net.minecraft.client.renderer.block.model.ModelBakery.loadVariantItemModels(ModelBakery.java:175) ~[ModelBakery.class:?]
	at net.minecraftforge.client.model.ModelLoader.setupModelRegistry(ModelLoader.java:151) ~[ModelLoader.class:?]
	at net.minecraft.client.renderer.block.model.ModelManager.onResourceManagerReload(ModelManager.java:28) [ModelManager.class:?]
	at net.minecraft.client.resources.SimpleReloadableResourceManager.registerReloadListener(SimpleReloadableResourceManager.java:121) [SimpleReloadableResourceManager.class:?]
	at net.minecraft.client.Minecraft.init(Minecraft.java:513) [Minecraft.class:?]
	at net.minecraft.client.Minecraft.run(Minecraft.java:378) [Minecraft.class:?]
	at net.minecraft.client.main.Main.main(Main.java:118) [Main.class:?]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[?:1.8.0_392]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[?:1.8.0_392]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[?:1.8.0_392]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[?:1.8.0_392]
	at net.minecraft.launchwrapper.Launch.launch(Launch.java:135) [launchwrapper-1.12.jar:?]
	at net.minecraft.launchwrapper.Launch.main(Launch.java:28) [launchwrapper-1.12.jar:?]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[?:1.8.0_392]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[?:1.8.0_392]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[?:1.8.0_392]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[?:1.8.0_392]
	at net.minecraftforge.legacydev.Main.start(Main.java:86) [legacydev-0.2.3.1-fatjar.jar:0.2.3.1+4+372be23]
	at net.minecraftforge.legacydev.MainClient.main(MainClient.java:29) [legacydev-0.2.3.1-fatjar.jar:0.2.3.1+4+372be23]
Caused by: net.minecraft.client.renderer.block.model.ModelBlockDefinition$MissingVariantException
	at net.minecraft.client.renderer.block.model.ModelBlockDefinition.getVariant(ModelBlockDefinition.java:83) ~[ModelBlockDefinition.class:?]
	at net.minecraftforge.client.model.ModelLoader$VariantLoader.loadModel(ModelLoader.java:1175) ~[ModelLoader$VariantLoader.class:?]
	at net.minecraftforge.client.model.ModelLoaderRegistry.getModel(ModelLoaderRegistry.java:157) ~[ModelLoaderRegistry.class:?]
	... 20 more
