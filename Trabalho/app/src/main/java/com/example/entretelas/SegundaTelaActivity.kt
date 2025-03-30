package com.example.entretelas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.entretelas.R

class SegundaTelaActivity : AppCompatActivity() {

    lateinit var idadeInput: EditText
    lateinit var calcularButton: Button
    lateinit var resultadoText: TextView
    lateinit var buttonT1: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        idadeInput = findViewById(R.id.idadeInput)
        calcularButton = findViewById(R.id.calcularButton)
        resultadoText = findViewById(R.id.resultadoText)
        buttonT1 = findViewById(R.id.buttonT1)  // Inicializa o novo botão

        // Homens e Mulheres
        val idadeAposentadoriaMulher = 60
        val idadeAposentadoriaHomem = 65

        calcularButton.setOnClickListener {
            val idade = idadeInput.text.toString().toIntOrNull()

            if (idade != null) {
                val faltamMulher = idadeAposentadoriaMulher - idade
                val faltamHomem = idadeAposentadoriaHomem - idade

                resultadoText.text = "Faltam $faltamMulher anos para você se aposentar caso seja mulher.\n" +
                        "Faltam $faltamHomem anos para você se aposentar caso seja homem."
            } else {
                resultadoText.text = "Coloca algo Válido."
            }
        }

        buttonT1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) // Voltar para a Home
            startActivity(intent)
        }
    }
}
