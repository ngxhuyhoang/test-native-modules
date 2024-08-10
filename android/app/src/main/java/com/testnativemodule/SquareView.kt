package com.testnativemodule

import android.content.Context
import android.view.ViewGroup

class SquareView(context: Context) : ViewGroup(context) {

    init {
        // Đảm bảo layoutParams có giá trị mặc định hợp lệ
        if (layoutParams == null) {
            layoutParams = LayoutParams(
                LayoutParams.MATCH_PARENT, // Có thể thay đổi tùy theo nhu cầu
                LayoutParams.MATCH_PARENT  // Có thể thay đổi tùy theo nhu cầu
            )
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width = MeasureSpec.getSize(widthMeasureSpec)
        val height = MeasureSpec.getSize(heightMeasureSpec)

        // Đảm bảo đo lường chính xác
        setMeasuredDimension(width, height)

        // Đo lường các view con
        val childSpec = MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY)
        measureChildren(childSpec, childSpec)
    }

    override fun onLayout(p0: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        for (i in 0 until childCount) {
            val child = getChildAt(i)
            // Đặt tất cả các view con vào các góc của com.testnativemodule.SquareView
            child.layout(0, 0, width, height)
        }
    }
}