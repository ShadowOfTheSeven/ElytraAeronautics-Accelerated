package com.github.Soulphur0.keybinds;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class GeniusWings implements ModInitializer {
    public static KeyBinding accelerateFlight;
    public static KeyBinding wingFlap;

    @Override
    public void onInitialize() {
        accelerateFlight = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "Accelerate", // The translation key of the keybinding's name
                InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
                GLFW.GLFW_KEY_R, // The keycode of the key
                "ElytraAeronautics"
        ));
        wingFlap = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "Speed Burst", // The translation key of the keybinding's name
                InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
                GLFW.GLFW_KEY_LEFT_CONTROL, // The keycode of the key
                "ElytraAeronautics"
        ));

    }
}

