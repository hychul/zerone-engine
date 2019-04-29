package com.zerone.core

import java.util.*

class Event<T : Any?> {

    private val subscriberList = ArrayList<Subscriber<T>>()

    fun addSubscriber(subscriber: Subscriber<T>) {
        subscriberList.add(subscriber)
    }

    fun removeSubscriber(subscriber: Subscriber<T>) {
        subscriberList.remove(subscriber)
    }

    operator fun invoke(param: T) {
        subscriberList.forEach { it.onEvent(param) }
    }

    interface Subscriber<T> {
        fun onEvent(param: T)
    }
}
