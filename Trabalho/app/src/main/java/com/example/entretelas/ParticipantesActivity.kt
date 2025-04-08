package com.example.entretelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ParticipantesActivity : AppCompatActivity() {

    lateinit var buttonT1: Button // Home
    lateinit var buttonT5: Button // Akira
    lateinit var buttonT6: Button //  Amanda
    lateinit var buttonT7: Button // Fanthine
    // lateinit var buttonT8: Button // Mauricio

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_participantes)

        buttonT1 = findViewById(R.id.buttonT1)
        buttonT1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        buttonT5 = findViewById(R.id.buttonT5)
        buttonT5.setOnClickListener {
            val intent = Intent(this, AkiraActivity::class.java)
            startActivity(intent)
        }

        buttonT6 = findViewById(R.id.buttonT6)
        buttonT6.setOnClickListener {
            val intent = Intent(this, AmandaActivity::class.java)
            startActivity(intent)
        }

        buttonT7 = findViewById(R.id.buttonT7)
        buttonT7.setOnClickListener {
            val intent = Intent(this, FanthineActivity::class.java)
            startActivity(intent)
        }
    }
}
