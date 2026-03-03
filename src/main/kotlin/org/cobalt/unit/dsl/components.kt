package org.cobalt.unit.dsl

import org.cobalt.unit.UIComponent

infix fun UIComponent.childOf(component: UIComponent) = apply {
  setParent(component)
}

