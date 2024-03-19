package com.example.additioncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.CalculateButton)
        val sumText = findViewById<TextView>(R.id.sumText)

        button.setOnClickListener()
        {
            val num1Text = findViewById<EditText>(R.id.Number1)
            val num2Text = findViewById<EditText>(R.id.Number2)

            val num1 = num1Text.text.toString().toInt()
            val num2 = num2Text.text.toString().toInt()
            val sum = num1 + num2

            sumText.text = "$sum"

        }
    }


}