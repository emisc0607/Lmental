package com.example.lmental.suicide.SecondOption.SOSubOptions.FamProblems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityFamiliarProblemsBinding
import com.example.lmental.suicide.SecondOption.SuicideSecond

class FamiliarProblems : AppCompatActivity() {
    private  lateinit var binding: ActivityFamiliarProblemsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFamiliarProblemsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fabFamProblemsReturn.setOnClickListener {
            val intent = Intent(this, SuicideSecond::class.java)
            startActivity(intent)
        }

        binding.cvFamiliarV.setOnClickListener {
            val intent = Intent(this, FamiliarViolence::class.java)
            startActivity(intent)
        }
    }
}