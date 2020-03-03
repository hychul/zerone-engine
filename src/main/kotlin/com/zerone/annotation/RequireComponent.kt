package com.zerone.annotation

import com.zerone.core.Component
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import kotlin.reflect.KClass

@Retention(RetentionPolicy.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
annotation class RequireComponent(vararg val value: KClass<out Component>)
