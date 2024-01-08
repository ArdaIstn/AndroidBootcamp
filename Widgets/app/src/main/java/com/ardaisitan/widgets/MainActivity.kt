package com.ardaisitan.widgets

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ardaisitan.widgets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val data = binding.editTextinput.text.toString()
            binding.textViewResult.text = data
            binding.editTextinput.text.clear()
        }

        //ImageView
        binding.buttonImage1.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.image1)
        }

        binding.buttonImage2.setOnClickListener {
            binding.imageView.setImageResource(
                resources.getIdentifier(
                    "image2",
                    "drawable",
                    packageName
                )
            )
        }

        //Switch Material
        binding.switchButton.setOnCheckedChangeListener { _, isChecked ->//ilki butonu ikincisi check edilip edilmedigini kontrol eder,yani true false doner.
            if (isChecked) {
                Log.e("WidgetsLog", "Switch On")
            } else {
                Log.e("WidgetsLog", "Switch Off")
            }

        }

        binding.buttonShow.setOnClickListener {
            Log.e("WidgetsLog", "Switch State:${binding.switchButton.isChecked}")
        }

        // Check Box
        binding.checkBox1.setOnCheckedChangeListener { checkBox1, isChecked ->
            if (isChecked) {
                Log.e("WidgetsLog", "CheckBox1 On")

            } else {
                Log.e("WidgetsLog", "CheckBox1 Off")
            }
        }
        binding.checkBox2.setOnCheckedChangeListener { checkBox2, isChecked ->
            if (isChecked) {
                Log.e("WidgetsLog", "CheckBox2 On")
            } else {
                Log.e("WidgetsLog", "CheckBox2 Off")
            }
        }
        binding.checkBox3.setOnCheckedChangeListener { checkBox3, isChecked ->
            if (isChecked) {
                Log.e("WidgetsLog", "CheckBox3 On")
            } else {
                Log.e("WidgetsLog", "CheckBox3 Off")
            }
        }

        // Toggle Buttons
        binding.toggleButton.addOnButtonCheckedListener { group, checkedId, isChecked ->
            /**
             *   val chosenButton: Button =
             *                 findViewById(binding.toggleButton.checkedButtonId) // Hangi buton secildiyse onun idsini aliriz.
             *
             *             val buttonText = chosenButton.text.toString() // Butonun uzerinde yazan yaziya erisiriz.
             *
             *             Log.e("WidgetsLog", "Toggle Button:$buttonText")
             */

            if (isChecked) { //Bir butonun durumu degistigince checked ve unchecked ele alindigi icin loglarken 2 defa goruruz.Bunu saglayarak secili durumundaki buton icin islem yapabiliriz.
                val clickedButton = findViewById<Button>(checkedId)
                val buttonText = clickedButton.text.toString()

                Log.e("WidgetsLog", "Clicked Toggle Button:$buttonText")
            } else {
                val unClickedButton = findViewById<Button>(checkedId) //Else koyarak ise sectigimiz butonu birakip baska bir buton sectigimizde devreye girer.
                val buttonText = unClickedButton.text.toString()

                Log.e("WidgetsLog", "UnClicked Toggle Button:$buttonText")
            }

        }


    }

}