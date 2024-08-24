package com.example.food

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.food.databinding.BrowseBinding

class Browse : Fragment(),  foodAdapter.FoodClickListener {
    private var Fooditems : MutableList<Fooditem> = mutableListOf()
    lateinit var binding: BrowseBinding
    lateinit var foodadapter: foodAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = BrowseBinding.inflate(inflater,container,false)



        Fooditems = mutableListOf(
            Fooditem("Burger", R.drawable.burger),
            Fooditem("Steak", R.drawable.filletsteak),
            Fooditem("Pancakes", R.drawable.pancakes),
            Fooditem("Waffeles", R.drawable.waffles),
            Fooditem("pizza", R.drawable.pizza),
            Fooditem("shawerma", R.drawable.shawerma)

        )

        foodadapter=foodAdapter(Fooditems,this)
        binding.rvfood.adapter= foodadapter
        return binding.root
    }

    override fun onfoodClicked(food: Fooditem) {
        val action = BrowseDirections.actionBrowseToFooddetailsFragment(food)
        findNavController().navigate(action)


    }


}
