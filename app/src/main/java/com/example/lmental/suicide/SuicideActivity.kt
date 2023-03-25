package com.example.lmental.suicide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySuicideBinding
import com.example.lmental.suicide.FirstOption.SuicideFirstActivity

class SuicideActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.cvSFirstOption.setOnClickListener {
            val intent = Intent(this, SuicideFirstActivity::class.java)
            startActivity(intent)
        }

    }
}