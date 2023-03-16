package com.example.lmental.suicide.FirstOption.FOSubOptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmental.databinding.ActivityDideaBinding
import com.example.lmental.suicide.FirstOption.SuicideFirstActivity

class DIdeaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDideaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDideaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
    }

    private fun initListeners() {
        binding.fabDIdeaReturn.setOnClickListener {
            val intent = Intent(this, SuicideFirstActivity::class.java)
            startActivity(intent)
        }
    }
}