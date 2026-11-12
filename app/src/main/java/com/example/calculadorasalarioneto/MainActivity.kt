package com.example.calculadorasalarioneto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los componentes del layout
        val etSalarioBruto: EditText = findViewById(R.id.etSalarioBruto)
        val etNumPagas: EditText = findViewById(R.id.etNumPagas)
        val etEdad: EditText = findViewById(R.id.etEdad)
        val etGrupoProfesional: EditText = findViewById(R.id.etGrupoProfesional)
        val etDiscapacidad: EditText = findViewById(R.id.etDiscapacidad)
        val etEstadoCivil: EditText = findViewById(R.id.etEstadoCivil)
        val etNumHijos: EditText = findViewById(R.id.etNumHijos)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)

        // Lectura de valores usando operador Elvis (?:)
        btnCalcular.setOnClickListener {
            val salarioBruto = etSalarioBruto.text.toString().toDoubleOrNull() ?: 0.0
            val numPagas = etNumPagas.text.toString().toIntOrNull() ?: 12
            val edad = etEdad.text.toString().toIntOrNull() ?: 0
            val grupo = etGrupoProfesional.text.toString().toIntOrNull() ?: 1
            val discapacidad = etDiscapacidad.text.toString().toIntOrNull() ?: 0
            val estadoCivil = etEstadoCivil.text.toString()
            val numHijos = etNumHijos.text.toString().toIntOrNull() ?: 0

            // Cálculo simulado de porcentaje de IRPF usando when
            // Cálculo de deducciones usando condicionales if
            // Cálculo de deducciones usando condicionales if
            // Paso de parámetros y navegación con Intent



        }
    }
}
