package com.example.lmental.suicide.FifthOption.FiOSubOptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.R
import com.example.lmental.databinding.ActivitySocialWheelResultsBinding

class SocialWheelResults : AppCompatActivity() {
    private lateinit var binding: ActivitySocialWheelResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySocialWheelResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spinResult: Int = intent.extras?.getInt(SocialWheel.SOCIALW_KEY) ?: -1
        initUI(spinResult)

        binding.fabSocialWheelResultsReturn.setOnClickListener {
            val intent = Intent(this, SocialWheel::class.java)
            startActivity(intent)
        }
    }

    private fun initUI(spinResult: Int) {
        when (spinResult) {
            0 -> {
                binding.ivSocialWheelResults.setImageResource(R.drawable.social_wheel_familliar_ic)
                binding.tvSocialWheelResultTitle.text = getString(R.string.sConduct_socialWheel_first_option_title)
                binding.tvSocialWheelResultBody.text = getString(R.string.sConduct_socialWheel_first_option_body)
            }
            1 -> {
                binding.ivSocialWheelResults.setImageResource(R.drawable.social_wheel_difficult_acces_ic)
                binding.tvSocialWheelResultTitle.text = getString(R.string.sConduct_socialWheel_second_option_title)
                binding.tvSocialWheelResultBody.text = getString(R.string.sConduct_socialWheel_second_option_body)
            }
            2 -> {
                binding.ivSocialWheelResults.setImageResource(R.drawable.social_wheel_help_ic)
                binding.tvSocialWheelResultTitle.text = getString(R.string.sConduct_socialWheel_third_option_title)
                binding.tvSocialWheelResultBody.text = getString(R.string.sConduct_socialWheel_third_option_body)
            }
            3 -> {
                binding.ivSocialWheelResults.setImageResource(R.drawable.social_wheel_services_ic)
                binding.tvSocialWheelResultTitle.text = getString(R.string.sConduct_socialWheel_fourth_option_title)
                binding.tvSocialWheelResultBody.text = getString(R.string.sConduct_socialWheel_fourth_option_body)
            }
            4 -> {

                binding.ivSocialWheelResults.setImageResource(R.drawable.social_wheel_living_ic)
                binding.tvSocialWheelResultTitle.text = getString(R.string.sConduct_socialWheel_fifth_option_title)
                binding.tvSocialWheelResultBody.text = getString(R.string.sConduct_socialWheel_fifth_option_body)
            }

            5 -> {

                binding.ivSocialWheelResults.setImageResource(R.drawable.social_wheel_good_friends_ic)
                binding.tvSocialWheelResultTitle.text = getString(R.string.sConduct_socialWheel_sixth_option_title)
                binding.tvSocialWheelResultBody.text = getString(R.string.sConduct_socialWheel_sixth_option_body)
            }

            6 -> {

                binding.ivSocialWheelResults.setImageResource(R.drawable.social_wheel_skills_ic)
                binding.tvSocialWheelResultTitle.text = getString(R.string.sConduct_socialWheel_seventh_option_title)
                binding.tvSocialWheelResultBody.text = getString(R.string.sConduct_socialWheel_seventh_option_body)
            }
        }
    }
}