package com.example.pr14_v5_voroshilov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var login:EditText
    lateinit var email: EditText
    lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userlogin)
        login =findViewById(R.id.login)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }

    fun Reg(view: View) {
        if (login.text.toString().isNotEmpty()&& email.text.toString().isNotEmpty()&&password.text.toString().isNotEmpty()) {
            val intent = Intent(this@MainActivity, activity_settingsactivity::class.java)
            startActivity(intent)
            finish()
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
    }
}