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

        val button8 = findViewById<Button>(R.id.button8)

        button8.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.otra-pagina.com"))
            startActivity(intent)
        }
    }
}