package org.cobalt.test

import org.cobalt.unit.UIScreen
import org.cobalt.unit.components.UIRectangle
import org.cobalt.unit.dsl.childOf

object TestScreen : UIScreen() {

  init {
    UIRectangle() childOf window
  }

}
