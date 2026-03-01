package org.cobalt.unit.components

import java.awt.Color
import org.cobalt.unit.UIComponent
import org.cobalt.unit.utils.render.Renderer

class UIRectangle : UIComponent() {

  override fun renderComponent(renderer: Renderer) {
    renderer.rect(0f, 0f, 100f, 100f, Color.WHITE.rgb)
  }

}
