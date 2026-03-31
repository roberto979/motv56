package com.example.motivao

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.motivao.ui.theme.MotivaçãoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.interfa3)
        val input = findViewById<EditText>(R.id.inputhour)
        val result = findViewById<TextView>(R.id.btnresult)
        val btn = findViewById<Button>(R.id.btnsugerir)
        val reset = findViewById<Button>(R.id.btnReset)

        btn.setOnClickListener {
            val txt = input.text.toString().trim().lowercase()
            val suggestion = when(txt){
                "morning"-> "Send a good morning message to someone"
                "afternoon"-> "Have lunch with a friend"
                "snak"-> "go and buy same food"
                "night"-> "do one call"
                "time"-> "good night"

                else -> "invalid"

            }
            result.text = suggestion
        }
        reset.setOnClickListener {
            input.text.clear()
            result.text = ""
        }


    }
}

