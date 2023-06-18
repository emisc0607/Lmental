package com.example.lmental.suicide.SeventhOption.SevOSubOptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.R
import com.example.lmental.databinding.ActivityMythRealResultsBinding
import com.example.lmental.suicide.SeventhOption.SevOSubOptions.FirstMyth.Companion.MYTHREAL_KEY
import com.example.lmental.suicide.SeventhOption.SuicideSeventh

class MythRealResults : AppCompatActivity() {
    private lateinit var binding: ActivityMythRealResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMythRealResultsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val mythResults: Int = intent.extras?.getInt(MYTHREAL_KEY) ?: -1
        initUI(mythResults)

        binding.fabMythResultsReturn.setOnClickListener{
            val intent = Intent(this, SuicideSeventh::class.java)
            startActivity(intent)
        }
    }

    private fun initUI(mythResults: Int){
        val finalScore = mythResults.toString() + getString(R.string.sConduct_mythReal_results_max_score)
        binding.tvResultScore.text = finalScore

        when(mythResults){
            in 0..4 ->{
                binding.tvMythRealResultBody.text = getString(R.string.sConduct_mythReality_results_bad)
                binding.ivMythRealResult.setImageResource(R.drawable.myth_real_result_bad_ic)
            }

            in 5..7 ->{
                binding.tvMythRealResultBody.text = getString(R.string.sConduct_mythReality_results_good)
                binding.ivMythRealResult.setImageResource(R.drawable.myth_real_result_good_ic)
            }

            in 8..10 ->{
                binding.tvMythRealResultBody.text = getString(R.string.sConduct_mythReality_results_exc)
                binding.ivMythRealResult.setImageResource(R.drawable.myth_real_result_ex_ic)
            }
        }
    }
}