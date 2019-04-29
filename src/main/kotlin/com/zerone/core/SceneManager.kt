package com.zerone.core

object SceneManager {

    private var scene: Scene? = null

    val onSceneLoad: Event<Scene> = Event()
    val onSceneUnload: Event<Scene> = Event()

    fun loadScene(newScene: Scene) {
        scene?.let {
            it.onPause()
            it.onDestroy()

            onSceneUnload(it)
        }

        newScene.onCreate()
        newScene.onResume()

        scene = newScene

        onSceneLoad(newScene)
    }
}
