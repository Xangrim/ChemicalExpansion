package chemicalexpansion.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/********************************
 Copyright (C) Xangrim, 2016
 All rights reserved

 Class: 
 Created: 11/12/2016, 11:43:12
 Project: Chemical_Expansion
 Description: 
 ********************************/

public class BlockOre extends BlockBase {

    public BlockOre(String name) {
        super(Material.ROCK, name);

        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
