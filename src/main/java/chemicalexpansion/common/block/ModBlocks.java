package chemicalexpansion.common.block;

import chemicalexpansion.common.block.counter.BlockCounter;
import chemicalexpansion.common.item.ItemOreDict;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
    // Extension
    public static BlockOre ore_cinnabar;
    public static BlockOre ore_cassiterite;
    public static BlockOre ore_columbite;
    public static BlockOre ore_tantalite;
    public static BlockOre ore_argentite;
    public static BlockOre ore_cobaltite;
    public static BlockOre ore_molybdenite;
    public static BlockOre ore_magnesite;
    public static BlockOre ore_beryl;
    public static BlockOre ore_sperrylite;
    public static BlockOre ore_spodumene;
    public static BlockOre ore_uraninite;
    public static BlockOre ore_baryte;
    public static BlockOre ore_ulexite;
    public static BlockOre ore_apatite;
    public static BlockOre ore_sulfur;
    public static BlockOre ore_pollucite;
    //
    public static BlockBase block_copper;
    public static BlockBase block_zinc;
    public static BlockBase block_titanium;
    public static BlockBase block_nickel;
    public static BlockBase block_lead;
    public static BlockBase block_aluminium;
    public static BlockBase block_tungsten;
    public static BlockBase block_manganese;
    public static BlockCounter counter;

    public static void init() {
        // Ores
        ore_chalcopyrite = register(new BlockOre("ore_chalcopyrite", "oreCopper"));
        ore_sphalerite = register(new BlockOre("ore_sphalerite", "oreZinc"));
        ore_ilmenite = register(new BlockOre("ore_ilmenite", "oreTitanium"));
        ore_garnierite = register(new BlockOre("ore_garnierite", "oreNickel"));
        ore_galena = register(new BlockOre("ore_galena", "oreLead"));
        ore_bauxite = register(new BlockOre("ore_bauxite", "oreAluminium"));
        ore_wolframite = register(new BlockOre("ore_wolframite", "oreTungsten"));
        ore_pyrolusite = register(new BlockOre("ore_pyrolusite", "oreManganese"));
        // Extension
        ore_cinnabar = register(new BlockOre("ore_cinnabar", "oreMercury"));
        // Material Blocks
        block_copper = register(new BlockBase(Material.IRON, "block_copper"));
        block_zinc = register(new BlockBase(Material.IRON, "block_zinc"));
        block_titanium = register(new BlockBase(Material.IRON, "block_titanium"));
        block_nickel = register(new BlockBase(Material.IRON, "block_nickel"));
        block_lead = register(new BlockBase(Material.IRON, "block_lead"));
        block_aluminium = register(new BlockBase(Material.IRON, "block_aluminium"));
        block_tungsten = register(new BlockBase(Material.IRON, "block_tungsten"));
        block_manganese = register(new BlockBase(Material.IRON, "block_manganese"));
        // Machines
        counter = register(new BlockCounter());
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof BlockBase) {
            ((BlockBase)block).registerItemModel(itemBlock);
        }
        if (block instanceof ItemOreDict) {
            ((ItemOreDict)block).initOreDict();
        }
        if (itemBlock instanceof ItemOreDict) {
            ((ItemOreDict)itemBlock).initOreDict();
        }
        if (block instanceof BlockTileEntity) {
            GameRegistry.registerTileEntity(((BlockTileEntity<?>)block).getTileEntityClass(), block.getRegistryName().toString());
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
