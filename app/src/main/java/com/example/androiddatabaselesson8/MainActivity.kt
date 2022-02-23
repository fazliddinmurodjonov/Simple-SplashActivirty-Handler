package com.example.androiddatabaselesson8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var onBack = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        if (onBack) {
            super.onBackPressed()
            return
        }
        onBack = true
        Toast.makeText(this,
            "Please, click 2 times to exit !",
            Toast.LENGTH_SHORT).show();
        Handler(Looper.getMainLooper()).postDelayed({
            onBack = false
        }, 2000)
    }
}