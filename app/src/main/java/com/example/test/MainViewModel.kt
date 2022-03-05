package com.example.test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {
    val quote = MutableLiveData<String>("what is the that ")
    fun updateQuote(){
        quote.value ="hey this is updated  one "
    }
}