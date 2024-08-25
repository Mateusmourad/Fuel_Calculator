package com.example.testfuel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_CONSUMO = "ChaveConsumo"
const val KEY_COMBUSTIVEL = "ChaveCombustivel"
const val chaveDistancia = "ResultadoFinal"

class telaresultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telaresultado)

        val resultadoFinal = intent.getFloatExtra("chaveDistancia", 0f)

        println("Mateus acao do botao + result")

        val tvResult = findViewById<TextView>(R.id.tv_result)

        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)

        tvResult.text= resultadoFinal.toString()



        val novoCalculo = findViewById<Button>(R.id.btn_calculo)
        novoCalculo.setOnClickListener {
            val mainScreen = Intent(this, MainActivity::class.java)
            startActivity(mainScreen)
        }
    }
}