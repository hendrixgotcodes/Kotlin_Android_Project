package com.asvtech.buttontry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.asvtech.buttontry.databinding.ActivitySwitchButtonBinding
import com.asvtech.buttontry.databinding.ActivityToggleButtonBinding

//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.activity_toggle_button.*

class ToggleButton : AppCompatActivity() {

    private lateinit var binding: ActivityToggleButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityToggleButtonBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.toggleButtonGroup.addOnButtonCheckedListener { toggleButtonGroup, checkedId, isChecked ->

            if (isChecked) {
                when (checkedId) {
                    R.id.btnAndroid -> showToast("you clicked Android button.")
                    R.id.btnFlutter -> showToast("you have clicked Flutter button.")
                    R.id.btnWeb -> showToast("congratulations you pressed the web button")
                }
            } else {
                if (toggleButtonGroup.checkedButtonId == View.NO_ID) {
                    showToast("Nothing Selected")
                }
            }
        }
    }

    private fun showToast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }
}