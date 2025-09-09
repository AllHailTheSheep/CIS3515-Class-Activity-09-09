package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            var editText = findViewById<EditText>(R.id.textEditLabel)
            var textView = findViewById<TextView>(R.id.textView)

            if (editText.text.isEmpty()) {
                textView.text = "I asked for your name!"
            } else {
                textView.text = "Hello, ${editText.text}"
                editText.setText("")
            }


        }
    }
}