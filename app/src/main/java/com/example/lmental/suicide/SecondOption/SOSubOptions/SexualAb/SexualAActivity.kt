package com.example.lmental.suicide.SecondOption.SOSubOptions.SexualAb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySexualAactivityBinding
import com.example.lmental.suicide.SecondOption.SuicideSecond
import com.example.lmental.suicide.SuicideActivity

class SexualAActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySexualAactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySexualAactivityBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fabSexualAActivityReturn.setOnClickListener {
            val intent = Intent(this, SuicideSecond::class.java)
            startActivity(intent)
        }

        binding.fabSexualAHelp.setOnClickListener {
            val intent = Intent(this, SexualAHelp::class.java)
            startActivity(intent)
        }
    }
}