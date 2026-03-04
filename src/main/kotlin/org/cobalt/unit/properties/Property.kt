package org.cobalt.unit.properties

import org.cobalt.unit.UIComponent

interface Property<T> {
  fun resolve(component: UIComponent): T
}

interface PositionProperty : Property<Float>
interface SizeProperty : Property<Float>
