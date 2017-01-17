package chemicalexpansion.common.item;

import net.minecraftforge.oredict.OreDictionary;

/********************************
 Copyright (C) Xangrim, 2017
 All rights reserved

 Class: ItemOre
 Created: 17/01/2017, 13:14:02
 Project: ChemicalExpansion
 Description: Class for ore-dictionatied items
 ********************************/

public class ItemOre extends ItemBase implements ItemOreDict {

    private String oreName;

    public ItemOre(String name, String oreName) {
        super(name);
        this.oreName = oreName;
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }

}
