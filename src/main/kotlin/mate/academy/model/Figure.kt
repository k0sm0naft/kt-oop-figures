package mate.academy.model

import mate.academy.behavior.Calculable
import mate.academy.behavior.Drawable
import kotlin.math.roundToLong

abstract class Figure (private val color: Color) : Calculable, Drawable {
    protected fun getStartMessage() = "Figure: ${this.javaClass.simpleName.lowercase()}, " +
            "color: ${color.name.lowercase()}, " +
            "area: ${getRoundedArea()} sq. units, "

    private fun getRoundedArea() = calculateArea().times(100).roundToLong().toDouble().div(100)
}
