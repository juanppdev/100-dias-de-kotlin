package com.mundocode.androidmasterbyaristidevs.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.mundocode.androidmasterbyaristidevs.R

// Class Contenedor de Funciones
class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        // Al arrancar la pantalla

        val btnStart = findViewById<AppCompatButton>(R.id.btnClick)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnStart.setOnClickListener {

            val name = etName.text.toString()

            if (name.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }


        }

    }
}