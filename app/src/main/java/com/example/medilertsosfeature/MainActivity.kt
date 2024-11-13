package com.example.medilertsosfeature // Replace with your actual package name

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.medilertsosfeature.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize Back Button
        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Close the current activity
        }

        // Initialize SOS Button
        val sosButton: Button = findViewById(R.id.sosButton)
        sosButton.setOnClickListener {
            // Show a message when SOS button is pressed
            Toast.makeText(this, "Calling 911 Services", Toast.LENGTH_SHORT).show()
            val Intent = Intent(this,SecondActivity::class.java)
            startActivity(Intent)
        }
    }
}
