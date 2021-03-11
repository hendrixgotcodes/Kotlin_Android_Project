package com.asvtech.buttontry

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.asvtech.buttontry.databinding.ActivitySwitchButtonBinding

//import kotlinx.android.synthetic.main.activity_switch_button.*

class SwitchButton : AppCompatActivity() {

    private lateinit var binding: ActivitySwitchButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySwitchButtonBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // process for Toggle Button

        binding.toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked)
                Toast.makeText(this,"toggle on",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"toggle off", Toast.LENGTH_SHORT).show()

        }
        //process for the switch button

        binding.switch2.setOnCheckedChangeListener {                compoundButton, onSwitch ->
            if(onSwitch)
binding.switch2.setBackgroundColor(Color.GREEN)
            else
                binding.switch2.setBackgroundColor(Color.BLUE)


        }

        }
    }
