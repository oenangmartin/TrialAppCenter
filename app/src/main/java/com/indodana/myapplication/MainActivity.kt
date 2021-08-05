package com.indodana.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    private val textViewSample by lazy { findViewById<TextView>(R.id.textViewSample) }
    private val button by lazy { findViewById<AppCompatButton>(R.id.button) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            textViewSample.text = "Some text"
        }
    }
}