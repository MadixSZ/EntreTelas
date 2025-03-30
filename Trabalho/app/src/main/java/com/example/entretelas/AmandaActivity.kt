package com.example.entretelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button // 🔹 Adicionado para evitar erro
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AmandaActivity : AppCompatActivity() {
    lateinit var buttonT1: Button // Home
    lateinit var buttonT4: Button // Participantes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_amanda)

        buttonT1 = findViewById(R.id.buttonT1)
        buttonT4 = findViewById(R.id.buttonT4)

        buttonT1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        buttonT4.setOnClickListener {
            val intent = Intent(this, ParticipantesActivity::class.java)
            startActivity(intent)
        }
    }
}
