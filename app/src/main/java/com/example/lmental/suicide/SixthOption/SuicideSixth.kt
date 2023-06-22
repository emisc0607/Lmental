package com.example.lmental.suicide.SixthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySuicideSixthBinding
import com.example.lmental.suicide.SuicideActivity

class SuicideSixth : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideSixthBinding
    private var selectedOption = 1
    companion object{
        const val SIXOPT_KEY = "SIXOPT_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuicideSixthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLsiteners()
    }

    private fun initLsiteners() {
        binding.fabSixReturn.setOnClickListener {
            val intent = Intent(this, SuicideActivity::class.java)
            startActivity(intent)
        }

        binding.ivSixOne.setOnClickListener {
            val intent = Intent(this, SuicideSixResults::class.java)
            selectedOption = 1
            intent.putExtra(SIXOPT_KEY,selectedOption)
            startActivity(intent)
        }

        binding.ivSixTwo.setOnClickListener {
            val intent = Intent(this, SuicideSixResults::class.java)
            selectedOption = 2
            intent.putExtra(SIXOPT_KEY,selectedOption)
            startActivity(intent)
        }

        binding.ivSixThree.setOnClickListener {
            val intent = Intent(this, SuicideSixResults::class.java)
            selectedOption = 3
            intent.putExtra(SIXOPT_KEY,selectedOption)
            startActivity(intent)
        }

        binding.ivSixFour.setOnClickListener {
            val intent = Intent(this, SuicideSixResults::class.java)
            selectedOption = 4
            intent.putExtra(SIXOPT_KEY,selectedOption)
            startActivity(intent)
        }

        binding.ivSixFive.setOnClickListener {
            val intent = Intent(this, SuicideSixResults::class.java)
            selectedOption = 5
            intent.putExtra(SIXOPT_KEY,selectedOption)
            startActivity(intent)
        }


        binding.ivSixSix.setOnClickListener {
            val intent = Intent(this, SuicideSixResults::class.java)
            selectedOption = 6
            intent.putExtra(SIXOPT_KEY,selectedOption)
            startActivity(intent)
        }

        binding.ivSixSeven.setOnClickListener {
            val intent = Intent(this, SuicideSixResults::class.java)
            selectedOption = 7
            intent.putExtra(SIXOPT_KEY,selectedOption)
            startActivity(intent)
        }

        binding.ivSixEight.setOnClickListener {
            val intent = Intent(this, SuicideSixResults::class.java)
            selectedOption = 8
            intent.putExtra(SIXOPT_KEY,selectedOption)
            startActivity(intent)
        }

        binding.ivSixNine.setOnClickListener {
            val intent = Intent(this, SuicideSixResults::class.java)
            selectedOption = 9
            intent.putExtra(SIXOPT_KEY,selectedOption)
            startActivity(intent)
        }

        binding.ivSixTen.setOnClickListener {
            val intent = Intent(this, SuicideSixResults::class.java)
            selectedOption = 10
            intent.putExtra(SIXOPT_KEY,selectedOption)
            startActivity(intent)
        }
    }
}