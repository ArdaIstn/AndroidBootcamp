package com.ardaisitan.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ardaisitan.myapplication.databinding.ActivityDetailBinding

class Activity_Detail : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")
        val age = intent.getIntExtra("age", 0)




        binding.textViewDetail.text = "Name:$name, Surname:$surname,Age:$age"
    }
}