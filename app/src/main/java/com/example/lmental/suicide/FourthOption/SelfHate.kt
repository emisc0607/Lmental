package com.example.lmental.suicide.FourthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySelfHateBinding

class SelfHate : AppCompatActivity() {
    private lateinit var binding: ActivitySelfHateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySelfHateBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.fabSelfHateReturn.setOnClickListener {
            val intent = Intent(this, SuicideFourth::class.java)
            startActivity(intent)
        }
    }
}