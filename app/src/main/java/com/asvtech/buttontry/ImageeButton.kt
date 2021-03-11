package com.asvtech.buttontry

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.asvtech.buttontry.databinding.ActivityImageeButtonBinding

//import kotlinx.android.synthetic.main.activity_imagee_button.*

class ImageeButton : AppCompatActivity() {

    private lateinit var binding: ActivityImageeButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityImageeButtonBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        setContentView(R.layout.activity_imagee_button)


      binding.imageButton.setOnClickListener {
binding.imageButton2.visibility=View.GONE
      }
        binding.imageButton2.setOnClickListener {
            binding.imageButton.visibility=View.GONE

        }
        binding.button.setOnClickListener {
            binding.imageButton2.visibility=View.VISIBLE
            binding.imageButton.visibility=View.GONE
        }

         }
    }
