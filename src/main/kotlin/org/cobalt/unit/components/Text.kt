package org.cobalt.unit.components

import org.cobalt.unit.UIComponent
import org.cobalt.unit.utils.render.Renderer

class Text(
  private val content: String,
) : UIComponent() {

  private var textBounds: Pair<Float, Float> = Pair(0f, getTextSize())

  override fun renderComponent(renderer: Renderer) {
    val color = getColor()

    if (color.alpha == 0) {
      return
    }

    val textSize = getTextSize()

    if (textSize == 0f) {
      return
    }

    textBounds = renderer.textBounds(getFont(), content, textSize)

    renderer.text(
      getFont(),
      content,
      getX(),
      getY(),
      textSize,
      color.rgb
    )

    super.renderComponent(renderer)
  }

  override fun getWidth(): Float {
    return textBounds.first
  }

  override fun getHeight(): Float {
    return textBounds.second
  }

}
