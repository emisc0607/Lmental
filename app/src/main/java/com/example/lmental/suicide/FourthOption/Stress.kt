package com.example.lmental.suicide.FourthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityStressBinding

class Stress : AppCompatActivity() {
    private lateinit var binding: ActivityStressBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityStressBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.fabStressReturn.setOnClickListener {
            val intent = Intent(this, SuicideFourth::class.java)
            startActivity(intent)
        }
    }
}