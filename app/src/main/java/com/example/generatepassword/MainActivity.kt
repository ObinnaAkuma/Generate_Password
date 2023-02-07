package com.example.generatepassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.generatepassword.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{

    // TODO *Add a splash screen

    private lateinit var binding:ActivityMainBinding
    private var length : Int = 0
    private var password = GeneratePassword()
    private var etInput: EditText? = null
    private var tvResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        etInput = binding.etPasswordLength
        tvResult = binding.tvPasswordResult
        val btnGenerate = binding.btnGenerate

        btnGenerate.setOnClickListener(this)

    }

    private fun validateIntegers(): Boolean{
        if (etInput?.text.toString().isEmpty()){
            etInput?.error = "Enter number here"
            return false
        } else if(etInput?.text.toString().toInt()> 12 ||
                etInput?.text.toString().toInt()<8){
            etInput?.error = "number must be between 8 and 12"
            return false
        }
        return true
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.btnGenerate -> {
                if(validateIntegers()){
                    length = etInput?.text.toString().toInt()
                    tvResult?.text = password.generatePass(length)
                }
            }
        }
    }
}