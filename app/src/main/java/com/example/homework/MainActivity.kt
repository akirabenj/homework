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


    val sum = summa(3, 5)
    val result = isEqual(5, 6)




    //Задание 1

    fun summa (a: Int, b: Int): Int{
        return a + b

    }

    //Задание 2

    fun isEqual(a: Int, b: Int): String{
        return if (a == b) "истина" else "ложно"
    }

    //Задание 3

    private fun sumM(moneyA: Double, moneyB: Double): Double {
        return moneyA + moneyB

    }





    private fun setButtonsListeners() {
        //Обработчик нажатия на кнопку "Задание 1"
        buttonA.setOnClickListener {
            textViewA.text = sum.toString()
            
        }

        //Обработчик нажатия на кнопку "Задание 2"
        buttonB.setOnClickListener {
            textViewB.text = result.toString()

        }

        //Обработчик нажатия на кнопку "Задание 3"
        buttonC.setOnClickListener {
            textViewC.text = sumM(moneyA(), moneyB()).toDouble().toString()


        }
    }
}