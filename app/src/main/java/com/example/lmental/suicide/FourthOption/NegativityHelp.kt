package com.example.lmental.suicide.FourthOption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityNegativityHelpBinding

class NegativityHelp : AppCompatActivity() {
    private lateinit var binding: ActivityNegativityHelpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNegativityHelpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabNegativityHelpReturn.setOnClickListener {
            val intent = Intent(this, SuicideFourth::class.java)
            startActivity(intent)
        }
    }
}