package com.example.lmental.suicide.FourthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityImpulsivenessBinding

class Impulsiveness : AppCompatActivity() {
    private lateinit var binding: ActivityImpulsivenessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityImpulsivenessBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fabImpulsivenessReturn.setOnClickListener {
            val intent = Intent(this, SuicideFourth::class.java)
            startActivity(intent)
        }
    }
}