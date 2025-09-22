package net.phoenixcrew2025.EcreateMod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.phoenixcrew2025.EcreateMod.EcreateMod;
import net.phoenixcrew2025.EcreateMod.item.ModItems;
import net.phoenixcrew2025.EcreateMod.loot.AddItemModifier;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, EcreateMod.MOD_ID);
    }

    @Override
    protected void start() {
        this.add("music1_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.EVERYTHING_I_GOT_DISC.get()));

        this.add("music2_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.ACDC_HIGHWAY_TO_HELL_DISC.get()));

        this.add("music3_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.ACDC_BIG_BALLS_DISC.get()));

        this.add("music4_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.ACDC_HELLS_BELLS_DISC.get()));

        this.add("music5_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.ACDC_BACK_IN_BLACK_DISC.get()));

        this.add("music6_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.ALLSTARS_DISC.get()));

        this.add("music7_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.BLACK_CATCHER_DISC.get()));

        this.add("music8_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.COBBLEMON_BATTLE_MUSIC_DISC.get()));

        this.add("music9_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.DEMONS_SONG_DISC.get()));

        this.add("music10_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.DONT_FORGET_DELTARUNE_DISC.get()));

        this.add("music11_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.GODS_THEME_DISC.get()));

        this.add("music12_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.LAVA_CHICKEN_MUSIC_DISC.get()));

        this.add("music13_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.OCEAN_DRIVE_DISC.get()));

        this.add("music14_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.PINK_FLUFFY_UNICORN_DISC.get()));

        this.add("music15_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.SICKNESS_DISC.get()));

        this.add("music16_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.SLEEP_TOKEN_DISC.get()));

        this.add("music17_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.TEARS_MUSIC_DISC.get()));

        this.add("music18_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.UNIVERSAL_COLLAPSE_DISC.get()));

        this.add("music19_from_creeper",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/creeper")).build(),
                        LootItemRandomChanceCondition.randomChance(0.03f).build()
                }, ModItems.YOU_SPIN_ME_RIGHT_ROUND_DISC.get()));


    }
}
