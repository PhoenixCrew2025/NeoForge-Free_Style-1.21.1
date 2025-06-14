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

    public static final Supplier<CreativeModeTab> FREE_STYLE_TAB = CREATIVE_MODE_TAB.register("free_style_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOD_KILLER_BADGE.get()))
                    .title(Component.translatable("creativetab.freestylemod.free_style_mod_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GOD_KILLER_BADGE);
                        output.accept(ModItems.STORAGE_KEY_1);
                        output.accept(ModItems.STORAGE_KEY_2);
                        output.accept(ModItems.STORAGE_KEY_3);
                        output.accept(ModItems.STORAGE_KEY_4);
                        output.accept(ModItems.STORAGE_KEY_5);
                        output.accept(ModItems.STORAGE_MASTER_KEY);

                    }).build());


    public static final Supplier<CreativeModeTab> FREE_STYLE_DISC_TAB = CREATIVE_MODE_TAB.register("free_style_disc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COBBLEMON_BATTLE_MUSIC_DISC.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FreeStyleMod.MOD_ID, "free_style_tab"))
                    .title(Component.translatable("creativetab.freestylemod.free_style_mod_disc"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COBBLEMON_BATTLE_MUSIC_DISC);
                        output.accept(ModItems.PINK_FLUFFY_UNICORN_DISC);
                        output.accept(ModItems.ACDC_BIG_BALLS_DISC);
                        output.accept(ModItems.ACDC_BACK_IN_BLACK_DISC);
                        output.accept(ModItems.ACDC_HELLS_BELLS_DISC);
                        output.accept(ModItems.ACDC_HIGHWAY_TO_HELL_DISC);


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
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
