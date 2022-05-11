package com.example.workout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.workout.databinding.ActivityFinishBinding

class FinishActivity : AppCompatActivity() {

    private var binding : ActivityFinishBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setSupportActionBar(binding?.toolBarFinish)
        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding?.toolBarFinish?.setNavigationOnClickListener{
            onBackPressed()
        }
        binding?.ibfinish?.setOnClickListener{
            finish()
        }
    }
}