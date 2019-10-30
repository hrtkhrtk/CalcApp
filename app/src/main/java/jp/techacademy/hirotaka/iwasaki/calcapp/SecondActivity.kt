package jp.techacademy.hirotaka.iwasaki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //val value = intent.getIntExtra("VALUE", 0)
        val value = intent.getDoubleExtra("VALUE", 0.toDouble())

        textView.text = value.toString()
    }
}
