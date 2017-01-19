package chemicalexpansion.common.block;

import chemicalexpansion.common.block.counter.BlockCounter;
import chemicalexpansion.common.item.BlockBaseDict;
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
    public static BlockOre ore_thortveitite;
    public static BlockOre ore_vanadinite;
    public static BlockOre ore_chromite;
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
        // Extension
        ore_beryl = register(new BlockOre("ore_beryl", "oreBeryllium"));
        ore_magnesite = register(new BlockOre("ore_magnesite", "oreMagnesium"));
        ore_bauxite = register(new BlockOre("ore_bauxite", "oreAluminium")); // chance for gallium
        ore_bauxite = register(new BlockOre("ore_thortveitite", "oreScandium"));
        ore_ilmenite = register(new BlockOre("ore_ilmenite", "oreTitanium"));
        ore_vanadinite = register(new BlockOre("ore_vanadinite", "oreVanadium"));
        ore_chromite = register(new BlockOre("ore_chromite", "oreChromium"));
        ore_pyrolusite = register(new BlockOre("ore_pyrolusite", "oreManganese"));
        ore_cobaltite = register(new BlockOre("ore_cobaltite", "oreCobalt"));
        ore_garnierite = register(new BlockOre("ore_garnierite", "oreNickel"));
        ore_chalcopyrite = register(new BlockOre("ore_chalcopyrite", "oreCopper")); // selenium crumb
        ore_sphalerite = register(new BlockOre("ore_sphalerite", "oreZinc")); // chance for germanium, gallium
        //se
        //yt
        //zr
        //ni
        //mo
        //ru
        //rh
        //pa
        ore_argentite = register(new BlockOre("ore_argentite", "oreSilver"));
        //cd
        //...
        ore_wolframite = register(new BlockOre("ore_wolframite", "oreTungsten"));
        //...
        ore_galena = register(new BlockOre("ore_galena", "oreLead"));
        //bi

        ore_cinnabar = register(new BlockOre("ore_cinnabar", "oreMercury"));
        // Material Blocks
        register(block_beryllium = new BlockBase(Material.IRON, "block_beryllium"));       // 4
        register(block_magnesium = new BlockBase(Material.IRON, "block_magnesium"));       // 12
        register(block_aluminium = new BlockBase(Material.IRON, "block_aluminium"));       // 13
        register(block_silicon = new BlockBase(Material.IRON, "block_silicon"));             // 14
        register(block_scandium = new BlockBase(Material.IRON, "block_scandium"));          // 
        register(block_titanium = new BlockBase(Material.IRON, "block_titanium"));          // 
        register(block_vanadium = new BlockBase(Material.IRON, "block_vanadium"));          // 
        register(block_chromium = new BlockBase(Material.IRON, "block_chromium"));          // 
        register(block_manganese = new BlockBase(Material.IRON, "block_manganese"));       // 
        register(block_cobalt = new BlockBase(Material.IRON, "block_cobalt"));                // 
        register(block_nickel = new BlockBase(Material.IRON, "block_nickel"));                // 
        register(block_copper = new BlockBase(Material.IRON, "block_copper"));                // 
        register(block_zinc = new BlockBase(Material.IRON, "block_zinc"));                      // 
        register(block_gallium = new BlockBase(Material.IRON, "block_gallium"));             // 
        register(block_germanium = new BlockBase(Material.IRON, "block_germanium"));       // 
        register(block_selenium = new BlockBase(Material.IRON, "block_selenium"));          // 
        register(block_yttrium = new BlockBase(Material.IRON, "block_yttrium"));             // 
        register(block_zirconium = new BlockBase(Material.IRON, "block_zirconium"));       // 
        register(block_niobium = new BlockBase(Material.IRON, "block_niobium"));             // 
        register(block_molybdenum = new BlockBase(Material.IRON, "block_molybdenum"));    // 
        register(block_ruthenium = new BlockBase(Material.IRON, "block_ruthenium"));       // 
        register(block_rhodium = new BlockBase(Material.IRON, "block_rhodium"));             // 
        register(block_palladium = new BlockBase(Material.IRON, "block_palladium"));       // 
        register(block_silver = new BlockBase(Material.IRON, "block_silver"));                // 
        register(block_cadmium = new BlockBase(Material.IRON, "block_cadmium"));             // 
        register(block_indium = new BlockBase(Material.IRON, "block_indium"));                // 
        register(block_tin = new BlockBase(Material.IRON, "block_tin"));                         // 
        register(block_antimony = new BlockBase(Material.IRON, "block_antimony"));          // 
        register(block_tellurium = new BlockBase(Material.IRON, "block_tellurium"));       // 
        register(block_neodymium = new BlockBase(Material.IRON, "block_neodymium"));       // 
        register(block_hafnium = new BlockBase(Material.IRON, "block_hafnium"));             // 
        register(block_tantalum = new BlockBase(Material.IRON, "block_tantalum"));          // 
        register(block_tungsten = new BlockBase(Material.IRON, "block_tungsten"));          // 
        register(block_rhenium = new BlockBase(Material.IRON, "block_rhenium"));             // 
        register(block_osmium = new BlockBase(Material.IRON, "block_osmium"));                // 
        register(block_iridium = new BlockBase(Material.IRON, "block_iridium"));             // 
        register(block_platinum = new BlockBase(Material.IRON, "block_platinum"));          // 
        register(block_thallium = new BlockBase(Material.IRON, "block_thallium"));          // 
        register(block_lead = new BlockBase(Material.IRON, "block_lead"));                      // 
        register(block_bismuth = new BlockBase(Material.IRON, "block_bismuth"));             // 
        register(block_americium = new BlockBase(Material.IRON, "block_americium"));       // 
        register(block_curium = new BlockBase(Material.IRON, "block_curium"));                // 
        register(block_berkelium = new BlockBase(Material.IRON, "block_berkelium"));       // 
        register(block_californium = new BlockBase(Material.IRON, "block_californium")); // 
        // Machines
        counter = register(new BlockCounter());
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof BlockBase) {
            ((BlockBase)block).registerItemModel(itemBlock);
        }
        if (block instanceof BlockBaseDict) {
            ((BlockBaseDict)block).initOreDict();
        }
        if (itemBlock instanceof BlockBaseDict) {
            ((BlockBaseDict)itemBlock).initOreDict();
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
