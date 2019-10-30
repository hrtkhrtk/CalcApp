package jp.techacademy.hirotaka.iwasaki.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.design.widget.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus_button.setOnClickListener(this)
        minus_button.setOnClickListener(this)
        multiple_button.setOnClickListener(this)
        divide_button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if ((editText_val_01.text.toString().equals("") == false) && (editText_val_02.text.toString().equals("") == false)) {
            val intent = Intent(this, SecondActivity::class.java)
            when (v.id) {
                R.id.plus_button -> {
                    val value = editText_val_01.text.toString().toDouble() + editText_val_02.text.toString().toDouble()
                    intent.putExtra("VALUE", value)
                }
                R.id.minus_button -> {
                    val value = editText_val_01.text.toString().toDouble() - editText_val_02.text.toString().toDouble()
                    intent.putExtra("VALUE", value)
                }
                R.id.multiple_button -> {
                    val value = editText_val_01.text.toString().toDouble() * editText_val_02.text.toString().toDouble()
                    intent.putExtra("VALUE", value)
                }
                R.id.divide_button -> {
                    val value = editText_val_01.text.toString().toDouble() / editText_val_02.text.toString().toDouble()
                    intent.putExtra("VALUE", value)
                }
            }
            startActivity(intent)
        } else {
            Snackbar.make(v, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
