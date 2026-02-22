package org.cobalt.unit.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.util.SpecialDates;
import org.cobalt.unit.Unit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {

  @Inject(method = "<init>", at = @At("RETURN"))
  private static void onInit(CallbackInfo ci) {
    Unit.getRenderer().init();
  }

}
