package com.example.counter5

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view) // pieskiram id teksta laukam
        val button = findViewById<Button>(R.id.button) // pieskiram id pogai

        var counter = 0; // iestadam 0 ka sakuma skaitli

        button.setOnClickListener {
            counter++
            textView.text = "kliki $counter " // teksta rezultata izvade
        }

    }
}