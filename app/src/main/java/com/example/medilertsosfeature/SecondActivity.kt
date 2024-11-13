package com.example.medilertsosfeature

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val backButton: ImageButton = findViewById(R.id.backButton)

        // Set an OnClickListener to navigate back to the MainActivity
        backButton.setOnClickListener {
            // Start MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Optionally close SecondActivity
        }
    }
}