package org.cobalt.unit.properties

import org.cobalt.unit.UIComponent

class AbsoluteValue(private val value: Float) : PositionProperty, SizeProperty {
  override fun resolve(component: UIComponent): Float = value
}
