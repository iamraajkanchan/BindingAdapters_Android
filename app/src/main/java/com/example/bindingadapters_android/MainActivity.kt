package com.example.bindingadapters_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bindingadapters_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        val post = Post(
            "Hello World!" ,
            "This is the first line of code that is being written" ,
            "https://assets.hongkiat.com/uploads/hello-world-different-programming-languages/r.jpg"
        )
        binding.post = post
    }
}