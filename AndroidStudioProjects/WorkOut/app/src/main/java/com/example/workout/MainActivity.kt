package com.example.workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.Toast
import com.example.workout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        //val flScreen: FrameLayout = findViewById(R.id.flFile)
        binding?.flFile?.setOnClickListener{
           // Toast.makeText(this,"here we will start our exercise", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,ExerciseActivity::class.java)
            startActivity(intent)
        }
        binding?.flbmi?.setOnClickListener{
            val intent = Intent(this,BmiActivity::class.java)
            startActivity(intent)
        }
        binding?.flhistroy?.setOnClickListener{
            val intent = Intent(this,HistroyActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
