package org.cobalt.unit.dsl

import org.cobalt.unit.UIComponent
import org.cobalt.unit.UIProperties

fun UIComponent.configure(config: UIProperties.() -> Unit) = apply {
  properties.config()
}

infix fun UIComponent.childOf(component: UIComponent) = apply {
  setParent(component)
}

