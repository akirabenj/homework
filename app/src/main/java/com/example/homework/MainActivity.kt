package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var buttonA: Button
    private lateinit var buttonB: Button
    private lateinit var buttonC: Button
    private lateinit var textViewA: TextView
    private lateinit var textViewB: TextView
    private lateinit var textViewC: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeUIElements()
        setButtonsListeners()
    }

    //Функция инициализации элементов activity
    private fun initializeUIElements() {
        buttonA = findViewById(R.id.buttonA)
        buttonB = findViewById(R.id.buttonB)
        buttonC = findViewById(R.id.buttonC)

        textViewA = findViewById(R.id.textViewA)
        textViewB = findViewById(R.id.textViewB)
        textViewC = findViewById(R.id.textViewC)
    }

    private fun setButtonsListeners() {
        //Обработчик нажатия на кнопку "Задание 1"
        buttonA.setOnClickListener {
            
        }

        //Обработчик нажатия на кнопку "Задание 2"
        buttonB.setOnClickListener {

        }

        //Обработчик нажатия на кнопку "Задание 3"
        buttonC.setOnClickListener {

        }
    }
}