package org.cobalt.unit

import org.cobalt.unit.utils.render.Renderer

class UIWindow : UIComponent() {

  override fun renderComponent(renderer: Renderer) {
    children.forEach { it.renderComponent(renderer) }
  }

}
