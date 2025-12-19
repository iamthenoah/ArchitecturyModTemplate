package com.example.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class MyExampleModFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // do nothing
    }
}
