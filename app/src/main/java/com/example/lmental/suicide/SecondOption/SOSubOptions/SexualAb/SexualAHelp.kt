package com.example.lmental.suicide.SecondOption.SOSubOptions.SexualAb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivitySexualAhelpBinding

class SexualAHelp : AppCompatActivity() {
    private lateinit var binding: ActivitySexualAhelpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySexualAhelpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}