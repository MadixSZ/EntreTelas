package com.example.entretelas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.entretelas.R

class MainActivity : AppCompatActivity() {
    lateinit var buttonT2: Button  // Aposentadoria
    lateinit var buttonT3: Button  // Notas
    lateinit var buttonT4: Button  // Participantes

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonT2 = findViewById(R.id.buttonT2)
        buttonT2.setOnClickListener {
            val intent = Intent(this, SegundaTelaActivity::class.java)
            startActivity(intent)
        }

        buttonT4 = findViewById(R.id.buttonT4)
        buttonT4.setOnClickListener {
            val intent = Intent(this, ParticipantesActivity::class.java)
            startActivity(intent)
        }

        buttonT3 = findViewById(R.id.buttonT3)
        buttonT3.setOnClickListener {
            val intent = Intent(this, NotasActivity::class.java)
            startActivity(intent)
        }
    }
}
