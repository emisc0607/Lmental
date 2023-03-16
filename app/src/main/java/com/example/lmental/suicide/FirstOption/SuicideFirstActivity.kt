package com.example.lmental.suicide.FirstOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySuicideFirstBinding
import com.example.lmental.suicide.FirstOption.FOSubOptions.DIdeaActivity
import com.example.lmental.suicide.FirstOption.FOSubOptions.SAttemptActivity
import com.example.lmental.suicide.FirstOption.FOSubOptions.SPlanActivity
import com.example.lmental.suicide.FirstOption.FOSubOptions.SSuicideActivity
import com.example.lmental.suicide.SuicideActivity

class SuicideFirstActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideFirstBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {

        binding.fabFirstOptionReturn.setOnClickListener {
            val intent = Intent(this, SuicideActivity::class.java)
            startActivity(intent)
        }

        binding.tvDIdea.setOnClickListener {
            val intent = Intent(this, DIdeaActivity::class.java)
            startActivity(intent)
        }

        binding.tvSPlan.setOnClickListener {
            val intent = Intent(this, SPlanActivity::class.java)
            startActivity(intent)
        }

        binding.tvSAttempt.setOnClickListener {
            val intent = Intent(this, SAttemptActivity::class.java)
            startActivity(intent)
        }

        binding.tvSuicide.setOnClickListener {
            val intent = Intent(this, SSuicideActivity::class.java)
            startActivity(intent)
        }
    }
}