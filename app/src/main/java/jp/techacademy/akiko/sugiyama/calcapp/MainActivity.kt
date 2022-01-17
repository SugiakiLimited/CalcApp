package jp.techacademy.akiko.sugiyama.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.textView
import kotlinx.android.synthetic.main.activity_second.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        var num1_nullable: Float? = editText1.text.toString().toFloatOrNull()
        var num2_nullable: Float? = editText2.text.toString().toFloatOrNull()
        var ans: Float = 0.0f

        if(num1_nullable == null || num2_nullable == null) textView.text = "数字を入力してください"
        else {
            var num1: Float = num1_nullable
            var num2: Float = num2_nullable

            when (v.id) {
                R.id.button1 -> ans = num1 + num2
                R.id.button2 -> ans = num1 - num2
                R.id.button3 -> ans = num1 * num2
                R.id.button4 -> if(num2 != 0.0f) ans = num1 / num2
            }

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE", ans)
            startActivity(intent)
        }

    }
}