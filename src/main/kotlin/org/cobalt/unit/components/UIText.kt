package org.cobalt.unit.components

import org.cobalt.unit.UIComponent
import org.cobalt.unit.utils.render.Renderer

class UIText(
  private val content: String,
) : UIComponent() {

  override fun renderComponent(renderer: Renderer) {
    val color = getColor()

    if (color.alpha == 0) {
      return
    }

    val textSize = getTextSize()

    if (textSize == 0f) {
      return
    }

    renderer.text(
      getFont(),
      content,
      getX(),
      getY(),
      getTextSize(),
      color.rgb
    )

    super.renderComponent(renderer)
  }

}
