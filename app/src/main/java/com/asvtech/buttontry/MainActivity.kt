package com.asvtech.buttontry

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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

        binding.btnAutoComplete.setOnClickListener {

            val intent = Intent(this, AutoCompleteTextvieww::class.java)
            startActivity(intent)

        }

        binding.btnCheckBox.setOnClickListener {

            val intent = Intent(this, ChkBox::class.java)
            startActivity(intent)

        }

        binding.btnImageButton.setOnClickListener {

            val intent = Intent(this, ImageeButton::class.java)
            startActivity(intent)

        }

        binding.btnProgressBar.setOnClickListener {

            val intent = Intent(this, ProgressBarr::class.java)
            startActivity(intent)

        }

        binding.btnRatingBar.setOnClickListener {

            val intent = Intent(this, RatingBarr::class.java)
            startActivity(intent)

        }

        binding.btnSpinner.setOnClickListener {

            val intent = Intent(this, spinner_example::class.java)
            startActivity(intent)

        }

        binding.btnSwitchButton.setOnClickListener {

            val intent = Intent(this, SwitchButton::class.java)
            startActivity(intent)

        }

        binding.btnToast.setOnClickListener {

            val intent = Intent(this, Toast::class.java)
            startActivity(intent)

        }

        binding.btnToggleButton.setOnClickListener {

            val intent = Intent(this, ToggleButton::class.java)
            startActivity(intent)

        }






    }
}
