package com.example.lmental.suicide.ThirdOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.R
import com.example.lmental.databinding.ActivitySuicideThirdResultsBinding

class SuicideThirdResults : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideThirdResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val selectedOption: Int = intent.extras?.getInt(SuicideThird.SELECTEDOPT_KEY) ?: -1
        binding = ActivitySuicideThirdResultsBinding.inflate(layoutInflater)

        initUI(selectedOption)

        binding.fabSThirdResultsReturn.setOnClickListener {
            val intent = Intent(this, SuicideThird::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }

    private fun initUI(selectedOption: Int) {
        when(selectedOption){
            1 -> {
                binding.ivSThirdResults.setImageResource(R.drawable.s_third_one_ic)
                binding.tvSThirdResult.text = getString(R.string.sConduct_third_one)
            }
            2 -> {
                binding.ivSThirdResults.setImageResource(R.drawable.s_third_two_ic)
                binding.tvSThirdResult.text = getString(R.string.sConduct_third_two)
            }
            3 -> {
                binding.ivSThirdResults.setImageResource(R.drawable.s_third_three_ic)
                binding.tvSThirdResult.text = getString(R.string.sConduct_third_three)
            }
            4 -> {
                binding.ivSThirdResults.setImageResource(R.drawable.s_third_four_ic)
                binding.tvSThirdResult.text = getString(R.string.sConduct_third_four)
            }
            5 -> {
                binding.ivSThirdResults.setImageResource(R.drawable.s_third_five_ic)
                binding.tvSThirdResult.text = getString(R.string.sConduct_third_five)
            }
            6 -> {
                binding.ivSThirdResults.setImageResource(R.drawable.s_third_six_ic)
                binding.tvSThirdResult.text = getString(R.string.sConduct_third_six)
            }
            7 -> {
                binding.ivSThirdResults.setImageResource(R.drawable.s_third_seven_ic)
                binding.tvSThirdResult.text = getString(R.string.sConduct_third_seven)
            }
            8 -> {
                binding.ivSThirdResults.setImageResource(R.drawable.s_third_eight_ic)
                binding.tvSThirdResult.text = getString(R.string.sConduct_third_eight)
            }
        }
    }
}