package com.example.testfuel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class precodocombus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_precodocombus)

        val proximo1 = findViewById<Button>(R.id.proximo1)

        proximo1.setOnClickListener {

            val intent = Intent (this, consumocarro ::class.java)
            startActivity(intent)

        }



    }

}