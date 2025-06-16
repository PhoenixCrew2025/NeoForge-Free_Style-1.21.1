package net.phoenixcrew2025.FreeStyleMod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.phoenixcrew2025.FreeStyleMod.FreeStyleMod;
import net.phoenixcrew2025.FreeStyleMod.sound.ModSounds;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FreeStyleMod.MOD_ID);

    public static final DeferredItem<Item> ENCHANT_TOKEN = ITEMS.register("enchant_token",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HONEY_TOKEN = ITEMS.register("honey_token",
            () -> new Item(new Item.Properties()));



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
    public static final DeferredItem<Item> GOD_KILLER_BADGE = ITEMS.register("god_killer_badge",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.freestylemod.god_killer_badge.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> STORAGE_KEY_1 = ITEMS.register("storage_key_1",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STORAGE_KEY_2 = ITEMS.register("storage_key_2",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STORAGE_KEY_3 = ITEMS.register("storage_key_3",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STORAGE_KEY_4 = ITEMS.register("storage_key_4",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STORAGE_KEY_5 = ITEMS.register("storage_key_5",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STORAGE_MASTER_KEY = ITEMS.register("storage_master_key",
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









    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
