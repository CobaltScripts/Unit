package org.cobalt.unit.mixins;

import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.GameRenderer;
import org.cobalt.test.TestScreen;
import org.cobalt.unit.screen.UIScreen;
import org.cobalt.unit.utils.render.Renderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class GameRendererMixin {

  @Final
  @Shadow
  private Minecraft minecraft;

  @Unique
  private final Renderer cobaltUnit$renderer = Renderer.getRenderer();

  @Inject(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/render/GuiRenderer;incrementFrameNumber()V", shift = At.Shift.AFTER))
  public void renderNvg(DeltaTracker counter, boolean tick, CallbackInfo callbackInfo) {
    Screen currentScreen = this.minecraft.screen;

    if (currentScreen instanceof UIScreen) {
      ((UIScreen) currentScreen).drawScreen(cobaltUnit$renderer);
    }
  }

}
