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


            // Cálculo simulado de porcentaje de IRPF
            val porcentajeIRPF = when {
                salarioBruto <= 15000 -> 5.0
                salarioBruto <= 30000 -> 15.0
                else -> 22.0
            }

            // Cálculo de deducciones
            var deducciones = numHijos * 300.0
            if (estadoCivil == "Casado" || estadoCivil == "casado") {
                deducciones += 200.0
            }
            if (edad >= 65) {
            deducciones += 200.0
            }
            if (discapacidad >= 33) {
            deducciones += 1000.0
            }
            if (grupo == 1 ) {
            deducciones += 1000.0
            }

            var retencionIRPF = (salarioBruto * (porcentajeIRPF / 100.0)) - deducciones
            if (retencionIRPF < 0) {
                retencionIRPF = 0.0
            }

            val salarioNeto = salarioBruto - retencionIRPF

            val salarioMensual = salarioNeto / numPagas


            val intent = Intent(this, ResultadosActivity::class.java)
            intent.putExtra("BRUTO", salarioBruto)
            intent.putExtra("NETO", salarioNeto)
            intent.putExtra("MENSUAL", salarioMensual)
            intent.putExtra("IRPF", retencionIRPF)
            intent.putExtra("DEDUCCIONES", deducciones)
            startActivity(intent)

        }
    }
}
