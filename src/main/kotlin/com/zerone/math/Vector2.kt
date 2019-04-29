package com.zerone.math

data class Vector2(var x: Float = 0.toFloat(), var y: Float = 0.toFloat()) {

    constructor(other: Vector2): this(other.x, other.y)

    fun set(other: Vector2): Vector2 {
        this.x = other.x
        this.y = other.y
        return this
    }

    fun set(x: Float, y: Float): Vector2 {
        this.x = x
        this.y = y
        return this
    }

    fun plus(x: Float, y: Float): Vector2 {
        this.x += x
        this.y += y
        return this
    }

    fun plus(other: Vector2): Vector2 {
        this.x += other.x
        this.y += other.y
        return this
    }

    fun sub(x: Float, y: Float): Vector2 {
        this.x -= x
        this.y -= y
        return this
    }

    fun sub(other: Vector2): Vector2 {
        this.x -= other.x
        this.y -= other.y
        return this
    }

    fun times(scalar: Float): Vector2 {
        this.x *= scalar
        this.y *= scalar
        return this
    }

    fun len(): Float {
        return Mathf.sqrt(x * x + y * y)
    }

    fun nor(): Vector2 {
        val len = len()
        if (len != 0f) {
            this.x /= len
            this.y /= len
        }
        return this
    }

    fun angle(): Float {
        var angle = Mathf.toDegrees(Mathf.atan2(y, x))
        if (angle < 0)
            angle += 360f
        return angle
    }

    fun rotate(angle: Float): Vector2 {
        val rad = Mathf.toRadians(angle)
        val cos = Mathf.cos(rad)
        val sin = Mathf.sin(rad)

        val newX = this.x * cos - this.y * sin
        val newY = this.x * sin + this.y * cos

        this.x = newX
        this.y = newY

        return this
    }

    fun dist(other: Vector2): Float {
        val distX = this.x - other.x
        val distY = this.y - other.y
        return Mathf.sqrt(distX * distX + distY * distY)
    }

    fun dist(x: Float, y: Float): Float {
        val distX = this.x - x
        val distY = this.y - y
        return Mathf.sqrt(distX * distX + distY * distY)
    }

    fun distSquared(other: Vector2): Float {
        val distX = this.x - other.x
        val distY = this.y - other.y
        return distX * distX + distY * distY
    }

    fun distSquared(x: Float, y: Float): Float {
        val distX = this.x - x
        val distY = this.y - y
        return distX * distX + distY * distY
    }

    override fun toString(): String {
        return "$x, $y"
    }
}
