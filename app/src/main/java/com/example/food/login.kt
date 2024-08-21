package com.example.food

import android.content.Intent
import android.database.DatabaseUtils
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.food.databinding.ActivityLoginBinding

class login : ComponentActivity() {
    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.btlogin.setOnClickListener {
            val intent =  Intent(this , MainActivity::class.java);
            startActivity(intent);

            lifecycle.addObserver(MainActivity.MyObserver())
        }


    }
}