package com.mokhtar.offerstask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mokhtar.offerstask.util.Utility.setTransparentStatusBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTransparentStatusBar()
        setContentView(R.layout.activity_main)

    }
}