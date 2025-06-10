package com.example.nuevaapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvDisplay = findViewById<TextView>(R.id.tvDisplay)
        val menuCuenta = findViewById<LinearLayout>(R.id.menuCuenta)
        val menuDashboard = findViewById<LinearLayout>(R.id.menuDashboard)
        val btnGoToThird = findViewById<Button>(R.id.btnGoToThird)

        menuCuenta.setOnClickListener {
            tvDisplay.text = getString(R.string.option_account_selected)
        }
        menuDashboard.setOnClickListener {
            tvDisplay.text = getString(R.string.option_dashboard_selected)
        }
        btnGoToThird.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}