package com.zerone.core

abstract class Scene {

//    protected val world = World()

    abstract fun onCreate()

    abstract fun onResume()

    open fun update() {
//        world.update()
    }

    open fun draw() {

    }

    abstract fun onPause()

    abstract fun onDestroy()
}
