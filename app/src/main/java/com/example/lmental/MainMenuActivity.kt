package com.example.lmental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityMainBinding
import com.example.lmental.suicide.SuicideActivity

class MainMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.bSuicide.setOnClickListener{
            val intent = Intent(this, SuicideActivity::class.java)
            startActivity(intent)
        }

    }
}

