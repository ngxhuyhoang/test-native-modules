package com.testnativemodule

import android.graphics.Color
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import android.view.ViewGroup
import android.widget.FrameLayout

class SquareViewManager : ViewGroupManager<SquareView>() {

    override fun getName(): String {
        return "SquareView"
    }

    override fun createViewInstance(context: ThemedReactContext): SquareView {
        return SquareView(context)
    }

    @ReactProp(name = "color")
    fun setColor(view: SquareView, color: String) {
        view.setBackgroundColor(Color.parseColor(color))
    }

    @ReactProp(name = "width")
    fun setWidth(view: SquareView, width: Int) {
        val params = view.layoutParams ?: FrameLayout.LayoutParams(width, ViewGroup.LayoutParams.WRAP_CONTENT)
        params.width = width
        view.layoutParams = params
    }

    @ReactProp(name = "height")
    fun setHeight(view: SquareView, height: Int) {
        val params = view.layoutParams ?: FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, height)
        params.height = height
        view.layoutParams = params
    }
}