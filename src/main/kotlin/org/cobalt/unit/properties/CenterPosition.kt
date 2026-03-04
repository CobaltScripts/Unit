package org.cobalt.unit.properties

import org.cobalt.unit.UIComponent

class CenterX : PositionProperty {
  override fun resolve(component: UIComponent): Float {
    val parent = component.getParent() ?: return 0f
    val centerPoint = (parent.getX() + parent.getWidth()) / 2
    return centerPoint - (component.getWidth() / 2)
  }
}

class CenterY : PositionProperty {
  override fun resolve(component: UIComponent): Float {
    val parent = component.getParent() ?: return 0f
    val centerPoint = (parent.getY() + parent.getHeight()) / 2
    return centerPoint - (component.getHeight() / 2)
  }
}
