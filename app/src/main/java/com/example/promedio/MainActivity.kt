package com.example.promedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById(R.id.btncalcular)
        boton.setOnClickListener { calcular() }
    }

    private fun calcular() {

        val Nombre: EditText = findViewById(R.id.editName)
        val MATERIA: EditText= findViewById(R.id.editMateria)
        val nota1: EditText = findViewById(R.id.Nota1)
        val nota2: EditText = findViewById(R.id.Nota2)
        val nota3: EditText = findViewById(R.id.Nota3)
        val promedio: TextView = findViewById(R.id.result)

        val nombre: String = Nombre.text.toString()
        val materia: String= MATERIA.text.toString()
        val n1: Double = nota1.text.toString().toDouble()
        val n2: Double = nota2.text.toString().toDouble()
        val n3: Double = nota3.text.toString().toDouble()

        var prom:Double=(n1+n2+n3)/3
        var resultpromedio=""

        if(prom>=3.5){
            resultpromedio="EL ESTUDIANTE $nombre GANO LA MATERIA DE $materia CON UNA NOTA DE $prom"
            /* resultpromedio="GANO CON PROMEDIO DE $prom" */
        }else {
            resultpromedio="EL ESTUDIANTE $nombre PERDIO LA MATERIA DE $materia CON UNA NOTA DE $prom"
            /* resultpromedio="PERDIO CON PROMEDIO DE $prom" */
        }
        promedio.text=resultpromedio
    }
}