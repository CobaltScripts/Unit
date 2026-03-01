package org.cobalt.unit.mixins;

import com.mojang.blaze3d.opengl.GlStateManager;
import org.cobalt.unit.utils.render.StateTracker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GlStateManager.class)
public class GlStateManagerMixin {

  @Inject(method = "_bindTexture", at = @At("HEAD"), remap = false)
  private static void onBindTexture(int texture, CallbackInfo callbackInfo) {
    StateTracker.prevBoundTexture = texture;
  }

  @Inject(method = "_activeTexture", at = @At("HEAD"), remap = false)
  private static void onActiveTexture(int texture, CallbackInfo callbackInfo) {
    StateTracker.prevActiveTexture = texture;
  }

}
