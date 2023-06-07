package com.example.lmental.suicide.SecondOption.SOSubOptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityMentalIlnessBinding
import com.example.lmental.databinding.ActivitySuicideSecondBinding
import com.example.lmental.suicide.SecondOption.SuicideSecond

class MentalIlnessActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMentalIlnessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMentalIlnessBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fabMentalIlnessActivityReturn.setOnClickListener {
            val intent = Intent(this, SuicideSecond::class.java)
            startActivity(intent)
        }
    }
}