package com.example.lmental.suicide.FourthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityAgitationBinding

class Agitation : AppCompatActivity() {
    private lateinit var binding: ActivityAgitationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgitationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabAgitationReturn.setOnClickListener {
            val intent = Intent(this, SuicideFourth::class.java)
            startActivity(intent)
        }
    }
}