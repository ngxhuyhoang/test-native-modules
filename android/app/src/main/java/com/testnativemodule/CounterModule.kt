package com.testnativemodule

import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class CounterModule: ReactContextBaseJavaModule() {
    private var counter = 0

    override fun getName(): String {
        return "CounterModule"
    }

    @ReactMethod
    fun increase(callback: Callback) {
        callback.invoke(counter++)
    }

    @ReactMethod
    fun increaseAsync(promise: Promise) {
        promise.resolve(counter++)
    }

    @ReactMethod
    fun decrease(callback: Callback) {
        callback.invoke(counter--)
    }

    @ReactMethod
    fun decreaseAsync(promise: Promise) {
        promise.resolve(counter--)
    }
}