package com.example.lab1_appmoviles

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class DetalleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Detalle"

        val texto = findViewById<TextView>(R.id.textSaludo)
        val inicial = findViewById<TextView>(R.id.textInicial)

        val nombre = intent.getStringExtra("NOMBRE_USUARIO") ?: "?"

        // Mostrar saludo
        texto.text = "Hola, $nombre!"

        //primera letra
        val letra = nombre.first().uppercase()

        // Mostrar inicial
        inicial.text = letra

        // Botón volver
        val botonVolver = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonVolver)
        botonVolver.setOnClickListener {
            finish()
        }
    }
}