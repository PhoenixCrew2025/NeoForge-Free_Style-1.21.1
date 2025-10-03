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
        basicItem(ModItems.STORAGE_KEY_6.get());
        basicItem(ModItems.STORAGE_KEY_7.get());
        basicItem(ModItems.STORAGE_KEY_8.get());
        basicItem(ModItems.STORAGE_KEY_9.get());
        basicItem(ModItems.STORAGE_KEY_10.get());
        basicItem(ModItems.STORAGE_KEY_11.get());
        basicItem(ModItems.STORAGE_KEY_12.get());
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
        basicItem(ModItems.SICKNESS_DISC.get());
        basicItem(ModItems.ENCHANT_TOKEN.get());
        basicItem(ModItems.HONEY_TOKEN.get());
        basicItem(ModItems.ALLSTARS_DISC.get());
        basicItem(ModItems.JUST_A_BOOK_DISC.get());
        basicItem(ModItems.GODS_THEME_DISC.get());
        basicItem(ModItems.SLEEP_TOKEN_DISC.get());
        basicItem(ModItems.TEN_THOUSAND_DOLLARS.get());
        basicItem(ModItems.ONE_HUNDRED_THOUSAND_DOLLARS.get());
        basicItem(ModItems.ONE_MILLION_DOLLARS.get());
        basicItem(ModItems.EVENT_BADGE.get());
        basicItem(ModItems.UNIVERSAL_COLLAPSE_DISC.get());
        basicItem(ModItems.LAVA_CHICKEN_MUSIC_DISC.get());
        basicItem(ModItems.TEARS_MUSIC_DISC.get());
        basicItem(ModItems.BLACK_CATCHER_DISC.get());
        basicItem(ModItems.EVERYTHING_I_GOT_DISC.get());
        basicItem(ModItems.DONT_FORGET_DELTARUNE_DISC.get());
        basicItem(ModItems.YOU_SPIN_ME_RIGHT_ROUND_DISC.get());
        basicItem(ModItems.BILLIE_JEAN_DISC.get());
    }
}
