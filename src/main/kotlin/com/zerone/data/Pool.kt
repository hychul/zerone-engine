package com.zerone.data

import java.util.*

class Pool<T> @JvmOverloads constructor(private val factory: PoolObjectFactory<T>, private val initializer: PoolObjectInitializer<T>? = null) {

    private val freeObjects: Stack<T> = Stack()

    fun get(): T {
        val obj: T = if (freeObjects.isEmpty())
            factory.create()
        else
            freeObjects.pop()

        initializer?.initialize(obj)

        return obj
    }

    fun put(obj: T) {
        freeObjects.push(obj)
    }

    interface PoolObjectFactory<T> {
        fun create(): T
    }

    interface PoolObjectInitializer<T> {
        fun initialize(`object`: T)
    }
}
