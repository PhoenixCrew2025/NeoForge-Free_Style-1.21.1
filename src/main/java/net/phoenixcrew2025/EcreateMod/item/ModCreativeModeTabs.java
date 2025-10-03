package net.phoenixcrew2025.EcreateMod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.phoenixcrew2025.EcreateMod.EcreateMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EcreateMod.MOD_ID);


    public static final Supplier<CreativeModeTab> ECREATE_ORES_TAB = CREATIVE_MODE_TAB.register("ecreate_ores_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ECREATE_CORRUPTED_EMERALD.get()))
                    .title(Component.translatable("creativetab.ecreatemod.ecreatemod_ores"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ECREATE_CORRUPTED_COAL);
                        output.accept(ModItems.ECREATE_CORRUPTED_EMERALD);
                        output.accept(ModItems.ECREATE_CORRUPTED_DIAMOND);
                        output.accept(ModItems.ECREATE_CORRUPTED_GOLD);
                        output.accept(ModItems.ECREATE_CORRUPTED_IRON_INGOT);
                        output.accept(ModItems.ECREATE_CORRUPTED_RAW_DIAMOND);
                        output.accept(ModItems.ECREATE_CORRUPTED_RAW_EMERALD);
                        output.accept(ModItems.ECREATE_CORRUPTED_RAW_GOLD);
                        output.accept(ModItems.ECREATE_CORRUPTED_RAW_IRON);
                    }).build());



    public static final Supplier<CreativeModeTab> ECREATE_DISC_TAB = CREATIVE_MODE_TAB.register("ecreate_disc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COBBLEMON_BATTLE_MUSIC_DISC.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EcreateMod.MOD_ID, "ecreate_ores_tab"))
                    .title(Component.translatable("creativetab.ecreatemod.ecreatemod_disc"))
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
                        output.accept(ModItems.UNIVERSAL_COLLAPSE_DISC);
                        output.accept(ModItems.LAVA_CHICKEN_MUSIC_DISC);
                        output.accept(ModItems.TEARS_MUSIC_DISC);
                        output.accept(ModItems.BLACK_CATCHER_DISC);
                        output.accept(ModItems.EVERYTHING_I_GOT_DISC);
                        output.accept(ModItems.DONT_FORGET_DELTARUNE_DISC);
                        output.accept(ModItems.YOU_SPIN_ME_RIGHT_ROUND_DISC);
                        output.accept(ModItems.BILLIE_JEAN_DISC);
                    }).build());

    public static final Supplier<CreativeModeTab> ECREATE_MONEY_TAB = CREATIVE_MODE_TAB.register("ecreate_money_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ONE_HUNDRED_DOLLAR.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EcreateMod.MOD_ID, "ecreate_disc_tab"))
                    .title(Component.translatable("creativetab.ecreatemod.ecreatemod_money"))
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

    public static final Supplier<CreativeModeTab> ECREATE_OTHERS_TAB = CREATIVE_MODE_TAB.register("ecreate_others_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ATM_ALLOY_SMITHING_TEMPLATE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EcreateMod.MOD_ID, "ecreate_money_tab"))
                    .title(Component.translatable("creativetab.ecreatemod.ecreatemod_others"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MEK_GOD_PART);
                        output.accept(ModItems.MODIUM_GOD_PART);
                        output.accept(ModItems.GOD_MAIN_PART);
                        output.accept(ModItems.FOOD_GOD_PART);
                        output.accept(ModItems.HEART_OF_ECREATE);
                        output.accept(ModItems.ECREATE_CRYSTAL);
                        output.accept(ModItems.ECREATE_QUARTS);
                        output.accept(ModItems.ECREATE_ESSENCE);
                        output.accept(ModItems.ECREATE_ROD);
                        output.accept(ModItems.ECREATE_SHARD);
                        output.accept(ModItems.CREATE_GOD_PART);
                        output.accept(ModItems.BLOOD_GOD_PART);
                        output.accept(ModItems.ATM_ALLOY_SMITHING_TEMPLATE);
                        output.accept(ModItems.ORE_GOD_PART);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
