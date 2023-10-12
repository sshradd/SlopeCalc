package com.codepath.slopecalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var X1input: EditText
    private lateinit var Y1input: EditText
    private lateinit var X2input: EditText
    private lateinit var Y2input: EditText
    private lateinit var slope: TextView
    private lateinit var slopeAMT: TextView
    private lateinit var button: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        X1input = findViewById(R.id.X1input)
        X2input = findViewById(R.id.X2input)
        Y1input = findViewById(R.id.Y1input)
        Y2input = findViewById(R.id.Y2input)
        slope = findViewById(R.id.slope)
        slopeAMT = findViewById(R.id.slopeAMT)
        // call calculation in onclicklistener method

        button.setOnClickListener {
            val x1 = X1input.text.toString().toDouble()
            val x2 = X2input.text.toString().toDouble()
            val y1 = Y1input.text.toString().toDouble()
            val y2 = Y2input.text.toString().toDouble()
            val result = (y2-y1)/(x2-x1)
            slopeAMT.text = result.toString()
            Toast.makeText(this, "Slope Calculated!", Toast.LENGTH_SHORT).show()

        }



    }


}
