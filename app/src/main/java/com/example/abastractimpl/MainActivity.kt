package com.example.abastractimpl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        val btnHuman: Button = findViewById(R.id.btnHuman)

        btnHuman.setOnClickListener {
            val animal: Animal = Jibon()
            textView.text = showAnimalInfo(animal)
        }
    }

    private fun showAnimalInfo(animal: Animal): String {
        return """
            ${animal.Human()}
            ${animal.Manush()}
            ${animal.Money()}
            ${animal.breathe()}
        """.trimIndent()


    }
}
