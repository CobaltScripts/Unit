package org.cobalt.unit

import net.fabricmc.api.ClientModInitializer
import org.cobalt.unit.utils.render.NanoVGImpl
import org.cobalt.unit.utils.render.Renderer

object Unit : ClientModInitializer{

  @JvmStatic
  private var renderer: Renderer = NanoVGImpl

  @JvmStatic
  fun getRenderer(): Renderer {
    return renderer
  }

  override fun onInitializeClient() {}

}
