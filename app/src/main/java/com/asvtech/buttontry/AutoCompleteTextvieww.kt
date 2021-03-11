package com.asvtech.buttontry
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
class AutoCompleteTextvieww: AppCompatActivity() {
    private val fruits = arrayOf("Apple", "Banana", "Cherry", "Date", "Grape", "Kiwi", "Mango", "Pear")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete_textvieww)
        title = "KotlinApp"
        val autoTextView: AutoCompleteTextView = findViewById(R.id.text)
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this,
                android.R.layout.select_dialog_item, fruits)
        autoTextView.threshold = 1
        autoTextView.setAdapter(adapter)
    }
}