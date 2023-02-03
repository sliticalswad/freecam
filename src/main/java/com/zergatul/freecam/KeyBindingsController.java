package com.zergatul.freecam;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.lwjgl.glfw.GLFW;

public class KeyBindingsController {

    public static final KeyMapping toggleFreeCam = new KeyMapping("key.zergatul.freecam.toggle", GLFW.GLFW_KEY_F6, "category.zergatul.freecam");
    public static final KeyMapping toggleCameraLock = new KeyMapping("key.zergatul.freecam.cameralock.toggle", InputConstants.UNKNOWN.getValue(), "category.zergatul.freecam");
    public static final KeyMapping toggleEyeLock = new KeyMapping("key.zergatul.freecam.eyelock.toggle", InputConstants.UNKNOWN.getValue(), "category.zergatul.freecam");

    public static void setup() {
        ClientRegistry.registerKeyBinding(toggleFreeCam);
    }
}
