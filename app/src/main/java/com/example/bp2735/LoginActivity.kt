package com.example.bp2735

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) //instance
        val btnLogin:Button = findViewById(R.id.button2)
        btnLogin.setOnClickListener {
        val intentHome = Intent (this,HomeActivity2::class.java)
        startActivity(intentHome)
        }
    }
}
