package com.example.neoforge;

import com.example.MyExampleMod;
import net.neoforged.fml.common.Mod;

@Mod(MyExampleMod.MOD_ID)
public final class MyExampleModNeoforge {

    public MyExampleModNeoforge() {
        MyExampleMod.init();
    }
}
