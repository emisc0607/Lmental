package com.example.lmental.suicide.SecondOption.SOSubOptions.SchoolarStress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySchoolarStressBinding
import com.example.lmental.suicide.SecondOption.SuicideSecond

class SchoolarStress : AppCompatActivity() {
    private lateinit var binding: ActivitySchoolarStressBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySchoolarStressBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabBullyingReturn.setOnClickListener {
            val intent = Intent(this, SuicideSecond::class.java)
            startActivity(intent)
        }

        binding.fabBullyingHelp.setOnClickListener {
            val intent = Intent(this, SchoolStressHelp::class.java)
            startActivity(intent)
        }
    }
}