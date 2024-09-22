package com.cs407.lab2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.calculator_activity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editText = findViewById<EditText>(R.id.myTextField)
        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener {
            val userInput = editText.text.toString()
            //Toast.makeText(this, userInput, Toast.LENGTH_SHORT().SHOW()

            //Create an intent to navigate to CalculatorActivity
            val intent = Intent(this, CalculatorActivity::class.java)
            //pass the user input to the new activity
            intent.putExtra("EXTEA_MESSAGE",userInput)
            //Start the new activity
            startActivity(intent)
        }
    }
}