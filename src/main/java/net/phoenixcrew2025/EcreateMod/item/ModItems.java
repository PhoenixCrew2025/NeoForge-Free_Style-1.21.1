package net.phoenixcrew2025.EcreateMod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.phoenixcrew2025.EcreateMod.EcreateMod;
import net.phoenixcrew2025.EcreateMod.sound.ModSounds;

import javax.swing.*;
import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EcreateMod.MOD_ID);


    public static final DeferredItem<Item> ONE_DOLLAR = ITEMS.register("one_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIVE_DOLLAR = ITEMS.register("five_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TEN_DOLLAR = ITEMS.register("ten_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIFTY_DOLLAR = ITEMS.register("fifty_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ONE_HUNDRED_DOLLAR = ITEMS.register("one_hundred_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ONE_THOUSAND_DOLLAR = ITEMS.register("one_thousand_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TEN_THOUSAND_DOLLARS = ITEMS.register("ten_thousand_dollars",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ONE_HUNDRED_THOUSAND_DOLLARS = ITEMS.register("one_hundred_thousand_dollars",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ONE_MILLION_DOLLARS = ITEMS.register("one_million_dollars",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> COBBLEMON_BATTLE_MUSIC_DISC = ITEMS.register("cobblemon_battle_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.COBBLEMON_BATTLE_SONG_KEY).stacksTo(1)));
    public static final DeferredItem<Item> PINK_FLUFFY_UNICORN_DISC = ITEMS.register("pink_fluffy_unicorn_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.PINK_FLUFFY_UNICORN_SONG_KEY).stacksTo(1)));
    public static final DeferredItem<Item> ACDC_BACK_IN_BLACK_DISC = ITEMS.register("acdc_back_in_black_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ACDC_BACK_IN_BLACK_KEY).stacksTo(1)));
    public static final DeferredItem<Item> ACDC_BIG_BALLS_DISC = ITEMS.register("acdc_big_balls_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ACDC_BIG_BALLS_KEY).stacksTo(1)));
    public static final DeferredItem<Item> ACDC_HELLS_BELLS_DISC = ITEMS.register("acdc_hells_bells_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ACDC_HELLS_BELLS_KEY).stacksTo(1)));
    public static final DeferredItem<Item> ACDC_HIGHWAY_TO_HELL_DISC = ITEMS.register("acdc_highway_to_hell_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ACDC_HIGHWAY_TO_HELL_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DEMONS_SONG_DISC = ITEMS.register("demons_song_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DEMONS_SONG_KEY).stacksTo(1)));
    public static final DeferredItem<Item> OCEAN_DRIVE_DISC = ITEMS.register("ocean_drive_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.OCEAN_DRIVE_KEY).stacksTo(1)));
    public static final DeferredItem<Item> SICKNESS_DISC = ITEMS.register("sickness_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SICKNESS_KEY).stacksTo(1)));
    public static final DeferredItem<Item> ALLSTARS_DISC = ITEMS.register("allstars_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ALLSTARS_KEY).stacksTo(1)));
    public static final DeferredItem<Item> JUST_A_BOOK_DISC = ITEMS.register("just_a_book_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.JUST_A_BOOK_KEY).stacksTo(1)));
    public static final DeferredItem<Item> GODS_THEME_DISC = ITEMS.register("gods_theme_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.GODS_THEME_KEY).stacksTo(1)));
    public static final DeferredItem<Item> SLEEP_TOKEN_DISC = ITEMS.register("sleep_token_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SLEEP_TOKEN_KEY).stacksTo(1)));
    public static final DeferredItem<Item> UNIVERSAL_COLLAPSE_DISC = ITEMS.register("universal_collapse_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.UNIVERSAL_COLLAPSE_KEY).stacksTo(1)));
    public static final DeferredItem<Item> TEARS_MUSIC_DISC = ITEMS.register("tears_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.TEARS_KEY).stacksTo(1)));
    public static final DeferredItem<Item> LAVA_CHICKEN_MUSIC_DISC = ITEMS.register("lava_chicken_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.LAVA_CHICKEN_KEY).stacksTo(1)));
    public static final DeferredItem<Item> BLACK_CATCHER_DISC = ITEMS.register("black_catcher_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BLACK_CATCHER_KEY).stacksTo(1)));
    public static final DeferredItem<Item> EVERYTHING_I_GOT_DISC = ITEMS.register("everything_i_got_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.EVERYTHING_I_GOT_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DONT_FORGET_DELTARUNE_DISC = ITEMS.register("dont_forget_deltarune_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DONT_FORGET_DELTARUNE_KEY).stacksTo(1)));
    public static final DeferredItem<Item> YOU_SPIN_ME_RIGHT_ROUND_DISC = ITEMS.register("you_spin_me_right_round_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.YOU_SPIN_ME_RIGHT_ROUND_KEY).stacksTo(1)));
    public static final DeferredItem<Item> BILLIE_JEAN_DISC = ITEMS.register("billie_jean_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BILLIE_JEAN_KEY).stacksTo(1)));

    public static final DeferredItem<Item> ECREATE_CORRUPTED_IRON_INGOT = ITEMS.register("ecreate_corrupted_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_CORRUPTED_NETHER_STAR = ITEMS.register("ecreate_corrupted_nether_star",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_SHARD = ITEMS.register("ecreate_shard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_ROD = ITEMS.register("ecreate_rod",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_QUARTS = ITEMS.register("ecreate_quarts",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEART_OF_ECREATE = ITEMS.register("heart_of_ecreate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_CORRUPTED_RAW_GOLD = ITEMS.register("ecreate_corrupted_raw_gold",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_CORRUPTED_RAW_IRON = ITEMS.register("ecreate_corrupted_raw_iron",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_CORRUPTED_GOLD = ITEMS.register("ecreate_corrupted_gold",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_CORRUPTED_RAW_DIAMOND = ITEMS.register("ecreate_corrupted_raw_diamond",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_CORRUPTED_DIAMOND = ITEMS.register("ecreate_corrupted_diamond",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_CORRUPTED_RAW_EMERALD = ITEMS.register("ecreate_corrupted_raw_emerald",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_CORRUPTED_EMERALD = ITEMS.register("ecreate_corrupted_emerald",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_CORRUPTED_COAL = ITEMS.register("ecreate_corrupted_coal",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ECREATE_ESSENCE = ITEMS.register("ecreate_essence",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLOOD_GOD_PART = ITEMS.register("blood_god_part",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CREATE_GOD_PART = ITEMS.register("create_god_part",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ECREATE_CRYSTAL = ITEMS.register("ecreate_crystal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>  FOOD_GOD_PART = ITEMS.register("food_god_part",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOD_MAIN_PART = ITEMS.register("god_main_part",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MEK_GOD_PART = ITEMS.register("mek_god_part",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MODIUM_GOD_PART = ITEMS.register("modium_god_part",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORE_GOD_PART = ITEMS.register("ore_god_part",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ATM_ALLOY_SMITHING_TEMPLATE = ITEMS.register("atm_alloy_smithing_template",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
