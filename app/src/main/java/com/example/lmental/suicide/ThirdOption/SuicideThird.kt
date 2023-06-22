package com.example.lmental.suicide.ThirdOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySuicideThirdBinding
import com.example.lmental.suicide.FifthOption.FiOSubOptions.SocialWheel
import com.example.lmental.suicide.SuicideActivity

class SuicideThird : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideThirdBinding
    private var selectedOption = 1
    companion object{
        const val SELECTEDOPT_KEY = "SELECTEDOPT_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideThirdBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initListeners()

    }

    private fun initListeners() {
        binding.bButtonThirdOne.setOnClickListener {
            val intent = Intent(this, SuicideThirdResults::class.java)
            selectedOption = 1
            intent.putExtra(SuicideThird.SELECTEDOPT_KEY,selectedOption)
            startActivity(intent)
        }

        binding.bButtonThirdTwo.setOnClickListener {
            val intent = Intent(this, SuicideThirdResults::class.java)
            selectedOption = 2
            intent.putExtra(SuicideThird.SELECTEDOPT_KEY,selectedOption)
            startActivity(intent)
        }

        binding.bButtonThirdThree.setOnClickListener {
            val intent = Intent(this, SuicideThirdResults::class.java)
            selectedOption = 3
            intent.putExtra(SuicideThird.SELECTEDOPT_KEY,selectedOption)
            startActivity(intent)

        }

        binding.bButtonThirdFour.setOnClickListener {
            val intent = Intent(this, SuicideThirdResults::class.java)
            selectedOption = 4
            intent.putExtra(SuicideThird.SELECTEDOPT_KEY,selectedOption)
            startActivity(intent)
        }


        binding.bButtonThirdFive.setOnClickListener {
            val intent = Intent(this, SuicideThirdResults::class.java)
            selectedOption = 5
            intent.putExtra(SuicideThird.SELECTEDOPT_KEY,selectedOption)
            startActivity(intent)
        }


        binding.bButtonThirdSix.setOnClickListener {
            val intent = Intent(this, SuicideThirdResults::class.java)
            selectedOption = 6
            intent.putExtra(SuicideThird.SELECTEDOPT_KEY,selectedOption)
            startActivity(intent)
        }


        binding.bButtonThirdSeven.setOnClickListener {
            val intent = Intent(this, SuicideThirdResults::class.java)
            selectedOption = 7
            intent.putExtra(SuicideThird.SELECTEDOPT_KEY,selectedOption)
            startActivity(intent)
        }


        binding.bButtonThirdEight.setOnClickListener {
            val intent = Intent(this, SuicideThirdResults::class.java)
            selectedOption = 8
            intent.putExtra(SuicideThird.SELECTEDOPT_KEY,selectedOption)
            startActivity(intent)
        }

        binding.fabThirdReturn.setOnClickListener {
            val intent = Intent(this, SuicideActivity::class.java)
            startActivity(intent)
        }
    }


}