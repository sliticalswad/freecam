package com.zergatul.freecam.common;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static final KeyMapping toggleFreeCam = new KeyMapping("key.zergatul.freecam.toggle", GLFW.GLFW_KEY_F6, "category.zergatul.freecam");
    public static final KeyMapping toggleCameraLock = new KeyMapping("key.zergatul.freecam.cameralock.toggle", InputConstants.UNKNOWN.getValue(), "category.zergatul.freecam");
    public static final KeyMapping toggleEyeLock = new KeyMapping("key.zergatul.freecam.eyelock.toggle", InputConstants.UNKNOWN.getValue(), "category.zergatul.freecam");
    public static final KeyMapping startPath = new KeyMapping("key.zergatul.freecam.start.path", InputConstants.UNKNOWN.getValue(), "category.zergatul.freecam");
}