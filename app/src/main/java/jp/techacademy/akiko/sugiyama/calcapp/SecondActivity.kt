package jp.techacademy.akiko.sugiyama.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.util.Log
//import android.view.View
import kotlinx.android.synthetic.main.activity_second.*
//import android.content.Intent

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value = intent.getFloatExtra("VALUE", 0.0f)

        textView.text = "$value"
    }
}