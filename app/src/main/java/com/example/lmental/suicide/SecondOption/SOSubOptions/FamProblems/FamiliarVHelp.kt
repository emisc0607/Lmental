package com.example.lmental.suicide.SecondOption.SOSubOptions.FamProblems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityFamiliarVhelpBinding

class FamiliarVHelp : AppCompatActivity() {
    private lateinit var binding: ActivityFamiliarVhelpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFamiliarVhelpBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fabFamiliarVHelpReturn.setOnClickListener {
            val intent = Intent(this, FamiliarViolence::class.java)
            startActivity(intent)
        }
    }
}