package chemicalexpansion.common.recipe;

import chemicalexpansion.common.block.ModBlocks;
import chemicalexpansion.common.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/********************************
 Copyright (C) Xangrim, 2017
 All rights reserved

 Class: ModRecipes
 Created: 17/01/2017, 08:00:42
 Project: ChemicalExpansion
 Description: Class to register all of the mod's recipes
 ********************************/

public class ModRecipes {

    public static void init() {
        GameRegistry.addSmelting(ModBlocks.ore_chalcopyrite, new ItemStack(ModItems.ingot_copper), 0.7f);
        GameRegistry.addSmelting(ModBlocks.ore_sphalerite, new ItemStack(ModItems.ingot_zinc), 0.7f);
        GameRegistry.addSmelting(ModBlocks.ore_ilmenite, new ItemStack(ModItems.ingot_titanium), 0.7f);
        GameRegistry.addSmelting(ModBlocks.ore_garnierite, new ItemStack(ModItems.ingot_nickel), 0.7f);
        GameRegistry.addSmelting(ModBlocks.ore_galena, new ItemStack(ModItems.ingot_lead), 0.7f);
        GameRegistry.addSmelting(ModBlocks.ore_bauxite, new ItemStack(ModItems.ingot_aluminium), 0.7f);
        GameRegistry.addSmelting(ModBlocks.ore_wolframite, new ItemStack(ModItems.ingot_tungsten), 0.7f);
        GameRegistry.addSmelting(ModBlocks.ore_pyrolusite, new ItemStack(ModItems.ingot_manganese), 0.7f);
    }

}
