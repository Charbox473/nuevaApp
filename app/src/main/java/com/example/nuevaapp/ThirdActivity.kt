package com.example.nuevaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val tvDisplayThird = findViewById<TextView>(R.id.tvDisplayThird)
        val btnGoToFirst = findViewById<Button>(R.id.btnGoToFirst)
        val menuPerfil = findViewById<LinearLayout>(R.id.menuPerfil)
        val menuConfiguracion = findViewById<LinearLayout>(R.id.menuConfiguracion)
        val menuNotificaciones = findViewById<LinearLayout>(R.id.menuNotificaciones)

        menuPerfil.setOnClickListener {
            tvDisplayThird.text = getString(R.string.option_profile_selected)
        }
        menuConfiguracion.setOnClickListener {
            tvDisplayThird.text = getString(R.string.option_settings_selected)
        }
        menuNotificaciones.setOnClickListener {
            tvDisplayThird.text = getString(R.string.option_notifications_selected)
        }

        btnGoToFirst.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}