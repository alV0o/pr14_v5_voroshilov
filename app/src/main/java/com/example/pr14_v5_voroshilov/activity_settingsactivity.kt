package com.example.pr14_v5_voroshilov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activity_settingsactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settingsactivity)
    }

    fun Alarm(view: View) {
        var intent = Intent(this@activity_settingsactivity, activity_alarm::class.java)
        startActivity(intent)
        finish()
    }

    fun Calendar(view: View) {
        var intent = Intent(this@activity_settingsactivity, activity_calendar::class.java)
        startActivity(intent)
        finish()
    }
}