package com.example.lmental.suicide.FifthOption.FiOSubOptions

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.appcompat.app.AlertDialog
import com.example.lmental.databinding.ActivitySocialWheelBinding
import com.example.lmental.suicide.FifthOption.SuicideFifth
import kotlin.random.Random

class SocialWheel : AppCompatActivity() {
    private lateinit var binding: ActivitySocialWheelBinding
    private val divisions = 7
    companion object{
        const val SOCIALW_KEY = "SOCIALW_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySocialWheelBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners() {
        binding.fabSocialWheelReturn.setOnClickListener {
            val intent = Intent(this, SuicideFifth::class.java)
            startActivity(intent)
        }
        binding.bSpinSocialWheel.setOnClickListener{
            if(binding.bSpinSocialWheel.isEnabled){
                animateRoulette()
                binding.bSpinSocialWheel.isEnabled = false
            }
        }

        binding.fabSocialWheelSelect.setOnClickListener {
            val options = arrayOf("Familiares","Dificultad de acceso a métodos letales","Recibir Ayuda","Acceso a servicios","Donde vives","Buenos amigos","Competencias")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Selecciona una opción")
            builder.setItems(options){ dialog, which ->
                val selectedDivision = which
                openResults(selectedDivision)
                dialog.dismiss()
            }
            builder.show()
        }
    }

    private fun animateRoulette() {
        val randomDivision = Random.nextInt(divisions)
        val degrees = (randomDivision * 360 / divisions).toFloat()

        val animator = ObjectAnimator.ofFloat(binding.ivSocialWheel, "rotation", 0f, degrees)
        animator.duration = 2000 // Duración de la animación en milisegundos
        animator.interpolator = AccelerateDecelerateInterpolator()
        animator.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                openResults(randomDivision)
            }
        })
        animator.start()
    }


    private fun openResults(option: Int){
        val intent = Intent(this, SocialWheelResults::class.java)
        intent.putExtra(SocialWheel.SOCIALW_KEY,option)
        startActivity(intent)
        binding.bSpinSocialWheel.isEnabled = true
    }


}