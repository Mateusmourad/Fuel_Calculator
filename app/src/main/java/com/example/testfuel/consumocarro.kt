package com.example.testfuel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class consumocarro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumocarro)

        val proximo2 = findViewById<Button>(R.id.proximo2)

        proximo2.setOnClickListener {

            val intent = Intent(this, quilometragem::class.java)
            startActivity(intent)


        }
    }
}