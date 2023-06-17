package com.example.lmental.suicide.FourthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySuicideFourthBinding
import com.example.lmental.suicide.SuicideActivity

class SuicideFourth : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideFourthBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fabSFourthActivityReturn.setOnClickListener {
            val intent = Intent(this, SuicideActivity::class.java)
            startActivity(intent)
        }

        binding.cvHopelessness.setOnClickListener {
            val intent = Intent(this, Hoplessness::class.java)
            startActivity(intent)
        }

        binding.cvImpulsiveness.setOnClickListener {
            val intent = Intent(this, Impulsiveness::class.java)
            startActivity(intent)
        }

        binding.cvNegativeHelp.setOnClickListener {
            val intent = Intent(this, NegativityHelp::class.java)
            startActivity(intent)
        }

        binding.cvDefeatWithdrawal.setOnClickListener {
            val intent = Intent(this, DefeatEntrapment::class.java)
            startActivity(intent)
        }

        binding.cvPsychologicalPain.setOnClickListener {
            val intent = Intent(this, PsychologicalPain::class.java)
            startActivity(intent)
        }

        binding.cvStress.setOnClickListener {
            val intent = Intent(this, Stress::class.java)
            startActivity(intent)
        }

        binding.cvAgitation.setOnClickListener {
            val intent = Intent(this, Agitation::class.java)
            startActivity(intent)
        }

        binding.cvSelfHate.setOnClickListener {
            val intent = Intent(this, SelfHate::class.java)
            startActivity(intent)
        }

    }
}