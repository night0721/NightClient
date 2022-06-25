package com.night.nightclient;

import org.lwjgl.opengl.Display;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = NightClient.MODID, version = NightClient.VERSION)
public class NightClient
{
    public static final String MODID = "Night Client";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Display.setTitle(MODID + " v" + VERSION);
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
