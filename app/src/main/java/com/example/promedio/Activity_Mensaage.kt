package com.example.promedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Activity_Mensaage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaage)

        val campo = findViewById<TextView>(R.id.textMensaje)

        val bundle: Bundle? = this.intent.extras

        if (bundle != null) {
            campo.text =""

        }
    }
        fun salir(view: View) {
            finish();

    }
}