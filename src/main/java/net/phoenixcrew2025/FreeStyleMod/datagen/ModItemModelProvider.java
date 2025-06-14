package net.phoenixcrew2025.FreeStyleMod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.phoenixcrew2025.FreeStyleMod.FreeStyleMod;
import net.phoenixcrew2025.FreeStyleMod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FreeStyleMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ONE_DOLLAR.get());
        basicItem(ModItems.FIVE_DOLLAR.get());
        basicItem(ModItems.TEN_DOLLAR.get());
        basicItem(ModItems.FIFTY_DOLLAR.get());
        basicItem(ModItems.ONE_HUNDRED_DOLLAR.get());
        basicItem(ModItems.ONE_THOUSAND_DOLLAR.get());
        basicItem(ModItems.STORAGE_KEY_1.get());
        basicItem(ModItems.STORAGE_KEY_2.get());
        basicItem(ModItems.STORAGE_KEY_3.get());
        basicItem(ModItems.STORAGE_KEY_4.get());
        basicItem(ModItems.STORAGE_KEY_5.get());
        basicItem(ModItems.STORAGE_MASTER_KEY.get());
        basicItem(ModItems.GOD_KILLER_BADGE.get());
        basicItem(ModItems.COBBLEMON_BATTLE_MUSIC_DISC.get());
        basicItem(ModItems.PINK_FLUFFY_UNICORN_DISC.get());
        basicItem(ModItems.ACDC_BACK_IN_BLACK_DISC.get());
        basicItem(ModItems.ACDC_BIG_BALLS_DISC.get());
        basicItem(ModItems.ACDC_HELLS_BELLS_DISC.get());
        basicItem(ModItems.ACDC_HIGHWAY_TO_HELL_DISC.get());
        basicItem(ModItems.DEMONS_SONG_DISC.get());
        basicItem(ModItems.OCEAN_DRIVE_DISC.get());
    }
}
