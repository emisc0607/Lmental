package com.example.lmental.suicide.FifthOption.FiOSubOptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.R
import com.example.lmental.databinding.ActivityPersonalWheelResultsBinding
import com.example.lmental.suicide.FifthOption.FiOSubOptions.PersonalWheel.Companion.PERSONALW_KEY

class PersonalWheelResults : AppCompatActivity() {
    private lateinit var binding: ActivityPersonalWheelResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonalWheelResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spinResult: Int = intent.extras?.getInt(PERSONALW_KEY) ?: -1
        initUI(spinResult)

        binding.fabPersonalWheelResultsReturn.setOnClickListener {
            val intent = Intent(this, PersonalWheel::class.java)
            startActivity(intent)
        }
    }

    private fun initUI(spinResult: Int) {
        when (spinResult) {
            0 -> {
                binding.ivPersonalWheelResults.setImageResource(R.drawable.personal_wheel_skills_ic)
                binding.tvPersonalWheelResultTitle.text = getString(R.string.sConduct_personalWheel_first_option_title)
                binding.tvPersonalWheelResultBody.text = getString(R.string.sConduct_personalWheel_first_option_body)
            }
            4 -> {
                binding.ivPersonalWheelResults.setImageResource(R.drawable.personal_wheel_mental_skills_ic)
                binding.tvPersonalWheelResultTitle.text = getString(R.string.sConduct_personalWheel_second_option_title)
                binding.tvPersonalWheelResultBody.text = getString(R.string.sConduct_personalWheel_second_option_body)
            }
            3 -> {
                binding.ivPersonalWheelResults.setImageResource(R.drawable.personal_wheel_healthy_habits_ic)
                binding.tvPersonalWheelResultTitle.text = getString(R.string.sConduct_personalWheel_third_option_title)
                binding.tvPersonalWheelResultBody.text = getString(R.string.sConduct_personalWheel_third_option_body)
            }
            2 -> {
                binding.ivPersonalWheelResults.setImageResource(R.drawable.personal_wheel_mental_health_ic)
                binding.tvPersonalWheelResultTitle.text = getString(R.string.sConduct_personalWheel_fourth_option_title)
                binding.tvPersonalWheelResultBody.text = getString(R.string.sConduct_personalWheel_fourth_option_body)
            }
            1 -> {

                binding.ivPersonalWheelResults.setImageResource(R.drawable.personal_wheel_idea_analysis_ic)
                binding.tvPersonalWheelResultTitle.text = getString(R.string.sConduct_personalWheel_fifth_option_title)
                binding.tvPersonalWheelResultBody.text = getString(R.string.sConduct_personalWheel_fifth_option_body)
            }
        }
    }
}