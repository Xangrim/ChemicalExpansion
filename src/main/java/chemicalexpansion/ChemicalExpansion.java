package chemicalexpansion;

import chemicalexpansion.client.MainTab;
import chemicalexpansion.common.block.ModBlocks;
import chemicalexpansion.common.item.ModItems;
import chemicalexpansion.common.recipe.ModRecipes;
import chemicalexpansion.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/********************************
 Copyright (C) Xangrim, 2016
 All rights reserved

 Class: ChemicalExpansion
 Created: 10/12/2016, 14:47:35
 Project: Chemical_Expansion
 Description: Main class
 ********************************/

@Mod(modid = ChemicalExpansion.MODID, version = ChemicalExpansion.VERSION, name = ChemicalExpansion.NAME)
public class ChemicalExpansion {

    public static final String MODID = "chemicalexpansion";
    public static final String NAME = "Chemical Expansion";
    public static final String VERSION = "1.0";
    public static final MainTab creativeTabMain = new MainTab();

    @SidedProxy(serverSide = "chemicalexpansion.proxy.CommonProxy", clientSide = "chemicalexpansion.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static ChemicalExpansion instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(NAME + " is loading!");
        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
