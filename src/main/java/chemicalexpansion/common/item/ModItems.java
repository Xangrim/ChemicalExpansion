package chemicalexpansion.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/********************************
 Copyright (C) Xangrim, 2016
 All rights reserved

 Class: ModItems
 Created: 10/12/2016, 15:14:00
 Project: Chemical_Expansion
 Description: Contains the items to be registered in the game
 ********************************/

public class ModItems {

    public static ItemBase eItem;
    public static ItemBase ingot_beryllium;
    public static ItemBase ingot_magnesium;
    public static ItemBase ingot_aluminium;
    public static ItemBase ingot_silicon;
    public static ItemBase ingot_scandium;
    public static ItemBase ingot_titanium;
    public static ItemBase ingot_vanadium;
    public static ItemBase ingot_chromium;
    public static ItemBase ingot_manganese;
    public static ItemBase ingot_cobalt;
    public static ItemBase ingot_nickel;
    public static ItemBase ingot_copper;
    public static ItemBase ingot_zinc;
    public static ItemBase ingot_gallium;
    public static ItemBase ingot_germanium;
    public static ItemBase ingot_selenium;
    public static ItemBase ingot_yttrium;
    public static ItemBase ingot_zirconium;
    public static ItemBase ingot_niobium;
    public static ItemBase ingot_molybdenum;
    public static ItemBase ingot_ruthenium;
    public static ItemBase ingot_rhodium;
    public static ItemBase ingot_palladium;
    public static ItemBase ingot_silver;
    public static ItemBase ingot_cadmium;
    public static ItemBase ingot_indium;
    public static ItemBase ingot_tin;
    public static ItemBase ingot_antimony;
    public static ItemBase ingot_tellurium;
    public static ItemBase ingot_neodymium;
    public static ItemBase ingot_hafnium;
    public static ItemBase ingot_tantalum;
    public static ItemBase ingot_tungsten;
    public static ItemBase ingot_rhenium;
    public static ItemBase ingot_osmium;
    public static ItemBase ingot_iridium;
    public static ItemBase ingot_platinum;
    public static ItemBase ingot_thallium;
    public static ItemBase ingot_lead;
    public static ItemBase ingot_bismuth;
    public static ItemBase ingot_americium;
    public static ItemBase ingot_curium;
    public static ItemBase ingot_berkelium;
    public static ItemBase ingot_californium;

    public static void init() {
        register(ingot_beryllium = new ItemBase("ingot_beryllium"));
        register(ingot_magnesium = new ItemBase("ingot_magnesium"));
        register(ingot_aluminium = new ItemBase("ingot_aluminium"));
        register(ingot_silicon = new ItemBase("ingot_silicon"));
        register(ingot_scandium = new ItemBase("ingot_scandium"));
        register(ingot_titanium = new ItemBase("ingot_titanium"));
        register(ingot_vanadium = new ItemBase("ingot_vanadium"));
        register(ingot_chromium = new ItemBase("ingot_chromium"));
        register(ingot_manganese = new ItemBase("ingot_manganese"));
        register(ingot_cobalt = new ItemBase("ingot_cobalt"));
        register(ingot_nickel = new ItemBase("ingot_nickel"));
        register(ingot_copper = new ItemBase("ingot_copper"));
        register(ingot_zinc = new ItemBase("ingot_zinc"));
        register(ingot_gallium = new ItemBase("ingot_gallium"));
        register(ingot_germanium = new ItemBase("ingot_germanium"));
        register(ingot_selenium = new ItemBase("ingot_selenium"));
        register(ingot_yttrium = new ItemBase("ingot_yttrium"));
        register(ingot_zirconium = new ItemBase("ingot_zirconium"));
        register(ingot_niobium = new ItemBase("ingot_niobium"));
        register(ingot_molybdenum = new ItemBase("ingot_molybdenum"));
        register(ingot_ruthenium = new ItemBase("ingot_ruthenium"));
        register(ingot_rhodium = new ItemBase("ingot_rhodium"));
        register(ingot_palladium = new ItemBase("ingot_palladium"));
        register(ingot_silver = new ItemBase("ingot_silver"));
        register(ingot_cadmium = new ItemBase("ingot_cadmium"));
        register(ingot_indium = new ItemBase("ingot_indium"));
        register(ingot_tin = new ItemBase("ingot_tin"));
        register(ingot_antimony = new ItemBase("ingot_antimony"));
        register(ingot_tellurium = new ItemBase("ingot_tellurium"));
        register(ingot_neodymium = new ItemBase("ingot_neodymium"));
        register(ingot_hafnium = new ItemBase("ingot_hafnium"));
        register(ingot_tantalum = new ItemBase("ingot_tantalum"));
        register(ingot_tungsten = new ItemBase("ingot_tungsten"));
        register(ingot_rhenium = new ItemBase("ingot_rhenium"));
        register(ingot_osmium = new ItemBase("ingot_osmium"));
        register(ingot_iridium = new ItemBase("ingot_iridium"));
        register(ingot_platinum = new ItemBase("ingot_platinum"));
        register(ingot_thallium = new ItemBase("ingot_thallium"));
        register(ingot_lead = new ItemBase("ingot_lead"));
        register(ingot_bismuth = new ItemBase("ingot_bismuth"));
        register(ingot_americium = new ItemBase("ingot_americium"));
        register(ingot_curium = new ItemBase("ingot_curium"));
        register(ingot_berkelium = new ItemBase("ingot_berkelium"));
        register(ingot_californium = new ItemBase("ingot_californium"));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemBase) {
            ((ItemBase)item).registerItemModel();
        }

        return item;
    }
}
