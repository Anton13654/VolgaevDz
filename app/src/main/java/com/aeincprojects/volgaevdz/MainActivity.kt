package com.aeincprojects.volgaevdz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var generateNumber: TextView
    private lateinit var generateButton: Button
    private lateinit var goToCompose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateNumber = findViewById(R.id.textView)
        generateButton = findViewById(R.id.button)
        goToCompose = findViewById(R.id.compose_button)

        generateButton.setOnClickListener {
            generateNumber.text = (0..100).random().toString()
        }
        goToCompose.setOnClickListener {
            val goCompose = Intent(this, ComposeActivity::class.java)
            startActivity(goCompose)
        }


    }
}