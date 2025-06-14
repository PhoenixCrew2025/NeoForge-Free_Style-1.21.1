package net.phoenixcrew2025.FreeStyleMod.sound;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.phoenixcrew2025.FreeStyleMod.FreeStyleMod;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, FreeStyleMod.MOD_ID);

    public static final Supplier<SoundEvent> COBBLEMON_BATTLE_SONG = registerSoundEvent("cobblemon_battle_song");
    public static final ResourceKey<JukeboxSong> COBBLEMON_BATTLE_SONG_KEY = createSong("cobblemon_battle_song");

    public static final Supplier<SoundEvent> PINK_FLUFFY_UNICORN_SONG = registerSoundEvent("pink_fluffy_unicorn_song");
    public static final ResourceKey<JukeboxSong> PINK_FLUFFY_UNICORN_SONG_KEY = createSong("pink_fluffy_unicorn_song");

    public static final Supplier<SoundEvent> ACDC_BACK_IN_BLACK = registerSoundEvent("acdc_back_in_black");
    public static final ResourceKey<JukeboxSong> ACDC_BACK_IN_BLACK_KEY = createSong("acdc_back_in_black");

    public static final Supplier<SoundEvent> ACDC_BIG_BALLS = registerSoundEvent("acdc_big_balls");
    public static final ResourceKey<JukeboxSong> ACDC_BIG_BALLS_KEY = createSong("acdc_big_balls");

    public static final Supplier<SoundEvent> ACDC_HELLS_BELLS = registerSoundEvent("acdc_hells_bells");
    public static final ResourceKey<JukeboxSong> ACDC_HELLS_BELLS_KEY = createSong("acdc_hells_bells");

    public static final Supplier<SoundEvent> ACDC_HIGHWAY_TO_HELL = registerSoundEvent("acdc_highway_to_hell");
    public static final ResourceKey<JukeboxSong> ACDC_HIGHWAY_TO_HELL_KEY = createSong("acdc_highway_to_hell");









    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(FreeStyleMod.MOD_ID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(FreeStyleMod.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
