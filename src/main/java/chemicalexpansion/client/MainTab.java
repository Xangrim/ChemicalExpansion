package chemicalexpansion.client;

import chemicalexpansion.ChemicalExpansion;
import chemicalexpansion.common.block.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/********************************
 Copyright (C) Xangrim, 2016
 All rights reserved

 Class: 
 Created: 21/12/2016, 22:59:52
 Project: Chemical_Expansion
 Description: 
 ********************************/

public class MainTab extends CreativeTabs {

    public MainTab() {
        super(ChemicalExpansion.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.ore_chalcopyrite);
    }

}
