package chemicalexpansion.common.item;

import chemicalexpansion.ChemicalExpansion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.List;

/********************************
 Copyright (C) Xangrim, 2016
 All rights reserved

 Class: ItemBase
 Created: 10/12/2016, 15:05:13
 Project: Chemical_Expansion
 Description: Base class for items in this mod
 ********************************/

public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ChemicalExpansion.creativeTabMain);
    }

    public void registerItemModel() {
        ChemicalExpansion.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
