package com.example.lmental.suicide.FirstOption.FOSubOptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySsuicideBinding
import com.example.lmental.suicide.FirstOption.SuicideFirstActivity

class SSuicideActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySsuicideBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySsuicideBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabSSuicideReturn.setOnClickListener {
            val intent = Intent(this, SuicideFirstActivity::class.java)
            startActivity(intent)
        }
    }
}