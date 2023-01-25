package com.example.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListener()
    }
    @SuppressLint("SuspiciousIndentation")
    private fun setListener(){
         var clickableView : List<View>
            binding.apply {
                clickableView = listOf(box1 , textView2 , box3 , box4,box5 )
            }

        clickableView.forEach{ view ->
            view.setOnClickListener{makeColored(it)}
        }
    }
    @SuppressLint("ResourceAsColor")
    private fun makeColored(view : View){
        when(view.id){
            R.id.box_1 -> view.setBackgroundColor(android.R.color.holo_blue_bright)
            R.id.textView2 -> view.setBackgroundColor(android.R.color.holo_orange_dark)
            R.id.box_3 -> view.setBackgroundColor(android.R.color.holo_red_dark)
            R.id.box_4 -> view.setBackgroundColor(android.R.color.black)
            R.id.box_5 -> view.setBackgroundColor(android.R.color.holo_blue_dark)
            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }
}