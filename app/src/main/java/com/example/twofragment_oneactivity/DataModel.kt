package com.example.twofragment_oneactivity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel : ViewModel() {

    val firstname: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val lastName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val email: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

}