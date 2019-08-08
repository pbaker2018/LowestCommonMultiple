package com.baker.lowestcommonmultiple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun findLCM(view: View) {
        val num1 = num1Txt.text.toString().toInt()
        val num2 = num2Txt.text.toString().toInt()
        var gcd = 1
        var i = 1
        while (i <= num1 && i <= num2) {
            // Checks if i is factor of both integers
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i
            ++i
        }
        val lcm = num1 * num2 / gcd
        resultTxt.text = lcm.toString()
    }

    fun clearResult(view: View) {
        if (resultTxt.text.isNotEmpty()) {
            resultTxt.text = " "
            num1Txt.text.clear()
            num2Txt.text.clear()
        } else {
            Toast.makeText(this@MainActivity, "nothing to clear", Toast.LENGTH_SHORT).show()
        }
    }
}
