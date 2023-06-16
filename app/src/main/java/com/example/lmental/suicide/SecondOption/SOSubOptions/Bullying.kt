package com.example.lmental.suicide.SecondOption.SOSubOptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityBullyingBinding
import com.example.lmental.suicide.SecondOption.SuicideSecond

class Bullying : AppCompatActivity() {
    private lateinit var binding: ActivityBullyingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBullyingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabBullyingReturn.setOnClickListener {
            val intent = Intent(this, SuicideSecond::class.java)
            startActivity(intent)
        }
    }
}