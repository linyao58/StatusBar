package com.example.layoutlibrary

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.view.View
import android.view.WindowInsets
import android.widget.FrameLayout
import androidx.annotation.RequiresApi
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

object MyBar {

//    状态栏
    fun statusBar(activity: Activity, state: Boolean) {
        WindowCompat.setDecorFitsSystemWindows(activity.window, false)
        activity.window.statusBarColor = Color.TRANSPARENT
        val controller = ViewCompat.getWindowInsetsController(activity.findViewById(android.R.id.content))
//        true 字体为黑色


        controller?.isAppearanceLightStatusBars = state
    }

//    导航栏
    fun navigationBar(activity: Activity, state: Boolean){

        WindowCompat.setDecorFitsSystemWindows(activity.window, false)
        activity.window.statusBarColor = Color.TRANSPARENT
        val controller = ViewCompat.getWindowInsetsController(activity.findViewById(android.R.id.content))
//        显示导航栏
//        controller?.show(WindowInsetsCompat.Type.navigationBars())
        //        true 字体为黑色
        controller?.isAppearanceLightNavigationBars = state
    }

}