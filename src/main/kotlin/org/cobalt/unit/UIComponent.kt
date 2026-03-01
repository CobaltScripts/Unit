package org.cobalt.unit

import org.cobalt.unit.utils.render.Renderer

abstract class UIComponent {

  protected val children = mutableListOf<UIComponent>()

  abstract fun renderComponent(renderer: Renderer)

  fun addChild(component: UIComponent) {
    children.add(component)
  }

  fun setParent(component: UIComponent) {
    component.addChild(this)
  }

}
