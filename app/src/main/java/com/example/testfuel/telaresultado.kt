package com.example.testfuel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class telaresultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telaresultado)

        val getResultadoFinal = intent.getFloatExtra("ChaveDistancia", 0f)



        val novoCalculo = findViewById<Button>(R.id.btn_calculo)
        novoCalculo.setOnClickListener {
            val mainScreen = Intent(this, MainActivity::class.java)
            startActivity(mainScreen)
        }
    }
}