package com.example.lmental.suicide.SeventhOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lmental.databinding.ActivitySuicideSeventhBinding
import com.example.lmental.suicide.SeventhOption.SevOSubOptions.FirstMyth
import com.example.lmental.suicide.SuicideActivity

class SuicideSeventh : AppCompatActivity() {
    private lateinit var binding: ActivitySuicideSeventhBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuicideSeventhBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.fabSSeventhActivityReturn.setOnClickListener {
            val intent = Intent(this, SuicideActivity::class.java)
            startActivity(intent)
        }
        binding.ivMythReality.setOnClickListener {
            val intent = Intent(this, FirstMyth::class.java)
            startActivity(intent)
        }
    }

}