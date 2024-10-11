package com.mobileapps.lesson1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

/**
 * Be aware - the way this code is written can not be considered 'clean' or 'pretty'
 * There should be no code duplication and unnecessarily repeated action like finding
 * the view every time you call an onClick
 *
 * But it's done this way so we see progression of coding quality  and it's benefits down the line
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val middleText = findViewById<TextView>(R.id.middleText)
        middleText.text = "Hello everyone"

        // Task 1 - change button's text to "Toast to me"
        val middleButton = findViewById<Button>(R.id.middleButton)
        middleButton.text = "Toast to me"

        middleButton.setOnClickListener { view ->
            // Task 2 - display editText's text in the toast
            //
            // .text on EditText will return an Editable,
            // call .toString() on it
            val textField = findViewById<EditText>(R.id.textField)
            val displayedText = textField.text.toString()

            Toast.makeText(this, displayedText, Toast.LENGTH_SHORT)
                .show()
        }

        middleText.setOnClickListener { view ->
            val textField = findViewById<EditText>(R.id.textField)
            val displayedText = textField.text.toString()

            Toast.makeText(this, displayedText, Toast.LENGTH_SHORT)
                .show()
        }
    }
}