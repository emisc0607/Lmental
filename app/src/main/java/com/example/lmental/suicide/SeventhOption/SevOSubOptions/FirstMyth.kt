package com.example.lmental.suicide.SeventhOption.SevOSubOptions

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lmental.R
import com.example.lmental.databinding.ActivityFirstMythBinding

class FirstMyth : AppCompatActivity() {
    private lateinit var binding: ActivityFirstMythBinding

    private var currentQuestion:Double = 1.0
    var score:Int = 0

    companion object{
        const val MYTHREAL_KEY = "MYTHREAL_RESULT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFirstMythBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners(){
        binding.cvMythOption.setOnClickListener {
            if(binding.cvMythOption.isEnabled){
                disableOptions()
                showResults()
                when(currentQuestion){
                    in 0.0..1.01 ->{
                        score += 1
                    }

                    in 1.02..2.01 ->{
                        score += 1
                    }

                    in 2.02..3.01 ->{
                        score += 1
                    }

                    in 3.02..4.01 ->{
                        score += 1
                    }

                    in 4.02..5.01 ->{
                        score = score
                    }

                    in 5.02..6.01 ->{
                        score = score
                    }

                    in 6.02..7.01 ->{
                        score += 1
                    }

                    in 7.02..8.01 ->{
                        score = score
                    }
                }
            }
        }

        binding.cvRealityOption.setOnClickListener {
            if(binding.cvMythOption.isEnabled){
                disableOptions()
                showResults()
                when(currentQuestion){
                    in 4.02..5.01 ->{
                        score += 1
                    }

                    in 5.02..6.01 ->{
                        score += 1
                    }

                    in 7.02..8.01 ->{
                        score += 1
                    }
                }
            }
        }

        binding.bMythRealNext.setOnClickListener{
            if(binding.bMythRealNext.isEnabled){
                hideResults()
                enableOptions()
                currentQuestion += 1.0
                when(currentQuestion){
                    in 1.01..2.01 ->{
                        binding.tvCurrentQuestion.text = " 2 "
                        binding.tvFirstMyth.text = getString(R.string.sConduct_mythReality_secondQuestion)
                        binding.tvMythRealAnswerTitle.text = getString(R.string.sConduct_mythReality_title_answer_myth)
                        binding.tvMythRealAnswerBody.text = getString(R.string.sConduct_mythReality_secondAnswer)
                    }

                    in 2.02..3.01 ->{
                        binding.tvCurrentQuestion.text = " 3 "
                        binding.tvFirstMyth.text = getString(R.string.sConduct_mythReality_thirdQuestion)
                        binding.tvMythRealAnswerTitle.text = getString(R.string.sConduct_mythReality_title_answer_myth)
                        binding.tvMythRealAnswerBody.text = getString(R.string.sConduct_mythReality_thirdAnswer)
                    }

                    in 3.02..4.01 ->{
                        binding.tvCurrentQuestion.text = " 4 "
                        binding.tvFirstMyth.text = getString(R.string.sConduct_mythReality_fourthQuestion)
                        binding.tvMythRealAnswerTitle.text = getString(R.string.sConduct_mythReality_title_answer_myth)
                        binding.tvMythRealAnswerBody.text = getString(R.string.sConduct_mythReality_fourthAnswer)
                    }

                    in 4.02..5.01 ->{
                        binding.tvCurrentQuestion.text = " 5 "
                        binding.tvFirstMyth.text = getString(R.string.sConduct_mythReality_fifthQuestion)
                        binding.tvMythRealAnswerTitle.text = getString(R.string.sConduct_mythReality_title_answer_real)
                        binding.tvMythRealAnswerBody.text = getString(R.string.sConduct_mythReality_fifthAnswer)
                    }

                    in 5.02..6.01 ->{
                        binding.tvCurrentQuestion.text = " 6 "
                        binding.tvFirstMyth.text = getString(R.string.sConduct_mythReality_sixthQuestion)
                        binding.tvMythRealAnswerTitle.text = getString(R.string.sConduct_mythReality_title_answer_real)
                        binding.tvMythRealAnswerBody.text = getString(R.string.sConduct_mythReality_sixthAnswer)
                    }

                    in 6.02..7.01 ->{
                        binding.tvCurrentQuestion.text = " 7 "
                        binding.tvFirstMyth.text = getString(R.string.sConduct_mythReality_seventhQuestion)
                        binding.tvMythRealAnswerTitle.text = getString(R.string.sConduct_mythReality_title_answer_myth)
                        binding.tvMythRealAnswerBody.text = getString(R.string.sConduct_mythReality_seventhAnswer)
                    }

                    in 7.02..8.01 ->{
                        binding.tvCurrentQuestion.text = " 8 "
                        binding.tvFirstMyth.text = getString(R.string.sConduct_mythReality_eighthQuestion)
                        binding.tvMythRealAnswerTitle.text = getString(R.string.sConduct_mythReality_title_answer_real)
                        binding.tvMythRealAnswerBody.text = getString(R.string.sConduct_mythReality_eighthAnswer)
                        binding.bMythRealNext.text = "Mostrar Resultados"
                    }

                    in 8.02..20.00 ->{
                        val intent = Intent(this, MythRealResults::class.java)
                        val mythResults = score
                        intent.putExtra(MYTHREAL_KEY, mythResults)
                        startActivity(intent)
                    }
                }

            }
        }
    }

    private fun disableOptions(){
        binding.cvMythOption.isEnabled = false
        binding.cvRealityOption.isEnabled = false
    }

    private fun enableOptions(){
        binding.cvMythOption.isEnabled = true
        binding.cvRealityOption.isEnabled = true
    }
    private fun showResults(){
        binding.cvMythRealAnswerBox.visibility = View.VISIBLE
        binding.bMythRealNext.visibility = View.VISIBLE
        binding.bMythRealNext.isEnabled = true
    }

    private fun hideResults(){
        binding.cvMythRealAnswerBox.visibility = View.INVISIBLE
        binding.bMythRealNext.visibility = View.INVISIBLE
        binding.bMythRealNext.isEnabled = false
    }
}