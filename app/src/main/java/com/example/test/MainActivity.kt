package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//        mainViewModel.quote.observe(this) {
//            binding.textTv.text = it
//        }

        // now we have to pass life cycle owner since we have commented the observer and all that code
        // we are directly accessing live data from layout file


        //set your variable to the binding object
         binding.viewmodel = mainViewModel
        // we need to set life cycle owner to binding object
        binding.lifecycleOwner = this 

    }
}