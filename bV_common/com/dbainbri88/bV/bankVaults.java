package com.dbainbri88.bV;

import network.PacketHandler;
import proxies.CommonProxy;

import com.dbainbri88.bV.lib.reference;

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

@Mod( modid = reference.MOD_ID,name = reference.MOD_NAME, version = reference.VERSION)
@NetworkMod(channels = {"bV_channel"}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class bankVaults {
    
    @Instance("BankVaults")
    public static bankVaults bankvaults;
    
    @SidedProxy(clientSide = "proxies.ClientProxy", serverSide = "proxies.CommonProxy")
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
