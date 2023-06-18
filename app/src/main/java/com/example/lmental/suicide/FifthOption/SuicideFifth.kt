package com.example.lmental.suicide.FifthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySuicideFifthBinding
import com.example.lmental.suicide.FifthOption.FiOSubOptions.PersonalWheel
import com.example.lmental.suicide.SuicideActivity

class SuicideFifth : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideFifthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideFifthBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bFifthPersonal.setOnClickListener{
            val intent = Intent(this, PersonalWheel::class.java)
            startActivity(intent)
        }

        binding.fabSFifthReturn.setOnClickListener{
            val intent = Intent(this, SuicideActivity::class.java)
            startActivity(intent)
        }

    }
}