package com.example.lictest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class ClientsDetails : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.clients_details, menu)
        return true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_clients_details)
    }
}