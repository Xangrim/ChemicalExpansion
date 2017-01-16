package chemicalexpansion.common.block;

import chemicalexpansion.ChemicalExpansion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

/********************************
 Copyright (C) Xangrim, 2016
 All rights reserved

 Class: 
 Created: 11/12/2016, 11:40:52
 Project: Chemical_Expansion
 Description: 
 ********************************/

public class BlockBase extends Block {

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ChemicalExpansion.creativeTabMain);
    }

    public void registerItemModel(ItemBlock itemBlock) {
        ChemicalExpansion.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
