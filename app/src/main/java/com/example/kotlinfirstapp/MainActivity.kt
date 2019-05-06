package com.example.kotlinfirstapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeButtonClick(view: View) {

        imageView.setImageResource(R.drawable.second_image)
        //changing image resource when the user click the "change" button

    }
}
