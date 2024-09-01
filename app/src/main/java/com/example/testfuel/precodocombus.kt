package com.example.testfuel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class precodocombus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_precodocombus)

        val edtprecocombus = findViewById<TextInputEditText>(R.id.edt_precocombus)

        val proximo1 = findViewById<Button>(R.id.proximo1)

        val preco = edtprecocombus.text


        proximo1.setOnClickListener {

            if (preco.toString().isNotEmpty()) {

            val preco_combus: Float = edtprecocombus.text.toString().toFloat()

            val intent = Intent(this, consumocarro::class.java)
                .apply {
                    putExtra("KEY_COMBUSTIVEL", preco_combus)
                }
            startActivity(intent)

        } else {
            Snackbar.make(edtprecocombus, "Preencha o campo vazio", Snackbar.LENGTH_LONG)
                .show() }

        }



    }

}