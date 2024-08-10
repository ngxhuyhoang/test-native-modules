package com.testnativemodule

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext

class SquareViewPackage: ReactPackage {
    override fun createNativeModules(p0: ReactApplicationContext): MutableList<NativeModule> {
        return mutableListOf()
    }

    override fun createViewManagers(p0: ReactApplicationContext): List<SquareViewManager> {
        return listOf(SquareViewManager())
    }
}