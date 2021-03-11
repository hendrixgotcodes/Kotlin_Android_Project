package com.asvtech.buttontry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivitySecond : AppCompatActivity() {
    private lateinit var result:EditText
    private lateinit var newNumber:EditText
    private lateinit var displayOperation:TextView


    private var operand1:Double?=null
    private var operand2:Double=0.0
    private var pendingOperation ="="

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        result = findViewById(R.id.result)
        newNumber=findViewById(R.id.newNumber)
        displayOperation=findViewById(R.id.displayOperation)



        val button0:Button = findViewById(R.id.button0)
        val button1:Button = findViewById(R.id.button1)
        val button2:Button = findViewById(R.id.button2)
        val button3:Button = findViewById(R.id.button3)
        val button5:Button = findViewById(R.id.button5)
        val button6:Button = findViewById(R.id.button6)
        val button4:Button = findViewById(R.id.button4)
        val button7:Button = findViewById(R.id.button7)
        val button8:Button = findViewById(R.id.button8)
        val button9:Button = findViewById(R.id.button9)
        val buttonDot:Button = findViewById(R.id.buttonDot)


        val buttonEqual:Button = findViewById(R.id.buttonEqual)
        val buttonAdd:Button = findViewById(R.id.buttonAdd)
        val buttonSub:Button = findViewById(R.id.buttonSub)
        val buttonMul:Button = findViewById(R.id.buttonMul)
        val buttonDiv:Button = findViewById(R.id.buttonDiv)


        val listener = View.OnClickListener { v->
            val b = v as Button
            newNumber.append(b.text)
        }

        button0.setOnClickListener { listener }
        button1.setOnClickListener { listener }
        button2.setOnClickListener { listener }
        button3.setOnClickListener { listener }
        button4.setOnClickListener { listener }
        button5.setOnClickListener { listener }
        button6.setOnClickListener { listener }
        button7.setOnClickListener { listener }
        button8.setOnClickListener { listener }
        button9.setOnClickListener { listener }
        buttonDot.setOnClickListener { listener }





    }
}
