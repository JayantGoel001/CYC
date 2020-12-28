package com.example.cyc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private val shutdown: ImageButton = findViewById(R.id.shutdown)
    private val play: ImageButton = findViewById(R.id.play)
    private val restart: ImageButton = findViewById(R.id.restart)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shutdown.setOnClickListener {

        }

        play.setOnClickListener {

        }

        restart.setOnClickListener {

        }
    }
}