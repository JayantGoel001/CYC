@file:Suppress("DEPRECATION")

package com.example.cyc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shutdown: ImageButton = findViewById(R.id.shutdown)
        val music: ImageButton = findViewById(R.id.music)
        val restart: ImageButton = findViewById(R.id.restart)

        shutdown.setOnClickListener {
            val client = Client("shutdown")
            client.execute()
        }
        shutdown.setOnLongClickListener {
            createToast("shutdown")
            return@setOnLongClickListener true
        }

        music.setOnClickListener {
            val client = Client("music")
            client.execute()
        }
        music.setOnLongClickListener {
            createToast("play music")
            return@setOnLongClickListener true
        }

        restart.setOnClickListener {
            val client = Client("restart")
            client.execute()
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