package com.example.testandroid2.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TellVM : ViewModel() {
    private val mContMutableLiveData = MutableLiveData(0)
    val mTitle = "-Tell-"
    val mTell = "Tell"
    val mContLiveData: LiveData<Int> = mContMutableLiveData


    fun onTell() {
        mContMutableLiveData.value=(mContMutableLiveData.value ?: 0) + 1
    }
}