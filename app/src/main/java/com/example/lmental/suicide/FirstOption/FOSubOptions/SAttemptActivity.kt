package com.example.lmental.suicide.FirstOption.FOSubOptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySattemptBinding
import com.example.lmental.suicide.FirstOption.SuicideFirstActivity

class SAttemptActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySattemptBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySattemptBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabSAttemptReturn.setOnClickListener {
            val intent = Intent(this, SuicideFirstActivity::class.java)
            startActivity(intent)
        }
    }
}