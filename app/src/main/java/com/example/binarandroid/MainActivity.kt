package com.example.binarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Please input number 1 : ")
        val input1 = readln().toInt()
        println("Please input number 2 : ")
        val input2 = readln().toInt()

        val plus = input1+input2
        println("Total : $plus")

        val min = input1-input2
        println("Total : $min")
    }
}