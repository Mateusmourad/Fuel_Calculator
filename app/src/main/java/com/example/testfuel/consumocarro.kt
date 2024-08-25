package com.example.testfuel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class consumocarro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consumocarro)

        val proximo2 = findViewById<Button>(R.id.proximo2)

        val edtconsumo = findViewById<TextInputEditText>(R.id.edt_consumo)

        val preco_combus = intent.getFloatExtra("KEY_COMBUSTIVEL", 0f)

            proximo2.setOnClickListener {

            val consumo : Float = edtconsumo.text.toString().toFloat()

            val intent = Intent(this, quilometragem::class.java)
                .apply {
                    putExtra("KEY_COMBUSTIVEL", preco_combus)
                    putExtra ("KEY_CONSUMO", consumo)

                }
            startActivity(intent)


        }
    }
}