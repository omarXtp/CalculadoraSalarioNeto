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
        val bruto = intent.getDoubleExtra("BRUTO", 0.0)
        val neto = intent.getDoubleExtra("NETO", 0.0)
        val mensual = intent.getDoubleExtra("MENSUAL", 0.0)
        val irpf = intent.getDoubleExtra("IRPF", 0.0)
        val deducciones = intent.getDoubleExtra("DEDUCCIONES", 0.0)


        // Mostrar resultados en pantalla
        tvSalarioBruto.text = "Salario bruto anual: $bruto €"
        tvRetencionIrpf.text = "Retención de IRPF: $irpf €"
        tvDeducciones.text = "Deducciones aplicadas: $deducciones €"
        tvSalarioNeto.text = "Salario neto anual: $neto €"
        tvSalarioMensual.text = "Salario neto mensual: $mensual €"


        btnVolver.setOnClickListener {
            finish()
        }



    }
}