package com.example.lmental.suicide.FifthOption.FiOSubOptions

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import com.example.lmental.StartActivity
import com.example.lmental.databinding.ActivityPersonalWheelBinding
import com.example.lmental.suicide.FifthOption.SuicideFifth
import kotlin.random.Random

class PersonalWheel : AppCompatActivity() {

    private lateinit var binding: ActivityPersonalWheelBinding
    private val divisions = 5
    companion object{
        const val PERSONALW_KEY = "PERSONALW_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPersonalWheelBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners() {
        binding.fabPersonalWheelReturn.setOnClickListener {
            val intent = Intent(this, SuicideFifth::class.java)
            startActivity(intent)
        }

        binding.bSpinPersonalWheel.setOnClickListener{
            if(binding.bSpinPersonalWheel.isEnabled){
                animateRoulette()
                binding.bSpinPersonalWheel.isEnabled = false
            }
        }
    }

    private fun animateRoulette() {
        val randomDivision = Random.nextInt(divisions)
        val degrees = (randomDivision * 360 / divisions).toFloat()

        val animator = ObjectAnimator.ofFloat(binding.ivPersonalWheel, "rotation", 0f, degrees)
        animator.duration = 2000 // Duración de la animación en milisegundos
        animator.interpolator = AccelerateDecelerateInterpolator()
        animator.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                val intent = Intent(this@PersonalWheel, PersonalWheelResults::class.java)
                intent.putExtra(PERSONALW_KEY,randomDivision)
                startActivity(intent)
                binding.bSpinPersonalWheel.isEnabled = true

            }
        })
        animator.start()
    }


}