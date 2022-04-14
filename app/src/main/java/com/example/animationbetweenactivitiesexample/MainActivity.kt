package com.example.animationbetweenactivitiesexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textview1_activity1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = this.localClassName
        textview1_activity1 = findViewById(R.id.textview1_activity1)
        textview1_activity1.setOnClickListener {
            val intent : Intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
            //밑에다가 해야되는구나
            //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)

        }
    }
}