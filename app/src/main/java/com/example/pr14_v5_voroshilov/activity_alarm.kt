package com.example.pr14_v5_voroshilov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activity_alarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)
    }

    fun Calendar(view: View) {
        var intent = Intent(this@activity_alarm, activity_calendar::class.java)
        startActivity(intent)
        finish()
    }

    fun Settings(view: View) {
        var intent = Intent(this@activity_alarm, activity_settingsactivity::class.java)
        startActivity(intent)
        finish()
    }
}