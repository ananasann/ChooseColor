package com.hfad.smthng

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {

    private var ivb: ImageView? = null
    private var ivw: ImageView? = null
    private var tv1: TextView? = null
    private var tv2: TextView? = null
    private var cl:View? = null
    private var m:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivb = findViewById<ImageView>(R.id.blackC)
        ivw = findViewById<ImageView>(R.id.whiteC)
        tv1 = findViewById<TextView>(R.id.tv1)
        tv2 = findViewById<TextView>(R.id.tv2)
        cl = findViewById(R.id.c_l)
        val toolbar: ActionBar = supportActionBar!!
        toolbar.hide()
    }



    override fun onResume() {
        super.onResume()



        ivb?.setOnClickListener(View.OnClickListener { view ->
            tv1?.text = "вы нажали черный"
            m = (0..1).random()
            when (m) {
                0-> {
                    tv2?.text = "правильный ответ белый"
                    cl?.setBackgroundColor(resources.getColor(R.color.red))
                }
                1-> {tv2?.text = "правильный ответ черный"
                    cl?.setBackgroundColor(resources.getColor(R.color.green))}
            }
        })

        ivw?.setOnClickListener(View.OnClickListener { view ->
            tv1?.text = "вы нажали белый"
            m = (0..1).random()
            when (m) {
                0-> {
                    tv2?.text = "правильный ответ белый"
                    cl?.setBackgroundColor(resources.getColor(R.color.green))
                }
                1-> {tv2?.text = "правильный ответ черный"
                    cl?.setBackgroundColor(resources.getColor(R.color.red))}
            }

        })



    }
}


