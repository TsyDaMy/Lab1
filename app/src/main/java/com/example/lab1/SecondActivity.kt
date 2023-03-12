package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dogs = intent.getParcelableExtra<DogData>(MainActivity.dogs_array)

        with(binding){
            textName.text = dogs?.name
            textAge.text = dogs?.age.toString()
            textColor.text = dogs?.color
            textSex.text = dogs?.sex
            textWeight.text = dogs?.weight.toString()
        }
    }
}