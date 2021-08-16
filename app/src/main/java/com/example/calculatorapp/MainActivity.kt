package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    var number1: Int = 0
    var isPlus: Boolean = false
    var isMinus: Boolean =  false
    var isMultiply: Boolean = false
    var isDivide: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.display)
    }

    fun operationFunction(view: View) {

        when(view.id){
            R.id.btn_1 -> {
                numberClicked(1)
            }
            R.id.btn_2 -> {
                numberClicked(2)
            }
            R.id.btn_3 -> {
                numberClicked(3)
            }
            R.id.btn_4 -> {
                numberClicked(4)
            }
            R.id.btn_5 -> {
                numberClicked(5)
            }
            R.id.btn_6 -> {
                numberClicked(6)
            }
            R.id.btn_7 -> {
                numberClicked(7)
            }
            R.id.btn_8 -> {
                numberClicked(8)
            }
            R.id.btn_9 -> {
                numberClicked(9)
            }
            R.id.btn_0 -> {
                numberClicked(0)
            }
            R.id.btn_clr -> {
                editText.setText("")
            }
            R.id.btn_plus -> {
                plusClicked()
            }
            R.id.btn_minus -> {
                minusClicked()
            }
            R.id.btn_mul -> {
                mulClicked()
            }
            R.id.btn_div -> {
                divClicked()
            }
            R.id.btn_equal -> {
                equalIsClicked()
            }
        }

    }

        private fun numberClicked(numberClicked: Int){
            val number = editText.text.toString() + numberClicked.toString()
            editText.setText(number)
        }

        private fun plusClicked(){
            number1 = editText.text.toString().toInt()
            editText.setText("")
            isPlus = true
        }

        private fun minusClicked(){
            number1 = editText.text.toString().toInt()
            editText.setText("")
            isMinus = true
        }

        private fun mulClicked(){
            number1 = editText.text.toString().toInt()
            editText.setText("")
            isMultiply = true
        }

        private fun divClicked(){
            number1 = editText.text.toString().toInt()
            editText.setText("")
            isDivide = true
        }

        private fun equalIsClicked(){
            when {
                isPlus -> {
                    val number2 = editText.text.toString().toInt()
                    val result = number2 + number1
                    editText.setText(result.toString())
                    isPlus = false
                }
                isMinus -> {
                    val number2 = editText.text.toString().toInt()
                    val result = number1 - number2
                    editText.setText(result.toString())
                    isMinus = false
                }
                isMultiply -> {
                    val number2 = editText.text.toString().toInt()
                    val result = number1 * number2
                    editText.setText(result.toString())
                    isMultiply = false
                }
                isDivide -> {
                    val number2 = editText.text.toString().toInt()
                    val result = number1 / number2
                    editText.setText(result.toString())
                    isDivide = false
                }
            }
        }
}