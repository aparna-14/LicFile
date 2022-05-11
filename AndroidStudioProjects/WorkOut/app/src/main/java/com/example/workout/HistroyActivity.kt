package com.example.workout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.workout.databinding.ActivityHistroyBinding

class HistroyActivity : AppCompatActivity() {
    private var binding: ActivityHistroyBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistroyBinding.inflate(layoutInflater)
        setContentView(binding?.root)
       setSupportActionBar(binding?.toolBarHistroy)
        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "HISTORY"
        }
        binding?.toolBarHistroy?.setNavigationOnClickListener{
            onBackPressed()
        }

    }
}