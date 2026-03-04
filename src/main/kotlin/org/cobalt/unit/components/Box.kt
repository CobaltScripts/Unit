package org.cobalt.unit.components

import org.cobalt.unit.UIComponent
import org.cobalt.unit.utils.render.Renderer

class Box(
  val radius: Float? = null,
) : UIComponent() {

  override fun renderComponent(renderer: Renderer) {
    val color = getColor()

    if (color.alpha == 0) {
      return
    }

    val width = getWidth()

    if (width == 0f) {
      return
    }

    val height = getHeight()

    if (height == 0f) {
      return
    }

    renderer.rect(
      getX(),
      getY(),
      width,
      height,
      color.rgb,
      radius
    )

    super.renderComponent(renderer)
  }

}
