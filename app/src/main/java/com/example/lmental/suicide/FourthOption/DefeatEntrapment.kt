package com.example.lmental.suicide.FourthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityDefeatEntrapmentBinding

class DefeatEntrapment : AppCompatActivity() {
    private lateinit var binding: ActivityDefeatEntrapmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDefeatEntrapmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabDefeatEntrapmentReturn.setOnClickListener {
            val intent = Intent(this, SuicideFourth::class.java)
            startActivity(intent)
        }
    }
}