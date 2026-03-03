package org.cobalt.unit

import org.cobalt.unit.properties.UIProperties
import org.cobalt.unit.utils.render.Renderer

abstract class UIComponent {

  protected var parent: UIComponent? = null
  protected var properties: UIProperties = UIProperties()
  protected val children = mutableListOf<UIComponent>()

  abstract fun renderComponent(renderer: Renderer)

  fun addChild(component: UIComponent) = apply {
    component.parent = this
    children.add(component)
  }

  fun setParent(component: UIComponent) = apply {
    parent = component
    component.addChild(this)
  }

}
