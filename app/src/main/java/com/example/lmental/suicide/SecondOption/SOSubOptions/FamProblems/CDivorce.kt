package com.example.lmental.suicide.SecondOption.SOSubOptions.FamProblems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityCdivorceBinding

class CDivorce : AppCompatActivity() {
    private lateinit var binding: ActivityCdivorceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCdivorceBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}