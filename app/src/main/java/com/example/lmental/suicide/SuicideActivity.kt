package com.example.lmental.suicide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.MainMenuActivity
import com.example.lmental.databinding.ActivitySuicideBinding
import com.example.lmental.suicide.FifthOption.SuicideFifth
import com.example.lmental.suicide.FirstOption.SuicideFirstActivity
import com.example.lmental.suicide.FourthOption.SuicideFourth
import com.example.lmental.suicide.SecondOption.SuicideSecond
import com.example.lmental.suicide.SeventhOption.SuicideSeventh
import com.example.lmental.suicide.SixthOption.SuicideSixth
import com.example.lmental.suicide.ThirdOption.SuicideThird

class SuicideActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.cvSFirstOption.setOnClickListener {
            val intent = Intent(this, SuicideFirstActivity::class.java)
            startActivity(intent)
        }

        binding.cvSSecondOption.setOnClickListener {
            val intent = Intent(this, SuicideSecond::class.java)
            startActivity(intent)
        }

        binding.cvSThirdOption.setOnClickListener {
            val intent = Intent(this, SuicideThird::class.java)
            startActivity(intent)
        }

        binding.fabSActivityReturn.setOnClickListener {
            val intent = Intent(this, MainMenuActivity::class.java)
            startActivity(intent)
        }

        binding.cvSFourthOption.setOnClickListener {
            val intent = Intent(this, SuicideFourth::class.java)
            startActivity(intent)
        }

        binding.cvSFifthOption.setOnClickListener {
            val intent = Intent(this, SuicideFifth::class.java)
            startActivity(intent)
        }

        binding.cvSSixthOption.setOnClickListener {
            val intent = Intent(this, SuicideSixth::class.java)
            startActivity(intent)
        }

        binding.cvSSeventhOption.setOnClickListener {
            val intent = Intent(this, SuicideSeventh::class.java)
            startActivity(intent)
        }
    }
}