package com.example.entretelas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.entretelas.R

class NotasActivity : AppCompatActivity() {

    lateinit var notaInput: EditText
    lateinit var calcularButton: Button
    lateinit var resultadoText: TextView
    lateinit var buttonT1: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notas)

        notaInput = findViewById(R.id.notaInput)
        calcularButton = findViewById(R.id.calcularButton)
        resultadoText = findViewById(R.id.resultadoText)
        buttonT1 = findViewById(R.id.buttonT1)

        calcularButton.setOnClickListener {
            val nota = notaInput.text.toString().toFloatOrNull()

            if (nota != null) {
                var resultado = ""

                when {
                    nota < 4 -> resultado = "Reprovado"
                    nota >= 4 && nota < 6 -> resultado = "Prova Sub"
                    nota >= 6 -> resultado = "Aprovado"
                }

                resultadoText.text = "Resultado: $resultado"
            } else {
                resultadoText.text = "Coloca algo válido."
            }
        }

        buttonT1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)  // Home
            startActivity(intent)
        }
    }
}
