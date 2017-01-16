package chemicalexpansion.proxy;

import chemicalexpansion.ChemicalExpansion;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/********************************
 Copyright (C) Xangrim, 2016
 All rights reserved

 Class: ClientProxy
 Created: 10/12/2016, 15:01:20
 Project: Chemical_Expansion
 Description: 
 ********************************/

public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        //ModelResourceLocation loc = new ModelResourceLocation("chemicalexpansion:" + id, "inventory");
        //ModelLoader.setCustomModelResourceLocation(item, meta, loc);
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ChemicalExpansion.MODID + ":" + id, "inventory"));
        System.out.println("MODID is " + ChemicalExpansion.MODID);
        System.out.println("Item ID is " + id);
    }
}
