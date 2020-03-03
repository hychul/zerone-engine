package com.zerone.core

import java.lang.System.nanoTime
import java.util.concurrent.SynchronousQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

class ZeroneEngine {

    private val threadPoolExecutor = ThreadPoolExecutor(
            1,
            1,
            0,
            TimeUnit.MILLISECONDS,
            SynchronousQueue(),
            ThreadPoolExecutor.DiscardPolicy()
    )
    private val simulatorTask: SimulatorTask

    var lock: Object

    init {
        simulatorTask = SimulatorTask(60)

        lock = Object()
    }

    fun setSimulationRate(simulationRate: Long) {
        simulatorTask.setSimulationRate(simulationRate)
    }

    fun start() {
        threadPoolExecutor.execute(simulatorTask)
    }

    fun stop() {
        simulatorTask.stop()
    }

    internal inner class SimulatorTask(simulationRate: Long) : Runnable {

        private val NANO_TO_SEC = 1 / 1000000000.0f

        private var scene: Scene? = null

        private var shutdown: Boolean = false

        private var simulationInterval: Long = 0

        init {
            setSimulationRate(simulationRate)
            SceneManager.onSceneLoad.addSubscriber(object : Event.Subscriber<Scene> {
                override fun onEvent(param: Scene) {
                    scene = param
                }
            })
        }

        fun setSimulationRate(simulationRate: Long) {
            simulationInterval = TimeUnit.SECONDS.toNanos(1) / simulationRate
        }

        fun stop() {
            shutdown = true
        }

        fun onResume() {
            // TODO: Validating scene is not null
        }

        fun onPause() {
            scene?.let {
                it.onPause()
                it.onDestroy()
            }
        }

        override fun run() {
            onResume()

            var startTime = nanoTime()
            var elapseTime = 0L

            while (true) {
                Time.deltaTime = (nanoTime() - startTime) * NANO_TO_SEC
                startTime = nanoTime()

                synchronized(lock) {
                    // TODO: Use input queue
                    scene?.update()

                    lock.notifyAll()
                }

                elapseTime = nanoTime() - startTime

                if (elapseTime < simulationInterval) {
                    try {
                        Thread.sleep(TimeUnit.NANOSECONDS.toMillis(simulationInterval - elapseTime))
                    } catch (ignored: InterruptedException) {

                    }
                }

                if (shutdown)
                    break
            }

            shutdown = false

            onPause()
        }
    }
}
