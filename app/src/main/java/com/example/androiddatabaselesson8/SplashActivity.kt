package com.example.androiddatabaselesson8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val handler = Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
        ///https://lottiefiles.com/2523-loading
///        https://www.flaticon.com/premium-icon/flight_4283171?term=travel&page=1&position=46&page=1&position=46&related_id=4283171&origin=search    }
///https://lottiefiles.com/18517-the-travelers-walking-cycle-delivery
    }
}