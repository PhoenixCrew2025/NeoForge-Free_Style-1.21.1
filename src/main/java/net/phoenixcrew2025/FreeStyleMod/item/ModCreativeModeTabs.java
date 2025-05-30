package net.phoenixcrew2025.FreeStyleMod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.phoenixcrew2025.FreeStyleMod.FreeStyleMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FreeStyleMod.MOD_ID);

    public static final Supplier<CreativeModeTab> FREE_STYLE_TAB = CREATIVE_MODE_TAB.register("free_style_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.freestylemod.free_style_mod"))
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
