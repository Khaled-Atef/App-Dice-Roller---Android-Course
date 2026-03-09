package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val view1 = findViewById<ImageView>(R.id.image1)
        val view2 = findViewById<ImageView>(R.id.image2)
        val view3 = findViewById<Button>(R.id.clickable)
        val views:IntRange = 1..6
        view3.setOnClickListener {

            var rdm1 =views.random()
            var rdm2:Int
            do{
               rdm2 = views.random()

            }while(rdm1==rdm2)


            selectRanImg(rdm1,view1)
            selectRanImg(rdm2,view2)
        }
    }

    fun selectRanImg(num: Int , view:ImageView):Unit{
        when(num){
            1-> view.setImageResource(R.drawable.dice_1)
            2-> view.setImageResource(R.drawable.dice_2)
            3-> view.setImageResource(R.drawable.dice_3)
            4-> view.setImageResource(R.drawable.dice_4)
            5-> view.setImageResource(R.drawable.dice_5)
            6-> view.setImageResource(R.drawable.dice_6)
        }
    }


}