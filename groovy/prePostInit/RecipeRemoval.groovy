package prePostInit

import gregicality.multiblocks.api.recipes.GCYMRecipeMaps;
import gregtech.api.GregTechAPI
import gregtech.api.gui.GuiTextures
import gregtech.api.recipes.GTRecipeHandler
import gregtech.api.recipes.Recipe
import gregtech.api.recipes.RecipeMaps
import gregtech.api.unification.OreDictUnifier
import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.unification.ore.OrePrefix
import gregtechfoodoption.recipe.GTFORecipeMaps
import supersymmetry.api.fluids.SusyFluidStorageKeys
import supersymmetry.api.gui.SusyGuiTextures
import static gregtech.api.recipes.GTRecipeHandler.*
import static gregtech.api.recipes.RecipeMaps.*

//Removed to make way for overhauls
GTRecipeHandler.removeAllRecipes(RecipeMaps.DISTILLERY_RECIPES)
GTRecipeHandler.removeAllRecipes(RecipeMaps.DISTILLATION_RECIPES)
GTRecipeHandler.removeAllRecipes(RecipeMaps.CRACKING_RECIPES)
GTRecipeHandler.removeAllRecipes(RecipeMaps.BREWING_RECIPES)
GTRecipeHandler.removeAllRecipes(RecipeMaps.CHEMICAL_RECIPES)
GTRecipeHandler.removeAllRecipes(RecipeMaps.LARGE_CHEMICAL_RECIPES)
GTRecipeHandler.removeAllRecipes(RecipeMaps.FERMENTING_RECIPES)
GTRecipeHandler.removeAllRecipes(RecipeMaps.PYROLYSE_RECIPES)
GTRecipeHandler.removeAllRecipes(RecipeMaps.IMPLOSION_RECIPES)
GTRecipeHandler.removeAllRecipes(RecipeMaps.LASER_ENGRAVER_RECIPES)
GTRecipeHandler.removeAllRecipes(GTFORecipeMaps.GREENHOUSE_RECIPES)
GTRecipeHandler.removeAllRecipes(RecipeMaps.VACUUM_RECIPES)
GTRecipeHandler.removeAllRecipes(RecipeMaps.ELECTROLYZER_RECIPES)
GTRecipeHandler.removeAllRecipes(GCYMRecipeMaps.ALLOY_BLAST_RECIPES)

// LPG * 370
mods.gregtech.centrifuge.removeByInput(5, null, [fluid('butane') * 320])
// LPG * 290
mods.gregtech.centrifuge.removeByInput(5, null, [fluid('propane') * 320])
// Clay Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustBrick')], null)
// Epoxy Resin Pulp * 1
mods.gregtech.centrifuge.removeByInput(5, [metaitem('dustReinforcedEpoxyResin')], null)
// Water * 1000
mods.gregtech.centrifuge.removeByInput(30, null, [fluid('gtfo_baking_soda_solution') * 1000])
// Clay Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustFireclay') * 2], null)
//Red sand centrifuging
mods.gregtech.centrifuge.removeByInput(30, [item('minecraft:sand', 1)], null)
// Nitrogen Dioxide * 3900
mods.gregtech.centrifuge.removeByInput(480, null, [fluid('ender_air') * 10000])
mods.gregtech.centrifuge.removeByInput(320, [metaitem('dustPlutonium')], null)
// Carbon Monoxide * 3900
mods.gregtech.centrifuge.removeByInput(120, null, [fluid('nether_air') * 10000])
// Nitrogen * 3900
mods.gregtech.centrifuge.removeByInput(7, null, [fluid('air') * 10000])
// Silicon Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [item('minecraft:redstone') * 10], null)
// Small Pile of Banded Iron Dust * 1
mods.gregtech.centrifuge.removeByInput(900, [metaitem('dustMetalMixture')], null)
// Silicon Dioxide Dust * 2
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustPlatinumSludgeResidue') * 5], null)
mods.gregtech.centrifuge.removeByInput(320, [metaitem('dustUranium')], null)
// Lead Dust * 1
mods.gregtech.centrifuge.removeByInput(30, null, [fluid('lead_zinc_solution') * 1000])
mods.gregtech.centrifuge.removeByInput(30, [item('minecraft:mycelium')], null)
// Antimony Dust * 2
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustStibnite') * 5], null)
// Raw Platinum Powder * 3
mods.gregtech.centrifuge.removeByInput(480, [metaitem('dustPlatinumGroupSludge') * 6], [fluid('aqua_regia') * 1200])
// Small Pile of Redstone Dust * 2
mods.gregtech.centrifuge.removeByInput(80, [item('minecraft:glowstone_dust') * 2], null)
// Small Pile of Quartzite Dust * 1
mods.gregtech.centrifuge.removeByInput(120, [metaitem('dustStone')], null)
// Sulfur Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustCinnabar') * 2], null)
// Aluminium Dust * 2
mods.gregtech.centrifuge.removeByInput(480, null, [fluid('green_sapphire_slurry') * 3000])
// Aluminium Dust * 2
mods.gregtech.centrifuge.removeByInput(480, null, [fluid('sapphire_slurry') * 3000])
// Aluminium Dust * 2
mods.gregtech.centrifuge.removeByInput(480, null, [fluid('ruby_slurry') * 3000])
// Helium * 120
mods.gregtech.centrifuge.removeByInput(20, [metaitem('dustEndstone')], null)
// Biomass * 200
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustMeat') * 3], null)
//Centrifuging dirt or grass
mods.gregtech.centrifuge.removeByInput(30, [item('minecraft:dirt')], null)
mods.gregtech.centrifuge.removeByInput(30, [item('minecraft:grass')], null)
// Magnesium Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustMarble') * 8], null)
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustAsh')], null)
// Calcium Dust * 3
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustTricalciumPhosphate') * 5], null)
// Samarium Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustSamariumMagnetic')], null)
// Neodymium Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustNeodymiumMagnetic')], null)
// Phosphorus Dust * 2
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustPhosphorusPentoxide') * 7], null)
// Iridium Chloride Dust * 4
mods.gregtech.centrifuge.removeByInput(120, [metaitem('dustIridiumMetalResidue') * 5], null)
// Oil * 80
mods.gregtech.centrifuge.removeByInput(80, [item('minecraft:soul_sand')], null)
// Methane * 60
mods.gregtech.centrifuge.removeByInput(20, [item('gregtech:rubber_log')], null)
// Methane * 4000
mods.gregtech.centrifuge.removeByInput(5, null, [fluid('refinery_gas') * 8000])
// Heavy Oil * 2000
mods.gregtech.centrifuge.removeByInput(30, [item('gregtech:ore_oilsands_0')], null)
// Enriched Uranium Hexafluoride * 100
mods.gregtech.centrifuge.removeByInput(480, null, [fluid('uranium_hexafluoride') * 1000])
// Tritium * 40
mods.gregtech.centrifuge.removeByInput(80, null, [fluid('deuterium') * 160])
// Helium-3 * 5
mods.gregtech.centrifuge.removeByInput(80, null, [fluid('helium') * 80])
//Centrifuging nether rack dust
mods.gregtech.centrifuge.removeByInput(20, [metaitem('dustNetherrack')], null)
// Deuterium * 40
mods.gregtech.centrifuge.removeByInput(20, null, [fluid('hydrogen') * 160])
// Arsenic Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustRealgar') * 2], null)
// Silicon Dioxide Dust * 4
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustGranite') * 5], null)
// Silicon Dioxide Dust * 4
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustGraniteBlack') * 5], null)
//Rare Earth
mods.gregtech.centrifuge.removeByInput(20, [metaitem('dustRareEarth')], null)
// Dark Ashes * 1
mods.gregtech.centrifuge.removeByInput(30, [item('minecraft:blaze_powder') * 2], null)
//Lava
mods.gregtech.centrifuge.removeByInput(80, null, [fluid('lava') * 100])
// Iron Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustIronMagnetic')], null)
// Steel Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustSteelMagnetic')], null)
// Steel Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustDamascusSteel')], null)
// Calcite Dust * 2
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustRedrock') * 3], null)
// Copper Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustAnnealedCopper')], null)
// Methane * 54
mods.gregtech.centrifuge.removeByInput(5, [item('biomesoplenty:persimmon')], null)
// Methane * 35
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:porkchop')], null)
// Methane * 94
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:pumpkin_pie')], null)
// Methane * 126
mods.gregtech.centrifuge.removeByInput(5, [item('quark:golden_frog_leg')], null)
// Methane * 144
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:rabbit_stew')], null)
// Methane * 35
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:beef')], null)
// Methane * 12
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:potato')], null)
// Methane * 58
mods.gregtech.centrifuge.removeByInput(5, [item('biomesoplenty:pear')], null)
// Methane * 130
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_porkchop')], null)
// Methane * 35
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:rabbit')], null)
// Methane * 40
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:rotten_flesh')], null)
// Methane * 18
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:red_mushroom')], null)
// Methane * 14
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:beetroot')], null)
// Methane * 119
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:golden_carrot')], null)
// Methane * 23
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:mutton')], null)
// Methane * 10
mods.gregtech.centrifuge.removeByInput(5, [item('biomesoplenty:berries')], null)
// Methane * 23
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:melon')], null)
// Methane * 18
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:nether_wart')], null)
// Methane * 47
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:apple')], null)
// Methane * 20
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:fish')], null)
// Methane * 20
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:fish', 1)], null)
// Methane * 10
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:fish', 2)], null)
// Methane * 10
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:fish', 3)], null)
// Methane * 38
mods.gregtech.centrifuge.removeByInput(5, [item('biomesoplenty:filled_honeycomb')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:component.corn.cob')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:food.lemon')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:food.lime')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:crop.olive')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:crop.tomato')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:crop.onion')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:crop.cucumber')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:food.banana')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:food.orange')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:food.mango')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:food.apricot')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:component.soybean')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:crop.coffee')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:component.pea_pod')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:seed.bean')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:component.horseradish')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:component.basil')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:component.oregano')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:component.artichoke')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:component.black_pepper')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:component.rice')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:component.garlic_bulb')], null)
// Methane * 34
mods.gregtech.centrifuge.removeByInput(5, [metaitem('gregtechfoodoption:crop.aubergine')], null)
// Methane * 72
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:bread')], null)
// Methane * 47
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:chorus_fruit')], null)
// Methane * 81
mods.gregtech.centrifuge.removeByInput(5, [item('quark:cooked_frog_leg')], null)
// Methane * 72
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_fish')], null)
// Methane * 97
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_fish', 1)], null)
// Methane * 23
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:chicken')], null)
// Methane * 72
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_rabbit')], null)
// Methane * 79
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:golden_apple')], null)
// Methane * 79
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:golden_apple', 1)], null)
// Methane * 23
mods.gregtech.centrifuge.removeByInput(5, [item('quark:frog_leg')], null)
// Methane * 130
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_beef')], null)
// Methane * 10
mods.gregtech.centrifuge.removeByInput(5, [item('biomesoplenty:shroompowder')], null)
// Methane * 18
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:brown_mushroom')], null)
// Methane * 86
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_chicken')], null)
// Methane * 12
mods.gregtech.centrifuge.removeByInput(5, [item('quark:crab_leg')], null)
// Methane * 54
mods.gregtech.centrifuge.removeByInput(5, [item('biomesoplenty:peach')], null)
// Methane * 86
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:mushroom_stew')], null)
// Methane * 130
mods.gregtech.centrifuge.removeByInput(5, [item('quark:cooked_crab_leg')], null)
// Methane * 72
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:baked_potato')], null)
// Methane * 86
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:beetroot_soup')], null)
// Methane * 29
mods.gregtech.centrifuge.removeByInput(5, [item('biomesoplenty:ricebowl')], null)
// Methane * 23
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:poisonous_potato')], null)
// Methane * 32
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:spider_eye')], null)
// Methane * 20
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cookie')], null)
// Methane * 97
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:cooked_mutton')], null)
// Methane * 43
mods.gregtech.centrifuge.removeByInput(5, [item('minecraft:carrot')], null)
// Methane Gas * 78
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:apple_baked')], null)
// Methane Gas * 86
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:carrot_roasted')], null)
// Methane Gas * 86
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:egg_roasted')], null)
// Methane Gas * 72
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:mushroom_brown_roasted')], null)
// Methane Gas * 72
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:mushroom_red_roasted')], null)
// Methane Gas * 34
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:beetroot_roasted')], null)
// Methane Gas * 20
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:burned_food')], null)
// Methane Gas * 22
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:strange_tuber')], null)
// Methane Gas * 10
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:pyroberry_wine')], null)
// Methane Gas * 10
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:gloamberry_wine')], null)
// Methane Gas * 10
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:freckleberry_wine')], null)
// Methane Gas * 9
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:tainted_meat')], null)
// Methane Gas * 20
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:pyroberries')], null)
// Methane Gas * 20
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:gloamberries')], null)
// Methane Gas * 20
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:freckleberries')], null)
// Methane Gas * 9
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:marshmallow')], null)
// Methane Gas * 20
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:marshmallow_roasted')], null)
// Methane Gas * 9
mods.gregtech.centrifuge.removeByInput(5, [item('pyrotech:marshmallow_burned')], null)
// Iron Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustYellowLimonite') * 4], null)
// Iron Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustBrownLimonite') * 4], null)
// Baking Soda Solution * 1000
mods.gregtech.mixer.removeByInput(8, [metaitem('dustSodiumBicarbonate')], [fluid('water') * 1000])
// Crushed Bauxite Ore * 1
mods.gregtech.forge_hammer.removeByInput(16, [item('gregtech:ore_bauxite_0')], null)
// Crushed Bauxite Ore * 2
mods.gregtech.macerator.removeByInput(2, [item('gregtech:ore_bauxite_0')], null)
// Flower Pot * 1
mods.gregtech.assembler.removeByInput(2, [item('minecraft:brick') * 3], null)
// Tungsten Steel * 2
mods.gregtech.mixer.removeByInput(1920, [metaitem('dustTungsten'), metaitem('dustSteel'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// Fertilizer * 4
mods.gregtech.mixer.removeByInput(30, [item('minecraft:dirt'), metaitem('dustWood') * 2, item('minecraft:sand') * 4], [fluid('water') * 1000])
mods.gregtech.blender.removeByInput(30, [item('minecraft:dirt'), metaitem('dustWood') * 2, item('minecraft:sand') * 4], [fluid('water') * 1000])
// Fertilizer Solution * 5000
mods.gregtech.mixer.removeByInput(16, [item('minecraft:dye', 15)], [fluid('water') * 5000])
mods.gregtech.blender.removeByInput(16, [item('minecraft:dye', 15)], [fluid('water') * 5000])
// Greenhouse Glass * 1
mods.gregtech.assembler.removeByInput(24, [metaitem('gregtechfoodoption:cupric_hydrogen_arsenite_dust'), item('gregtech:transparent_casing')], null)
furnace.removeByInput(item('minecraft:slime_ball'))
// Sticky Resin * 1
mods.gregtech.fluid_solidifier.removeByInput(8, [metaitem('shape.mold.ball')], [fluid('gtfo_rubber_sap') * 100])
mods.gregtech.centrifuge.removeByInput(5, [metaitem('rubber_drop')], null)
// Hot Titanium Ingot * 1
mods.gregtech.electric_blast_furnace.removeByInput(480, [metaitem('dustMagnesium') * 2], [fluid('titanium_tetrachloride') * 1000])
// Tungstic Acid Dust * 7
mods.gregtech.chemical_bath.removeByInput(960, [metaitem('dustScheelite') * 6], [fluid('hydrochloric_acid') * 2000])
// Tungstic Acid Dust * 7
mods.gregtech.chemical_bath.removeByInput(960, [metaitem('dustTungstate') * 7], [fluid('hydrochloric_acid') * 2000])
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), metaitem('dustCoke')], null)
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), metaitem('gemCoke')], null)
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), item('minecraft:coal') * 2], null)
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), metaitem('dustCoal') * 2], null)
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), metaitem('dustCharcoal') * 2], null)
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), item('minecraft:coal', 1) * 2], null)
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('dustCoke')], null)
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('gemCoke')], null)
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('dustCoal') * 2], null)
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('dustCharcoal') * 2], null)
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), item('minecraft:coal') * 2], null)
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), item('minecraft:coal', 1) * 2], null)
mods.gregtech.electric_blast_furnace.removeByInput(120, [item('minecraft:iron_ingot')], [fluid('oxygen') * 200])
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustIron'), metaitem('circuit.integrated').withNbt(["Configuration": 2])], [fluid('oxygen') * 200])
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('ingotWroughtIron')], [fluid('oxygen') * 200])
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustWroughtIron'), metaitem('circuit.integrated').withNbt(["Configuration": 2])], [fluid('oxygen') * 200])
mods.gregtech.electric_blast_furnace.removeByInput(1920, [metaitem('dustIron') * 4, metaitem('dustCarbon')], null)
mods.gregtech.electric_blast_furnace.removeByInput(1920, [metaitem('dustWroughtIron') * 4, metaitem('dustCarbon')], null)
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustSteel')], null)
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustSteelMagnetic')], null)
//COBALTITE MODIFICATION
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustCobaltite')], [fluid('oxygen') * 3000])
// Garnierite Dust * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustPentlandite')], [fluid('oxygen') * 3000])
// Cupric Oxide Dust * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustTetrahedrite')], [fluid('oxygen') * 3000])
// Cupric Oxide Dust * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustChalcopyrite'), metaitem('dustSiliconDioxide')], [fluid('oxygen') * 3000])
// Silver Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustRawElectrum') * 2], null)
// Aqua Regia * 3000
mods.gregtech.mixer.removeByInput(30, null, [fluid('nitric_acid') * 1000, fluid('hydrochloric_acid') * 2000])
mods.gregtech.blender.removeByInput(30, null, [fluid('nitric_acid') * 1000, fluid('hydrochloric_acid') * 2000])
// Silver Dust * 1
mods.gregtech.centrifuge.removeByInput(30, [metaitem('dustRawElectrum') * 2], null)
// Zincite Dust * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustSphalerite')], [fluid('oxygen') * 3000])
// Bastnasite Dust * 1
mods.gregtech.electromagnetic_separator.removeByInput(24, [metaitem('dustPureBastnasite')], null)
// Monazite Dust * 1
mods.gregtech.electromagnetic_separator.removeByInput(24, [metaitem('dustPureMonazite')], null)

// Aluminium Nugget * 3
mods.gregtech.electric_blast_furnace.removeByInput(100, [metaitem('dustRuby')], null)
//Remove EBF recipe with Aluminium Dust:
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustAluminium'), metaitem('circuit.integrated').withNbt(["Configuration": 2])], [fluid('nitrogen') * 1000])
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustAluminium'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// remove auto generated furnace recipe, split into separate normal/pure recipes.
furnace.removeByInput(metaitem('dustHighPurityAluminium'))
// Ruby Slurry * 3000
mods.gregtech.mixer.removeByInput(1920, [metaitem('crushedRuby') * 2], [fluid('aqua_regia') * 3000])
mods.gregtech.blender.removeByInput(1920, [metaitem('crushedRuby') * 2], [fluid('aqua_regia') * 3000])
// Sapphire Slurry * 3000
mods.gregtech.mixer.removeByInput(1920, [metaitem('crushedSapphire') * 2], [fluid('aqua_regia') * 3000])
mods.gregtech.blender.removeByInput(1920, [metaitem('crushedSapphire') * 2], [fluid('aqua_regia') * 3000])
// Green Sapphire Slurry * 3000
mods.gregtech.mixer.removeByInput(1920, [metaitem('crushedGreenSapphire') * 2], [fluid('aqua_regia') * 3000])
mods.gregtech.blender.removeByInput(1920, [metaitem('crushedGreenSapphire') * 2], [fluid('aqua_regia') * 3000])
// Small Pile of Mercury II Chloride Dust * 1
mods.gregtech.distillery.removeByInput(30, [metaitem('circuit.integrated').withNbt(["Configuration": 1])], [fluid('crude_gallium_trichloride') * 432])
//GALLIUM ARSENIDE PRODUCTION (LIQUID ENCAPSULATED CZOCHIRALSKI PROCESS)
mods.gregtech.mixer.removeByInput(7, [metaitem('dustGallium'), metaitem('dustArsenic'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
mods.gregtech.blender.removeByInput(7, [metaitem('dustGallium'), metaitem('dustArsenic'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustGalena')], [fluid('oxygen') * 3000])
// Silicon Carbide Plate * 1
mods.gregtech.compressor.removeByInput(2, [metaitem('dustSiliconCarbide')], null)
// Phosphorus-doped Monocrystalline Silicon Boule * 1
mods.gregtech.electric_blast_furnace.removeByInput(480, [metaitem('dustSilicon') * 64, metaitem('dustPhosphorus') * 8, metaitem('dustSmallGalliumArsenide') * 2], [fluid('nitrogen') * 8000])
// Naquadah-doped Monocrystalline Silicon Boule * 1
mods.gregtech.electric_blast_furnace.removeByInput(1920, [metaitem('blockSilicon') * 16, metaitem('ingotNaquadah'), metaitem('dustGalliumArsenide')], [fluid('argon') * 8000])
// Neutronium-doped Monocrystalline Silicon Boule * 1
mods.gregtech.electric_blast_furnace.removeByInput(7680, [metaitem('blockSilicon') * 32, metaitem('ingotNeutronium') * 4, metaitem('dustGalliumArsenide') * 2], [fluid('xenon') * 8000])
// Raw Silicon Wafer * 14
mods.gregtech.cutter.removeByInput(64, [metaitem('boule.silicon')], [fluid('lubricant') * 225])
// Raw Silicon Wafer * 14
mods.gregtech.cutter.removeByInput(64, [metaitem('boule.silicon')], [fluid('distilled_water') * 676])
// Raw Silicon Wafer * 14
mods.gregtech.cutter.removeByInput(64, [metaitem('boule.silicon')], [fluid('water') * 900])
// Fix Hot Silicon Ingot conflict with dust
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustSiliconDioxide') * 3, metaitem('dustCarbon') * 2], null)
// Tin Dust * 1
mods.gregtech.centrifuge.removeByInput(30, null, [fluid('crude_tin') * 1000])
// Antimony Trioxide Dust * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustStibnite')], [fluid('oxygen') * 3000])
// TODO: Fix later, GTFO changed bone china recipes
// Adapt to that in the future
//mods.gregtech.mixer.removeByInput(8, [item('minecraft:clay_ball'), metaitem('dustStone'), metaitem('dustApatite') * 2], null)
//mods.gregtech.blender.removeByInput(8, [item('minecraft:clay_ball'), metaitem('dustStone'), metaitem('dustApatite') * 2], null)
// Long Boron Carbide Rod * 1
mods.gregtech.forge_hammer.removeByInput(16, [metaitem('stickBoronCarbide') * 2], null)
crafting.removeByOutput(metaitem('stickIronMagnetic')) 
// Replace magnetic component recipes
// Extreme Voltage Coil * 1
mods.gregtech.assembler.removeByInput(1920, [metaitem('stickNeodymiumMagnetic'), metaitem('wireFineTungstenSteel') * 16, metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// Insane Voltage Coil * 1
mods.gregtech.assembler.removeByInput(7680, [metaitem('stickNeodymiumMagnetic'), metaitem('wireFineIridium') * 16, metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// Ludicrous Voltage Coil * 1
mods.gregtech.assembler.removeByInput(30720, [metaitem('stickSamariumMagnetic'), metaitem('wireFineOsmiridium') * 16, metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// Zero Point Module Voltage Coil * 1
mods.gregtech.assembler.removeByInput(122880, [metaitem('stickSamariumMagnetic'), metaitem('wireFineEuropium') * 16, metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// Ultimate Voltage Coil * 1
mods.gregtech.assembler.removeByInput(491520, [metaitem('stickSamariumMagnetic'), metaitem('wireFineTritanium') * 16, metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// Salt * 2
mods.gregtech.centrifuge.removeByInput(30, null, [fluid('salt_water') * 1000])
// Cetane-Boosted Diesel * 750
mods.gregtech.mixer.removeByInput(480, null, [fluid('bio_diesel') * 1000, fluid('tetranitromethane') * 40])
mods.gregtech.blender.removeByInput(480, null, [fluid('bio_diesel') * 1000, fluid('tetranitromethane') * 40])
// Cetane-Boosted Diesel * 1000
mods.gregtech.mixer.removeByInput(480, null, [fluid('diesel') * 1000, fluid('tetranitromethane') * 20])
mods.gregtech.blender.removeByInput(480, null, [fluid('diesel') * 1000, fluid('tetranitromethane') * 20])
// Diesel * 6000
mods.gregtech.mixer.removeByInput(120, null, [fluid('light_fuel') * 5000 * 5000, fluid('heavy_fuel') * 1000 * 1000])
// Fiber-Reinforced Epoxy Resin Sheet * 1
mods.gregtech.chemical_bath.removeByInput(16, [metaitem('wireFineBorosilicateGlass')], [fluid('epoxy') * 144])
// Fiber-Reinforced Epoxy Resin Sheet * 1
mods.gregtech.chemical_bath.removeByInput(16, [metaitem('carbon.fibers')], [fluid('epoxy') * 144])
// Liquid Polydimethylsiloxane * 144
mods.gregtech.extractor.removeByInput(30, [metaitem('dustPolydimethylsiloxane')], null)
// Ultra High Molecular Weight Polyethylene (UHMWPE) Plate * 1
mods.gregtech.compressor.removeByInput(2, [metaitem('dustUltraHighMolecularWeightPolyethylene')], null)
// Ultra High Molecular Weight Polyethylene (UHMWPE) Plate * 1
mods.gregtech.fluid_solidifier.removeByInput(7, [metaitem('shape.mold.plate')], [fluid('ultra_high_molecular_weight_polyethylene') * 144])
// Ultra High Molecular Weight Polyethylene (UHMWPE) * 144
mods.gregtech.extractor.removeByInput(30, [metaitem('plateUltraHighMolecularWeightPolyethylene')], null)
// Raw Rubber Pulp * 2
mods.gregtech.extractor.removeByInput(2, [item('minecraft:slime_ball')], null)
// Raw Rubber Pulp * 3
mods.gregtech.extractor.removeByInput(2, [metaitem('rubber_drop')], null)
// Raw Rubber Pulp * 1
mods.gregtech.extractor.removeByInput(2, [item('gregtech:rubber_sapling')], null)
// Raw Rubber Pulp * 1
mods.gregtech.extractor.removeByInput(2, [item('gregtech:rubber_leaves') * 16], null)
// Raw Rubber Pulp * 1
mods.gregtech.extractor.removeByInput(2, [item('gregtech:rubber_log')], null)
// Liquid Latex * 144
mods.gregtech.extractor.removeByInput(30, [metaitem('dustLatex')], null)
// Calcium Chloride
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustCalcite') * 5, metaitem('dustSalt') * 4], null)
// Soda Ash (Sodium Carbonate) Dust * 1
mods.gregtech.centrifuge.removeByInput(30, null, [fluid('gtfo_sodium_carbonate_solution') * 1000])
// Sodium Carbonate Solution * 1000
mods.gregtech.mixer.removeByInput(8, [metaitem('dustSodaAsh')], [fluid('water') * 1000])
mods.gregtech.blender.removeByInput(8, [metaitem('dustSodaAsh')], [fluid('water') * 1000])
// Dutched Chocolate Liquor * 1
mods.gregtech.chemical_bath.removeByInput(540, [metaitem('gregtechfoodoption:chocolate_liquor_refined_crushed')], [fluid('gtfo_sodium_carbonate_solution') * 1000])
//PATCH PHOSPHORUS DUPE
mods.gregtech.batch_reactor.removeByInput(30, [metaitem('dustPhosphorusPentoxide')], [fluid('water') * 6000])
// Nitration Mixture * 2000
mods.gregtech.mixer.removeByInput(2, null, [fluid('nitric_acid') * 1000, fluid('sulfuric_acid') * 1000])
mods.gregtech.blender.removeByInput(2, null, [fluid('nitric_acid') * 1000, fluid('sulfuric_acid') * 1000])
// Liquid Ice * 144
mods.gregtech.extractor.removeByInput(30, [item('minecraft:ice')], null)
mods.gregtech.extractor.removeByInput(30, [metaitem('dustIce')], null)
// Water * 144
mods.gregtech.fluid_heater.removeByInput(4, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('ice') * 144])
// Ice * 1
mods.gregtech.fluid_solidifier.removeByInput(7, [metaitem('shape.mold.block')], [fluid('ice') * 144])
// Small Sodium Battery * 1
mods.gregtech.canner.removeByInput(2, [metaitem('battery.hull.lv'), metaitem('dustSodium') * 2], null)
// Medium Sodium Battery * 1
mods.gregtech.canner.removeByInput(2, [metaitem('battery.hull.mv'), metaitem('dustSodium') * 8], null)
// Large Sodium Battery * 1
mods.gregtech.canner.removeByInput(2, [metaitem('battery.hull.hv'), metaitem('dustSodium') * 16], null)
// Small Lithium Battery * 1
mods.gregtech.canner.removeByInput(2, [metaitem('battery.hull.lv'), metaitem('dustLithium') * 2], null)
// Medium Lithium Battery * 1
mods.gregtech.canner.removeByInput(2, [metaitem('battery.hull.mv'), metaitem('dustLithium') * 8], null)
// Large Lithium Battery * 1
mods.gregtech.canner.removeByInput(2, [metaitem('battery.hull.hv'), metaitem('dustLithium') * 16], null)
// Small Cadmium Battery * 1
mods.gregtech.canner.removeByInput(2, [metaitem('battery.hull.lv'), metaitem('dustCadmium') * 2], null)
// Medium Cadmium Battery * 1
mods.gregtech.canner.removeByInput(2, [metaitem('battery.hull.mv'), metaitem('dustCadmium') * 8], null)
// Large Cadmium Battery * 1
mods.gregtech.canner.removeByInput(2, [metaitem('battery.hull.hv'), metaitem('dustCadmium') * 16], null)
mods.gregtech.autoclave.removeByInput(480, [metaitem('energium_dust') * 9], [fluid('water') * 1000])
mods.gregtech.autoclave.removeByInput(320, [metaitem('energium_dust') * 9], [fluid('distilled_water') * 1000])
mods.gregtech.autoclave.removeByInput(256, [metaitem('energium_dust') * 9], [fluid('black_steel') * 288])
mods.gregtech.autoclave.removeByInput(192, [metaitem('energium_dust') * 9], [fluid('blue_steel') * 72])
mods.gregtech.autoclave.removeByInput(480, [metaitem('dustLapotron') * 15], [fluid('water') * 1000])
mods.gregtech.autoclave.removeByInput(320, [metaitem('dustLapotron') * 15], [fluid('distilled_water') * 1000])
mods.gregtech.autoclave.removeByInput(256, [metaitem('dustLapotron') * 15], [fluid('blue_steel') * 288])
mods.gregtech.autoclave.removeByInput(192, [metaitem('dustLapotron') * 15], [fluid('red_steel') * 72])
// Diode * 2
mods.gregtech.assembler.removeByInput(30, [metaitem('wireFineAnnealedCopper') * 4, metaitem('dustSmallGalliumArsenide')], [fluid('glass') * 144])
// Diode * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('wireFineCopper') * 4, metaitem('dustSmallGalliumArsenide')], [fluid('glass') * 144])
// Diode * 4
mods.gregtech.assembler.removeByInput(30, [metaitem('wireFineAnnealedCopper') * 4, metaitem('wafer.silicon')], [fluid('plastic') * 144])
// Diode * 2
mods.gregtech.assembler.removeByInput(30, [metaitem('wireFineCopper') * 4, metaitem('wafer.silicon')], [fluid('plastic') * 144])
// Diode * 4
mods.gregtech.assembler.removeByInput(30, [metaitem('wireFineAnnealedCopper') * 4, metaitem('dustSmallGalliumArsenide')], [fluid('plastic') * 144])
// Diode * 2
mods.gregtech.assembler.removeByInput(30, [metaitem('wireFineCopper') * 4, metaitem('dustSmallGalliumArsenide')], [fluid('plastic') * 144])
// Resistor * 2
mods.gregtech.assembler.removeByInput(6, [metaitem('dustCoal'), metaitem('wireFineCopper') * 4], [fluid('glue') * 100])
// Resistor * 2
mods.gregtech.assembler.removeByInput(6, [metaitem('dustCharcoal'), metaitem('wireFineCopper') * 4], [fluid('glue') * 100])
// Resistor * 2
mods.gregtech.assembler.removeByInput(6, [metaitem('dustCarbon'), metaitem('wireFineCopper') * 4], [fluid('glue') * 100])
// Resistor * 4
mods.gregtech.assembler.removeByInput(6, [metaitem('dustCoal'), metaitem('wireFineAnnealedCopper') * 4], [fluid('glue') * 100])
// Resistor * 4
mods.gregtech.assembler.removeByInput(6, [metaitem('dustCharcoal'), metaitem('wireFineAnnealedCopper') * 4], [fluid('glue') * 100])
// Resistor * 4
mods.gregtech.assembler.removeByInput(6, [metaitem('dustCarbon'), metaitem('wireFineAnnealedCopper') * 4], [fluid('glue') * 100])
// Electronic Circuit * 2
mods.gregtech.circuit_assembler.removeByInput(16, [metaitem('circuit_board.basic'), metaitem('component.resistor') * 2, metaitem('wireGtSingleRedAlloy') * 2, metaitem('circuit.vacuum_tube') * 2], [fluid('tin') * 144])
// Electronic Circuit * 2
mods.gregtech.circuit_assembler.removeByInput(16, [metaitem('circuit_board.basic'), metaitem('component.resistor') * 2, metaitem('wireGtSingleRedAlloy') * 2, metaitem('circuit.vacuum_tube') * 2], [fluid('soldering_alloy') * 72])
crafting.removeByOutput(metaitem('component.resistor')) 
// MV Emitter * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('stickElectrum') * 4, metaitem('cableGtSingleCopper') * 2, metaitem('circuit.good_integrated') * 2, metaitem('gemFlawlessEmerald'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)

// HV Emitter * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('stickChrome') * 4, metaitem('cableGtSingleGold') * 2, metaitem('circuit.assembly') * 2, item('minecraft:ender_eye'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// EV Emitter * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('stickPlatinum') * 4, metaitem('cableGtSingleAluminium') * 2, metaitem('circuit.nano_assembly') * 2, metaitem('quantumeye'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// IV Emitter * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('stickIridium') * 4, metaitem('cableGtSingleTungsten') * 2, metaitem('circuit.quantum_assembly') * 2, metaitem('quantumstar'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// LuV Emitter * 1
mods.gregtech.assembly_line.removeByInput(6000, [metaitem('frameHsss'), metaitem('electric.motor.luv'), metaitem('stickLongRuridit') * 4, metaitem('quantumstar'), metaitem('circuit.crystal_assembly') * 2, metaitem('foilPalladium') * 64, metaitem('foilPalladium') * 32, metaitem('cableGtSingleNiobiumTitanium') * 4], [fluid('soldering_alloy') * 288])
// ZPM Emitter * 1
mods.gregtech.assembly_line.removeByInput(24000, [metaitem('frameNaquadahAlloy'), metaitem('electric.motor.zpm'), metaitem('stickLongOsmiridium') * 4, metaitem('quantumstar') * 2, metaitem('circuit.wetware_assembly') * 2, metaitem('foilTrinium') * 64, metaitem('foilTrinium') * 32, metaitem('cableGtSingleVanadiumGallium') * 4], [fluid('soldering_alloy') * 576])
// UV Emitter * 1
mods.gregtech.assembly_line.removeByInput(100000, [metaitem('frameTritanium'), metaitem('electric.motor.uv'), metaitem('stickLongTritanium') * 4, metaitem('gravistar'), metaitem('circuit.wetware_computer') * 2, metaitem('foilNaquadria') * 64, metaitem('foilNaquadria') * 32, metaitem('cableGtSingleYttriumBariumCuprate') * 4], [fluid('soldering_alloy') * 1152, fluid('naquadria') * 576])

// CPU * 8
mods.gregtech.cutter.removeByInput(120, [metaitem('wafer.central_processing_unit')], [fluid('lubricant') * 84])
// CPU * 8
mods.gregtech.cutter.removeByInput(120, [metaitem('wafer.central_processing_unit')], [fluid('distilled_water') * 253])
// CPU * 8
mods.gregtech.cutter.removeByInput(120, [metaitem('wafer.central_processing_unit')], [fluid('water') * 337])
// RAM * 32
mods.gregtech.cutter.removeByInput(96, [metaitem('wafer.random_access_memory')], [fluid('lubricant') * 67])
// RAM * 32
mods.gregtech.cutter.removeByInput(96, [metaitem('wafer.random_access_memory')], [fluid('distilled_water') * 202])
// RAM * 32
mods.gregtech.cutter.removeByInput(96, [metaitem('wafer.random_access_memory')], [fluid('water') * 270])
// ULPIC * 6
mods.gregtech.cutter.removeByInput(120, [metaitem('wafer.ultra_low_power_integrated_circuit')], [fluid('lubricant') * 84])
// ULPIC * 6
mods.gregtech.cutter.removeByInput(120, [metaitem('wafer.ultra_low_power_integrated_circuit')], [fluid('distilled_water') * 253])
// ULPIC * 6
mods.gregtech.cutter.removeByInput(120, [metaitem('wafer.ultra_low_power_integrated_circuit')], [fluid('water') * 337])
// LPIC * 4
mods.gregtech.cutter.removeByInput(480, [metaitem('wafer.low_power_integrated_circuit')], [fluid('lubricant') * 250])
// LPIC * 4
mods.gregtech.cutter.removeByInput(480, [metaitem('wafer.low_power_integrated_circuit')], [fluid('distilled_water') * 750])
// LPIC * 4
mods.gregtech.cutter.removeByInput(480, [metaitem('wafer.low_power_integrated_circuit')], [fluid('water') * 1000])
// Integrated Circuit * 8
mods.gregtech.cutter.removeByInput(64, [metaitem('wafer.integrated_logic_circuit')], [fluid('lubricant') * 45])
// Integrated Circuit * 8
mods.gregtech.cutter.removeByInput(64, [metaitem('wafer.integrated_logic_circuit')], [fluid('distilled_water') * 135])
// Integrated Circuit * 8
mods.gregtech.cutter.removeByInput(64, [metaitem('wafer.integrated_logic_circuit')], [fluid('water') * 180])
// PIC * 4
mods.gregtech.cutter.removeByInput(1920, [metaitem('wafer.power_integrated_circuit')], [fluid('lubricant') * 250])
// PIC * 4
mods.gregtech.cutter.removeByInput(1920, [metaitem('wafer.power_integrated_circuit')], [fluid('distilled_water') * 750])
// PIC * 4
mods.gregtech.cutter.removeByInput(1920, [metaitem('wafer.power_integrated_circuit')], [fluid('water') * 1000])
// NAND * 32
mods.gregtech.cutter.removeByInput(192, [metaitem('wafer.nand_memory_chip')], [fluid('lubricant') * 135])
// NAND * 32
mods.gregtech.cutter.removeByInput(192, [metaitem('wafer.nand_memory_chip')], [fluid('distilled_water') * 405])
// NAND * 32
mods.gregtech.cutter.removeByInput(192, [metaitem('wafer.nand_memory_chip')], [fluid('water') * 540])
// NOR * 16
mods.gregtech.cutter.removeByInput(192, [metaitem('wafer.nor_memory_chip')], [fluid('lubricant') * 135])
// NOR * 16
mods.gregtech.cutter.removeByInput(192, [metaitem('wafer.nor_memory_chip')], [fluid('distilled_water') * 405])
// NOR * 16
mods.gregtech.cutter.removeByInput(192, [metaitem('wafer.nor_memory_chip')], [fluid('water') * 540])
// LV Field Generator * 1
mods.gregtech.assembler.removeByInput(30, [item('minecraft:ender_pearl'), metaitem('plateSteel') * 2, metaitem('circuit.microprocessor') * 2, metaitem('wireGtQuadrupleManganesePhosphide') * 4], null)
// MV Field Generator * 1
mods.gregtech.assembler.removeByInput(30, [item('minecraft:ender_eye'), metaitem('plateAluminium') * 2, metaitem('circuit.processor') * 2, metaitem('wireGtQuadrupleMagnesiumDiboride') * 4], null)
// HV Field Generator * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('quantumeye'), metaitem('plateStainlessSteel') * 2, metaitem('circuit.assembly') * 2, metaitem('wireGtQuadrupleMercuryBariumCalciumCuprate') * 4], null)
// EV Field Generator * 1
mods.gregtech.assembler.removeByInput(30, [item('minecraft:nether_star'), metaitem('plateDoubleTitanium') * 2, metaitem('circuit.nano_assembly') * 2, metaitem('wireGtQuadrupleUraniumTriplatinum') * 4], null)
// IV Field Generator * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('quantumstar'), metaitem('plateDoubleTungstenSteel') * 2, metaitem('circuit.quantum_assembly') * 2, metaitem('wireGtQuadrupleSamariumIronArsenicOxide') * 4], null)
// LuV Field Generator * 1
mods.gregtech.assembly_line.removeByInput(6000, [metaitem('frameHsss'), metaitem('plateHsss') * 6, metaitem('quantumstar'), metaitem('emitter.luv') * 2, metaitem('circuit.crystal_assembly') * 2, metaitem('wireFineIndiumTinBariumTitaniumCuprate') * 64, metaitem('wireFineIndiumTinBariumTitaniumCuprate') * 64, metaitem('cableGtSingleNiobiumTitanium') * 4], [fluid('soldering_alloy') * 576])
// ZPM Field Generator * 1
mods.gregtech.assembly_line.removeByInput(24000, [metaitem('frameNaquadahAlloy'), metaitem('plateNaquadahAlloy') * 6, metaitem('quantumstar'), metaitem('emitter.zpm') * 2, metaitem('circuit.wetware_assembly') * 2, metaitem('wireFineUraniumRhodiumDinaquadide') * 64, metaitem('wireFineUraniumRhodiumDinaquadide') * 64, metaitem('cableGtSingleVanadiumGallium') * 4], [fluid('soldering_alloy') * 1152])
// UV Field Generator * 1
mods.gregtech.assembly_line.removeByInput(100000, [metaitem('frameTritanium'), metaitem('plateTritanium') * 6, metaitem('gravistar'), metaitem('emitter.uv') * 2, metaitem('circuit.wetware_computer') * 2, metaitem('wireFineEnrichedNaquadahTriniumEuropiumDuranide') * 64, metaitem('wireFineEnrichedNaquadahTriniumEuropiumDuranide') * 64, metaitem('cableGtSingleYttriumBariumCuprate') * 4], [fluid('soldering_alloy') * 1728, fluid('naquadria') * 576])
// NAND Chip * 8
mods.gregtech.circuit_assembler.removeByInput(120, [metaitem('circuit_board.good'), metaitem('plate.simple_system_on_chip'), metaitem('boltRedAlloy') * 2, metaitem('wireFineTin') * 2], [fluid('soldering_alloy') * 72])
// NAND Chip * 8
mods.gregtech.circuit_assembler.removeByInput(120, [metaitem('circuit_board.good'), metaitem('plate.simple_system_on_chip'), metaitem('boltRedAlloy') * 2, metaitem('wireFineTin') * 2], [fluid('tin') * 144])
// NAND Chip * 12
mods.gregtech.circuit_assembler.removeByInput(120, [metaitem('circuit_board.plastic'), metaitem('plate.simple_system_on_chip'), metaitem('boltRedAlloy') * 2, metaitem('wireFineTin') * 2], [fluid('soldering_alloy') * 72])
// NAND Chip * 12
mods.gregtech.circuit_assembler.removeByInput(120, [metaitem('circuit_board.plastic'), metaitem('plate.simple_system_on_chip'), metaitem('boltRedAlloy') * 2, metaitem('wireFineTin') * 2], [fluid('tin') * 144])
// Microprocessor * 6
mods.gregtech.circuit_assembler.removeByInput(600, [metaitem('circuit_board.plastic'), metaitem('plate.system_on_chip'), metaitem('wireFineCopper') * 2, metaitem('boltTin') * 2], [fluid('soldering_alloy') * 72])
// Microprocessor * 6
mods.gregtech.circuit_assembler.removeByInput(600, [metaitem('circuit_board.plastic'), metaitem('plate.system_on_chip'), metaitem('wireFineCopper') * 2, metaitem('boltTin') * 2], [fluid('tin') * 144])

// Microprocessor * 5
mods.gregtech.circuit_assembler.removeByInput(60, [metaitem('circuit_board.plastic'), metaitem('plate.central_processing_unit'), metaitem('component.resistor') * 2, metaitem('component.capacitor') * 2, metaitem('component.transistor') * 2, metaitem('wireFineCopper') * 2], [fluid('tin') * 144 * 144])
mods.gregtech.circuit_assembler.removeByInput(60, [metaitem('circuit_board.plastic'), metaitem('plate.central_processing_unit'), metaitem('component.resistor') * 2, metaitem('component.capacitor') * 2, metaitem('component.transistor') * 2, metaitem('wireFineCopper') * 2], [fluid('soldering_alloy') * 72 * 72])

// Integrated Processor * 2
mods.gregtech.circuit_assembler.removeByInput(60, [metaitem('circuit_board.plastic'), metaitem('plate.central_processing_unit'), metaitem('component.resistor') * 4, metaitem('component.capacitor') * 4, metaitem('component.transistor') * 4, metaitem('wireFineRedAlloy') * 4], [fluid('tin') * 144 * 144])
mods.gregtech.circuit_assembler.removeByInput(60, [metaitem('circuit_board.plastic'), metaitem('plate.central_processing_unit'), metaitem('component.resistor') * 4, metaitem('component.capacitor') * 4, metaitem('component.transistor') * 4, metaitem('wireFineRedAlloy') * 4], [fluid('soldering_alloy') * 72 * 72])

// Processor Assembly * 1
mods.gregtech.circuit_assembler.removeByInput(90, [metaitem('circuit_board.plastic'), metaitem('circuit.processor') * 2, metaitem('component.inductor') * 4, metaitem('component.capacitor') * 8, metaitem('plate.random_access_memory') * 4, metaitem('wireFineRedAlloy') * 8], [fluid('soldering_alloy') * 144 * 144])
mods.gregtech.circuit_assembler.removeByInput(90, [metaitem('circuit_board.plastic'), metaitem('circuit.processor') * 2, metaitem('component.inductor') * 4, metaitem('component.capacitor') * 8, metaitem('plate.random_access_memory') * 4, metaitem('wireFineRedAlloy') * 8], [fluid('tin') * 288 * 288])

// Mainframe * 1
mods.gregtech.circuit_assembler.removeByInput(480, [metaitem('frameAluminium') * 2, metaitem('circuit.workstation') * 2, metaitem('component.inductor') * 8, metaitem('component.capacitor') * 16, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 16], [fluid('soldering_alloy') * 288 * 288])
mods.gregtech.circuit_assembler.removeByInput(480, [metaitem('frameAluminium') * 2, metaitem('circuit.workstation') * 2, metaitem('component.inductor') * 8, metaitem('component.capacitor') * 16, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 16], [fluid('tin') * 576 * 576])
mods.gregtech.circuit_assembler.removeByInput(480, [metaitem('frameAluminium') * 2, metaitem('circuit.workstation') * 2, metaitem('component.advanced_smd.inductor') * 2, metaitem('component.advanced_smd.capacitor') * 4, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 16], [fluid('soldering_alloy') * 288 * 288])
mods.gregtech.circuit_assembler.removeByInput(480, [metaitem('frameAluminium') * 2, metaitem('circuit.workstation') * 2, metaitem('component.advanced_smd.inductor') * 2, metaitem('component.advanced_smd.capacitor') * 4, metaitem('plate.random_access_memory') * 16, metaitem('wireGtSingleAnnealedCopper') * 16], [fluid('tin') * 576 * 576])

// Workstation * 1
mods.gregtech.circuit_assembler.removeByInput(120, [metaitem('circuit_board.plastic'), metaitem('circuit.assembly') * 2, metaitem('component.diode') * 4, metaitem('plate.random_access_memory') * 4, metaitem('wireFineElectrum') * 16, metaitem('boltBlueAlloy') * 16], [fluid('soldering_alloy') * 144])
mods.gregtech.circuit_assembler.removeByInput(120, [metaitem('circuit_board.plastic'), metaitem('circuit.assembly') * 2, metaitem('component.diode') * 4, metaitem('plate.random_access_memory') * 4, metaitem('wireFineElectrum') * 16, metaitem('boltBlueAlloy') * 16], [fluid('tin') * 288])
mods.gregtech.circuit_assembler.removeByInput(16, [metaitem('circuit_board.basic'), metaitem('plate.integrated_logic_circuit'), metaitem('component.resistor') * 2, metaitem('component.diode') * 2, metaitem('wireFineCopper') * 2, metaitem('boltTin') * 2], [fluid('soldering_alloy') * 72])
// LV Electric Motor * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('cableGtSingleTin') * 2, metaitem('stickIron') * 2, metaitem('stickIronMagnetic'), metaitem('wireGtSingleCopper') * 4], null)
// LV Electric Motor * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('cableGtSingleTin') * 2, metaitem('stickSteel') * 2, metaitem('stickSteelMagnetic'), metaitem('wireGtSingleCopper') * 4], null)
// MV Electric Motor * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('cableGtSingleCopper') * 2, metaitem('stickAluminium') * 2, metaitem('stickSteelMagnetic'), metaitem('wireGtDoubleCupronickel') * 4], null)
// HV Electric Motor * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('cableGtDoubleSilver') * 2, metaitem('stickStainlessSteel') * 2, metaitem('stickSteelMagnetic'), metaitem('wireGtDoubleElectrum') * 4], null)
// EV Electric Motor * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('cableGtDoubleAluminium') * 2, metaitem('stickTitanium') * 2, metaitem('stickNeodymiumMagnetic'), metaitem('wireGtDoubleKanthal') * 4], null)
// IV Electric Motor * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('cableGtDoubleTungsten') * 2, metaitem('stickTungstenSteel') * 2, metaitem('stickNeodymiumMagnetic'), metaitem('wireGtDoubleGraphene') * 4], null)
// LuV Electric Motor * 1
mods.gregtech.assembly_line.removeByInput(6000, [metaitem('stickLongSamariumMagnetic'), metaitem('stickLongHsss') * 2, metaitem('ringHsss') * 2, metaitem('roundHsss') * 4, metaitem('wireFineRuridit') * 64, metaitem('cableGtSingleNiobiumTitanium') * 2], [fluid('soldering_alloy') * 144, fluid('lubricant') * 250])
// ZPM Electric Motor * 1
mods.gregtech.assembly_line.removeByInput(24000, [metaitem('stickLongSamariumMagnetic'), metaitem('stickLongOsmiridium') * 4, metaitem('ringOsmiridium') * 4, metaitem('roundOsmiridium') * 8, metaitem('wireFineEuropium') * 64, metaitem('wireFineEuropium') * 32, metaitem('cableGtSingleVanadiumGallium') * 2], [fluid('soldering_alloy') * 288, fluid('lubricant') * 500])
// UV Electric Motor * 1
mods.gregtech.assembly_line.removeByInput(100000, [metaitem('stickLongSamariumMagnetic'), metaitem('stickLongTritanium') * 4, metaitem('ringTritanium') * 4, metaitem('roundTritanium') * 8, metaitem('wireFineAmericium') * 64, metaitem('wireFineAmericium') * 64, metaitem('cableGtSingleYttriumBariumCuprate') * 2], [fluid('soldering_alloy') * 576, fluid('lubricant') * 1000, fluid('naquadria') * 576])
// Transistor * 8
mods.gregtech.assembler.removeByInput(120, [metaitem('plateSilicon'), metaitem('wireFineTin') * 6], [fluid('plastic') * 144])
// Integrated Logic Circuit * 2
mods.gregtech.circuit_assembler.removeByInput(16, [metaitem('circuit_board.basic'), metaitem('plate.integrated_logic_circuit'), metaitem('component.resistor') * 2, metaitem('component.diode') * 2, metaitem('wireFineCopper') * 2, metaitem('boltTin') * 2], [fluid('tin') * 144])
// Good Integrated Circuit * 2
mods.gregtech.circuit_assembler.removeByInput(24, [metaitem('circuit_board.good'), metaitem('circuit.basic_integrated') * 2, metaitem('component.resistor') * 2, metaitem('component.diode') * 2, metaitem('wireFineGold') * 4, metaitem('boltSilver') * 4], [fluid('soldering_alloy') * 72])
mods.gregtech.circuit_assembler.removeByInput(24, [metaitem('circuit_board.good'), metaitem('circuit.basic_integrated') * 2, metaitem('component.resistor') * 2, metaitem('component.diode') * 2, metaitem('wireFineGold') * 4, metaitem('boltSilver') * 4], [fluid('tin') * 144])
// Advanced Integrated Circuit * 1
mods.gregtech.circuit_assembler.removeByInput(30, [metaitem('circuit.good_integrated') * 2, metaitem('plate.integrated_logic_circuit') * 2, metaitem('plate.random_access_memory') * 2, metaitem('component.transistor') * 4, metaitem('wireFineElectrum') * 8, metaitem('boltAnnealedCopper') * 8], [fluid('soldering_alloy') * 72])
mods.gregtech.circuit_assembler.removeByInput(30, [metaitem('circuit.good_integrated') * 2, metaitem('plate.integrated_logic_circuit') * 2, metaitem('plate.random_access_memory') * 2, metaitem('component.transistor') * 4, metaitem('wireFineElectrum') * 8, metaitem('boltAnnealedCopper') * 8], [fluid('tin') * 144])
// MV Sensor * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('stickElectrum'), metaitem('plateAluminium') * 4, metaitem('circuit.good_integrated'), metaitem('gemFlawlessEmerald')], null)
// HV Sensor * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('stickChrome'), metaitem('plateStainlessSteel') * 4, metaitem('circuit.assembly'), item('minecraft:ender_eye')], null)
// EV Sensor * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('stickPlatinum'), metaitem('plateTitanium') * 4, metaitem('circuit.nano_assembly'), metaitem('quantumeye')], null)
// IV Sensor * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('stickIridium'), metaitem('plateTungstenSteel') * 4, metaitem('circuit.crystal_processor'), metaitem('quantumstar')], null)
// LuV Sensor * 1
mods.gregtech.assembly_line.removeByInput(6000, [metaitem('frameHsss'), metaitem('electric.motor.luv'), metaitem('plateRuridit') * 4, metaitem('quantumstar'), metaitem('circuit.crystal_assembly') * 2, metaitem('foilPalladium') * 64, metaitem('foilPalladium') * 32, metaitem('cableGtSingleNiobiumTitanium') * 4], [fluid('soldering_alloy') * 288])
// ZPM Sensor * 1
mods.gregtech.assembly_line.removeByInput(24000, [metaitem('frameNaquadahAlloy'), metaitem('electric.motor.zpm'), metaitem('plateOsmiridium') * 4, metaitem('quantumstar') * 2, metaitem('circuit.wetware_assembly') * 2, metaitem('foilTrinium') * 64, metaitem('foilTrinium') * 32, metaitem('cableGtSingleVanadiumGallium') * 4], [fluid('soldering_alloy') * 576])
// UV Sensor * 1
mods.gregtech.assembly_line.removeByInput(100000, [metaitem('frameTritanium'), metaitem('electric.motor.uv'), metaitem('plateTritanium') * 4, metaitem('gravistar'), metaitem('circuit.wetware_computer') * 2, metaitem('foilNaquadria') * 64, metaitem('foilNaquadria') * 32, metaitem('cableGtSingleYttriumBariumCuprate') * 4], [fluid('soldering_alloy') * 1152, fluid('naquadria') * 576])
// Inductor * 2
mods.gregtech.assembler.removeByInput(120, [metaitem('ringSteel'), metaitem('wireFineCopper') * 2], [fluid('plastic') * 36])
// Inductor * 4
mods.gregtech.assembler.removeByInput(120, [metaitem('ringSteel'), metaitem('wireFineAnnealedCopper') * 2], [fluid('plastic') * 36])
// SMD Inductor * 16
mods.gregtech.assembler.removeByInput(480, [metaitem('ringNickelZincFerrite'), metaitem('wireFineCupronickel') * 4], [fluid('plastic') * 144])
// SMD Inductor * 32
mods.gregtech.assembler.removeByInput(480, [metaitem('ringNickelZincFerrite'), metaitem('wireFineTantalum') * 4], [fluid('plastic') * 144])
// SMD Resistor * 16
mods.gregtech.assembler.removeByInput(480, [metaitem('dustCarbon'), metaitem('wireFineElectrum') * 4], [fluid('plastic') * 288])
// SMD Capacitor * 8
mods.gregtech.assembler.removeByInput(480, [metaitem('foilSiliconeRubber'), metaitem('foilAluminium')], [fluid('plastic') * 72])
// SMD Capacitor * 12
mods.gregtech.assembler.removeByInput(480, [metaitem('foilPolyvinylChloride') * 2, metaitem('foilAluminium')], [fluid('plastic') * 72])
// SMD Capacitor * 16
mods.gregtech.assembler.removeByInput(480, [metaitem('foilSiliconeRubber'), metaitem('foilTantalum')], [fluid('plastic') * 72])
// SMD Capacitor * 24
mods.gregtech.assembler.removeByInput(480, [metaitem('foilPolyvinylChloride') * 2, metaitem('foilTantalum')], [fluid('plastic') * 72])
// SMD Transistor * 16
mods.gregtech.assembler.removeByInput(480, [metaitem('foilGallium'), metaitem('wireFineAnnealedCopper') * 8], [fluid('plastic') * 144])
// SMD Transistor * 32
mods.gregtech.assembler.removeByInput(480, [metaitem('foilGallium'), metaitem('wireFineTantalum') * 8], [fluid('plastic') * 144])
// SMD Resistor * 32
mods.gregtech.assembler.removeByInput(480, [metaitem('dustCarbon'), metaitem('wireFineTantalum') * 4], [fluid('plastic') * 288])
// SMD Diode * 32
mods.gregtech.assembler.removeByInput(480, [metaitem('dustGalliumArsenide'), metaitem('wireFinePlatinum') * 8], [fluid('plastic') * 288])
// Ferrite Mixture Dust * 6
mods.gregtech.mixer.removeByInput(120, [metaitem('dustNickel'), metaitem('dustZinc'), metaitem('dustIron') * 4, metaitem('circuit.integrated').withNbt(["Configuration": 2])], null)
mods.gregtech.blender.removeByInput(120, [metaitem('dustNickel'), metaitem('dustZinc'), metaitem('dustIron') * 4, metaitem('circuit.integrated').withNbt(["Configuration": 2])], null)
// Nickel Zinc Ferrite Ingot * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustFerriteMixture')], [fluid('oxygen') * 2000])
// Liquid Nickel Zinc Ferrite * 864
mods.gregtech.advanced_arc_furnace.removeByInput(120, [metaitem('dustNickel'), metaitem('dustZinc'), metaitem('dustIron') * 4, metaitem('circuit.integrated').withNbt(['Configuration': 6])], [fluid('oxygen') * 8000 * 8000, fluid('refractory_gunning_mixture') * 50 * 50])
// Alumina Plate * 1
mods.gregtech.fluid_solidifier.removeByInput(7, [metaitem('shape.mold.plate')], [fluid('alumina') * 144])
// Alumina Plate * 1
mods.gregtech.compressor.removeByInput(2, [metaitem('dustAlumina')], null)
// Advanced SMD Transistor * 16
mods.gregtech.assembler.removeByInput(3840, [metaitem('foilVanadiumGallium'), metaitem('wireFineHssg') * 8], [fluid('polybenzimidazole') * 144])
// Vacuum Tube * 4
mods.gregtech.assembler.removeByInput(7, [metaitem('component.glass.tube'), metaitem('boltSteel') * 2, metaitem('wireGtSingleAnnealedCopper') * 2], [fluid('red_alloy') * 18])
// Vacuum Tube * 3
mods.gregtech.assembler.removeByInput(7, [metaitem('component.glass.tube'), metaitem('boltSteel') * 2, metaitem('wireGtSingleCopper') * 2], [fluid('red_alloy') * 18])
// Vacuum Tube * 2
mods.gregtech.assembler.removeByInput(7, [metaitem('component.glass.tube'), metaitem('boltSteel') * 2, metaitem('wireGtSingleCopper') * 2, metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)


//Vanilla

//Remove Enchantments
mods.jei.ingredient.hide(ore('bookEnchanted'));
mods.jei.ingredient.hide(item('minecraft:enchanting_table'));
//Remove Potions
mods.jei.ingredient.hide(item('minecraft:brewing_stand'));
//Remove Furnace recipe
crafting.remove("minecraft:furnace")
// Furnace * 1
mods.gregtech.assembler.removeByInput(7, [metaitem('circuit.integrated').withNbt(['Configuration': 8]), item('minecraft:mossy_cobblestone:*') * 8 * 8], null)


//Arc Furnace

// Molten Titanium Carbide * 288
mods.gregtech.advanced_arc_furnace.removeByInput(1920, [metaitem('dustTitanium'), metaitem('dustCarbon'), metaitem('circuit.integrated').withNbt(['Configuration': 12])], [fluid('helium') * 200 * 200, fluid('refractory_gunning_mixture') * 50 * 50])
// Molten Titanium Carbide * 288
mods.gregtech.advanced_arc_furnace.removeByInput(1920, [metaitem('dustTitanium'), metaitem('dustCarbon'), metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('refractory_gunning_mixture') * 50 * 50])
// Molten Tungstencarbide * 288
mods.gregtech.advanced_arc_furnace.removeByInput(1920, [metaitem('dustTungsten'), metaitem('dustCarbon'), metaitem('circuit.integrated').withNbt(['Configuration': 12])], [fluid('helium') * 200 * 200, fluid('refractory_gunning_mixture') * 50 * 50])
// Molten Tungstencarbide * 288
mods.gregtech.advanced_arc_furnace.removeByInput(1920, [metaitem('dustTungsten'), metaitem('dustCarbon'), metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('refractory_gunning_mixture') * 50 * 50])
// Molten Tantalum Carbide * 288
mods.gregtech.advanced_arc_furnace.removeByInput(1920, [metaitem('dustTantalum'), metaitem('dustCarbon'), metaitem('circuit.integrated').withNbt(['Configuration': 12])], [fluid('helium') * 200 * 200, fluid('refractory_gunning_mixture') * 50 * 50])
// Molten Tantalum Carbide * 288
mods.gregtech.advanced_arc_furnace.removeByInput(1920, [metaitem('dustTantalum'), metaitem('dustCarbon'), metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('refractory_gunning_mixture') * 50 * 50])
// Molten Yttrium Barium Cuprate * 1872
mods.gregtech.advanced_arc_furnace.removeByInput(7680, [metaitem('dustYttrium'), metaitem('dustBarium') * 2, metaitem('dustCopper') * 3, metaitem('circuit.integrated').withNbt(['Configuration': 4])], [fluid('oxygen') * 7000 * 7000, fluid('refractory_gunning_mixture') * 50 * 50])
// Molten Yttrium Barium Cuprate * 1872
mods.gregtech.advanced_arc_furnace.removeByInput(7680, [metaitem('dustYttrium'), metaitem('dustBarium') * 2, metaitem('dustCopper') * 3, metaitem('circuit.integrated').withNbt(['Configuration': 14])], [fluid('oxygen') * 7000 * 7000, fluid('argon') * 650 * 650, fluid('refractory_gunning_mixture') * 50 * 50])
// Molten Samarium Iron Arsenic Oxide * 576
mods.gregtech.advanced_arc_furnace.removeByInput(1920, [metaitem('dustSamarium'), metaitem('dustIron'), metaitem('dustArsenic'), metaitem('circuit.integrated').withNbt(['Configuration': 14])], [fluid('oxygen') * 1000 * 1000, fluid('helium') * 400 * 400, fluid('refractory_gunning_mixture') * 50 * 50])
// Molten Samarium Iron Arsenic Oxide * 576
mods.gregtech.advanced_arc_furnace.removeByInput(1920, [metaitem('dustSamarium'), metaitem('dustIron'), metaitem('dustArsenic'), metaitem('circuit.integrated').withNbt(['Configuration': 4])], [fluid('oxygen') * 1000 * 1000, fluid('refractory_gunning_mixture') * 50 * 50])
// Molten Indium Tin Barium Titanium Cuprate * 2304
mods.gregtech.advanced_arc_furnace.removeByInput(7680, [metaitem('dustIndium') * 4, metaitem('dustTin') * 2, metaitem('dustBarium') * 2, metaitem('dustTitanium'), metaitem('dustCopper') * 7, metaitem('circuit.integrated').withNbt(['Configuration': 16])], [fluid('oxygen') * 14000 * 14000, fluid('argon') * 800 * 800, fluid('refractory_gunning_mixture') * 50 * 50])
// Molten Indium Tin Barium Titanium Cuprate * 2304
mods.gregtech.advanced_arc_furnace.removeByInput(7680, [metaitem('dustIndium') * 4, metaitem('dustTin') * 2, metaitem('dustBarium') * 2, metaitem('dustTitanium'), metaitem('dustCopper') * 7, metaitem('circuit.integrated').withNbt(['Configuration': 6])], [fluid('oxygen') * 14000 * 14000, fluid('refractory_gunning_mixture') * 50 * 50])
// Stainless Steel Dust * 9
mods.gregtech.mixer.removeByInput(120, [metaitem('dustIron') * 6, metaitem('dustNickel'), metaitem('dustManganese'), metaitem('dustChrome'), metaitem('circuit.integrated').withNbt(["Configuration": 3])], null)
mods.gregtech.blender.removeByInput(120, [metaitem('dustIron') * 6, metaitem('dustNickel'), metaitem('dustManganese'), metaitem('dustChrome'), metaitem('circuit.integrated').withNbt(["Configuration": 3])], null)
// Stainless Steel Dust * 9
mods.gregtech.mixer.removeByInput(120, [metaitem('dustIron') * 4, metaitem('dustInvar') * 3, metaitem('dustManganese'), metaitem('dustChrome'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
mods.gregtech.blender.removeByInput(120, [metaitem('dustIron') * 4, metaitem('dustInvar') * 3, metaitem('dustManganese'), metaitem('dustChrome'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// Liquid Stainless Steel * 1296
mods.gregtech.advanced_arc_furnace.removeByInput(480, [metaitem('dustIron') * 6, metaitem('dustChrome'), metaitem('dustManganese'), metaitem('dustNickel'), metaitem('circuit.integrated').withNbt(['Configuration': 14])], [fluid('nitrogen') * 9000 * 9000, fluid('refractory_gunning_mixture') * 50 * 50])
// Liquid Stainless Steel * 1296
mods.gregtech.advanced_arc_furnace.removeByInput(480, [metaitem('dustIron') * 6, metaitem('dustChrome'), metaitem('dustManganese'), metaitem('dustNickel'), metaitem('circuit.integrated').withNbt(['Configuration': 4])], [fluid('refractory_gunning_mixture') * 50 * 50])
mods.gregtech.mixer.removeByInput(480, [metaitem('dustCobalt') * 5, metaitem('dustChrome') * 2, metaitem('dustNickel'),metaitem('dustMolybdenum'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
mods.gregtech.mixer.removeByInput(480, [metaitem('dustInvar') * 2, metaitem('dustVanadium'), metaitem('dustTitanium'),metaitem('dustMolybdenum'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
mods.gregtech.assembler.removeByInput(16, [metaitem('plateHslaSteel') * 4, metaitem('plateTitaniumCarbide') * 2,metaitem('frameTungstenCarbide'), metaitem('circuit.integrated').withNbt(["Configuration": 6])], null)
mods.gregtech.assembler.removeByInput(16, [metaitem('plateZeron100') * 6, metaitem('frameTitanium'),metaitem('circuit.integrated').withNbt(["Configuration": 6])], null)
mods.gregtech.assembler.removeByInput(16, [metaitem('plateStellite100') * 6, metaitem('frameTungsten'),metaitem('circuit.integrated').withNbt(["Configuration": 6])], null)
mods.gregtech.assembler.removeByInput(16, [metaitem('plateMaragingSteel300') * 6, metaitem('frameStainlessSteel'),metaitem('circuit.integrated').withNbt(["Configuration": 6])], null)
mods.gregtech.assembler.removeByInput(16, [metaitem('plateCobaltBrass') * 6, metaitem('gcym:frameHslaSteel'),metaitem('circuit.integrated').withNbt(['Configuration': 6])], null)
mods.gregtech.assembler.removeByInput(16, [metaitem('plateWatertightSteel') * 6, metaitem('gcym:frameWatertightSteel'),metaitem('circuit.integrated').withNbt(["Configuration": 6])], null)
mods.gregtech.assembler.removeByInput(16, [metaitem('plateIncoloyMa956') * 6, metaitem('gcym:frameIncoloyMa956'),metaitem('circuit.integrated').withNbt(["Configuration": 6])], null)
mods.gregtech.assembler.removeByInput(16, [metaitem('plateHastelloyC276') * 6, metaitem('gcym:frameHastelloyC276'),metaitem('circuit.integrated').withNbt(["Configuration": 6])], null)
mods.gregtech.assembler.removeByInput(16, [metaitem('plateHslaSteel') * 6, metaitem('gcym:frameHslaSteel'),metaitem('circuit.integrated').withNbt(["Configuration": 6])], null)
mods.gregtech.assembler.removeByInput(16, [metaitem('plateHastelloyX') * 6, metaitem('gcym:frameMaragingSteel300'),metaitem('circuit.integrated').withNbt(["Configuration": 6])], null)
mods.gregtech.assembler.removeByInput(16, [metaitem('plateTitaniumTungstenCarbide') * 6, metaitem('frameTitanium'),metaitem('circuit.integrated').withNbt(["Configuration": 6])], null)
// Concrete * 576
mods.gregtech.mixer.removeByInput(16, [metaitem('dustClay'), metaitem('dustStone') * 3], [fluid('water') * 500])
mods.gregtech.blender.removeByInput(16, [metaitem('dustClay'), metaitem('dustStone') * 3], [fluid('water') * 500])
// Concrete * 1152
mods.gregtech.mixer.removeByInput(16, [metaitem('dustStone') * 2, metaitem('dustCalcite'), metaitem('dustGypsum')], [fluid('water') * 1000])
mods.gregtech.blender.removeByInput(16, [metaitem('dustStone') * 2, metaitem('dustCalcite'), metaitem('dustGypsum')], [fluid('water') * 1000])
// Concrete * 1152
mods.gregtech.mixer.removeByInput(16, [metaitem('dustStone') * 2, metaitem('dustMarble'), metaitem('dustGypsum')], [fluid('water') * 1000])
mods.gregtech.blender.removeByInput(16, [metaitem('dustStone') * 2, metaitem('dustMarble'), metaitem('dustGypsum')], [fluid('water') * 1000])




