package com.example.lmental.suicide.SecondOption.SOSubOptions.SchoolarStress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySchoolStressHelpBinding

class SchoolStressHelp : AppCompatActivity() {
    private lateinit var binding: ActivitySchoolStressHelpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySchoolStressHelpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fabSchoolStressHelpReturn.setOnClickListener {
            val intent = Intent(this, SchoolarStress::class.java)
            startActivity(intent)
        }
    }
}