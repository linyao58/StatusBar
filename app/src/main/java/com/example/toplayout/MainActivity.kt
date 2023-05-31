package com.example.toplayout

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.view.ViewCompat
import com.example.layoutlibrary.MyBar

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        MyBar.statusBar(this, Color.TRANSPARENT)
        MyBar.navigationBar(this, Color.TRANSPARENT)

    }
}
