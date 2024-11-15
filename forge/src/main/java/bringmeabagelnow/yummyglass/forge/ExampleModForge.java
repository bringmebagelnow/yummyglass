package bringmeabagelnow.yummyglass.forge;

import net.minecraftforge.fml.common.Mod;

import bringmeabagelnow.yummyglass.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModForge {
    public ExampleModForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
