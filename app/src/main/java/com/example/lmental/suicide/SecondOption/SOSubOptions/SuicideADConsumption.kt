package com.example.lmental.suicide.SecondOption.SOSubOptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.StartActivity
import com.example.lmental.databinding.ActivitySuicideAdconsumptionBinding
import com.example.lmental.suicide.SecondOption.SuicideSecond

class SuicideADConsumption : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideAdconsumptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideAdconsumptionBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.fabSADConsumptionReturn.setOnClickListener {
            val intent = Intent(this, SuicideSecond::class.java)
            startActivity(intent)
        }
    }
}