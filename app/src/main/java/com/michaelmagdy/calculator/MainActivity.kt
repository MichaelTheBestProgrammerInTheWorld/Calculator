package com.michaelmagdy.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import io.kaen.dagger.BadSyntaxException
import io.kaen.dagger.ExpressionParser
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buttonsOnClick(view: View) {

        //val entryData = equation_edt.text
        val buSelect = view as Button
        var buClickValue: String = equation_edt.text.toString()
        when (buSelect.id) {

            //numbers
            button_0.id -> {
                buClickValue += "0"
            }
            button_1.id -> {
                buClickValue += "1"
            }
            button_2.id -> {
                buClickValue += "2"
            }
            button_3.id -> {
                buClickValue += "3"
            }
            button_4.id -> {
                buClickValue += "4"
            }
            button_5.id -> {
                buClickValue += "5"
            }
            button_6.id -> {
                buClickValue += "6"
            }
            button_7.id -> {
                buClickValue += "7"
            }
            button_8.id -> {
                buClickValue += "8"
            }
            button_9.id -> {
                buClickValue += "9"
            }
            button_0.id -> {
                buClickValue += "0"
            }
            //operators
            button_point.id -> {
                buClickValue += "."
            }
            button_z.id -> {
                //buClickValue = "-" + buClickValue
                if (buClickValue.contains('-')){

                } else {
                    buClickValue = "-" + buClickValue
                }
            }
            button_plus.id -> {
                buClickValue += "+"
            }
            button_minus.id -> {
                buClickValue += "-"
            }
            button_multiply.id -> {
                buClickValue += "*"
            }
            button_divide.id -> {
                buClickValue += "/"
            }
            button_percent.id -> {
                buClickValue += "%"
            }
            button_ac.id -> {
                //buClickValue += "+"
                buClickValue = ""
            }
        }
        equation_edt.setText(buClickValue)
    }

    fun equalOnClick(view: View) {

        val parser = ExpressionParser()
        try {
            val result = parser.evaluate(equation_edt.text.toString())
            equation_edt.setText(result.toString())
        } catch (e: BadSyntaxException){
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
        } catch (e: NumberFormatException){
            Toast.makeText(this, e.message , Toast.LENGTH_LONG).show()
        }
    }

}
