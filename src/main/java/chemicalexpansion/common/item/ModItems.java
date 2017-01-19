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

    public static ItemOre ingot_beryllium;
    public static ItemOre ingot_magnesium;
    public static ItemOre ingot_aluminium;
    public static ItemOre ingot_silicon;
    public static ItemOre ingot_scandium;
    public static ItemOre ingot_titanium;
    public static ItemOre ingot_vanadium;
    public static ItemOre ingot_chromium;
    public static ItemOre ingot_manganese;
    public static ItemOre ingot_cobalt;
    public static ItemOre ingot_nickel;
    public static ItemOre ingot_copper;
    public static ItemOre ingot_zinc;
    public static ItemOre ingot_gallium;
    public static ItemOre ingot_germanium;
    public static ItemOre ingot_selenium;
    public static ItemOre ingot_yttrium;
    public static ItemOre ingot_zirconium;
    public static ItemOre ingot_niobium;
    public static ItemOre ingot_molybdenum;
    public static ItemOre ingot_ruthenium;
    public static ItemOre ingot_rhodium;
    public static ItemOre ingot_palladium;
    public static ItemOre ingot_silver;
    public static ItemOre ingot_cadmium;
    public static ItemOre ingot_indium;
    public static ItemOre ingot_tin;
    public static ItemOre ingot_antimony;
    public static ItemOre ingot_tellurium;
    public static ItemOre ingot_neodymium;
    public static ItemOre ingot_hafnium;
    public static ItemOre ingot_tantalum;
    public static ItemOre ingot_tungsten;
    public static ItemOre ingot_rhenium;
    public static ItemOre ingot_osmium;
    public static ItemOre ingot_iridium;
    public static ItemOre ingot_platinum;
    public static ItemOre ingot_thallium;
    public static ItemOre ingot_lead;
    public static ItemOre ingot_bismuth;
    public static ItemOre ingot_americium;
    public static ItemOre ingot_curium;
    public static ItemOre ingot_berkelium;
    public static ItemOre ingot_californium;
    public static ItemOre dust_copper;
    public static ItemOre dust_aluminium;
    public static ItemOre dust_zinc;
    public static ItemOre dust_nickel;
    public static ItemOre dust_titanium;
    public static ItemOre dust_manganese;
    public static ItemOre dust_tungsten;
    public static ItemOre dust_iron;
    public static ItemOre dust_lead;

    public static void init() {
        register(ingot_beryllium = new ItemOre("ingot_beryllium", "ingotBeryllium"));       // 4
        register(ingot_magnesium = new ItemOre("ingot_magnesium", "ingotMagnesium"));       // 12
        register(ingot_aluminium = new ItemOre("ingot_aluminium", "ingotAluminium"));       // 13
        register(ingot_silicon = new ItemOre("ingot_silicon", "ingotSilicon"));             // 14
        register(ingot_scandium = new ItemOre("ingot_scandium", "ingotScandium"));          // 
        register(ingot_titanium = new ItemOre("ingot_titanium", "ingotTitanium"));          // 
        register(ingot_vanadium = new ItemOre("ingot_vanadium", "ingotVanadium"));          // 
        register(ingot_chromium = new ItemOre("ingot_chromium", "ingotChromium"));          // 
        register(ingot_manganese = new ItemOre("ingot_manganese", "ingotManganese"));       // 
        register(ingot_cobalt = new ItemOre("ingot_cobalt", "ingotCobalt"));                // 
        register(ingot_nickel = new ItemOre("ingot_nickel", "ingotNickel"));                // 
        register(ingot_copper = new ItemOre("ingot_copper", "ingotCopper"));                // 
        register(ingot_zinc = new ItemOre("ingot_zinc", "ingotZinc"));                      // 
        register(ingot_gallium = new ItemOre("ingot_gallium", "ingotGallium"));             // 
        register(ingot_germanium = new ItemOre("ingot_germanium", "ingotGermanium"));       // 
        register(ingot_selenium = new ItemOre("ingot_selenium", "ingotSelenium"));          // 
        register(ingot_yttrium = new ItemOre("ingot_yttrium", "ingotYttrium"));             // 
        register(ingot_zirconium = new ItemOre("ingot_zirconium", "ingotZirconium"));       // 
        register(ingot_niobium = new ItemOre("ingot_niobium", "ingotNiobium"));             // 
        register(ingot_molybdenum = new ItemOre("ingot_molybdenum", "ingotMolybdenum"));    // 
        register(ingot_ruthenium = new ItemOre("ingot_ruthenium", "ingotRuthenium"));       // 
        register(ingot_rhodium = new ItemOre("ingot_rhodium", "ingotRhodium"));             // 
        register(ingot_palladium = new ItemOre("ingot_palladium", "ingotPalladium"));       // 
        register(ingot_silver = new ItemOre("ingot_silver", "ingotSilver"));                // 
        register(ingot_cadmium = new ItemOre("ingot_cadmium", "ingotCadmium"));             // 
        register(ingot_indium = new ItemOre("ingot_indium", "ingotIndium"));                // 
        register(ingot_tin = new ItemOre("ingot_tin", "ingotTin"));                         // 
        register(ingot_antimony = new ItemOre("ingot_antimony", "ingotAntimony"));          // 
        register(ingot_tellurium = new ItemOre("ingot_tellurium", "ingotTellurium"));       // 
        register(ingot_neodymium = new ItemOre("ingot_neodymium", "ingotNeodymium"));       // 
        register(ingot_hafnium = new ItemOre("ingot_hafnium", "ingotHafnium"));             // 
        register(ingot_tantalum = new ItemOre("ingot_tantalum", "ingotTantalum"));          // 
        register(ingot_tungsten = new ItemOre("ingot_tungsten", "ingotTungsten"));          // 
        register(ingot_rhenium = new ItemOre("ingot_rhenium", "ingotRhenium"));             // 
        register(ingot_osmium = new ItemOre("ingot_osmium", "ingotOsmium"));                // 
        register(ingot_iridium = new ItemOre("ingot_iridium", "ingotIridium"));             // 
        register(ingot_platinum = new ItemOre("ingot_platinum", "ingotPlatinum"));          // 
        register(ingot_thallium = new ItemOre("ingot_thallium", "ingotThallium"));          // 
        register(ingot_lead = new ItemOre("ingot_lead", "ingotLead"));                      // 
        register(ingot_bismuth = new ItemOre("ingot_bismuth", "ingotBismuth"));             // 
        register(ingot_americium = new ItemOre("ingot_americium", "ingotAmericium"));       // 
        register(ingot_curium = new ItemOre("ingot_curium", "ingotCurium"));                // 
        register(ingot_berkelium = new ItemOre("ingot_berkelium", "ingotBerkelium"));       // 
        register(ingot_californium = new ItemOre("ingot_californium", "ingotCalifornium")); // 
        // Dusts
        register(dust_beryllium = new ItemOre("dust_beryllium", "dustBeryllium"));       // 4
        register(dust_magnesium = new ItemOre("dust_magnesium", "dustMagnesium"));       // 12
        register(dust_aluminium = new ItemOre("dust_aluminium", "dustAluminium"));       // 13
        register(dust_silicon = new ItemOre("dust_silicon", "dustSilicon"));             // 14
        register(dust_scandium = new ItemOre("dust_scandium", "dustScandium"));          // 
        register(dust_titanium = new ItemOre("dust_titanium", "dustTitanium"));          // 
        register(dust_vanadium = new ItemOre("dust_vanadium", "dustVanadium"));          // 
        register(dust_chromium = new ItemOre("dust_chromium", "dustChromium"));          // 
        register(dust_manganese = new ItemOre("dust_manganese", "dustManganese"));       // 
        register(dust_cobalt = new ItemOre("dust_cobalt", "dustCobalt"));                // 
        register(dust_nickel = new ItemOre("dust_nickel", "dustNickel"));                // 
        register(dust_copper = new ItemOre("dust_copper", "dustCopper"));                // 
        register(dust_zinc = new ItemOre("dust_zinc", "dustZinc"));                      // 
        register(dust_gallium = new ItemOre("dust_gallium", "dustGallium"));             // 
        register(dust_germanium = new ItemOre("dust_germanium", "dustGermanium"));       // 
        register(dust_selenium = new ItemOre("dust_selenium", "dustSelenium"));          // 
        register(dust_yttrium = new ItemOre("dust_yttrium", "dustYttrium"));             // 
        register(dust_zirconium = new ItemOre("dust_zirconium", "dustZirconium"));       // 
        register(dust_niobium = new ItemOre("dust_niobium", "dustNiobium"));             // 
        register(dust_molybdenum = new ItemOre("dust_molybdenum", "dustMolybdenum"));    // 
        register(dust_ruthenium = new ItemOre("dust_ruthenium", "dustRuthenium"));       // 
        register(dust_rhodium = new ItemOre("dust_rhodium", "dustRhodium"));             // 
        register(dust_palladium = new ItemOre("dust_palladium", "dustPalladium"));       // 
        register(dust_silver = new ItemOre("dust_silver", "dustSilver"));                // 
        register(dust_cadmium = new ItemOre("dust_cadmium", "dustCadmium"));             // 
        register(dust_indium = new ItemOre("dust_indium", "dustIndium"));                // 
        register(dust_tin = new ItemOre("dust_tin", "dustTin"));                         // 
        register(dust_antimony = new ItemOre("dust_antimony", "dustAntimony"));          // 
        register(dust_tellurium = new ItemOre("dust_tellurium", "dustTellurium"));       // 
        register(dust_neodymium = new ItemOre("dust_neodymium", "dustNeodymium"));       // 
        register(dust_hafnium = new ItemOre("dust_hafnium", "dustHafnium"));             // 
        register(dust_tantalum = new ItemOre("dust_tantalum", "dustTantalum"));          // 
        register(dust_tungsten = new ItemOre("dust_tungsten", "dustTungsten"));          // 
        register(dust_rhenium = new ItemOre("dust_rhenium", "dustRhenium"));             // 
        register(dust_osmium = new ItemOre("dust_osmium", "dustOsmium"));                // 
        register(dust_iridium = new ItemOre("dust_iridium", "dustIridium"));             // 
        register(dust_platinum = new ItemOre("dust_platinum", "dustPlatinum"));          // 
        register(dust_thallium = new ItemOre("dust_thallium", "dustThallium"));          // 
        register(dust_lead = new ItemOre("dust_lead", "dustLead"));                      // 
        register(dust_bismuth = new ItemOre("dust_bismuth", "dustBismuth"));             // 
        register(dust_americium = new ItemOre("dust_americium", "dustAmericium"));       // 
        register(dust_curium = new ItemOre("dust_curium", "dustCurium"));                // 
        register(dust_berkelium = new ItemOre("dust_berkelium", "dustBerkelium"));       // 
        register(dust_californium = new ItemOre("dust_californium", "dustCalifornium")); // 
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);
        if (item instanceof ItemBase) {
            ((ItemBase)item).registerItemModel();
        }
        if(item instanceof ItemOreDict) {
            ((ItemOreDict)item).initOreDict();
        }
        return item;
    }

}
