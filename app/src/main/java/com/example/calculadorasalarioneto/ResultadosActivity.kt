package com.example.calculadorasalarioneto

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)

        val tvSalarioBruto: TextView = findViewById(R.id.tvSalarioBruto)
        val tvRetencionIrpf: TextView = findViewById(R.id.tvRetencionIrpf)
        val tvDeducciones: TextView = findViewById(R.id.tvDeducciones)
        val tvSalarioNeto: TextView = findViewById(R.id.tvSalarioNeto)
        val tvSalarioMensual: TextView = findViewById(R.id.tvSalarioMensual)
        val btnVolver: Button = findViewById(R.id.btnVolver)

        // Recoger parámetros enviados desde MainActivity
        // Mostrar resultados en pantalla usando plantillas de String
        // Volver a la vista anterior


    }
}