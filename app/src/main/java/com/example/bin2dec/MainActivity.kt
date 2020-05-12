package com.example.bin2dec

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun printResult(view: View) {
        val viewResult = findViewById<TextView>(R.id.result)
        val viewInput = findViewById<EditText>(R.id.input)

        val input = viewInput.text.toString()
        val error = validateInput(input)

        if(error ==  null) viewResult.text = binaryToDecimal(input).toString()
        else showAlert(R.string.invalid_digit)
    }

    private fun showAlert(stringId: Int) {
        Snackbar.make(
            findViewById(R.id.activityMain),
            stringId,
            Snackbar.LENGTH_LONG
        ).show()
    }
}

