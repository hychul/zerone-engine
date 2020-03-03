package com.zerone.component

import com.zerone.core.Component
import com.zerone.math.Quaternion
import com.zerone.math.Vector3

class Transform @JvmOverloads constructor(x: Float = 0.0f, y: Float = 0.0f, scaleX: Float = 1.0f, scaleY: Float = 1.0f) : Component() {

    val position: Vector3
    val scale: Vector3
    val rotation: Quaternion

    init {
        this.position = Vector3(x, y, 0f)
        this.scale = Vector3(scaleX, scaleY, 0f)
        this.rotation = Quaternion()
    }
}
