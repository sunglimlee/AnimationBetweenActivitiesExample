package com.example.animationbetweenactivitiesexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    private lateinit var textview1_mainactivity3 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        title = this.localClassName
        textview1_mainactivity3 = findViewById(R.id.textview1_activity3 )
        textview1_mainactivity3.setOnClickListener {
            val intent : Intent = Intent(this@MainActivity3, MainActivity::class.java)
            startActivity(intent)
        }
    }
}