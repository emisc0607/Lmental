package com.example.lmental.suicide.FourthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityPsychologicalPainBinding

class PsychologicalPain : AppCompatActivity() {
    private lateinit var binding: ActivityPsychologicalPainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPsychologicalPainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.fabPsychologicalPainReturn.setOnClickListener {
            val intent = Intent(this, SuicideFourth::class.java)
            startActivity(intent)
        }
    }
}