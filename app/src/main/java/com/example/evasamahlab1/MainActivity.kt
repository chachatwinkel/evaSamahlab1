package com.example.evasamahlab1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var contador =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val saludo = findViewById<TextView>(R.id.saludo)
        val boton = findViewById<Button>(R.id.botonComunidad)
        val contadorTexto = findViewById<TextView>(R.id.contador)

        // Log de onCreate
        Log.d("RIVENDELL", "El Anillo ha llegado a Rivendell")

        // Cuando pulsamos el botón , para que cambie el texto y vaya contando cada miembro
        boton.setOnClickListener {
            saludo.text = "¡La Comunidad del Anillo ha partido hacia Mordor!"
            contador++
            contadorTexto.text = "Miembros reunidos: $contador"
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("RIVENDELL", "La Comunidad se prepara para el viaje")
    }

    override fun onResume() {
        super.onResume()
        Log.d("RIVENDELL", "La Comunidad comienza su viaje") }

    override fun onPause() {
        super.onPause()
        Log.d("RIVENDELL", "La Comunidad hace una pausa en su camino")
    }

    override fun onStop() {
        super.onStop()
        Log.d("RIVENDELL", "La Comunidad ha abandonado Rivendell")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("RIVENDELL", "El viaje de esta Activity ha terminado")
    }

}