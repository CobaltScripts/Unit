package org.cobalt.unit

import java.awt.Color
import org.cobalt.unit.effects.Effect
import org.cobalt.unit.properties.PositionProperty
import org.cobalt.unit.properties.SizeProperty
import org.cobalt.unit.utils.helper.Font
import org.cobalt.unit.utils.render.Renderer

abstract class UIComponent {

  @JvmField
  protected var parent: UIComponent? = null
  var properties: UIProperties = UIProperties()

  protected val children = mutableListOf<UIComponent>()
  protected val effects = mutableListOf<Effect>()

  open fun renderComponent(renderer: Renderer) {
    if (children.isNotEmpty()) {
      children.forEach { it.renderComponent(renderer) }
    }
  }

  fun addChild(component: UIComponent) = apply {
    component.parent = this
    children.add(component)
  }

  fun setParent(component: UIComponent) = apply {
    parent = component
    component.addChild(this)
  }

  fun setX(property: PositionProperty) = apply {
    properties.x = property
  }

  fun setY(property: PositionProperty) = apply {
    properties.y = property
  }

  fun setWidth(property: SizeProperty) = apply {
    properties.width = property
  }

  fun setHeight(property: SizeProperty) = apply {
    properties.height = property
  }

  fun setColor(color: Color) = apply {
    properties.color = color
  }

  fun setFont(font: Font) = apply {
    properties.font = font
  }

  fun setTextSize(size: SizeProperty) = apply {
    properties.textSize = size
  }

  fun getX(): Float {
    val ownX = properties.x.resolve(this)
    val parentX = parent?.getX() ?: 0f
    return parentX + ownX
  }

  fun getY(): Float {
    val ownY = properties.y.resolve(this)
    val parentY = parent?.getY() ?: 0f
    return parentY + ownY
  }

  open fun getWidth(): Float = properties.width.resolve(this)
  open fun getHeight(): Float = properties.height.resolve(this)
  fun getColor(): Color = properties.color
  fun getFont(): Font = properties.font
  fun getTextSize(): Float = properties.textSize.resolve(this)
  fun getParent(): UIComponent? = parent

}
