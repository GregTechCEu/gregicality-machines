package gregicality.multiblocks.loaders;

import com.google.common.collect.ImmutableSet;
import gregicality.multiblocks.api.metatileentity.ITieredHatch;
import gregicality.multiblocks.api.utils.GCYMUtility;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockUniqueCasing;
import gregicality.multiblocks.common.metatileentities.GCYMMetaTileEntities;
import gregtech.api.recipes.ingredients.GTRecipeOreInput;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;

import static gregtech.api.GTValues.*;

public final class TileEntityMechanics {

    public static void register() {
        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_MACERATOR,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_LuV.getStackForm(2),
                        MetaItems.ELECTRIC_PISTON_LUV.getStackForm(2),
                        MetaItems.COMPONENT_GRINDER_TUNGSTEN.getStackForm()
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_MACERATOR,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_ZPM.getStackForm(2),
                        MetaItems.ELECTRIC_PISTON_ZPM.getStackForm(2),
                        MetaItems.COMPONENT_GRINDER_TUNGSTEN.getStackForm()
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_MACERATOR,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_UV.getStackForm(2),
                        MetaItems.ELECTRIC_PISTON_UV.getStackForm(2),
                        MetaItems.COMPONENT_GRINDER_TUNGSTEN.getStackForm()
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ARC_FURNACE,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_LuV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.plate, Materials.RhodiumPlatedPalladium, 4)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ARC_FURNACE,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_ZPM.getStackForm(),
                        OreDictUnifier.get(OrePrefix.plate, Materials.NaquadahAlloy, 4)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ARC_FURNACE,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_UV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.plate, Materials.Darmstadtium, 4)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ASSEMBLER, LuV,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ROBOT_ARM_LuV.getStackForm(2),
                        MetaItems.CONVEYOR_MODULE_LuV.getStackForm(2)
                )),
                GTRecipeOreInput.getOrCreate(OrePrefix.circuit, MarkerMaterials.Tier.LuV));

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ASSEMBLER, ZPM,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ROBOT_ARM_ZPM.getStackForm(2),
                        MetaItems.CONVEYOR_MODULE_ZPM.getStackForm(2)
                )),
                GTRecipeOreInput.getOrCreate(OrePrefix.circuit, MarkerMaterials.Tier.ZPM));

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ASSEMBLER, UV,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ROBOT_ARM_UV.getStackForm(2),
                        MetaItems.CONVEYOR_MODULE_UV.getStackForm(2)
                )),
                GTRecipeOreInput.getOrCreate(OrePrefix.circuit, MarkerMaterials.Tier.UV));

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_AUTOCLAVE,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_LuV.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_LuV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.rotor, Materials.RhodiumPlatedPalladium)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_AUTOCLAVE,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_ZPM.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_ZPM.getStackForm(),
                        OreDictUnifier.get(OrePrefix.rotor, Materials.NaquadahAlloy)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_AUTOCLAVE,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_UV.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_UV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.rotor, Materials.Darmstadtium)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_BENDER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PISTON_LUV.getStackForm(2)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_BENDER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PISTON_ZPM.getStackForm(2)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_BENDER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PISTON_UV.getStackForm(2)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_BREWERY,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_LuV.getStackForm(2),
                        OreDictUnifier.get(OrePrefix.rotor, Materials.RhodiumPlatedPalladium)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_BREWERY,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_ZPM.getStackForm(2),
                        OreDictUnifier.get(OrePrefix.rotor, Materials.NaquadahAlloy)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_BREWERY,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_UV.getStackForm(2),
                        OreDictUnifier.get(OrePrefix.rotor, Materials.Darmstadtium)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CENTRIFUGE,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_LuV.getStackForm(2)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CENTRIFUGE,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_ZPM.getStackForm(2)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CENTRIFUGE,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_UV.getStackForm(2)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CHEMICAL_BATH,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_LuV.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_LuV.getStackForm()
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CHEMICAL_BATH,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_ZPM.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_ZPM.getStackForm()
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CHEMICAL_BATH,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_UV.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_UV.getStackForm()
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_EXTRACTOR,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_LuV.getStackForm(),
                        MetaItems.ELECTRIC_PISTON_LUV.getStackForm()
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_EXTRACTOR,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_ZPM.getStackForm(),
                        MetaItems.ELECTRIC_PISTON_ZPM.getStackForm()
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_EXTRACTOR,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_UV.getStackForm(),
                        MetaItems.ELECTRIC_PISTON_UV.getStackForm()
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CUTTER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_LuV.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_LuV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.toolHeadBuzzSaw, Materials.HSSS)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CUTTER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_ZPM.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_ZPM.getStackForm(),
                        OreDictUnifier.get(OrePrefix.toolHeadBuzzSaw, Materials.Duranium)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CUTTER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_UV.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_UV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.toolHeadBuzzSaw, Materials.Tritanium)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_DISTILLERY,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_LuV.getStackForm(2),
                        OreDictUnifier.get(OrePrefix.spring, Materials.HSSG)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_DISTILLERY,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_ZPM.getStackForm(2),
                        OreDictUnifier.get(OrePrefix.spring, Materials.Naquadah)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_DISTILLERY,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_UV.getStackForm(2),
                        OreDictUnifier.get(OrePrefix.spring, Materials.NaquadahAlloy)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ELECTROLYZER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        OreDictUnifier.get(OrePrefix.wireGtSingle, Materials.Osmium, 8),
                        GCYMMetaBlocks.UNIQUE_CASING.getItemVariant(BlockUniqueCasing.UniqueCasingType.ELECTROLYTIC_CELL, 4)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ELECTROLYZER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        OreDictUnifier.get(OrePrefix.wireGtDouble, Materials.Osmium, 8),
                        GCYMMetaBlocks.UNIQUE_CASING.getItemVariant(BlockUniqueCasing.UniqueCasingType.ELECTROLYTIC_CELL, 4)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ELECTROLYZER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        OreDictUnifier.get(OrePrefix.wireGtQuadruple, Materials.Osmium, 8),
                        GCYMMetaBlocks.UNIQUE_CASING.getItemVariant(BlockUniqueCasing.UniqueCasingType.ELECTROLYTIC_CELL, 4)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_POLARIZER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.CONVEYOR_MODULE_LuV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.wireGtSingle, Materials.NiobiumNitride, 8)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_POLARIZER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.CONVEYOR_MODULE_ZPM.getStackForm(),
                        OreDictUnifier.get(OrePrefix.wireGtDouble, Materials.VanadiumGallium, 8)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_POLARIZER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.CONVEYOR_MODULE_UV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.wireGtQuadruple, Materials.YttriumBariumCuprate, 8)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_EXTRUDER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PISTON_LUV.getStackForm(2),
                        OreDictUnifier.get(OrePrefix.pipeNormalFluid, Materials.NiobiumTitanium)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_EXTRUDER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PISTON_ZPM.getStackForm(2),
                        OreDictUnifier.get(OrePrefix.pipeLargeFluid, Materials.Iridium)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_EXTRUDER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PISTON_UV.getStackForm(2),
                        OreDictUnifier.get(OrePrefix.pipeHugeFluid, Materials.Naquadah)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_SOLIDIFIER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_LuV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.pipeNormalFluid, Materials.Polybenzimidazole)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_SOLIDIFIER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_ZPM.getStackForm(),
                        OreDictUnifier.get(OrePrefix.pipeLargeFluid, Materials.Polybenzimidazole)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_SOLIDIFIER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PUMP_UV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.pipeHugeFluid, Materials.Polybenzimidazole)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_MIXER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_LuV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.rotor, Materials.RhodiumPlatedPalladium)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_MIXER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_ZPM.getStackForm(),
                        OreDictUnifier.get(OrePrefix.rotor, Materials.NaquadahAlloy)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_MIXER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_UV.getStackForm(),
                        OreDictUnifier.get(OrePrefix.rotor, Materials.Darmstadtium)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_PACKAGER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ROBOT_ARM_LuV.getStackForm(2)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_PACKAGER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ROBOT_ARM_ZPM.getStackForm(2)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_PACKAGER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ROBOT_ARM_UV.getStackForm(2)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ENGRAVER, LuV,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.EMITTER_LuV.getStackForm(),
                        MetaItems.ELECTRIC_PISTON_LUV.getStackForm(2)
                )),
                GTRecipeOreInput.getOrCreate(OrePrefix.circuit, MarkerMaterials.Tier.LuV));

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ENGRAVER, ZPM,
                GCYMUtility.stacksToInput( ImmutableSet.of(
                        MetaItems.EMITTER_ZPM.getStackForm(),
                        MetaItems.ELECTRIC_PISTON_ZPM.getStackForm(2)
                )),
                GTRecipeOreInput.getOrCreate(OrePrefix.circuit, MarkerMaterials.Tier.ZPM));

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_ENGRAVER, UV,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.EMITTER_UV.getStackForm(),
                        MetaItems.ELECTRIC_PISTON_UV.getStackForm(2)
                )),
                GTRecipeOreInput.getOrCreate(OrePrefix.circuit, MarkerMaterials.Tier.UV));

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_SIFTER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PISTON_LUV.getStackForm(2),
                        MetaItems.ITEM_FILTER.getStackForm()
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_SIFTER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PISTON_ZPM.getStackForm(2),
                        MetaItems.ITEM_FILTER.getStackForm(2)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_SIFTER,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_PISTON_UV.getStackForm(2),
                        MetaItems.ITEM_FILTER.getStackForm(4)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_WIREMILL,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_LuV.getStackForm(4)
                )), LuV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_WIREMILL,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_ZPM.getStackForm(4)
                )), ZPM);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_WIREMILL,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ELECTRIC_MOTOR_UV.getStackForm(4)
                )), UV);

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CIRCUIT_ASSEMBLER, LuV,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ROBOT_ARM_LuV.getStackForm(),
                        MetaItems.EMITTER_LuV.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_LuV.getStackForm(2)
                )),
                GTRecipeOreInput.getOrCreate(OrePrefix.circuit, MarkerMaterials.Tier.ZPM));

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CIRCUIT_ASSEMBLER, ZPM,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ROBOT_ARM_ZPM.getStackForm(),
                        MetaItems.EMITTER_ZPM.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_ZPM.getStackForm(2)
                )),
                GTRecipeOreInput.getOrCreate(OrePrefix.circuit, MarkerMaterials.Tier.UV));

        ITieredHatch.addMultiblockTier(GCYMMetaTileEntities.LARGE_CIRCUIT_ASSEMBLER, UV,
                GCYMUtility.stacksToInput(ImmutableSet.of(
                        MetaItems.ROBOT_ARM_UV.getStackForm(),
                        MetaItems.EMITTER_UV.getStackForm(),
                        MetaItems.CONVEYOR_MODULE_UV.getStackForm(2)
                )),
                GTRecipeOreInput.getOrCreate(OrePrefix.circuit, MarkerMaterials.Tier.UHV));

        // gcys will add its own items for these outside of gcym
    }
}
