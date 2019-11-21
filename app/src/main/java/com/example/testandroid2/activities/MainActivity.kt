package com.example.testandroid2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.testandroid2.R
import com.example.testandroid2.databinding.ActivityMainBinding
import com.example.testandroid2.viewmodels.TellVM

class MainActivity : AppCompatActivity() {

    private val mTellViewModel by lazy {
        ViewModelProviders.of(this).get(TellVM::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupDataBindig()
    }

    fun setupDataBindig() {
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.tellViewModel = mTellViewModel
    }
}
