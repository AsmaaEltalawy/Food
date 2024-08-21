package com.example.food
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.food.R.id
import com.example.food.R.layout.activity_main
import com.example.food.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity()  {
    lateinit var binding: ActivityMainBinding
    lateinit var navController :NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        super.onCreate(savedInstanceState)
        setContentView(activity_main)



        val fragHost = supportFragmentManager.findFragmentById(id.nav_host) as NavHostFragment
        navController = fragHost.navController

        setupWithNavController(binding.bottomNavigation, navController)
        lifecycle.addObserver(MyObserver())
}

    class MyObserver : DefaultLifecycleObserver{

        private val TAG: String = "Observer"

        override fun onCreate(owner: LifecycleOwner) {
            Log.d(TAG,"onCreate")
        }
        override fun onStart(owner: LifecycleOwner) {
            Log.d(TAG,"onStart")
        }
        override fun onResume(owner: LifecycleOwner) {
            Log.d(TAG,"onResume")
        }
        override fun onPause(owner: LifecycleOwner) {
            Log.d(TAG,"onPause")
        }
        override fun onStop(owner: LifecycleOwner) {
            Log.d(TAG,"onStop")
        }
        override fun onDestroy(owner: LifecycleOwner) {
            Log.d(TAG,"onDestroy")
        }
    }
}
