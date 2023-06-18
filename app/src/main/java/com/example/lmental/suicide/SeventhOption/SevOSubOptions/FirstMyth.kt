package com.example.lmental.suicide.SeventhOption.SevOSubOptions

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lmental.databinding.ActivityFirstMythBinding

class FirstMyth : AppCompatActivity() {
    private lateinit var binding: ActivityFirstMythBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFirstMythBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.cvMythOption.setOnClickListener {
            if(binding.cvMythOption.isEnabled){
                binding.cvMythRealAnswerBox.visibility = View.VISIBLE
                binding.cvMythOption.isEnabled = false
                binding.bMythRealNext.visibility = View.VISIBLE
                binding.bMythRealNext.isEnabled = true
            }
        }
    }
}