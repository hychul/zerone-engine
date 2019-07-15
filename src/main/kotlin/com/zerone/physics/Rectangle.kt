package com.zerone.physics

import com.zerone.math.Vector2

// TODO: Change it to data class
class Rectangle(x: Float, y: Float, var width: Float, var height: Float) {
    val lowerLeft: Vector2 = Vector2(x, y)
}
