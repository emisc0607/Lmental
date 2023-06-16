package com.example.lmental.suicide.FourthOption

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySuicideFourthBinding

class SuicideFourth : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideFourthBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}