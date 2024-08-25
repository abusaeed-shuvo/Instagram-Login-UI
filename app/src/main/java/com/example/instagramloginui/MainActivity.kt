package com.example.instagramloginui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.instagramloginui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnLogin.setOnClickListener {
            val userName = binding.usernameInput.text.toString().split("@")[0]
            Toast.makeText(
                this@MainActivity,
                "$userName Has logged in successfully!",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}