package com.example.food

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.food.databinding.BrowseBinding

class Browse : Fragment() {
    lateinit var binding: BrowseBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BrowseBinding.inflate(inflater,container,false)
        return binding.root
    }
}