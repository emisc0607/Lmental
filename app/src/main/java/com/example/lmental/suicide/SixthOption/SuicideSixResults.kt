package com.example.lmental.suicide.SixthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lmental.R
import com.example.lmental.databinding.ActivitySuicideSixResultsBinding
import com.example.lmental.suicide.FifthOption.FiOSubOptions.PersonalWheel

class SuicideSixResults : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideSixResultsBinding
    private var option = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuicideSixResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sixResult: Int = intent.extras?.getInt(SuicideSixth.SIXOPT_KEY) ?: -1
        initUI(sixResult)
        initListeners()

        binding.ivSixResultsReturn.setOnClickListener {
            val intent = Intent(this, SuicideSixth::class.java)
            startActivity(intent)
        }
    }

    private fun initListeners() {
        binding.ivSixBack.setOnClickListener {
            when(option){
                1->{
                  val intent = Intent(this, SuicideSixth::class.java)
                  startActivity(intent)
                }
                2->{
                    option = 1
                }
                3->{
                    option = 2
                 }
                4->{
                    option = 3
                }
                5->{
                    option = 4
                }
                6->{
                    option = 5
                }
                7->{
                    option = 6
                }
                8->{
                    option = 7
                }
                9->{
                    option = 8
                }
                10->{
                    option = 9
                }
            }
            initUI(option)
        }

        binding.ivSixNext.setOnClickListener {
            when(option){
                1->{
                    option = 2
                }
                2->{
                    option = 3
                }
                3->{
                    option = 4
                }
                4->{
                    option = 5
                }
                5->{
                    option = 6
                }
                6->{
                    option = 7
                }
                7->{
                    option = 8
                }
                8->{
                    option = 9
                }
                9->{
                    option = 10
                }
            }
            initUI(option)
        }
    }

    private fun initUI(sixResult: Int) {
        when(sixResult){
            1->{
                binding.tvSixResultsText.text = getString(R.string.sConduct_six_one)
                binding.ivSixResultsReturn.setImageResource(R.drawable.red_button_ic_sub)
            }
            2->{
                binding.tvSixResultsText.text = getString(R.string.sConduct_six_two)
                binding.ivSixResultsReturn.setImageResource(R.drawable.blue_button_ic_sub)
            }
            3->{
                binding.tvSixResultsText.text = getString(R.string.sConduct_six_three)
                binding.ivSixResultsReturn.setImageResource(R.drawable.orange_button_ic_sub)
            }
            4->{
                binding.tvSixResultsText.text = getString(R.string.sConduct_six_four)
                binding.ivSixResultsReturn.setImageResource(R.drawable.red_button_ic_sub)
            }
            5->{
                binding.tvSixResultsText.text = getString(R.string.sConduct_six_five)
                binding.ivSixResultsReturn.setImageResource(R.drawable.blue_button_ic_sub)
            }
            6->{
                binding.tvSixResultsText.text = getString(R.string.sConduct_six_six)
                binding.ivSixResultsReturn.setImageResource(R.drawable.orange_button_ic_sub)
            }
            7->{
                binding.tvSixResultsText.text = getString(R.string.sConduct_six_seven)
                binding.ivSixResultsReturn.setImageResource(R.drawable.red_button_ic_sub)
            }
            8->{
                binding.tvSixResultsText.text = getString(R.string.sConduct_six_eight)
                binding.ivSixResultsReturn.setImageResource(R.drawable.blue_button_ic_sub)
            }
            9->{
                binding.tvSixResultsText.text = getString(R.string.sConduct_six_nine)
                binding.ivSixResultsReturn.setImageResource(R.drawable.orange_button_ic_sub)
            }
            10->{
                binding.tvSixResultsText.text = getString(R.string.sConduct_six_ten)
                binding.ivSixResultsReturn.setImageResource(R.drawable.red_button_ic_sub)
                binding.ivSixNext.visibility = View.INVISIBLE
                binding.ivSixNext.isEnabled = false
            }

        }
    }
}