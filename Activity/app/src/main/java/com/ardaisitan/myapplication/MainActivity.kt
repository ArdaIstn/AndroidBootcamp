package com.ardaisitan.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ardaisitan.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetail.setOnClickListener {
            // Snackbar.make(it, "Hello", Snackbar.LENGTH_SHORT).show()

            val intent = Intent(this@MainActivity, Activity_Detail::class.java)
            intent.putExtra("name", "Arda")
            intent.putExtra("surname", "isitan")
            intent.putExtra("age", "24")

            startActivity(intent)
        }

    }
}