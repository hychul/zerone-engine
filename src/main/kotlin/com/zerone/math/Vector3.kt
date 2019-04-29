package com.zerone.math

import sun.reflect.generics.reflectiveObjects.NotImplementedException

data class Vector3(var x: Float = 0.toFloat(), var y: Float = 0.toFloat(), var z: Float = 0.toFloat()) {

    companion object {
        private val matrix = FloatArray(16)
        private val inVec = FloatArray(4)
        private val outVec = FloatArray(4)
    }

    constructor(other: Vector3): this(other.x, other.y, other.z)

    fun set(x: Float, y: Float, z: Float): Vector3 {
        this.x = x
        this.y = y
        this.z = z
        return this
    }

    fun set(other: Vector3): Vector3 {
        this.x = other.x
        this.y = other.y
        this.z = other.z
        return this
    }

    fun plus(x: Float, y: Float, z: Float): Vector3 {
        this.x += x
        this.y += y
        this.z += z
        return this
    }

    fun plus(other: Vector3): Vector3 {
        this.x += other.x
        this.y += other.y
        this.z += other.z
        return this
    }

    fun minus(x: Float, y: Float, z: Float): Vector3 {
        this.x -= x
        this.y -= y
        this.z -= z
        return this
    }

    fun minus(other: Vector3): Vector3 {
        this.x -= other.x
        this.y -= other.y
        this.z -= other.z
        return this
    }

    fun times(scalar: Float): Vector3 {
        this.x *= scalar
        this.y *= scalar
        this.z *= scalar
        return this
    }

    fun len(): Float {
        return Mathf.sqrt(x * x + y * y + z * z)
    }

    fun nor(): Vector3 {
        val len = len()
        if (len != 0f) {
            this.x /= len
            this.y /= len
            this.z /= len
        }
        return this
    }

    fun rotate(angle: Float, axisX: Float, axisY: Float, axisZ: Float): Vector3 {
        throw NotImplementedException()
    }

    fun dist(other: Vector3): Float {
        val distX = this.x - other.x
        val distY = this.y - other.y
        val distZ = this.z - other.z
        return Mathf.sqrt(distX * distX + distY * distY + distZ * distZ)
    }

    fun dist(x: Float, y: Float, z: Float): Float {
        val distX = this.x - x
        val distY = this.y - y
        val distZ = this.z - z
        return Mathf.sqrt(distX * distX + distY * distY + distZ * distZ)
    }

    fun distSquared(other: Vector3): Float {
        val distX = this.x - other.x
        val distY = this.y - other.y
        val distZ = this.z - other.z
        return distX * distX + distY * distY + distZ * distZ
    }

    fun distSquared(x: Float, y: Float, z: Float): Float {
        val distX = this.x - x
        val distY = this.y - y
        val distZ = this.z - z
        return distX * distX + distY * distY + distZ * distZ
    }
}
