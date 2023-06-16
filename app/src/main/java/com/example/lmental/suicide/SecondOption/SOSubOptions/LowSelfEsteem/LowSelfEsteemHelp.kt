package com.example.lmental.suicide.SecondOption.SOSubOptions.LowSelfEsteem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityLowSelfEsteemHelpBinding

class LowSelfEsteemHelp : AppCompatActivity() {
    private lateinit var binding: ActivityLowSelfEsteemHelpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLowSelfEsteemHelpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabLowSelfEHelpReturn.setOnClickListener {
            val intent = Intent(this, LowSelfEsteem::class.java)
            startActivity(intent)
        }
    }
}