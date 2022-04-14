package com.example.animationbetweenactivitiesexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private lateinit var button1_activity2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title = this.localClassName
        button1_activity2 = findViewById(R.id.button1_activity2)
        button1_activity2.setOnClickListener {
            val intent : Intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
        }
    }

    override fun finish() {
        super.finish()
        //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}