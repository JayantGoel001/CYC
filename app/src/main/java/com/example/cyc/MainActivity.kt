package com.example.cyc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val shutdown: ImageButton = findViewById(R.id.shutdown)
    private val music: ImageButton = findViewById(R.id.music)
    private val restart: ImageButton = findViewById(R.id.restart)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shutdown.setOnClickListener {
            val client = Client("shutdown")
        }
        shutdown.setOnLongClickListener {
            createToast("shutdown")
            return@setOnLongClickListener true
        }

        music.setOnClickListener {
            val client = Client("music")
        }
        music.setOnLongClickListener {
            createToast("play music")
            return@setOnLongClickListener true
        }

        restart.setOnClickListener {
            val client = Client("restart")
        }
        restart.setOnLongClickListener {
            createToast("restart")
            return@setOnLongClickListener true
        }
    }
    private fun  createToast(it:String){
        Toast.makeText(this, it,Toast.LENGTH_LONG).show()
    }
}