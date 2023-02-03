package com.example.generatepassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.generatepassword.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Add a splash screen
    // Material design-check

    private lateinit var binding:ActivityMainBinding
    private var length : Int = 0
    private var password = GeneratePassword()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}