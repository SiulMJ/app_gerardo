package com.example.ordenya

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)
        val boton8=findViewById<Button>(R.id.button8)
        val boton7=findViewById<Button>(R.id.button7)
        boton8.setOnClickListener {
            val intent = Intent(this, ordenes_en_curso::class.java)
            startActivity(intent)
        }
        boton7.setOnClickListener {
            val intent = Intent(this, ordenes::class.java)
            startActivity(intent)
        }
    }
}