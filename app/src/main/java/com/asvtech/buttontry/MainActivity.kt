package com.asvtech.buttontry

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.asvtech.buttontry.databinding.ActivityAlertDialoggBinding
import com.asvtech.buttontry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAlertDialog.setOnClickListener {

            val intent = Intent(this, AlertDialogg::class.java)
            startActivity(intent);

        }

        binding.btnDatePicker.setOnClickListener {

            val intent = Intent(this, DatePickerr::class.java)
            startActivity(intent)

        }






    }
}
