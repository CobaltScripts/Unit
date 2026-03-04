package org.cobalt.unit.dsl

import org.cobalt.unit.properties.AbsoluteValue

val Int.pixels: AbsoluteValue
  get() = AbsoluteValue(this.toFloat())

val Float.pixels: AbsoluteValue
  get() = AbsoluteValue(this)
