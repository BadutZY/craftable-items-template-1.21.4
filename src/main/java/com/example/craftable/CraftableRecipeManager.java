package com.example.craftable;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class CraftableRecipeManager {

    public static void registerRecipes() {
        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            CraftableItems.LOGGER.info("Registering custom spawn egg recipes programmatically...");
        });
    }
    public static void addSpawnEggRecipe() {

    }
}