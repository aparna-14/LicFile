package com.example.lictest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create_account.*
import kotlinx.android.synthetic.main.activity_sign_in_page.*

class SignInPage : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var email: String
    private lateinit var pswrd: EditText
    private val emailIdPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_page)
        editText = findViewById(R.id.edittEmailAddress)
        pswrd = findViewById(R.id.etPassword)
        email = editText.text.toString().trim()
        editText.setOnClickListener {
            validateEmail()
        }
        pswrd.setOnClickListener {
            validatePassword()
        }

    }

    private fun validatePassword(): Boolean {
            var password = ""
            if (password.length < 8) return false
            if (password.filter { it.isDigit() }.firstOrNull() == null) return false
            if (password.filter { it.isLetter() }.filter { it.isUpperCase() }.firstOrNull() == null) return false
            if (password.filter { it.isLetter() }.filter { it.isLowerCase() }.firstOrNull() == null) return false
            if (password.filter { !it.isLetterOrDigit() }.firstOrNull() == null) return false

            return true


    }

    fun validateEmail() {
            if (email.matches(emailIdPattern.toRegex())) {
                Toast.makeText(applicationContext, "Valid email address",
                    Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Invalid email address",
                    Toast.LENGTH_SHORT).show()
            }
        }


}