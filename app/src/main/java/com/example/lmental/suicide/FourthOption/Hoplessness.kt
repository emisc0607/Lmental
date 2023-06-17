package com.example.lmental.suicide.FourthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityHoplessnessBinding

class Hoplessness : AppCompatActivity() {
    private lateinit var binding: ActivityHoplessnessBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoplessnessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabHoplessnessReturn.setOnClickListener {
            val intent = Intent(this, SuicideFourth::class.java)
            startActivity(intent)
        }
    }
}