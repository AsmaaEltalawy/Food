package com.example.food

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.food.databinding.CartBinding

class Cart : Fragment(){
    lateinit var binding : CartBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CartBinding.inflate(inflater,container,false)
        return binding.root
    }

}