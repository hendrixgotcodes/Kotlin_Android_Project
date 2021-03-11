package com.asvtech.buttontry


import android.os.Bundle
//import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.asvtech.buttontry.databinding.ActivitySpinnerExampleBinding
import com.asvtech.buttontry.databinding.ActivityToggleButtonBinding

//import kotlinx.android.synthetic.main.activity_spinner_example.*


class spinner_example : AppCompatActivity(),AdapterView.OnItemSelectedListener {

    private lateinit var binding: ActivitySpinnerExampleBinding

    var languages = arrayOf("English", "French", "Spanish", "Hindi", "Russian", "Telugu", "Chinese", "German", "Portuguese", "Arabic", "Dutch", "Urdu", "Italian", "Tamil", "Persian", "Turkish", "Other")

    var spinner:Spinner? = null
    var textView_msg:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySpinnerExampleBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        textView_msg = binding.msg

        spinner = binding.spinnerSample
        spinner!!.setOnItemSelectedListener(this)

        // Create an ArrayAdapter using a simple spinner layout and languages array
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
        // Set layout to use when the list of choices appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Set Adapter to Spinner
        spinner!!.setAdapter(aa)

    }

    override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
        textView_msg!!.text = "Selected : "+languages[position]
    }

    override fun onNothingSelected(arg0: AdapterView<*>) {

    }
}