package com.example.lmental.suicide.FirstOption.FOSubOptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySplanBinding
import com.example.lmental.suicide.FirstOption.SuicideFirstActivity

class SPlanActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        binding.fabSPlanReturn.setOnClickListener {
            val intent = Intent(this, SuicideFirstActivity::class.java)
            startActivity(intent)
        }
    }
}