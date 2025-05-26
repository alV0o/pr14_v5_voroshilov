package com.example.pr14_v5_voroshilov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activity_calendar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
    }

    fun Alarm(view: View) {
        var intent = Intent(this@activity_calendar, activity_alarm::class.java)
        startActivity(intent)
        finish()
    }

    fun Settings(view: View) {
        var intent = Intent(this@activity_calendar, activity_settingsactivity::class.java)
        startActivity(intent)
        finish()
    }
}