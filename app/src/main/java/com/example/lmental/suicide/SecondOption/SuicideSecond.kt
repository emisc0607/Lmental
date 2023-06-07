package com.example.lmental.suicide.SecondOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySuicideSecondBinding
import com.example.lmental.suicide.SecondOption.SOSubOptions.MentalIlnessActivity
import com.example.lmental.suicide.SecondOption.SOSubOptions.SexualAb.SexualAActivity
import com.example.lmental.suicide.SuicideActivity

class SuicideSecond : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideSecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.fabSSecondActivityReturn.setOnClickListener {
            val intent = Intent(this, SuicideActivity::class.java)
            startActivity(intent)
        }

        binding.cvMentalProblems.setOnClickListener {
            val intent = Intent(this, MentalIlnessActivity::class.java)
            startActivity(intent)
        }

        binding.cvSexualA.setOnClickListener {
            val intent = Intent(this, SexualAActivity::class.java)
            startActivity(intent)
        }
    }
}