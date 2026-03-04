package org.cobalt.test

import java.awt.Color
import org.cobalt.unit.UIScreen
import org.cobalt.unit.components.UIBox
import org.cobalt.unit.components.UIText
import org.cobalt.unit.dsl.childOf
import org.cobalt.unit.dsl.configure
import org.cobalt.unit.dsl.pixels
import org.cobalt.unit.utils.Fonts

object TestScreen : UIScreen() {

  init {
    val box = UIBox(10f).configure {
      x = 10.pixels
      y = 10.pixels
      width = 100.pixels
      height = 100.pixels
      color = Color.BLUE
    } childOf window


    UIText("Hello").configure {
      textSize = 100f.pixels
      font = Fonts.DEFAULT
      color = Color.WHITE
    } childOf box
  }

}
