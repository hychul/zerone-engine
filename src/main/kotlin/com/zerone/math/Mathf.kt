package com.zerone.math

class Mathf {

    companion object {
        const val E = 2.718281828459045f
        const val PI = 3.141592653589793f

        const val DEG_TO_RADIANS = PI / 180.0f
        const val RAD_TO_DEGREES = 180.0f / PI

        @JvmStatic fun sin(var0: Float): Float {
            return Math.sin(var0.toDouble()).toFloat()
        }

        @JvmStatic fun cos(var0: Float): Float {
            return Math.cos(var0.toDouble()).toFloat()
        }

        @JvmStatic fun tan(var0: Float): Float {
            return Math.tan(var0.toDouble()).toFloat()
        }

        @JvmStatic fun asin(var0: Float): Float {
            return Math.asin(var0.toDouble()).toFloat()
        }

        @JvmStatic fun acos(var0: Float): Float {
            return Math.acos(var0.toDouble()).toFloat()
        }

        @JvmStatic fun atan(var0: Float): Float {
            return Math.atan(var0.toDouble()).toFloat()
        }

        @JvmStatic fun toRadians(angdeg: Float): Float {
            return angdeg * DEG_TO_RADIANS
        }

        @JvmStatic fun toDegrees(angrad: Float): Float {
            return angrad * RAD_TO_DEGREES
        }

        @JvmStatic fun exp(var0: Float): Float {
            return Math.exp(var0.toDouble()).toFloat()
        }

        @JvmStatic fun log(var0: Float): Float {
            return Math.log(var0.toDouble()).toFloat()
        }

        @JvmStatic fun log10(var0: Float): Float {
            return Math.log10(var0.toDouble()).toFloat()
        }

        @JvmStatic fun sqrt(var0: Float): Float {
            return Math.sqrt(var0.toDouble()).toFloat()
        }

        @JvmStatic fun cbrt(var0: Float): Float {
            return Math.cbrt(var0.toDouble()).toFloat()
        }

        @JvmStatic fun IEEEremainder(var0: Float, var2: Float): Float {
            return Math.IEEEremainder(var0.toDouble(), var2.toDouble()).toFloat()
        }

        @JvmStatic fun ceil(var0: Float): Float {
            return Math.ceil(var0.toDouble()).toFloat()
        }

        @JvmStatic fun floor(var0: Float): Float {
            return Math.floor(var0.toDouble()).toFloat()
        }

        @JvmStatic fun rint(var0: Float): Float {
            return Math.rint(var0.toDouble()).toFloat()
        }

        @JvmStatic fun atan2(var0: Float, var2: Float): Float {
            return Math.atan2(var0.toDouble(), var2.toDouble()).toFloat()
        }

        @JvmStatic fun pow(var0: Float, var2: Float): Float {
            return Math.pow(var0.toDouble(), var2.toDouble()).toFloat()
        }

        @JvmStatic fun round(a: Float): Int {
            return Math.round(a)
        }

        @JvmStatic fun random(): Float {
            return Math.random().toFloat()
        }

        @JvmStatic fun abs(a: Float): Float {
            return Math.abs(a)
        }

        @JvmStatic fun max(a: Float, b: Float): Float {
            return Math.max(a, b)
        }

        @JvmStatic fun min(a: Float, b: Float): Float {
            return Math.min(a, b)
        }

        @JvmStatic fun ulp(f: Float): Float {
            return Math.ulp(f)
        }

        @JvmStatic fun signum(f: Float): Float {
            return Math.signum(f)
        }

        @JvmStatic fun sinh(var0: Float): Float {
            return Math.sinh(var0.toDouble()).toFloat()
        }

        @JvmStatic fun cosh(var0: Float): Float {
            return Math.cosh(var0.toDouble()).toFloat()
        }

        @JvmStatic fun tanh(var0: Float): Float {
            return Math.tanh(var0.toDouble()).toFloat()
        }

        @JvmStatic fun hypot(var0: Float, var2: Float): Float {
            return Math.hypot(var0.toDouble(), var2.toDouble()).toFloat()
        }

        @JvmStatic fun expm1(var0: Float): Float {
            return Math.expm1(var0.toDouble()).toFloat()
        }

        @JvmStatic fun log1p(var0: Float): Float {
            return Math.log1p(var0.toDouble()).toFloat()
        }

        @JvmStatic fun copySign(magnitude: Float, sign: Float): Float {
            return Math.copySign(magnitude, sign)
        }

        @JvmStatic fun getExponent(f: Float): Int {
            return Math.getExponent(f)
        }

        @JvmStatic fun scalb(f: Float, scaleFactor: Int): Float {
            return Math.scalb(f, scaleFactor)
        }
    }
}
