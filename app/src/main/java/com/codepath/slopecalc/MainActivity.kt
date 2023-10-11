package com.codepath.slopecalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private lateinit var X1input: EditText
    private lateinit var Y1input: EditText
    private lateinit var X2input: EditText
    private lateinit var Y2input: EditText
    private lateinit var slope: TextView
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
        // call calculation in onclicklistener method
    }
}