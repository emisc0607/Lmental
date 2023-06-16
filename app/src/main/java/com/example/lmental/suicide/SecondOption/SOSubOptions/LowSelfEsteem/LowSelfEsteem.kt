package com.example.lmental.suicide.SecondOption.SOSubOptions.LowSelfEsteem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityLowSelfEsteemBinding
import com.example.lmental.suicide.SecondOption.SOSubOptions.FamProblems.FamiliarProblems
import com.example.lmental.suicide.SecondOption.SuicideSecond

class LowSelfEsteem : AppCompatActivity() {
    private lateinit var binding: ActivityLowSelfEsteemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLowSelfEsteemBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fabLowSelfEReturn.setOnClickListener {
            val intent = Intent(this, SuicideSecond::class.java)
            startActivity(intent)
        }

        binding.fabLowSelfVHelp.setOnClickListener {
            val intent = Intent(this, LowSelfEsteemHelp::class.java)
            startActivity(intent)
        }
    }
}