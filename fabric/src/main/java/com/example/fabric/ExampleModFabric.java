package com.example.fabric;

import com.example.ExampleMod;
import net.fabricmc.api.ModInitializer;

public final class ExampleModFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ExampleMod.init();
    }
}
