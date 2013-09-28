package dbainbri88_bV;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import dbainbri88_bV.lib.reference;
import dbainbri88_bV.network.PacketHandler;
import dbainbri88_bV.proxies.CommonProxy;

@Mod( modid = reference.MOD_ID,name = reference.MOD_NAME, version = reference.VERSION)
@NetworkMod(channels = {reference.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class bankVaults {
    
    @Instance(reference.MOD_ID)
    public static bankVaults bankvaults;
    
    @SidedProxy(clientSide = "dbainbri88_bV.proxies.ClientProxy", serverSide = "dbainbri88_bV.proxies.CommonProxy")
    public static CommonProxy proxy;
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        proxy.initSounds();
        proxy.initRenderers();
    }
    
    @Init
    public void init(FMLInitializationEvent event) {
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
