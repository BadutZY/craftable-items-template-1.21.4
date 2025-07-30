package com.example.craftable;

import net.fabricmc.api.ClientModInitializer;

public class CraftableItemsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Client-side initialization code here
        CraftableItems.LOGGER.info("Craftable Items client initialized!");
    }
}