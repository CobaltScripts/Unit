package org.cobalt.unit

import org.cobalt.unit.dsl.pixels
import org.cobalt.unit.properties.PositionProperty
import org.cobalt.unit.properties.SizeProperty
import org.cobalt.unit.utils.Fonts
import org.cobalt.unit.utils.helper.Font
import java.awt.Color

class UIProperties {

  var x: PositionProperty = 0.pixels
  var y: PositionProperty = 0.pixels
  var width: SizeProperty = 0.pixels
  var height: SizeProperty = 0.pixels
  var textSize: SizeProperty = 0.pixels

  var color: Color = Color.WHITE
  var font: Font = Fonts.DEFAULT

}
