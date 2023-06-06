package com.example.lmental.suicide.SecondOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySuicideSecondBinding
import com.example.lmental.suicide.SuicideActivity

class SuicideSecond : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideSecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.fabSSecondActivityReturn.setOnClickListener {
            val intent = Intent(this, SuicideActivity::class.java)
            startActivity(intent)
        }
    }
}