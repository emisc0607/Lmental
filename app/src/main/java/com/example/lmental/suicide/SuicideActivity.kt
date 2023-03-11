package com.example.lmental.suicide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySuicideBinding

class SuicideActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}