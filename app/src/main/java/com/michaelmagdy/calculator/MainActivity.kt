package com.michaelmagdy.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buNumberEvent(view:View){

        //val entryData = equation_edt.text
        val buSelect = view as Button
        var buClickValue:String = equation_edt.text.toString()
        when(buSelect.id){

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
            button_point.id -> {
                //TODO: TO NOT ALLOW MORE THAN 1 POINT
                buClickValue += "."
            }
            button_z.id -> {
                buClickValue = "-" + buClickValue
            }
        }
        equation_edt.setText(buClickValue)
    }
}
