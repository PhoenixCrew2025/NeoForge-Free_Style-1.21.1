package net.phoenixcrew2025.FreeStyleMod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.phoenixcrew2025.FreeStyleMod.FreeStyleMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FreeStyleMod.MOD_ID);

    public static final Supplier<CreativeModeTab> FREE_STYLE_ITEM_TAB = CREATIVE_MODE_TAB.register("free_style_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENCHANT_TOKEN.get()))
                    .title(Component.translatable("creativetab.freestylemod.free_style_mod_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HONEY_TOKEN);
                        output.accept(ModItems.ENCHANT_TOKEN);
                        output.accept(ModItems.JUST_A_BOOK_DISC);
                    }).build());

    public static final Supplier<CreativeModeTab> FREE_STYLE_KEYS_TAB = CREATIVE_MODE_TAB.register("free_style_keys_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STORAGE_MASTER_KEY.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FreeStyleMod.MOD_ID, "free_style_item_tab"))
                    .title(Component.translatable("creativetab.freestylemod.free_style_mod_keys"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STORAGE_KEY_1);
                        output.accept(ModItems.STORAGE_KEY_2);
                        output.accept(ModItems.STORAGE_KEY_3);
                        output.accept(ModItems.STORAGE_KEY_4);
                        output.accept(ModItems.STORAGE_KEY_5);
                        output.accept(ModItems.STORAGE_KEY_6);
                        output.accept(ModItems.STORAGE_KEY_7);
                        output.accept(ModItems.STORAGE_KEY_8);
                        output.accept(ModItems.STORAGE_KEY_9);
                        output.accept(ModItems.STORAGE_KEY_10);
                        output.accept(ModItems.STORAGE_KEY_11);
                        output.accept(ModItems.STORAGE_KEY_12);
                        output.accept(ModItems.STORAGE_MASTER_KEY);
                    }).build());


    public static final Supplier<CreativeModeTab> FREE_STYLE_DISC_TAB = CREATIVE_MODE_TAB.register("free_style_disc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COBBLEMON_BATTLE_MUSIC_DISC.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FreeStyleMod.MOD_ID, "free_style_keys_tab"))
                    .title(Component.translatable("creativetab.freestylemod.free_style_mod_disc"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COBBLEMON_BATTLE_MUSIC_DISC);
                        output.accept(ModItems.PINK_FLUFFY_UNICORN_DISC);
                        output.accept(ModItems.ACDC_BIG_BALLS_DISC);
                        output.accept(ModItems.ACDC_BACK_IN_BLACK_DISC);
                        output.accept(ModItems.ACDC_HELLS_BELLS_DISC);
                        output.accept(ModItems.ACDC_HIGHWAY_TO_HELL_DISC);
                        output.accept(ModItems.DEMONS_SONG_DISC);
                        output.accept(ModItems.OCEAN_DRIVE_DISC);
                        output.accept(ModItems.SICKNESS_DISC);
                        output.accept(ModItems.ALLSTARS_DISC);
                        output.accept(ModItems.GODS_THEME_DISC);
                        output.accept(ModItems.SLEEP_TOKEN_DISC);
                    }).build());

    public static final Supplier<CreativeModeTab> FREE_STYLE_MONEY_TAB = CREATIVE_MODE_TAB.register("free_style_money_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ONE_HUNDRED_DOLLAR.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FreeStyleMod.MOD_ID, "free_style_disc_tab"))
                    .title(Component.translatable("creativetab.freestylemod.free_style_mod_money"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ONE_DOLLAR);
                        output.accept(ModItems.FIVE_DOLLAR);
                        output.accept(ModItems.TEN_DOLLAR);
                        output.accept(ModItems.FIFTY_DOLLAR);
                        output.accept(ModItems.ONE_HUNDRED_DOLLAR);
                        output.accept(ModItems.ONE_THOUSAND_DOLLAR);
                        output.accept(ModItems.TEN_THOUSAND_DOLLARS);
                        output.accept(ModItems.ONE_HUNDRED_THOUSAND_DOLLARS);
                        output.accept(ModItems.ONE_MILLION_DOLLARS);
                    }).build());

    public static final Supplier<CreativeModeTab> FREE_STYLE_BADGE_TAB = CREATIVE_MODE_TAB.register("free_style_badge_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOD_KILLER_BADGE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FreeStyleMod.MOD_ID, "free_style_money_tab"))
                    .title(Component.translatable("creativetab.freestylemod.free_style_mod_badge"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GOD_KILLER_BADGE);
                        output.accept(ModItems.EVENT_BADGE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
