package com.example.lmental.suicide.SecondOption.SOSubOptions.FamProblems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityFamiliarViolenceBinding

class FamiliarViolence : AppCompatActivity() {
    private lateinit var binding: ActivityFamiliarViolenceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFamiliarViolenceBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fabFamiliarVReturn.setOnClickListener {
            val intent = Intent(this, FamiliarProblems::class.java)
            startActivity(intent)
        }

        binding.fabFamiliarVHelp.setOnClickListener {
            val intent = Intent(this, FamiliarVHelp::class.java)
            startActivity(intent)
        }
    }
}