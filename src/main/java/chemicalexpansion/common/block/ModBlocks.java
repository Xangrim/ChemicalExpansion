package chemicalexpansion.common.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/********************************
 Copyright (C) Xangrim, 2016
 All rights reserved

 Class: 
 Created: 11/12/2016, 11:45:34
 Project: Chemical_Expansion
 Description: 
 ********************************/

public class ModBlocks {

    public static BlockOre ore_chalcopyrite;
    public static BlockOre ore_sphalerite;
    public static BlockOre ore_ilmenite;
    public static BlockOre ore_garnierite;
    public static BlockOre ore_galena;
    public static BlockOre ore_bauxite;
    public static BlockOre ore_wolframite;
    public static BlockOre ore_pyrolusite;

    public static void init() {
        ore_chalcopyrite = register(new BlockOre("ore_chalcopyrite"));
        ore_sphalerite = register(new BlockOre("ore_sphalerite"));
        ore_ilmenite = register(new BlockOre("ore_ilmenite"));
        ore_garnierite = register(new BlockOre("ore_garnierite"));
        ore_galena = register(new BlockOre("ore_galena"));
        ore_bauxite = register(new BlockOre("ore_bauxite"));
        ore_wolframite = register(new BlockOre("ore_wolframite"));
        ore_pyrolusite = register(new BlockOre("ore_pyrolusite"));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof BlockBase) {
            ((BlockBase)block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
