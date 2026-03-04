package org.cobalt.unit

import net.minecraft.client.gui.screens.Screen
import net.minecraft.network.chat.Component
import org.cobalt.unit.utils.render.Renderer

abstract class UIScreen : Screen(Component.empty()) {

  val window: Window = Window()

  fun drawScreen(renderer: Renderer) {
    val minecraftWindow = minecraft.window
    val screenWidth = minecraftWindow.width.toFloat()
    val screenHeight = minecraftWindow.height.toFloat()

    renderer.render(screenWidth, screenHeight) {
      window.renderComponent(renderer)
    }
  }

  class Window : UIComponent()

}
